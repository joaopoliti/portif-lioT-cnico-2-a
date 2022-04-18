select * from brinquedos

select * from funcionario




create table Brinquedos(
	nome varchar,
	Cod int primary key,
	Localizaçao varchar,
	Altura_minima decimal (3,2),
	tipo varchar
); 

select * from Brinquedos
----------------------------------------------------------------------------------------------------


create table ingresso (
	Cod int primary key,
	quantidade int ,
	dataDeComp date ,
	valor int 
	foreign key(cod_cliente) references cliente
);
insert into ingresso 
(cod, quantidade,  dataDeComp, valor, cod_cliente)
values
(1,1, '2022-03-17', 50, 11),
(2,1, '2022-03-17', 50, 12),
(3,1, '2022-03-17', 50, 13),
(4,2, '2022-03-17', 100, 14),
(5,1, '2022-03-17', 50, 15),
(6,2, '2022-03-17', 100, 16),
(7,1, '2022-03-17', 50, 17),
(8,1, '2022-03-17', 50, 18),
(9,3, '2022-03-17', 150, 19),
(10,1, '2022-03-17', 50, 20)
----------------------------------------------------------------------------------------------------


create table cliente(
	nome varchar,
	cpf varchar,
	meiaEntrada boolean,
	cod_cliente int primary key,
	cod_alimento int,
	foreign key(cod_alimento) references alimentacao
);

insert into cliente 
(cod_cliente, cod_alimento, nome, cpf,  meiaEntrada)
values
(1, 11, 'jonas',048922519-47, true),
(2, 12, 'indiana', 54913043-16, false),
(3, 13, 'patolino', 648132469-10, true),
(4, 14, 'perlnalonga', 461325497-01, true),
(5, 15, 'taz', 786130461-04, true),
(6, 16, 'gaguinho', 461823013-68, false),
(7, 17, 'papa-leguas', 784234910-04, false),
(8, 18, 'lola', 7186991300-46, false),
(9, 19, 'kick buttowski', 4203469043-16, true),
(10, 20, 'gumball', 46231975642-00, false)

delete from cliente 
alter table cliente
add column cod_cliente int primary key;
add column cpf varchar, 
add column cod_alimento int references alimentacao;
select * from  cliente
----------------------------------------------------------------------------------------------------


create table funcionario (
	nome varchar,
	Cod int primary key,
	carga_hr int,
	salario  decimal (4,0)
	foreign key(cod_brinquedo) references brinquedo

);

----------------------------------------------------------------------------------------------------


create table alimentacao(
	tipo_comida varchar,
	Cod int primary key,
	preco decimal (3,2) ,
	nome varchar,
	cod_cliente int,
	foreign key(cod_cliente) references cliente
);

insert into alimentacao 
(tipo_comida, cod, preco, nome, cod_cliente)
values
('doce', 1, 2.50, 'kitkat', 2),
('doe', 2, 3.00, 'bolacha', 12),
('salgado', 3, 1.00, 'amendoin', 13),
('doce', 4, 2.00, 'trento', 14),
('doce', 5, 1.00, 'sonho de valsa', 15),
('salgado', 6, 5.00, 'salgadinho', 16),
('salgado ', 7, 8.00, 'crepe', 17),
('doce', 8, 5.00, 'brigadeiro', 18),
('doce', 9, 4.50, 'algodao doce', 19),
('doce', 10, 5.00, 'pipoca', 20)
----------------------------------------------------------------------------------------------------

