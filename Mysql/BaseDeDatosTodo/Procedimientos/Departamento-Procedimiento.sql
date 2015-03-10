DELIMITER /
create procedure akuavida.inserDepartamento( idDepar varchar(200), nombreDepar varchar (45) )
begin
INSERT INTO `akuavida`.`departamento`
(`idDepartamento`,
`Nombre_Departamento`)
VALUES
(idDepar,
nombreDepar);
end /

CALL `akuavida`.`inserDepartamento`
('100',
'Michupichu');

