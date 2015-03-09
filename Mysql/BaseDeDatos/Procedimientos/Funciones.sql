create function akuavida.text6(s varchar(20))
returns char (50)
return concat ('Hola',s,'!')
;

drop function akuavida.text6;


show create function akuavida.text;

show create function akuavida.text6;

select akuavida.text6 (' Juancho');

