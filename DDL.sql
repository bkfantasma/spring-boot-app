create schema estoqueMinusculo;

use estoqueMinusculo;

create table produto (
id bigint not null auto_increment,
descricao varchar(255) not null,
<<<<<<< HEAD
valor_compra float (10,2),
valor_venda float (10,2),
=======
valor_compra decimal (10,2),
valor_venda decimal (10,2),
>>>>>>> 9cb1dd5214916c9260180a9aa4d18f79eea528d0
status boolean not null,
primary key (id)
);

create table estoque (
id bigint not null auto_increment,
data_entrada_produto timestamp not null,
data_saida_produto timestamp not null,
quantidade bigint not null,
id_produto bigint not null,
primary key (id),
foreign key id_produto_fk (id_produto) references produto(id) 
);
