-- esto es un comentario
-- eliminamos la base de datos si existe
drop database if exists clb_store;

-- creamos la base de datos
create database clb_store;

-- seleccionamos la base de datos
use clb_store;

-- eliminamos la tabla si existe
drop table if exists categoria;

-- creamos la tabla categoria
create table categoria(
idCat int primary key auto_increment,
nomCat varchar(100) binary character set utf8 collate utf8_bin not null,
estcat bit not null
)engine=InnoDB character set=utf8;

-- insertando datos a la tabla
insert into categoria(nomCat,estCat) 
values('SmartWatch',1);
insert into categoria(nomCat,estCat) 
values('Audífonos',1);
insert into categoria(nomCat,estCat) 
values('Jugueteria',1);

-- mostrando los datos insertado a la tabla
select * from categoria;

-- creamos la tabla distrito
create table distrito(
iddistri int primary key auto_increment,
nomdistri varchar(100) binary character set utf8 collate utf8_bin not null,
estdistri bit not null
)engine=InnoDB character set=utf8;

-- insertando datos a la tabla
insert into distrito(nomdistri,estdistri) 
values('SJL',1);
insert into distrito(nomdistri,estdistri) 
values('Villa Maria del Triunfo',1);
insert into distrito(nomdistri,estdistri) 
values('Villa El Salvador',1);
insert into distrito(nomdistri,estdistri) 
values('Cercado de Lima',1);
insert into distrito(nomdistri,estdistri) 
values('Rimac',1);

-- mostrando los datos insertado a la tabla
select * from distrito;


-- creamos la tabla cliente
create table cliente(
idcliet int primary key auto_increment,
usuario varchar(40) binary character set utf8 collate utf8_bin not null,
clave varchar(40) binary character set utf8 collate utf8_bin not null,
iddistri int not null,
nombre varchar(40) binary character set utf8 collate utf8_bin not null,
apellido varchar(100) binary character set utf8 collate utf8_bin not null,
direccion varchar(255) binary character set utf8 collate utf8_bin not null,
sexo varchar(1) binary character set utf8 collate utf8_bin not null,
celular varchar(100) binary character set utf8 collate utf8_bin not null,
dni varchar(100) binary character set utf8 collate utf8_bin not null,
estclie bit not null,
idventclie int not null,
foreign key (iddistri) references distrito(iddistri)
)engine=InnoDB character set=utf8;

-- insertando datos a la tabla
insert into cliente(iddistri,usuario,clave,nombre,apellido,direccion,sexo,celular,dni,estclie, idventclie) 
values(1,'pepito','elgrillo2022','pepe','grillo','SJL','M','987654321','45126345',1,1);
insert into cliente(iddistri,usuario,clave,nombre,apellido,direccion,sexo,celular,dni,estclie, idventclie)
values(2,'sandrach','chambvmt','Sandra','Chambilla','Villa Maria del Triunfo','F','963258741','47852136',1,2);
insert into cliente(iddistri,usuario,clave,nombre,apellido,direccion,sexo,celular,dni,estclie, idventclie) 
values(4,'leo20','juegodetronos','Leonardo','Obregon','Cercado de Lima','M','951236874','75369842',1,3);
insert into cliente(iddistri,usuario,clave,nombre,apellido,direccion,sexo,celular,dni,estclie, idventclie)
values(2,'elbambino','lospolloshermanos','Hector','Salamanca','Villa El Salvador','M','986753421','42687931',1,4);
insert into cliente(iddistri,usuario,clave,nombre,apellido,direccion,sexo,celular,dni,estclie, idventclie)
values(2,'elhombrerosado','metasmetas','Jesse','Pinkman','Rimac','M','971236485','49286173',1,5);

-- mostrando los datos insertado a la tabla
select * from cliente;


-- creamos la tabla producto
create table producto(
idPro int primary key auto_increment,
nompro varchar(100) binary character set utf8 collate utf8_bin not null,
idCat int not null,
Descri varchar(255) binary character set utf8 collate utf8_bin not null,
Stock int not null,
Prec double not null,
est bit not null,
foreign key (idCat) references categoria(idCat)
)engine=InnoDB character set=utf8;

-- insertando datos a la tabla
insert into producto(nompro,idCat,Descri,Stock,Prec,est) 
values('SmartWatch FD68S',1,'Relo inteligenteeee',10, 37.9, 1);
insert into producto(nompro,idCat,Descri,Stock,Prec,est) 
values('AirPods Y40',2,'Audífonos Wireless',30,33.9,1);
insert into producto(nompro,idCat,Descri,Stock,Prec,est) 
values('CigarreroNeon',3,'Incorpora un conector micro usb',20, 27.99,1);
insert into producto(nompro,idCat,Descri,Stock,Prec,est) 
values('Lampara Lunar',3, '5 modos de iluminación',10,33.99,1);
insert into producto(nompro,idCat,Descri,Stock,Prec,est) 
values('SmartWatch I7 Pro Max',1, 'Recibe llamadas, batería de 2800mAh',50,76.99,1);

-- mostrando los datos insertado a la tabla
select * from producto;


-- creamos la tabla empleado
create table roles(
idrol int primary key auto_increment,
rol varchar(100) binary character set utf8 collate utf8_bin not null,
descriprol varchar(100) binary character set utf8 collate utf8_bin not null,
est bit not null
)engine=InnoDB character set=utf8;

