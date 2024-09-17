create database db_escola_tech;
use db_escola_tech;

create table tb_endereco(
   id INT AUTO_INCREMENT PRIMARY KEY,
   logradouro VARCHAR(255),
   bairro VARCHAR(255),
   numero INT,
   uf CHAR(2),
   pais VARCHAR(255)
);
create table tb_filial(
  id INT AUTO_INCREMENT PRIMARY KEY,
  nome VARCHAR(255),
  cnpj CHAR(14),
  id_endereco INT,
  foreign key(id_endereco) references tb_filial(id)
);

insert into tb_endereco(logradouro, bairro, numero, uf, pais) values('rua afonso ferreira, 430', 'vila olimpia', 123 , 'sp', 'Brasil'); 
insert into tb_filial(nome, cnpj, id_endereco) values ('les', 12345678901234,  1);

select * from tb_filial;