package com.myplatzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {

    public Connection get_connection(){
        Connection conection = null;
        try{
            conection = DriverManager.getConnection("jdbc:mysql://localhost:33065/mensajes_app","root","");

        }catch(SQLException e) {
            System.out.println(e);
        }
        return conection;

    }

}