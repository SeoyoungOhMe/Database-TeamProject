package database;

import java.sql.*;
import java.util.*;

public class Main {
	
    public static void main(String[] args) {
        try {
            // 데이터베이스 연결
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/pj", "root", "0224");

            // 메뉴 실행
            int choice = Out.out();

            while (choice != 0) {
                switch (choice) {
                    case 1:
                        ProductInsertMenu.insertProduct(connection);
                        break;
                    case 2:
                    	OrderApplication.orderProduct(connection);
                        break;
                    case 3:
                        OrderHistory.showCustomerOrderHistory(connection);
                        break;
                    case 4:
                        OrderDeletion.orderDeletion(connection);
                        break;
                    case 5:
                        ProductSearchApp.searchProductsByCategory(connection);
                        break;
                    case 6:
                        AggregationQuery.aggregationquery(connection);
                        break;
                    case 7:
                        OrderUpdate.orderupdate(connection);
                        break;
                    default:
                        System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                }

                choice = Out.out();
            }


            // 데이터베이스 연결 종료
            connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}