-- select

select p.ID_producto from akuavida.producto p;
select Distinct(p.ID_producto) from akuavida.producto p;

select p.ID_producto, p.Nombre from akuavida.producto p;


select p.ID_producto, p.Nombre from akuavida.producto p where p.ID_producto>'100' order by p.Nombre;
select p.ID_producto, p.Nombre from akuavida.producto p where p.ID_producto >'100' order by p.Nombre ASC;
select p.ID_producto, p.Nombre from akuavida.producto p where p.ID_producto >'100' order by p.Nombre DESC;

select p.ID_producto, p.Nombre from akuavida.producto p where p.ID_producto >'100' order by p.Nombre DESC limit 2;
select p.ID_producto, p.Nombre from akuavida.producto p where p.ID_producto  between '100' and '105';

select * from  akuavida.cuenta c where c.Activo is false;

select p.ID_producto, p.Nombre from akuavida.producto p where p.ID_producto in ('102','103');

select * from  akuavida.producto p where  p.ID_producto like '%1';
select * from  akuavida.producto p where  p.ID_producto like '%0%';
select * from  akuavida.producto p where  p.ID_producto like '1%';
select * from  akuavida.producto p where  p.Nombre like 'A%A';

select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=1;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=2;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=3;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=4;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=5;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=6;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=7;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=8;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=9;
select
i.Producto_ID_producto, i.Cantidad, i.Costo_Unitario, i.Costo_Unitario*i.Cantidad as totalito
from akuavida.item i where i.Pedido_Factura_ID_Factura=10;

-- binary
select  p.Nombre from akuavida.producto p where Binary(Nombre)='Clean Master';
select  p.Precio from akuavida.producto p where Binary(Precio)=160000;






