DELIMITER /
create procedure akuavida.inserItem(IdProducto varchar (200),idFac int,can int, costoTotal float, costoUni float)
begin
INSERT INTO `akuavida`.`item`
(`Producto_ID_producto`,
`Pedido_Factura_ID_Factura`,
`Cantidad`,
`Costo_Total`,
`Costo_Unitario`)
VALUES
(IdProducto,
idFac,
can,
costoTotal,
costoUni);
end /

CALL `akuavida`.`inserItem`
('122', 
11, 
10, 
0, 
0);

