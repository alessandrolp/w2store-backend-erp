DROP TABLE IF EXISTS product;
 
CREATE TABLE product (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(100) NOT NULL,
  price DECIMAL(10,2) NOT NULL
);
 
INSERT INTO product (id, name, price) VALUES
  (1, 'notebook1', 100.00),
  (2, 'noteboo2', 101.00),
  (3, 'notebook3', 102.00),
  (4, 'notebook4', 103.00),
  (5, 'notebook5', 104.00),
  (6, 'notebook6', 105.00),
  (7, 'notebook7', 106.00),
  (8, 'notebook8', 107.00),
  (9, 'notebook9', 108.00),
  (10, 'notebook10', 109.00);
