#  EXCEPCIONES EN JAVA

## MANEJO DE EXCEPCIONES

**Importancia:** Ayuda a mejorar la calidad de nuestros programas para que terminen de forma adecuada.

**VENTAJAS**
- Separar errores del código (separas los errores de ejecución con la lógica de negocio).
- Propagar el manejo de errores por medio de una pila de error.
- Agrupar errores del tipo error.

**Propagación:**	Si una excepción no es procesada, se propaga hacia el método que llame, para que lo procese . Si no lo procesa se propaga hasta el *main*. Si al llegar a este, no se procesa, la ejecución termina abruptamente.

***Excepción:*** Error que solamente puede ocurrir en tiempo de ejecución, y o puede ser corregido en tiempo de programación.
Hace uso de las palabras reservadas: *try*, *catch*, *finally*.
![Tipos de excepciones en Java_. (n.d.). Solvetic. https://www.solvetic.com/tutoriales/article/1136-tipos-de-excepciones-en-java/](https://www.solvetic.com/uploads/monthly_09_2014/tutorials-2308-0-14559800-1409888424.jpg)
**SINTAXIS**

    try{
		    //Código que podría lanzar una excepción
    } catch (ExceptionType1 exceptionVariable1){
		    //Código para manejar la excepción de tipo ExceptionType1
    } catch (ExceptionType2 exceptionVariable2){
		    //Código para manejar la excepción de tipo ExceptionType2
    } finally {
		    //Siempre se ejecuja, incluso si lanzó una excepción
    }

**SINTAXIS PARA AGRUPAR EXCEPCIONES**

    try{
    		    //Código que genera
    		    //Excepciones
        } catch (IOException ioe){
    		    //catch accesible
        } catch (Exception e){
    		   //catch accesible
        }

## PROYECTO REALIZADO
> El proyecto es un seguimiento del vídeo [**Excepciones en Java parte 1, ICO FES Aragón UNAM.**](https://youtu.be/MOO9F0x81NE)