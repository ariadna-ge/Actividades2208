package org.example;


import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;
import org.example.persistencia.LibroDAO;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        LibroDAO libroDAO = new LibroDAO();
/*        try {
            Libro res = (Libro)libroDAO.buscarPorId("1");
            System.out.println(res);
            System.out.println("-------------");
            for(Object lib: libroDAO.obtenerTodo()){
                System.out.println((Libro)lib);
            }

        } catch (SQLException sqle){
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        }
        */

/*        try {
            if (libroDAO.delete("10")) {
                System.out.println("se elimino correctamente");
            } else {
                System.out.println("no se pudo eliminar");
            }
        } catch (SQLException sqle) {
            System.out.println("Error al eliminar");
            System.out.println(sqle.getMessage());
        }
    }*/
/*
        Libro libro = new Libro(1, "El perfume", "Patrick Süskind");
        try {
            if (libroDAO.update(libro)) {
                System.out.println("Se modifico correctamente");
            } else {
                System.out.println("No se pudo modificar");
            }
        } catch (SQLException sqle) {
            System.out.println("Error al insertar");
        }*/
        Libro libro = new Libro(0, "Piensa en Java", "Bruce Eckel");
        try {
            libroDAO.insertar(libro);
        } catch (SQLException sqle) {
            System.out.println("Error al insertar");
        }
    }
/*        DemoLibroDB demo = new DemoLibroDB();
        demo.insertStatement();
        System.out.println("---- CON PREPARED ----");
        demo.insertPreparedStatement();

        Libro libro = new Libro(0, "El juego", "Desconocido");
       if (demo.insertarLibros(libro)){
           System.out.println("Se inserto correctamente");
       } else {
           System.out.println("No se inserto");
       }
        System.out.println(demo.buscarLibroPorId(100));
        System.out.println("------------");
        for (Libro tmp: demo.obtenerTodos()){
            System.out.println("Libro: " + tmp);
            System.out.println("Titulo: " + tmp.getTitulo());
        } */
}