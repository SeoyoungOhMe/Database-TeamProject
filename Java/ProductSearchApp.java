package database;

import java.sql.*;
import java.util.*;

public class ProductSearchApp {
    // 카테고리별 상품 조회 기능 구현
    public static void searchProductsByCategory(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            // 카테고리 목록 출력
            String categoryQuery = "SELECT * FROM category";
            ResultSet categoryResult = statement.executeQuery(categoryQuery);
            System.out.println("카테고리 목록:");
            while (categoryResult.next()) {
                int categoryId = categoryResult.getInt("category_id");
                String categoryName = categoryResult.getString("category_name");
                System.out.println(categoryId + ". " + categoryName);
            }

            // 사용자로부터 카테고리 입력 받기
            System.out.print("조회할 카테고리 번호 입력: ");
            Scanner scanner = new Scanner(System.in);
            int cateId = scanner.nextInt();

            // 카테고리별 상품 조회
            String productQuery = "SELECT * FROM show_products WHERE category_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(productQuery);
            preparedStatement.setInt(1, cateId);
            ResultSet productResult = preparedStatement.executeQuery();

            // 조회 결과 출력
            System.out.println("조회 결과:");
            while (productResult.next()) {
                int productId = productResult.getInt("product_id");
                String productName = productResult.getString("product_name");
                double price = productResult.getDouble("price");
                System.out.println("상품 ID: " + productId);
                System.out.println("상품명: " + productName);
                System.out.println("가격: " + price);
                System.out.println();
            }

        }
       
    }
}