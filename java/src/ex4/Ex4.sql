CREATE TABLE person(
	person_id SERIAL PRIMARY KEY,
	name VARCHAR(100) NOT NULL,
	age INTEGER NOT NULL,
	phone VARCHAR(15) NOT NULL,
	height FLOAT NOT NULL,
	email VARCHAR(100) NOT NULL,
	cpf VARCHAR(11) NOT NULL,
	birthdate DATE CHECK(birthdate > '1900-01-01'),
	id_address INT NOT NULL,
	CONSTRAINT fk_address FOREIGN KEY (id_address) REFERENCES address(address_id)
)

CREATE TABLE address(
	address_id SERIAL PRIMARY KEY,
	zip_code VARCHAR(20) NOT NULL,
	address VARCHAR(50) NOT NULL,
	complement VARCHAR(50) NOT NULL,
	neighborhood VARCHAR(50) NOT NULL,
	city VARCHAR(50) NOT NULL,
	state VARCHAR(50) NOT NULL,
	country VARCHAR(50) NOT NULL
)

SELECT * FROM address;

SELECT * FROM person;

INSERT INTO address(zip_code,address,complement,neighborhood,city,state,country)
VALUES(
	'555-555',
	'Rua Boa Vista',
	'Casa',
	'Jardim Campo Belo',
	'Ribeirão Preto',
	'São Paulo',
	'Brasil'
),( '666-666',
	'Rua 12',
	'Casa',
	'Jardim Campo Alegre',
	'Ribeirão Preto',
	'São Paulo',
	'Brasil'
)

INSERT INTO person(name, age, phone, height, email, cpf, birthdate, id_address)
VALUES (
	'Lucas',
	22,
	'+5516988245555',
	1.81,
	'lucas-gabriel@gmail.com',
	'11122233344',
	'2000-09-25',
	2
)




























