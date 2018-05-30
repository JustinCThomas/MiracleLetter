CREATE TABLE Customer(
customer_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
email_address VARCHAR2(255) NOT NULL UNIQUE,
password VARCHAR2(255) NOT NULL,
CONSTRAINT customer_pk PRIMARY KEY(customer_id),
CONSTRAINT password_length_ck CHECK (LENGTH(password) >= 8)
);

INSERT INTO customer (email_address, password)
VALUES ('tim@gmail.com', 'fiveYard');
INSERT INTO customer (email_address, password)
VALUES ('jim@yahoo.com', 'fourfour');


CREATE TABLE Letter_Template(
letter_template_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
letter_template_name VARCHAR2(255) NOT NULL UNIQUE,
letter_template_description VARCHAR2(255) NOT NULL,
letter_template_base_price NUMBER(10,2) NOT NULL,
CONSTRAINT letter_template_pk PRIMARY KEY(letter_template_id)
);

INSERT INTO letter_template (letter_template_name, letter_template_description, letter_template_base_price)
VALUES ('Ocean', 'For those who want to add depth to their letters.', 7.99);
INSERT INTO letter_template (letter_template_name, letter_template_description, letter_template_base_price)
VALUES ('Sky', 'Let your creativity soar. The sky''s the limit!', 8.49);
INSERT INTO letter_template (letter_template_name, letter_template_description, letter_template_base_price)
VALUES ('Fruit Basket', 'If you need some flavor, this is the letter for you.', 7.49);

CREATE TABLE Envelope(
envelope_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
envelope_type VARCHAR2(255) NOT NULL,
envelope_color VARCHAR2(255) NOT NULL,
envelope_price NUMBER(10,2) NOT NULL,
CONSTRAINT envelope_pk PRIMARY KEY(envelope_id)
);


INSERT INTO envelope (envelope_type, envelope_color, envelope_price)
VALUES ('Regular', 'White', 1.29);
INSERT INTO envelope (envelope_type, envelope_color, envelope_price)
VALUES ('Window', 'White', 1.49);
INSERT INTO envelope (envelope_type, envelope_color, envelope_price)
VALUES ('Regular', 'Blue', 1.49);
INSERT INTO envelope (envelope_type, envelope_color, envelope_price)
VALUES ('Window', 'Blue', 1.79);
INSERT INTO envelope (envelope_type, envelope_color, envelope_price)
VALUES ('Regular', 'Red', 1.49);
INSERT INTO envelope (envelope_type, envelope_color, envelope_price)
VALUES ('Window', 'Red', 1.79);


CREATE TABLE Order_Table(
order_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
customer_id INTEGER NOT NULL,
order_price NUMBER(10,2) NOT NULL,
date_of_purchase DATE DEFAULT SYSDATE NOT NULL,
CONSTRAINT order_id PRIMARY KEY(order_id),
CONSTRAINT customer_id_fk FOREIGN KEY(customer_id) REFERENCES Customer(customer_id)
);


INSERT INTO order_table (customer_id, order_price, date_of_purchase)
VALUES (1, 8.78, TO_DATE('2018/05/30 11:00:45', 'yyyy/mm/dd hh24:mi:ss'));
INSERT INTO order_table (customer_id, order_price, date_of_purchase)
VALUES (2, 19.06, TO_DATE('2018/05/30 11:00:45', 'yyyy/mm/dd hh24:mi:ss'));
INSERT INTO order_table (customer_id, order_price, date_of_purchase)
VALUES (2, 9.48, TO_DATE('2018/05/30 11:00:45', 'yyyy/mm/dd hh24:mi:ss'));
INSERT INTO order_table (customer_id, order_price, date_of_purchase)
VALUES (2, 8.98, TO_DATE('2018/05/30 11:00:45', 'yyyy/mm/dd hh24:mi:ss'));
INSERT INTO order_table (customer_id, order_price, date_of_purchase)
VALUES (2, 10.28, TO_DATE('2018/05/30 11:00:45', 'yyyy/mm/dd hh24:mi:ss'));


CREATE TABLE Order_Item_Table(
order_item_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
order_id INTEGER NOT NULL,
letter_template_id INTEGER NOT NULL,
envelope_id INTEGER NOT NULL,
price_of_item NUMBER(10,2) NOT NULL,
address_of_recipient VARCHAR(255) NOT NULL,
CONSTRAINT order_item_pk PRIMARY KEY (order_item_id),
CONSTRAINT order_id_fk FOREIGN KEY(order_id) REFERENCES Order_Table(order_id) ON DELETE CASCADE,
CONSTRAINT letter_template_id_fk FOREIGN KEY(letter_template_id) REFERENCES Letter_template(letter_template_id),
CONSTRAINT envelope_id_fk FOREIGN KEY(envelope_id) REFERENCES Envelope(envelope_id)
);

INSERT INTO order_item_table (order_id, letter_template_id, envelope_id, price_of_item, address_of_recipient)
VALUES (1, 1, 3, 8.78, '2200 Canal Road');
INSERT INTO order_item_table (order_id, letter_template_id, envelope_id, price_of_item, address_of_recipient)
VALUES (2, 1, 4, 9.78, '1400 Windmill Path');
INSERT INTO order_item_table (order_id, letter_template_id, envelope_id, price_of_item, address_of_recipient)
VALUES (2, 3, 6, 9.28, '1620 Fulton Street');

COMMIT;