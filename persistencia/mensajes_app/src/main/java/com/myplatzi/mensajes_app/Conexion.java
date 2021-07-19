package com.myplatzi.mensajes_app;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
    public Connection getConnection(){
        Connection connection = null;
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:33065/mensajes_app","root","");
            if (connection !=  null){
                System.out.println("conexion exitosa!");
            }
        }catch(SQLException s) {
            System.out.println(s);
        }return connection;
    }
}
