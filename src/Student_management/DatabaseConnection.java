/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student_management;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author mypc
 */
public class DatabaseConnection {
           /*Class.forName("java.sql.DriverManager");
           Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","Daya@1208");
           Statement stmt=(Statement)con.createStatement();*/
        final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        final static String DB_URL = "jdbc:mysql://localhost:3306/student_db";
        final static String USER="root";
        final static String PASS ="Daya@1208";
        public static Connection connection(){
    try{
          Class.forName(JDBC_DRIVER);
          Connection conn=DriverManager.getConnection(DB_URL,USER,PASS);
          return conn;
    }catch(Exception e){
          JOptionPane.showMessageDialog(null,e);
          return null;
        }
        
    }
}
//It seems that you're trying to cast a `com.mysql.cj.jdbc.ConnectionImpl` object to a `com.sun.jdi.connect.spi.Connection` object, which is causing the exception. Make sure that you're using the correct class for the casting.