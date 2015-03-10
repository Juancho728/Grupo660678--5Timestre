INSERT INTO `akuavida`.`items_del_carrito`(`Producto_ID_producto`,`Carrito_De_Compras_ID_Carrito`,`Cantidad`,`Costo_Unitario`,`Costo_Total`)
VALUES('102',1,5,(select pro.precio from akuavida.producto pro where pro.ID_producto = 102),0);

INSERT INTO `akuavida`.`items_del_carrito`(`Producto_ID_producto`,`Carrito_De_Compras_ID_Carrito`,`Cantidad`,`Costo_Unitario`,`Costo_Total`)
VALUES('103',1,2,(select pro.precio from akuavida.producto pro where pro.ID_producto = 103),0);


INSERT INTO `akuavida`.`items_del_carrito`(`Producto_ID_producto`,`Carrito_De_Compras_ID_Carrito`,`Cantidad`,`Costo_Unitario`,`Costo_Total`)
VALUES('104',1,3,(select pro.precio from akuavida.producto pro where pro.ID_producto = 104),0);


INSERT INTO `akuavida`.`items_del_carrito`(`Producto_ID_producto`,`Carrito_De_Compras_ID_Carrito`,`Cantidad`,`Costo_Unitario`,`Costo_Total`)
VALUES('105',1,4,(select pro.precio from akuavida.producto pro where pro.ID_producto = 105),0);


INSERT INTO `akuavida`.`items_del_carrito`(`Producto_ID_producto`,`Carrito_De_Compras_ID_Carrito`,`Cantidad`,`Costo_Unitario`,`Costo_Total`)
VALUES('106',1,7,(select pro.precio from akuavida.producto pro where pro.ID_producto = 106),0);
INSERT INTO `akuavida`.`items_del_carrito`
(`Producto_ID_producto`,
`Carrito_De_Compras_ID_Carrito`,
`Cantidad`,
`Costo_Unitario`,
`Costo_Total`)
VALUES
(113,
2,
3,(select pro.precio from akuavida.producto pro where pro.ID_producto = 113),
0);



INSERT INTO `akuavida`.`items_del_carrito`
(`Producto_ID_producto`,
`Carrito_De_Compras_ID_Carrito`,
`Cantidad`,
`Costo_Unitario`,
`Costo_Total`)
VALUES
(114,
2,
4,
(select pro.precio from akuavida.producto pro where pro.ID_producto = 114),
0);