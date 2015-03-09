DELIMITER /
create procedure akuavida.inserItemCarrito(idProducto varchar (200),idCarrito int, can int, costoUni float, costoTotal float)
begin
INSERT INTO `akuavida`.`items_del_carrito`
(`Producto_ID_producto`,
`Carrito_De_Compras_ID_Carrito`,
`Cantidad`,
`Costo_Unitario`,
`Costo_Total`)
VALUES
(idProducto,
idCarrito,
can,
costoUni,
costoTotal);
end /

CALL `akuavida`.`inserItemCarrito`
('122',
 3,
 100, 
420000, 
0);

