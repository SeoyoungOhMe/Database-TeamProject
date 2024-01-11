-- Insert data into the category table
INSERT INTO category (category_id, category_name)
VALUES (1, 'Beverages'),
	(2, 'Food'),
	(3, 'Stationery'),
	(4, 'Snack'),
	(5, 'etc');

-- Insert data into the product table
INSERT INTO product (product_id, product_name, price, stock_quantity, category_id)
VALUES (1, 'ice coffee', 2000, 100, 1),
       (2, 'kimbap', 1700, 20, 2),
       (3, 'iceteano', 2200, 101, 1),
       (4, 'sandwich', 3600, 10, 2),
       (5, 'pencil', 500, 12, 3);

-- Insert data into the customer table
INSERT INTO customer (customer_id, customer_name, address, email, phone_number)
VALUES (101, 'Minsu Lee', '123 Main Street, City, State, Zip Code', 'minsulee@example.com', '123-456-7890'),
       (102, 'Yerin Kim', '456 Elm Street, City, State, Zip Code', 'yerinkim@example.com', '987-654-3210'),
       (103, 'Seoyoung Oh', '789 Oak Street, City, State, Zip Code', 'seoyoungoh@example.com', '456-789-1230'),
       (104, 'Eunkyo Lee', '321 Pine Street, City, State, Zip Code', 'eungyolee@example.com', '789-123-4560'),
       (105, 'Junhyuk Lim', '567 Maple Street, City, State, Zip Code', 'junhyuklim@example.com', '234-567-8901');

-- Insert data into the orders table
INSERT INTO orders (order_id, customer_id, product_id, quantity, order_date, payment_info, delivery_status)
VALUES (1, 101, 1, 2, '2023-05-15', 'Credit Card', 'In Progress'),
       (2, 102, 2, 3, '2023-05-16', 'PayPal', 'Delivered'),
       (3, 103, 1, 1,  '2023-05-17', 'Cash on Delivery', 'Shipped'),
       (4, 101, 2, 4, '2023-05-18', 'Credit Card', 'In Progress'),
       (5, 104, 3, 1, '2023-05-19', 'Bank Transfer', 'Pending');

