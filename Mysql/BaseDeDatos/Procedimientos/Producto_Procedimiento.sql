DELIMITER /
create procedure akuavida.inserProducto(IdProducto varchar(200), nombre varchar(60), precio float ,imagen longblob ,descripcion longtext ,cantidad int ,activo bool ,impuestos float, IDCategoria int )
begin
INSERT INTO `akuavida`.`producto`
(`ID_producto`,
`Categorias_ID_Categoria`,
`Nombre`,
`Precio`,
`Imagen`,
`Descripcion`,
`Cantidad`,
`Activo`,
`impuesto`)
VALUES
(IdProducto,
IDCategoria,
nombre,
precio,
imagen,
descripcion,
cantidad,
activo,
impuestos);
end /


CALL akuavida.inserProducto('12345J', 'Fufulin' , 450000, 
 load_file("C:/Imagenes/kalifa.jpg"),  'El nuevo producto llamado Fufu Mucho Mas Rendidor Para Su Hogar'
, 4, true,16, 2 );



