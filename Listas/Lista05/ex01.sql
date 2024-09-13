create database db_empresa_eventos;

use db_empresa_eventos;

create table tb_eventos(
    id int primary key,
    nome varchar(255),
    localizacao varchar(255),
    preco_ingresso DECIMAL(6,2)
 );
 
 insert into tb_eventos VALUES(1, 'Hopi hari', 'sao paulo', 200), (2, 'Rodeio', 'itaqua', 200);
select * from tb_eventos;    