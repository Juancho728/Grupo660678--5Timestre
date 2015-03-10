DELIMITER /
create procedure akuavida.inserUsuario(idUsuario varchar(45), clave varchar (45), Rol varchar(45),Estado varchar(45))
begin 
INSERT INTO `akuavida`.`ususario`
(`idUsusario`,
`password`,
`rol`,
`estado`)
VALUES
(idUsuario,
clave,
Rol,
Estado);
end /


CALL `akuavida`.`inserUsuario`
('6',
'24680',
'Cliente',
'Activo');
