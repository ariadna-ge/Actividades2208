package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        LeerArchivo lectura = new LeerArchivo();
        try{
            lectura.leer("datos.txt");
        } catch (IOException e){
            e.printStackTrace();
        }
        // lectura.leer("datos.txt");

       /* try {
            lectura.metodoUno("ee.txt");
        } catch (IOException e){
            e.printStackTrace();
        }*/
    }
}