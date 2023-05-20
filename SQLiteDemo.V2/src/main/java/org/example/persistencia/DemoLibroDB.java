package org.example.persistencia;

import org.example.modelo.Libro;

import java.lang.module.ResolutionException;
import java.sql.*;
import java.util.ArrayList;

public class DemoLibroDB {
    public DemoLibroDB() {
    }

    public void insertStatement() {
        String elTitulo = "Arrancame la vida";
        String elAutor = "Angeles Mastretta";

        try {
            Statement stm = ConexionSingleton.getInstance("librosDB.db").getConnection().createStatement();
            String sqlInsert = "INSERT INTO libros(titulo,autor) VALUES('" + elTitulo + "','" + elAutor + "')";
            int rowCount = stm.executeUpdate(sqlInsert);
            System.out.println("Se insertaron " + rowCount + " registros");

        } catch (SQLException sqle) {
            System.out.println("Error al conectar" + sqle.getMessage());
        }
    }

    public void insertPreparedStatement() {
        String elTitulo = "El principito";
        String elAutor = "Antoine de Saint-Exupery";
        String sqlInsert = "INSERT INTO libros(titulo,autor) VALUES (?,?)";
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, elTitulo);
            pstm.setString(2, elAutor);
            int rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");
        } catch (SQLException sqle) {
            System.out.println("Error PreparedStatement" + sqle.getMessage());
        }
    }

    public boolean insertarLibros(Libro libro) {
        String sqlInsert = "INSERT INTO libros(titulo,autor) VALUES ( ?,?)";
        int rowCount = 0;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sqlInsert);
            pstm.setString(1, libro.getTitulo());
            pstm.setString(2, libro.getAutor());
            rowCount = pstm.executeUpdate();
            System.out.println("Se insertaron " + rowCount + " registros");
        } catch (SQLException sqle) {
            System.out.println("Error PreparedStatement" + sqle.getMessage());
        }
        return rowCount > 0;
    }

    public Libro buscarLibroPorId(int id) {
        String sql = "SELECT * FROM libros WHERE id = ?; ";
        Libro libro = null;
        try {
            PreparedStatement pstm = ConexionSingleton.getInstance("librosDB.db").getConnection().prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rst = pstm.executeQuery();
            if (rst.next()) {
                libro = new Libro(rst.getInt(1), rst.getString(1), rst.getString(2));
            }
        } catch (SQLException sqle) {
            System.out.println("Error al buscar");
        }
        return libro;
    }

    public ArrayList<Libro> obtenerTodos() {
        String sql = "SELECT * FROM libros";
        ArrayList<Libro> resultado = new ArrayList<>();
        try{
            Statement stm = ConexionSingleton.getInstance("librosDB.db").getConnection().createStatement();
            ResultSet rst = stm.executeQuery(sql);
            while (rst.next()){
                resultado.add(new Libro(rst.getInt(1), rst.getString(2), rst.getString(3)));
            }
        } catch (SQLException sqlException){
            System.out.println(sqlException.getMessage());
        }
        return resultado;
    }
}
