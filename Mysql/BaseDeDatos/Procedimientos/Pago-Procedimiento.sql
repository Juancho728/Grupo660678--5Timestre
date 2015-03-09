DELIMITER /
create procedure akuavida.inserPago(idFac int, tipoPago varchar (45), numeroTarjeta varchar (100))
begin
INSERT INTO `akuavida`.`pago`
(`Factura_ID_Factura`,
`Tipo_Pago`,
`Numero_Tarjeta`)
VALUES
(idFac,
tipoPago,
numeroTarjeta);
end /


CALL `akuavida`.`inserPago`
(11, 
'Tarjeta Credito',
 '3456 6578 9009 8462');

