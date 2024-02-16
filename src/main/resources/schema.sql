CREATE TABLE IF NOT EXISTS shops (
    shop_id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    address VARCHAR(255),
    schedule VARCHAR(255),
    status VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT check_status CHECK (status IN ('ACTIVE', 'INACTIVE', 'DELETED'))
);

CREATE TABLE IF NOT EXISTS users (
    user_id SERIAL PRIMARY KEY,
    username VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(255),
    status VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT check_status CHECK (status IN ('ACTIVE', 'INACTIVE')),
    CONSTRAINT check_role CHECK (role IN ('ROLE_ADMIN', 'ROLE_USER'))
);

CREATE TABLE IF NOT EXISTS purchase_details (
    purchase_details_id SERIAL PRIMARY KEY,
    list_order_id INTEGER[],
    quantity INTEGER,
    price DOUBLE PRECISION,
    status VARCHAR(255),
    date BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT check_status CHECK (status IN ('PENDING', 'PAID', 'CANCELLED'))
);

CREATE TABLE IF NOT EXISTS products (
    product_id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    url_image VARCHAR(255),
    shop_id INT NOT NULL,
    FOREIGN KEY (shop_id) REFERENCES shops(shop_id),
    status VARCHAR(255),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT check_status CHECK (status IN ('ACTIVE', 'INACTIVE', 'DELETED', 'OUT_OF_STOCK', 'SOLD_OUT', 'DISCONTINUED'))
);

CREATE TABLE IF NOT EXISTS offers (
    offer_id SERIAL PRIMARY KEY,
    product_id INT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products(product_id),
    shop_id INT NOT NULL,
    FOREIGN KEY (shop_id) REFERENCES shops(shop_id),
    stock INTEGER,
    price DOUBLE PRECISION,
    status VARCHAR(255),
    date BIGINT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT check_status CHECK (status IN ('ACTIVE', 'INACTIVE'))
);

CREATE TABLE IF NOT EXISTS orders (
    order_id SERIAL PRIMARY KEY,
    offer_id INT NOT NULL,
    FOREIGN KEY (offer_id) REFERENCES offers(offer_id),
    quantity INTEGER,
    total DOUBLE PRECISION,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    date BIGINT
);
