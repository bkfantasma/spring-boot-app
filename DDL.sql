create schema estoqueMinusculo;

use estoqueMinusculo;

create table produto (
    id bigint(255) not null auto_increment,
    descricao varchar(255) not null,
    valor_compra float (10,2),
    valor_venda float (10,2),
    status boolean not null,
    id_estoque bigint (255),
    primary key (id)

    -- alter table produto add constraint id_estoque_fk foreign key (id_estoque) references estoque(id);

);

create table estoque (
    id bigint (255) not null auto_increment,
    data_entrada_produto timestamp not null,
    data_saida_produto timestamp not null,
    quantidade bigint not null,
    id_produto bigint (255),
    primary key (id),
    foreign key id_produto_fk (id_produto) references produto(id) 
);
