DELIMITER /
create procedure akuavida.inserDomicilio(idMuni varchar(200), tipoDocumento varchar(10),nDocumento varchar(50),city varchar(45),direccion varchar(45), telefono varchar(30))
begin
INSERT INTO `akuavida`.`domicilio`
(`Municipio_idMunicipio`,
`Cuenta_Tipo_Documento`,
`Cuenta_Numero_Documento`,
`Ciudad`,
`Direccion`,
`Telefono`)
VALUES
(idMuni,
tipoDocumento,
nDocumento,
city,
direccion,
telefono);
end /

CALL `akuavida`.`inserDomicilio`
('1500',
 'C.C',
'79351320',
 'Juanchito',
'Calle 49 M # 18 X 45 Sur',
'3132183903');

