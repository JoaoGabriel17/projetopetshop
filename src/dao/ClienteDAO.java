/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ANTUNES
 */
public class ClienteDAO {
    Connection con;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClienteDTO> listar = new ArrayList<>();
    
    public void cadastrarCliente(ClienteDTO objclientedto){
        String sql = "insert into cliente (nome_cliente, email_cliente, telefone_cliente, nome_animal, raca_animal, especie_animal, tipo_servico, funcionario_servico, agendamento_servico) values (?,?,?,?,?,?,?,?,?)";
        con = new ConexaoDAO().conexaobd();
        
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objclientedto.getNome_cliente());
            pstm.setString(2, objclientedto.getEmail_cliente());
            pstm.setString(3, objclientedto.getTelefone_cliente());
            pstm.setString(4, objclientedto.getNome_animal());
            pstm.setString(5, objclientedto.getRaca_animal());
            pstm.setString(6, objclientedto.getEspecie_animal());
            pstm.setString(7, objclientedto.getTipo_servico());
            pstm.setString(8, objclientedto.getFuncionario_servico());
            pstm.setString(9, objclientedto.getAgendamento_servico());
            
            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Cadastrar" + erro);
        }
    }
    
     public ArrayList<ClienteDTO> PesquisarCliente(){
        String sql = "select * from cliente";
        con = new ConexaoDAO().conexaobd();
        
        try {
            pstm = con.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ClienteDTO objcClienteDTO = new ClienteDTO();
                objcClienteDTO.setId_cliente(rs.getInt("id_cliente"));
                objcClienteDTO.setNome_cliente(rs.getString("nome_cliente"));
                objcClienteDTO.setEmail_cliente(rs.getString("email_cliente"));
                objcClienteDTO.setTelefone_cliente(rs.getString("telefone_cliente"));
                objcClienteDTO.setNome_animal(rs.getString("nome_animal"));
                objcClienteDTO.setRaca_animal(rs.getString("raca_animal"));
                objcClienteDTO.setEspecie_animal(rs.getString("especie_animal"));
                objcClienteDTO.setTipo_servico(rs.getString("tipo_servico"));
                objcClienteDTO.setFuncionario_servico(rs.getString("funcionario_servico"));
                objcClienteDTO.setAgendamento_servico(rs.getString("agendamento_servico"));
                
                listar.add(objcClienteDTO);
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Pesquisar" + erro);
        }
        return listar;
    }
     
     public void deletarCliente(ClienteDTO objClienteDTO){
         String sql = "delete from cliente where id_cliente = ?";
         
          con = new ConexaoDAO().conexaobd();
        
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, objClienteDTO.getId_cliente());
           
            
            JOptionPane.showMessageDialog(null, "Deletado com sucesso!");
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Excluir" + erro);
        }
     }
     
     public void editarCliente(ClienteDTO objClienteDTO){
     String sql = "update cliente set nome_cliente = ?, email_cliente = ?, telefone_cliente = ?, nome_animal = ?, raca_animal = ?, especie_animal = ?, tipo_servico = ?, funcionario_servico = ?, agendamento_servico = ? where id_cliente = ?";
     
     con = new ConexaoDAO().conexaobd();
        
        try {
            
            pstm = con.prepareStatement(sql);
            pstm.setString(1, objClienteDTO.getNome_cliente());
            pstm.setString(2, objClienteDTO.getEmail_cliente());
            pstm.setString(3, objClienteDTO.getTelefone_cliente());
            pstm.setString(4, objClienteDTO.getNome_animal());
            pstm.setString(5, objClienteDTO.getRaca_animal());
            pstm.setString(6, objClienteDTO.getEspecie_animal());
            pstm.setString(7, objClienteDTO.getTipo_servico());
            pstm.setString(8, objClienteDTO.getFuncionario_servico());
            pstm.setString(9, objClienteDTO.getAgendamento_servico());
            pstm.setInt(10, objClienteDTO.getId_cliente());
               
           
            
            JOptionPane.showMessageDialog(null, "Editado com sucesso!");
            
            pstm.execute();
            pstm.close();
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "ClienteDAO Editar" + erro);
        }
     }
     }

