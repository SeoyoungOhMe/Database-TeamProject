package database;

import java.sql.*;
import java.util.Scanner;

public class OrderDeletion {
    public static void orderDeletion(Connection conn) {
        try {

            // 삭제 메뉴
            System.out.println("주문 정보 삭제");
            Scanner scanner = new Scanner(System.in);
            
            // 주문 정보 삭제
            System.out.print("삭제할 주문 ID를 입력하세요: ");
            int orderId = scanner.nextInt();
            
            // 삭제 쿼리 실행
            String deleteQuery = "DELETE FROM orders WHERE order_id = ?";
            PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setInt(1, orderId);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                        System.out.println("주문 정보가 삭제되었습니다.");
                    } else {
                        System.out.println("주문 정보 삭제에 실패했습니다.");
                    }

                    pstmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}