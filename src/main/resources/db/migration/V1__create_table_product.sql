CREATE TABLE product{
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(155) NOT NULL,
    description VARCHAR(255),
    price DOUBLE NOT NULL,
    quantity INTEGER NOT NULL
}