create table funcionario(

	cpf varchar primary key,
		
	cargo varchar, 
	
	carga_horaria int,
	
	nome varchar,
	
	slario decimal(7,3),
	
	ferias boolean,
	
	observacoes varchar 

);

select * from funcionario

\copy funcionario from 'C:\Users\joao_p_belluomini\Documents\funcionarios.csv' delimiter';' csv header; 

create table loja(

	COD int primary key,
	
	nome varchar

);

select * from loja

 \copy loja from 'C:\Users\joao_p_belluomini\Documents\loja.csv' delimiter';' csv header;














create table produto (
	
	COD int primary key,

	preco decimal (4,3),
	
	qtd int,

	nome varchar
	
);

select * from produto

 \copy produto from 'C:\Users\joao_p_belluomini\Documents\produto.csv' delimiter';' csv header;




create table fornecedor (
	
	COD int primary key,
	
	nome varchar,
	
	contato varchar,
	
	cnpj varchar


);
select * from fornecedor


insert into fornecedor 
(COD, nome, contato, cnpj)
values
(1, 'Romario', 'romariotatar@gmail.com', '12.924.483/0001-37');



create table pessoa (
	
	cod_carteirinha int  primary key,

	contato_emergencia varchar,
	
	nome varchar, 
	
	data_nasc date

);

select * from pessoa

insert into pessoa
(cod_carteirinha,contato_emergencia, nome, data_nasc)
values
(1, '(49)72639047', 'Marcia', '1999-01-30'),
(2, '(48)27264926', 'Pedro', '2006-05-20'),
(3, '(36)81892837', 'James', '1995-10-15');




create table bilheteria(
	
	COD int  primary key,
	
	preço decimal (4,2),
	
	meia decimal (4,2),
	
	data_compra date

);
select * from bilheteria

insert into bilheteria
(COD, preço, meia, data_compra)
values 
(1, 50.00, 25.00, '2012-01-16'),
(2, 50.00, 25.00, '2012-02-20'),
(3, 50.00, 25.00, '2012-03-28'),
(4, 50.00, 25.00, '2012-04-03');

select * from bilheteria









create table loja_franquia(
	
	cnpj varchar primary key,
	
	nome varchar,
	
	email varchar
	
	area_atuacao varchar,
	
	aluguel decimal (4,0)

);

insert into loja_franquia
(cnpj, nome, email, area_atuacao, aluguel)
values
('12.924.483/0001-37', 'MundoAnimal', 'mundoanimal@gmail.com', 'venda de roupas e brinquedos', 1800);






create table animal(
	
	COD int  primary key,
	
	nome varchar,
	
	Atributo varchar,
	
	especie varchar,
	
	idade int,
	
	classe_animal varchar

);

insert into animal 
(COD, nome, Atributo, especie, idade, classe_animal )
values
(1, 'leão', 'carnivoro', 'felino', 8, 'mamifero'),
(2, 'jacaré', 'carnivoro', 'réptil', 20, 'réptil');

create table habitat(
	
	COD int  primary key,
	
	esta_aberto boolean,
	
	qtd_comida int,
	
	qtd_animais int,
	
	nome varchar, 
	
);

insert into habitat
(COD, esta_aberto, qtd_comida, qtd_animais, nome)
values
(1, true, 500, 20, 'viveiro'),
(2, false, 1000, 30, 'aviario'),
(3, false, 300, 50, 'aquario');
