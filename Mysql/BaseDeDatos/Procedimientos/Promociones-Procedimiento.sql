DELIMITER /
create procedure akuavida.inserPromociones(idPromo varchar(200), descuento float, nombre varchar(60),precio float,IdProducto varchar (200))
begin
INSERT INTO `akuavida`.`promociones`
(`Id_Promocion`,
`Descuentos`,
`Nombre`,
`Precio`,
`Producto_ID_producto`)
VALUES
(idPromo,
descuento,
nombre,
precio,
IdProducto);
end /

CALL `akuavida`.`inserPromociones`
('6',
 25, 
'Lleve Su Purificador A Mitad De Precio',
 210000,
'122');

