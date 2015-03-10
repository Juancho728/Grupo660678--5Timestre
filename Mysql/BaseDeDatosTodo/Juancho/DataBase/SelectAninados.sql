select akuavida 
from ususario
where id = (select i from cuenta where id = (select Numero_Documento from cuenta where id = 1))