package org.example.vista;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    //botones
    private JButton btnMensaje;
    private JButton btnEntrada;
    private JButton btnOpcion;
    //etiquetas
    private JLabel lblResultado;

    public JButton getBtnMensaje() {
        return btnMensaje;
    }

    public void setBtnMensaje(JButton btnMensaje) {
        this.btnMensaje = btnMensaje;
    }

    public JButton getBtnEntrada() {
        return btnEntrada;
    }

    public void setBtnEntrada(JButton btnEntrada) {
        this.btnEntrada = btnEntrada;
    }

    public JButton getBtnOpcion() {
        return btnOpcion;
    }

    public void setBtnOpcion(JButton btnOpcion) {
        this.btnOpcion = btnOpcion;
    }

    public JLabel getLblResultado() {
        return lblResultado;
    }

    public void setLblResultado(JLabel lblResultado) {
        this.lblResultado = lblResultado;
    }

    //sobreescribir el constructor de titulo
    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(450,200);

        //construccion de los botones: lanzar cada JOptionPane
        btnMensaje = new JButton("Mensaje");
        btnEntrada = new JButton("Entrada");
        btnOpcion= new JButton("Opción");
        lblResultado = new JLabel("resultado");
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(btnMensaje);
        this.getContentPane().add(btnEntrada);
        this.getContentPane().add(btnOpcion);
        this.getContentPane().add(lblResultado);


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);


    }
}
