/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ANTUNES
 */
public class UsuarioDAO {
    Connection con;
    
    public ResultSet autenticacaoUsuario(UsuarioDTO objUsuariodto){
        con = new ConexaoDAO().conexaobd();//ACESSANDO A CLASSE DE CONEXÃO E O MÉTODO
        
        try {
            String sql = "select * from admin where nome_admin = ? and senha_admin = ?";
            
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, objUsuariodto.getNome_usuario());
            pstm.setString(2, objUsuariodto.getSenha_usuario());
            
            ResultSet rst = pstm.executeQuery();
            return rst;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null,"USuarioDAO: " + erro);
            return null;
        }
    }
}
