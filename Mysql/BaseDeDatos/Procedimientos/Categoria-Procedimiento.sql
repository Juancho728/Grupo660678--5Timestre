DELIMITER /
create procedure akuavida.inserCategoria(IdCategoria int, nombre varchar(45), activa bool, parientico int )
begin
INSERT INTO `akuavida`.`categorias`
(`ID_Categoria`,
`Nombre`,
`Activa`,
`Pariente`)
VALUES
(IdCategoria,
nombre,
activa,
parientico);
end /

CALL `akuavida`.`inserCategoria`
(3,
 'Purificadores Gua',
1, 
1);

