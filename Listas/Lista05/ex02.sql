create database	db_floricultura;

use db_floricultura;

create table tb_flores(
	id int primary key,
    especie varchar(244),
    preco decimal(5,2)
);

insert into tb_flores values(1, 'girassol', 39.9), (2,' rosa', 19.9);
select * from tb_flores;