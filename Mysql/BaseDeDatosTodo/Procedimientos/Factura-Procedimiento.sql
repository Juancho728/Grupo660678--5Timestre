DELIMITER /
create procedure akuavida.inserFactura(idFac int , fechita date, tipoDocumento varchar(10), nDocumento varchar (50))
begin
INSERT INTO `akuavida`.`factura`
(`ID_Factura`,
`Fecha`,
`Cuenta_Tipo_Documento`,
`Cuenta_Numero_Documento`)
VALUES
(idFac,
fechita,
tipoDocumento,
nDocumento);
end /

CALL `akuavida`.`inserFactura`
(11,
'2015-01-26',
'C.C',
'79351320');

