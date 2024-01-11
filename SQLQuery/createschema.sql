-- Create the category table
CREATE TABLE category (
  category_id INT PRIMARY KEY,
  category_name VARCHAR(100)
);

-- Create the product table
CREATE TABLE product (
  product_id INT auto_increment,
  product_name VARCHAR(100),
  price DECIMAL(10, 2),
  stock_quantity INT,
  category_id INT,
  PRIMARY KEY (product_id),
  FOREIGN KEY (category_id) REFERENCES category(category_id)
);

-- Create the customer table
CREATE TABLE customer (
  customer_id INT PRIMARY KEY,
  customer_name VARCHAR(100),
  address VARCHAR(200),
  email VARCHAR(100),
  phone_number VARCHAR(15)
);

-- Create the order table
CREATE TABLE orders (
  order_id INT auto_increment,
  customer_id INT,
  product_id INT,
  quantity INT,
  order_date DATE,
  payment_info VARCHAR(100),
  delivery_status VARCHAR(50),
  PRIMARY KEY (order_id),
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
  FOREIGN KEY (product_id) REFERENCES product(product_id)
);


-- Create view: show_products
CREATE VIEW show_products AS
SELECT product_id, product_name, price, category.category_id
FROM product JOIN category
WHERE product.category_id= category.category_id;

-- Create view: show_orders
CREATE VIEW show_orders AS
SELECT order_id, order_date,product_name, price, quantity, customer_name
FROM orders JOIN product JOIN customer
WHERE orders.product_id= product.product_id and customer.customer_id= orders.customer_id;
