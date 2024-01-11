package database;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class OrderApplication {

    public static void orderProduct(Connection conn) throws SQLException {
    	Scanner scanner = new Scanner(System.in);
    	System.out.print("고객 id를 입력하세요: ");
    	int cus_id = scanner.nextInt();
    	scanner.nextLine();
    	
        // 상품 목록 조회
        String productListQuery = "SELECT * FROM product";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(productListQuery);

        // 상품 목록 출력
        System.out.println("=== 상품 목록 ===");
        while (rs.next()) {
            int productId = rs.getInt("product_id");
            String productName = rs.getString("product_name");
            int price = rs.getInt("price");
            int stockQuantity = rs.getInt("stock_quantity");
            System.out.println(productId + ". " + productName + " - " + price + "원 (재고: " + stockQuantity + ")");
        }
        System.out.println("================");

        // 주문 정보 입력
        System.out.print("주문할 상품 번호를 입력하세요: ");
        int productId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("주문 수량을 입력하세요: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("결제 정보를 입력하세요(Credit Card, PayPal, Cash on Delivery, Bank Transfer): ");
        String paymentInfo = scanner.nextLine();
        
        Date currentDate = new Date();
        java.sql.Date orderDate = new java.sql.Date(currentDate.getTime());
        
        // 주문 정보 저장
        String orderInsertQuery = "INSERT INTO orders (customer_id, product_id, quantity, order_date, payment_info, delivery_status) VALUES (?, ?, ?, ?, ?, ?)";
        String deliveryStatus = "in progress";
        PreparedStatement pstmt = conn.prepareStatement(orderInsertQuery);
        pstmt.setInt(1, cus_id);
        pstmt.setInt(2, productId);
        pstmt.setInt(3, quantity);
        pstmt.setDate(4, orderDate);
        pstmt.setString(5, paymentInfo);
        pstmt.setString(6, deliveryStatus);
        pstmt.executeUpdate();
        

        // 상품 수량 업데이트
        String productUpdateQuery = "UPDATE product SET stock_quantity = stock_quantity - ? WHERE product_id = ?";
        pstmt = conn.prepareStatement(productUpdateQuery);
        pstmt.setInt(1, quantity);
        pstmt.setInt(2, productId);
        pstmt.executeUpdate();

        // 주문 완료 메시지 출력
        System.out.println("주문이 완료되었습니다.");

        // 자원 해제
        rs.close();
        stmt.close();
        pstmt.close();
    }
}
