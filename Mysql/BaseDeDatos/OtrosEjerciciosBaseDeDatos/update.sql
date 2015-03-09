-- update cascada en producto

UPDATE `akuavida`.`producto` SET `ID_producto`='110234' WHERE `ID_producto`='11023';

-- update cascada en cuenta

UPDATE `akuavida`.`cuenta` SET `Tipo_Documento`='C.C', `Numero_Documento`='10' WHERE `Tipo_Documento`='T.T' and`Numero_Documento`='1065916645';

-- update cascada en departamento
UPDATE `akuavida`.`departamento` SET `idDepartamento`='13' WHERE `idDepartamento`='206489';

-- update cascada en municipio

UPDATE `akuavida`.`municipio` SET `idMunicipio`='200000' WHERE `idMunicipio`='20004';


update akuavida.cuenta  cu set cu.Primer_Nombre='Juan', cu.Segundo_Nombre='Sebastian', cu.Primer_Apellido='Contreras', cu.Segundo_Apellido='Palacios' where cu.Tipo_Documento='C.C' and cu.Numero_Documento='10';
update akuavida.cuenta  cu set cu.Primer_Nombre='Juancho', cu.Segundo_Nombre='Cristian', cu.Primer_Apellido='Gomez', cu.Segundo_Apellido='Sepulveda' where cu.Tipo_Documento='C.C' and cu.Numero_Documento='1033790199';
update akuavida.cuenta  cu set cu.Primer_Nombre='Oscar', cu.Segundo_Nombre='Eduardo', cu.Primer_Apellido='Romero', cu.Segundo_Apellido='Marin' where cu.Tipo_Documento='Cedula' and cu.Numero_Documento='1023014938';

update akuavida.producto cu set cu.Nombre='Super Star' where cu.ID_producto='103';
update akuavida.producto cu set cu.Nombre='Super Star1' where cu.ID_producto='104';
update akuavida.producto cu set cu.Nombre='Super Star2' where cu.ID_producto='105';

select count(*) from akuavida.item where item.Pedido_Factura_ID_Factura=1;


select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=1;



update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=1) where Factura_ID_Factura=1;

update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=2) where Factura_ID_Factura=2;

update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=3) where Factura_ID_Factura=3;

update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=4) where Factura_ID_Factura=4;

update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=5) where Factura_ID_Factura=5;

update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=6) where Factura_ID_Factura=6;

update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=7) where Factura_ID_Factura=7;


update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=8) where Factura_ID_Factura=8;

update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=9) where Factura_ID_Factura=9;

update akuavida.pedido p set p.Subtotal=(select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=10) where Factura_ID_Factura=10;




update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=1)*1.16) where Factura_ID_Factura=1;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=2)*1.16) where Factura_ID_Factura=2;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=3)*1.16) where Factura_ID_Factura=3;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=4)*1.16) where Factura_ID_Factura=4;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=5)*1.16) where Factura_ID_Factura=5;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=6)*1.16) where Factura_ID_Factura=6;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=7)*1.16) where Factura_ID_Factura=7;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=8)*1.16) where Factura_ID_Factura=8;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=9)*1.16) where Factura_ID_Factura=9;

update akuavida.pedido p set p.Total=((select sum(i.Costo_Total) from akuavida.item i where i.Pedido_Factura_ID_Factura=10)*1.16) where Factura_ID_Factura=10;