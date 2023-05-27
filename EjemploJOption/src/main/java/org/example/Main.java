package org.example;

import org.example.controlador.ControladorEjemplo;
import org.example.vista.Ventana;

public class Main{
    public static void main(String[] args) {
        Ventana ventana = new Ventana("JOptionPane");

        //conectar vista con controlador
        ControladorEjemplo controller= new ControladorEjemplo(ventana);
    }
}