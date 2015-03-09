DELIMITER /
create procedure akuavida.inserPedido(idFac int, fechita date, subto float, totalito float )
begin
INSERT INTO `akuavida`.`pedido`
(`Factura_ID_Factura`,
`Fecha`,
`Subtotal`,
`Total`)
VALUES
(idFac,
fechita,
subto,
totalito);
end /


CALL `akuavida`.`inserPedido`
(11,
 '2015-01-26', 
0,
0);

