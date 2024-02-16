CREATE TABLE IF NOT EXISTS shops (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    address VARCHAR(255),
    schedule VARCHAR(255),
    status VARCHAR(255),
    CONSTRAINT check_status CHECK (status IN ('ACTIVE', 'INACTIVE', 'DELETED'))
);

CREATE TABLE IF NOT EXISTS users (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    role VARCHAR(255),
    status VARCHAR(255),
    CONSTRAINT check_status CHECK (status IN ('ACTIVE', 'INACTIVE'))
);

CREATE TABLE IF NOT EXISTS purchase_details (
    id SERIAL PRIMARY KEY,
    shop_id INTEGER REFERENCES shops(id),
    user_id INTEGER REFERENCES users(id),
    list_order_id VARCHAR(255),
    quantity INTEGER,
    price DOUBLE PRECISION,
    total DOUBLE PRECISION,
    status VARCHAR(255),
    date BIGINT,
    CONSTRAINT check_status CHECK (status IN ('PENDING', 'PAID', 'CANCELLED'))
);

CREATE TABLE IF NOT EXISTS products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    url_image VARCHAR(255),
    shop_id INTEGER REFERENCES shops(id),
    status VARCHAR(255),
    CONSTRAINT check_status CHECK (status IN ('ACTIVE', 'INACTIVE', 'DELETED', 'OUT_OF_STOCK', 'SOLD_OUT', 'DISCONTINUED'))
);

CREATE TABLE IF NOT EXISTS offers (
    id SERIAL PRIMARY KEY,
    product_id INTEGER REFERENCES products(id),
    shop_id INTEGER REFERENCES shops(id),
    stock INTEGER,
    price DOUBLE PRECISION,
    status VARCHAR(255),
    date BIGINT,
    CONSTRAINT check_status CHECK (status IN ('ACTIVE', 'INACTIVE'))
);

CREATE TABLE IF NOT EXISTS orders (
    id SERIAL PRIMARY KEY,
    offer_id INTEGER REFERENCES offers(id),
    quantity INTEGER,
    total DOUBLE PRECISION,
    date BIGINT
);
