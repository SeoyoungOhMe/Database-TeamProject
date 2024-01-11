package database;

import java.sql.*;
import java.util.*;

public class OrderUpdate {
	public static void orderupdate(Connection conn) {
		try {
	        Scanner scanner = new Scanner(System.in);
	        
	        // 주문 정보 업데이트
	        System.out.print("업데이트할 주문 ID를 입력하세요: ");
	        //이건 order_id이다 
	        int orderId = scanner.nextInt();
	        scanner.nextLine(); // 개행 문자 제거
	            
	        System.out.print("새로운 주문 수량을 입력하세요: ");
	        int quantity = scanner.nextInt();
	        scanner.nextLine(); // 개행 문자 제거

	        // 업데이트 쿼리 실행
	        String updateQuery = "UPDATE orders SET quantity = ? WHERE order_id = ?";
	        PreparedStatement pstmt = conn.prepareStatement(updateQuery);
	        pstmt.setInt(1, quantity);
	        pstmt.setInt(2, orderId);
	        int rowsAffected = pstmt.executeUpdate();

	        if (rowsAffected > 0) {
	        	System.out.println("주문 정보가 업데이트되었습니다.");
	        } else {
	        	System.out.println("주문 정보 업데이트에 실패했습니다.");
	        }
	    }
		catch (SQLException e) {
            e.printStackTrace();
        }
	 }
}


