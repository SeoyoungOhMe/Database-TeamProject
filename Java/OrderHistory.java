package database;

import java.sql.*;
import java.util.*;

public class OrderHistory {
	
    // 고객 주문 내역 조회 기능 구현
    public static void showCustomerOrderHistory(Connection connection) throws SQLException {
        // 사용자로부터 고객 이름 입력 받기
        System.out.print("조회할 고객 이름 입력: ");
        Scanner scanner = new Scanner(System.in);
        String customerName = scanner.nextLine();

        try (Statement statement = connection.createStatement()) {
            // 고객 주문 내역 조회
            String query = "SELECT * FROM show_orders WHERE customer_name = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, customerName);
            ResultSet resultSet = preparedStatement.executeQuery();

            // 조회 결과 출력
            System.out.println("조회 결과:");
            while (resultSet.next()) {
                int orderId = resultSet.getInt("order_id");
                String orderDate = resultSet.getString("order_date");
                String productName = resultSet.getString("product_name");
                double price = resultSet.getDouble("price");
                int quantity = resultSet.getInt("quantity");
                System.out.println("주문 ID: " + orderId);
                System.out.println("주문 일자: " + orderDate);
                System.out.println("상품명: " + productName);
                System.out.println("주문 수량: " + quantity);
                System.out.println("가격: " + price*quantity);
                System.out.println();
            }
        }
    }
}