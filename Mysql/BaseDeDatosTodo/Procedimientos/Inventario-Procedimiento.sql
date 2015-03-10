DELIMITER /
create procedure akuavida.inserInventario(idInventario int, canti int, IdProducto varchar (200), cantidadComprada float, fechaCompra date)
begin
INSERT INTO `akuavida`.`inventario`
(`ID_Inventario`,
`Cantidad`,
`Producto_ID_producto`,
`Cantidad_Producto_Comprado`,
`Fecha_De_Compra`)
VALUES
(idInventario,
canti,
idProducto,
cantidadComprada,
fechaCompra);
end /


CALL `akuavida`.`inserInventario`
(6, 
10, 
'115', 
20, 
'2015-02-25');
