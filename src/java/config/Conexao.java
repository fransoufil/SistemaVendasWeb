/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.DriverManager;
import java.sql.*;
//import javax.servlet.jsp.tagext.TryCatchFinally;


/**
 *
 * @author franz
 */
public class Conexao {
    
        
    public static Connection conexao(){
        
        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";

        //armazenando informações do BD
        String url = "jdbc:mysql://localhost:3306/<bancodedados>";
        //String url = "jdbc:mysql://localhost:3306/dbControleDeGastosvt";
        String user = "<usuario>";
        String password = "<senha>";

        //estabelecendo a conexao, escerve try ctrl+space enter constroi o tratamento da exceção
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
    
}
