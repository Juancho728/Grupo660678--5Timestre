DELIMITER /
create procedure akuavida.inserMunicipio(idMuni varchar (200), nombreMuni varchar(45),idDepar varchar(200))
begin
INSERT INTO `akuavida`.`municipio`
(`idMunicipio`,
`Nombre_Municipio`,
`Departamento_idDepartamento`)
VALUES
(idMuni,
nombreMuni,
idDepar);
end /

CALL `akuavida`.`inserMunicipio`
('1500',
'Tangamandapio',
 '100');



