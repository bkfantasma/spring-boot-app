create schema estoqueMinusculo;

use estoqueMinusculo;

create table produto (
id bigint not null auto_increment,
descricao varchar(255) not null,
valor_compra decimal (10,2),
valor_venda decimal (10,2),
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
