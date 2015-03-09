DELIMITER /
create procedure akuavida.inserCuenta(tipoDocumento varchar(10), nDocumento varchar(50),oneNombre varchar(60),  twoNombre varchar(60), oneApellido varchar(60),twoApellido varchar(60),clave varchar(100),correito varchar(50),direccion varchar(30), telefono varchar(20),rool varchar(30),activo boolean, idUsuario varchar(20) )
begin
INSERT INTO `akuavida`.`cuenta`
(`Tipo_Documento`,
`Numero_Documento`,
`Primer_Nombre`,
`Segundo_Nombre`,
`Primer_Apellido`,
`Segundo_Apellido`,
`Contraseña`,
`Correo`,
`Direccion`,
`Telefono`,
`Rool`,
`Activo`,
`Ususario_idUsusario`)
VALUES
(tipoDocumento,
nDocumento,
oneNombre,
twoNombre,
oneApellido,
twoApellido,
clave,
correito,
direccion,
telefono,
rool,
activo,
idUsuario);
end /


CALL `akuavida`.`inserCuenta`
('C.C',
'79351320',
'Arquimedes',
 '-------', 
'Montero',
'Castro',
'24680', 
'ArquimedesMon@hotmail.com',
'Calle 49 M # 18 X 45 Sur',
 '3132183903',
'Cliente', 
1, 
'6');

