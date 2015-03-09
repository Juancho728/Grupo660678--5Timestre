-- joins

 
-- joins implicitos

select * from akuavida.producto pro, akuavida.pedido ped, akuavida.item item
where ped.Factura_ID_Factura=item.Pedido_Factura_ID_Factura and item.Producto_ID_producto=pro.ID_producto;

-- joins explisitos 
select * from akuavida.producto pro inner join  akuavida.pedido ped inner join akuavida.item item
on ped.Factura_ID_Factura=item.Pedido_Factura_ID_Factura and item.Producto_ID_producto=pro.ID_producto;


select * from akuavida.domicilio_cuenta cu left outer join akuavida.municipio mun on  mun.idMunicipi;

-- ejercicio1
-- explisito
select item.Cantidad, pro.Nombre, item.Costo_Unitario, item.Costo_Total from akuavida.producto pro inner join  akuavida.item item inner join akuavida.pedido ped inner join akuavida.factura fac
on  pro.ID_producto=item.Producto_ID_producto and ped.Factura_ID_Factura=item.Pedido_Factura_ID_Factura and fac.ID_Factura=item.Pedido_Factura_ID_Factura where fac.ID_Factura=1;

-- implisito

select item.Cantidad, pro.Nombre, item.Costo_Unitario, item.Costo_Total from akuavida.producto pro,akuavida.item item,akuavida.pedido ped,akuavida.factura fac
where  pro.ID_producto=item.Producto_ID_producto and ped.Factura_ID_Factura=item.Pedido_Factura_ID_Factura and fac.ID_Factura=item.Pedido_Factura_ID_Factura and fac.ID_Factura=1;


-- ejercicio2

-- explisito
select cu.Primer_Nombre, dom.Direccion, dom.Telefono, mun.Nombre_Municipio, fac.ID_Factura from akuavida.factura fac inner join akuavida.cuenta cu inner join akuavida.domicilio dom inner join akuavida.municipio mun
on fac.Cuenta_Numero_Documento=cu.Numero_Documento and fac.Cuenta_Tipo_Documento=cu.Tipo_Documento and cu.Numero_Documento=dom.Cuenta_Numero_Documento and cu.Tipo_Documento=dom.Cuenta_Tipo_Documento and dom.Municipio_idMunicipio=mun.idMunicipio where fac.ID_Factura=1 ;

-- implisito

select cu.Primer_Nombre, dom.Direccion, dom.Telefono, mun.Nombre_Municipio, fac.ID_Factura from akuavida.factura fac,akuavida.cuenta cu,akuavida.domicilio dom,akuavida.municipio mun
where fac.Cuenta_Numero_Documento=cu.Numero_Documento and fac.Cuenta_Tipo_Documento=cu.Tipo_Documento and cu.Numero_Documento=dom.Cuenta_Numero_Documento and cu.Tipo_Documento=dom.Cuenta_Tipo_Documento and dom.Municipio_idMunicipio=mun.idMunicipio and fac.ID_Factura=1 ;

-- ejercicio 3

-- explisito

select cu.Primer_Nombre, fac.ID_Factura, ped.Subtotal, ped.Total from akuavida.cuenta cu inner join akuavida.factura fac inner join akuavida.pedido ped
on cu.Tipo_Documento=fac.Cuenta_Tipo_Documento and cu.Numero_Documento=fac.Cuenta_Numero_Documento and fac.ID_Factura=ped.Factura_ID_Factura where fac.ID_Factura=1;

-- implisito
select cu.Primer_Nombre, fac.ID_Factura, ped.Subtotal, ped.Total from akuavida.cuenta cu ,akuavida.factura fac,akuavida.pedido ped
where cu.Tipo_Documento=fac.Cuenta_Tipo_Documento and cu.Numero_Documento=fac.Cuenta_Numero_Documento and fac.ID_Factura=ped.Factura_ID_Factura and fac.ID_Factura=1;


-- ejercicio4
-- explisito
select cu.Primer_Nombre,fac.ID_Factura,pe.Subtotal,pe.Total,pa.Tipo_Pago from akuavida.cuenta cu inner join akuavida.factura fac inner join akuavida.pago pa inner join akuavida.pedido pe
on cu.Tipo_Documento=fac.Cuenta_Tipo_Documento and cu.Numero_Documento=fac.Cuenta_Numero_Documento and fac.ID_Factura=pa.Factura_ID_Factura and fac.ID_Factura=pe.Factura_ID_Factura where fac.ID_Factura=1;

-- implisito
select cu.Primer_Nombre,fac.ID_Factura,pe.Subtotal,pe.Total,pa.Tipo_Pago from akuavida.cuenta cu , akuavida.factura fac , akuavida.pago pa , akuavida.pedido pe
where cu.Tipo_Documento=fac.Cuenta_Tipo_Documento and cu.Numero_Documento=fac.Cuenta_Numero_Documento and fac.ID_Factura=pa.Factura_ID_Factura and fac.ID_Factura=pe.Factura_ID_Factura and fac.ID_Factura=1;

