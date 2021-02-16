/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vanderlei.dal;
import java.sql.*;

/**
 *
 * @author vande
 */
public class Modulo_de_conexao {
    //fazendo conexão com banco
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //Chamando driver importado
        
        String driver = "com.mysql.cj.jdbc.Driver";
        // Guardando dados
        
        String url = "jdbc:mysql://localhost:3306/_baco_de_dados_clientes";
        String user = "root";
        String password = "";
        // conectando com banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        } catch (Exception e) {
            System.out.println(e);
        
            return null;
        }
        
        
    }
}
