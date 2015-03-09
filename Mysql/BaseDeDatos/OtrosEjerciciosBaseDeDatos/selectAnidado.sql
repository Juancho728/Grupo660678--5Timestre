select * from akuavida.pedido where ID_Factura  not in(select ID_producto from akuavida.producto where producto.Precio>=160000);

SELECT * FROM t1 WHERE column1 = (SELECT column1 FROM t2);

select * from akuavida.producto where producto.ID_producto =(select producto.ID_producto='103' from akuavida.item);