-- insertamos los datos a la tabla
insert into roles(rol,descriprol,est)
values ('Supervisor','supervisa las operaciones',1);
insert into roles(rol,descriprol,est)
values ('Colaborador','atención al cliente',1);
insert into roles(rol,descriprol,est)
values ('Delivery','reparto de productos',1);

-- mostramos los datos de la tabla
select * from roles;



-- creamos la tabla empleado
create table empleado(
idemple int primary key auto_increment,
idrol int not null,
usuario varchar(40) binary character set utf8 collate utf8_bin not null,
clave varchar(40) binary character set utf8 collate utf8_bin not null,
nomemp varchar(50) binary character set utf8 collate utf8_bin not null,
Apemp varchar(100) binary character set utf8 collate utf8_bin not null,
sexo varchar(10) binary character set utf8 collate utf8_bin not null,
celular varchar(100) binary character set utf8 collate utf8_bin not null,
dni varchar(100) binary character set utf8 collate utf8_bin not null,
iddistri int not null,
est bit not null,
foreign key (idrol) references roles(idrol),
foreign key (iddistri) references distrito(iddistri)
)engine=InnoDB character set=utf8;

-- insertamos los datos a la tabla
insert into empleado(idrol,usuario,clave,nomemp,Apemp,sexo,celular,dni,iddistri,est)
values (2,'luisalas','salitas2022','Luis', 'Salas','M','942861735','456123987',1,1);
insert into empleado(idrol,usuario,clave,nomemp,Apemp,sexo,celular,dni,iddistri,est)
values (2,'pedrito','contraseña','Pedro', 'Dueñas','M','986142753','75698432',2,1);
insert into empleado(idrol,usuario,clave,nomemp,Apemp,sexo,celular,dni,iddistri,est)
values (2,'nandito','lopez1456','Fernando', 'Lopez','M','963152847','43872619',3,1);
insert into empleado(idrol,usuario,clave,nomemp,Apemp,sexo,celular,dni,iddistri,est)
values (1,'davidch','chambilla7','Axel', 'Chambilla','M','934269445','71326566',4,1);
insert into empleado(idrol,usuario,clave,nomemp,Apemp,sexo,celular,dni,iddistri,est)
values (3,'lalito','cansancio','Lalo', 'Cansas','M','995587364','77948563',5,1);

-- mostramos los datos de la tabla
select * from empleado;

-- creamos la tabla venta
create table venta(
idvent int primary key auto_increment,
idpro int not null,
idcat int not null,
nompro varchar(40) binary character set utf8 collate utf8_bin not null, 
idcliet int not null,
cantidad int not null,
fechavent date,
idemple int not null,
costoventatotal double not null,
prec double not null,
estvent bit not null,
foreign key (idcliet) references cliente(idcliet),
foreign key (idemple) references empleado(idemple)
)engine=InnoDB character set=utf8;

-- insertando datos a la tabla
insert into venta(idpro,idcat,nompro,idcliet,cantidad,fechavent,idemple,costoventatotal,prec,estvent)
values(2,2,'AirPods Y40',1,2,'2022-06-07',1,67.8,33.9,1); 
insert into venta(idpro,idcat,nompro,idcliet,cantidad,fechavent,idemple,costoventatotal,prec,estvent)
values(1,1,'SmartWatch FD68S',2,1,'2022-07-06',2,37.9,37.9,1); 
insert into venta(idpro,idcat,nompro,idcliet,cantidad,fechavent,idemple,costoventatotal,prec,estvent)
values(3,3,'CigarreroNeon',3,1,'2022-09-14',3,27.99,27.99,1); 
insert into venta(idpro,idcat,nompro,idcliet,cantidad,fechavent,idemple,costoventatotal,prec,estvent)
values(5,1,'SmartWatch I7 Pro Max',4,1,'2022-02-10',4,76.99,76.99,1); 
insert into venta(idpro,idcat,nompro,idcliet,cantidad,fechavent,idemple,costoventatotal,prec,estvent)
values(4,3,'Lampara Lunar',5,2,'2022-05-29',5,67.98,33.99,1);

-- mostramos los datos de la tabla
select * from venta;

-- -------------------

-- creamos la tabla venta
create table detalle_venta(
iddetalle_venta int primary key auto_increment,
idvent int not null,
idPro int not null,
Cantidad int not null,
Prec double not null,
estvent bit not null,
foreign key (idvent) references venta(idvent),
foreign key (idPro) references producto(idPro)
)engine=InnoDB character set=utf8;

-- insertando datos a la tabla
insert into detalle_venta(idvent,idPro,Cantidad,Prec,estvent)
values(1,2,2,33.9,1); 
insert into detalle_venta(idvent,idPro,Cantidad,Prec,estvent)
values(2,1,1,37.9,1); 
insert into detalle_venta(idvent,idPro,Cantidad,Prec,estvent)
values(3,3,1,27.99,1); 
insert into detalle_venta(idvent,idPro,Cantidad,Prec,estvent)
values(4,5,1,76.99,1); 
insert into detalle_venta(idvent,idPro,Cantidad,Prec,estvent)
values(5,4,2,33.99,1);

-- mostramos los datos de la tabla
select * from detalle_venta;



