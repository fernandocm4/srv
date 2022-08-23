/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package srvDAO;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Fernando Candido
 */
public class ConnectionFactory {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "mysql_db1243";
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/banco?useTimezone=true&serverTimezone=UTC";
    
    public static Connection createConnectionToMySQL()throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        
        return connection;
    }
    
    
    public static void main(String[] args) throws Exception{
        Connection conn = createConnectionToMySQL();
        
        if(conn!=null){
            System.out.println("Conexao obtida com sucesso!");
            conn.close();
        }
    }
}