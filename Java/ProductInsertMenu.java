package database;
import java.util.*;
import java.sql.*;

public class ProductInsertMenu {
	public static void insertProduct(Connection connection) throws SQLException{

		// 사용자로부터 입력 받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("상품 이름을 입력하세요: ");
		String productName = scanner.nextLine();
		System.out.print("가격을 입력하세요: ");
		int price = scanner.nextInt();
		scanner.nextLine();
		System.out.print("재고 수량을 입력하세요: ");
		int stockQuantity = scanner.nextInt();
		scanner.nextLine();
		System.out.print("카테고리를 선택해주세요: ");
		int categoryId = scanner.nextInt();
		scanner.nextLine();
        
		// SQL 쿼리 실행
		String sql = "INSERT INTO product (product_name, price, stock_quantity, category_id) VALUES (?, ?, ?, ?)";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, productName);
		statement.setInt(2, price);
		statement.setInt(3, stockQuantity);
		statement.setInt(4, categoryId);
		statement.executeUpdate();
		System.out.println("상품이 성공적으로 추가되었습니다.");
		// 리소스 해제
		statement.close();
       
		
        
	}

	
}