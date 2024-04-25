# Database-TeamProject
- 데이터베이스 자바앱 제작 팀프로젝트(23년 1학기 수강)
- 2023.05 ~ 2023.06
- 3 people team project

## 📝Introduction of Project
The project is to create a Java application using JDBC and a MySQL database.

The application will allow users to retrieve, insert, update, and delete data in the database.

## 🔗Start Guide
### How to Connect DB
- URL : localhost:3306/pj
- ID : root
- PW : 0224

### Usage
1. Run the Main class located in the "database" package.
2. The application will display a menu with various options.
3. Select an option by entering the corresponding number.
4. Follow the instructions provided by the application for each operation.
5. To exit the application, choose the "Exit" option from the menu.

## 📐Stacks
- JDBC
- MySQL
- JAVA

## 🗒️ER-Diagram
<img width="477" alt="스크린샷 2024-01-11 오후 10 09 29" src="https://github.com/SeoyoungOhMe/Database-TeamProject/assets/96602351/2499db65-b024-43fd-84e3-1669e1e31583">

## 📌Functionality
1. insertProduct method of ProductInsertMenu class : Allows user to add a new product to the database.
2. OrderProduct method of OrderApplication class : Allows user to place an order for a product.
3. showCustomerOrderHistory method of OrderHistory class : Displays the order history for a customer.
4. orderDeletion method of OrderDeletion class : Deletes an order from the database.
5. ProductSearchApp method of ProductSearchApp class : Searches for products in a specific category.
6. aggregationquery method of AggregationQuery class : Performs an aggregation query on the database.
7. orderupdate method of OrderUpdate class : Updates an existing order in the database.
8. main method of Main class: Presents a menu to the user, and based on the user's choice, performs various operations such as inserting products, ordering products, displaying order history, deleting orders, searching products by category, performing aggregation queries, and updating orders until the user chooses to exit, after which it closes the database connection. 

<!-- ## 실행 화면
<img width="181" alt="스크린샷 2024-01-11 오후 10 13 25" src="https://github.com/SeoyoungOhMe/Database-TeamProject/assets/96602351/df17c53e-1722-43dc-9d66-57c1a1b9a005">
<img width="198" alt="스크린샷 2024-01-11 오후 10 13 37" src="https://github.com/SeoyoungOhMe/Database-TeamProject/assets/96602351/201185e6-4dad-4d5b-9ce5-4922702ffa33">
<img width="557" alt="스크린샷 2024-01-11 오후 10 13 52" src="https://github.com/SeoyoungOhMe/Database-TeamProject/assets/96602351/91f83d20-b452-40ac-80ba-115a5da92c30">
<img width="152" alt="스크린샷 2024-01-11 오후 10 14 02" src="https://github.com/SeoyoungOhMe/Database-TeamProject/assets/96602351/f0efc00a-6dc7-440a-a93a-26065417bb38">
<img width="149" alt="스크린샷 2024-01-11 오후 10 14 18" src="https://github.com/SeoyoungOhMe/Database-TeamProject/assets/96602351/d513c963-7ff1-4b1b-8d8f-5097e623a1de">
<img width="200" alt="스크린샷 2024-01-11 오후 10 14 40" src="https://github.com/SeoyoungOhMe/Database-TeamProject/assets/96602351/e6404d9e-44eb-4613-9331-e18f672b55d3">
<img width="210" alt="스크린샷 2024-01-11 오후 10 14 51" src="https://github.com/SeoyoungOhMe/Database-TeamProject/assets/96602351/47c9bc3e-f3f0-4fd1-b087-f630faf05105"> -->
