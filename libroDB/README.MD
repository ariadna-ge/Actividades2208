# DataBase, SQLite y JDBC

En dicho proyecto se aprendió a manejar:

 **SQL CREATE TABLE**
 

    CREATE TABLE _table_name_ (  
    _column1 datatype_,  
    _column2 datatype_,  
    _column3 datatype_,  
    ....  
    );

**SQL INSERT INTO**

    INSERT INTO _table2_  
    SELECT * FROM _table1  
    _WHERE _condition_;
  
  **SQL UPDATE**

    UPDATE _table_name_  
    SET _column1_ = _value1_, _column2_ = _value2_, ...  
    WHERE _condition_;

**SQL SELECT**

    SELECT _column1_, _column2, ..._  
    FROM _table_name_;

>      SELECT * FROM _table_name_;

**SQL DELETE**

    DELETE FROM _table_name_ WHERE _condition_;

## PROYECTO REALIZADO
> El proyecto es un seguimiento del video [**Uso Básico de DB Browser for SQLite, JDBC parte 1. Conexión a bases de datos con Java.**](https://youtu.be/qsAIND-OCJw)

**SCRIPTS**

    CREATE TABLE "libros" 
    ( "id" INTEGER, 
    "titulo" TEXT NOT NULL, 
    "autor" TEXT NOT NULL, 
    PRIMARY KEY("id" AUTOINCREMENT) 
    );

    CREATE TABLE "peliculas" 
    ( "id" INTEGER, 
    "nombre" TEXT, 
    "duracion" INTEGER, 
    PRIMARY KEY("id" AUTOINCREMENT) 
    );

