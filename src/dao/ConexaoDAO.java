/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANTUNES
 */
public class ConexaoDAO {
    public Connection conexaobd(){
    
    Connection con = null;
    
            try {
                String url = "jdbc:mysql://localhost:3306/sistemapoo2?user=root&password=";
                con = DriverManager.getConnection(url);
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null, "Erro ConexaoDAO" + erro.getMessage());
            }
   return con;
}
}
