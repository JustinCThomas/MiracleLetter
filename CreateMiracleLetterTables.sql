CREATE TABLE Customer(
customer_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
email_address VARCHAR2(255) NOT NULL UNIQUE,
password VARCHAR2(255) NOT NULL,
CONSTRAINT customer_pk PRIMARY KEY(customer_id),
CONSTRAINT password_length_ck CHECK (LENGTH(password) >= 8)
);

CREATE TABLE Letter_Template(
letter_template_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
letter_template_name VARCHAR2(255) NOT NULL UNIQUE,
letter_template_description VARCHAR2(255) NOT NULL,
letter_template_base_price NUMBER(10,2) NOT NULL,
CONSTRAINT letter_template_pk PRIMARY KEY(letter_template_id)
);

CREATE TABLE Envelope(
envelope_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
envelope_type VARCHAR2(255) NOT NULL,
envelope_size VARCHAR2(255) NOT NULL,
envelope_color VARCHAR2(255) NOT NULL,
envelope_price NUMBER(10,2) NOT NULL,
CONSTRAINT envelope_pk PRIMARY KEY(envelope_id)
);

CREATE TABLE Order_Table(
order_id NUMERIC GENERATED ALWAYS AS IDENTITY(START WITH 1 INCREMENT BY 1) NOT NULL,
customer_id INTEGER NOT NULL,
order_price NUMBER(10,2) NOT NULL,
date_of_purchase DATE DEFAULT SYSDATE NOT NULL,
CONSTRAINT order_id PRIMARY KEY(order_id),
CONSTRAINT customer_id_fk FOREIGN KEY(customer_id) REFERENCES Customer(customer_id)
);

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

COMMIT;