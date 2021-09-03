CREATE TABLE productos
(
idproducto BIGINT NOT NULL AUTO_INCREMENT,
referencia VARCHAR(60) NOT NULL,
nombre VARCHAR(500) NOT NULL,
preciocosto NUMERIC(12,2) NOT NULL,
precioventa NUMERIC(12,2) NOT NULL,
PRIMARY KEY(idproducto)
);

CREATE UNIQUE INDEX indice_referencia ON productos(referencia);


INSERT INTO productos (referencia, nombre, preciocosto, precioventa)
VALUES ('0001', 'Computador escritorio', 1000000,1000500);

INSERT INTO productos (referencia, nombre, preciocosto, precioventa)
VALUES ('0002', 'Computador portátil', 1200000, 1700000);

INSERT INTO productos (referencia, nombre, preciocosto, precioventa)
VALUES ('0003', 'Disco duro', 80000, 120000);

INSERT INTO productos (referencia, nombre, preciocosto, precioventa)
VALUES ('0004', 'Memoria Ram', 90000, 150000);

INSERT INTO productos (referencia, nombre, preciocosto, precioventa)
VALUES ('0005', 'Fuente de poder', 50000, 60000);