package database;

import java.sql.*;

public class AggregationQuery {
    public static void aggregationquery(Connection conn) {
        try {
            // 쿼리 실행
            String query = "SELECT category_id, COUNT(*) AS total_products " +
                           "FROM product " +
                           "GROUP BY category_id";

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            // 결과 출력
            while (rs.next()) {
                int categoryId = rs.getInt("category_id");
                int totalProducts = rs.getInt("total_products");
                System.out.println("카테고리 ID: " + categoryId + ", 총 상품 수: " + totalProducts);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}