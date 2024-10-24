CREATE DATABASE RepasoJAVA
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Spanish_Guatemala.1252'
    LC_CTYPE = 'Spanish_Guatemala.1252'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;

drop table if exists historial_movimientos;
drop table if exists productos;
drop table if exists categorias;





create table categorias(
	id char(4) not null,
	nombre varchar(50) not null,

	constraint categorias_pk primary key(id)
);




create table productos(
	id char(5) not null,
	nombre varchar(50) not null,
	precio_venta money not null,
	precio_compra money not null,
	id_categoria char(4) not null,

	CONSTRAINT productos_pk primary key(id),
	constraint productos_categorias_fk foreign key(id_categoria) references categorias(id)
	
);

create table historial_movimientos(
	id serial not null,
	id_producto char(5) not null,
	cantidad int not null,
	fecha_movimiento TIMESTAMP not null,

	CONSTRAINT historial_movimientos_pk primary key(id),
	constraint historial_movimientos_productos_fk foreign key(id_producto) references productos(id)
);


insert into categorias(id, nombre)
values
('C001', 'Bebidas'),
('C002', 'Snacks'),
('C003', 'Golosinas');



insert into productos (id, nombre, precio_venta, precio_compra, id_categoria)
values
('P0001', 'Coca cola 300 ml', 0.7, 55, 'C001'),
('P0002', 'Coca cola 1000 ml', 1.0, 0.8, 'C001'),
('P0003', 'Doritos 50g', 0.5, 0.42, 'C002'),
('P0004', 'Manicho', 0.25, 0.21, 'C003'),
('P0005', 'Tango', 0.5, 0.42, 'C003');


insert into historial_movimientos(id_producto, cantidad, fecha_movimiento)
values
('P0001', 10, '28/10/2020 09:45:00'),
('P0002', -3, '28/10/2020 10:49:00'),
('P0003', 5, '28/10/2020 12:23:00');



select * from productos;
select * from categorias;
select * from historial_movimientos;