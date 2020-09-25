create schema estoque;

use estoque;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on estoque.* to user@'localhost'

CREATE TABLE PRODUTO (
	ID BIGINT NOT NULL AUTO_INCREMENT,
	DESCRICAO VARCHAR(255) NOT NULL,
	VALOR_COMPRA FLOAT (4,2) NOT NULL,
	VALOR_VENDA FLOAT (4,2) NOT NULL,
	STATUS BOOLEAN NOT NULL,
	PRIMARY KEY (ID)
);

CREATE TABLE ESTOQUE (
	ID BIGINT NOT NULL AUTO_INCREMENT,
	DATA_ENTRADA_PRODUTO DATE NOT NULL,
	DATA_SAIDA_PRODUTO DATE NOT NULL,
	QUANTIDADE BIGINT NOT NULL,
	ID_PRODUTO BIGINT NOT NULL,
	PRIMARY KEY (ID),
	FOREIGN KEY ID_PRODUTO_FK (ID_PRODUTO) REFERENCES PRODUTO (ID)  
);