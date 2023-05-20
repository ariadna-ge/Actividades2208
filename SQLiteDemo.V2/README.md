# JAVA DATABASE CONNECTIVITY

### PreparedStatement
- Hereda de Statement, la especializa para poder utilizar parametros. 
- Utiliza comodines **"?"** para determinar los parámetros a enviar a la BD.
- Se compila una vez y se llama **n veces**.

<img src="sql.png" width="400"/>

### PATRÓN DE DISEÑO DAO (Data Acess Object)
* Objetivo: Encapsular la fuente de datos.
* Ocultar los métodos para acceso a datos.
* Existen arquitecturas y tecnologías que mejoran este patrón.

<img src="https://www.oscarblancarteblog.com/wp-content/uploads/2018/12/UML-clases-1024x493.png" width="400"/>


## PROYECTO REALIZADO
> El proyecto es un seguimiento del video [**Patrón de Acceso a Datos, DAO, JDBC parte 5 de conexiones a bases de datos con Java**](https://youtu.be/_ORq62VV2Yo)