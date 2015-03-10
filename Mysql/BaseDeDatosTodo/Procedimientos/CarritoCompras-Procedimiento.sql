DELIMITER /
create procedure akuavida.inserCarrito(IdCarro int, Totalito float, subTotalito float )
begin
INSERT INTO `akuavida`.`carrito_de_compras`
(`ID_Carrito`,
`Total`,
`Subtotal`)
VALUES
(IdCarro,
Totalito,
subTotalito);
end /

CALL akuavida.inserCarrito 
(3,
0,
 0);




