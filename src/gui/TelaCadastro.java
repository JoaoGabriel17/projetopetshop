/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.ClienteDAO;
import dto.ClienteDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rafael e joão gabriel
 */
public class TelaCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadastro() {
        initComponents();
        listarCampos();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txttelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtespecie = new javax.swing.JTextField();
        txtraca = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        btneditar = new javax.swing.JButton();
        btndeletar = new javax.swing.JButton();
        btnsalvar = new javax.swing.JButton();
        btnlimpar = new javax.swing.JButton();
        txtagendamento = new javax.swing.JFormattedTextField();
        txtfuncionario = new javax.swing.JTextField();
        txttipo = new javax.swing.JTextField();
        txtnome = new javax.swing.JTextField();
        txtnomepet = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Cliente");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 50, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nome:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 40, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Email:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Telefone:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 60, 20));
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 120, -1));

        txttelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttelefoneActionPerformed(evt);
            }
        });
        getContentPane().add(txttelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 120, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Animal");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 50, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 40, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Raça:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 30, 20));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Espécie:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, -1, 20));
        getContentPane().add(txtespecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 120, -1));
        getContentPane().add(txtraca, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 120, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Serviço");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 50, 20));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Tipo:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 40, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Funcionário:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 70, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Agendamento:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, 20));

        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Email", "Telefone", "NomePet", "Raça", "Espécie", "Tipo", "Func", "Agenda"
            }
        ));
        tabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 680, 190));

        btneditar.setText("Editar");
        btneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditarActionPerformed(evt);
            }
        });
        getContentPane().add(btneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, -1, -1));

        btndeletar.setText("Deletar");
        btndeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeletarActionPerformed(evt);
            }
        });
        getContentPane().add(btndeletar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, -1, -1));

        btnsalvar.setText("Salvar");
        btnsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));

        btnlimpar.setText("Limpar");
        btnlimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimparActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        txtagendamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        getContentPane().add(txtagendamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 140, -1));
        getContentPane().add(txtfuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 140, -1));
        getContentPane().add(txttipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 140, -1));
        getContentPane().add(txtnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 120, -1));
        getContentPane().add(txtnomepet, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 120, -1));

        txtcodigo.setEditable(false);
        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Código:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/application_home.png"))); // NOI18N
        jMenu1.setText("Home");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/user_add.png"))); // NOI18N
        jMenu2.setText("Cadastrar");
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report.png"))); // NOI18N
        jMenu3.setText("Relatório");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalvarActionPerformed
        salvarCampos();
        listarCampos();
        limparCampos();
    }//GEN-LAST:event_btnsalvarActionPerformed

    private void btnlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimparActionPerformed
        // TODO add your handling code here:
        limparCampos();
    }//GEN-LAST:event_btnlimparActionPerformed

    private void txttelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttelefoneActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        TelaPrincipal nomeVariavel = new TelaPrincipal();
        nomeVariavel.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        TelaRelatorio nomeVariavel = new TelaRelatorio();
        nomeVariavel.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void tabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMouseClicked
        selectRegistryTable();
    }//GEN-LAST:event_tabelaMouseClicked

    private void btndeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeletarActionPerformed
        // TODO add your handling code here:
        
        deletarCampos();
        listarCampos();
        limparCampos();
    }//GEN-LAST:event_btndeletarActionPerformed

    private void btneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditarActionPerformed
        // TODO add your handling code here:
        editarCampos();
        listarCampos();
        limparCampos();
    }//GEN-LAST:event_btneditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastro().setVisible(true);
            }
        });
    }

    private void salvarCampos() {
        // TODO add your handling code here:
        if (txtnome.getText().isEmpty() && txtemail.getText().isEmpty() && txttelefone.getText().isEmpty() && txtnomepet.getText().isEmpty() && txtraca.getText().isEmpty() && txtespecie.getText().isEmpty() && txttipo.getText().isEmpty() && txtfuncionario.getText().isEmpty() && txtagendamento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");

        } else {

            String nome_cliente;
            String email_cliente;
            String telefone_cliente;
            String nome_animal;
            String raca_animal;
            String especie_animal;
            String tipo_servico;
            String funcionario_servico;
            String agendamento_servico;

            nome_cliente = txtnome.getText();
            email_cliente = txtemail.getText();
            telefone_cliente = txttelefone.getText();
            nome_animal = txtnomepet.getText();
            raca_animal = txtraca.getText();
            especie_animal = txtespecie.getText();
            tipo_servico = txttipo.getText();
            funcionario_servico = txtfuncionario.getText();
            agendamento_servico = txtagendamento.getText();

            ClienteDTO objclientedto = new ClienteDTO();
            objclientedto.setNome_cliente(nome_cliente);
            objclientedto.setEmail_cliente(email_cliente);
            objclientedto.setTelefone_cliente(telefone_cliente);
            objclientedto.setNome_animal(nome_animal);
            objclientedto.setRaca_animal(nome_animal);
            objclientedto.setEspecie_animal(nome_animal);
            objclientedto.setTipo_servico(tipo_servico);
            objclientedto.setFuncionario_servico(funcionario_servico);
            objclientedto.setAgendamento_servico(agendamento_servico);

            ClienteDAO objclientedao = new ClienteDAO();
            objclientedao.cadastrarCliente(objclientedto);

        }
    }

    private void limparCampos() {
        
        txtcodigo.setText("");
        txtnome.setText("");
        txtemail.setText("");
        txttelefone.setText("");
        txtnomepet.setText("");
        txtraca.setText("");
        txtespecie.setText("");
        txttipo.setText("");
        txtfuncionario.setText("");
        txtagendamento.setText("");
        txtnome.requestFocus();

    }

    private void listarCampos() {
        try {
            ClienteDAO objClienteDAO = new ClienteDAO();

            DefaultTableModel model = (DefaultTableModel) tabela.getModel();
            model.setNumRows(0);

            ArrayList<ClienteDTO> listar = objClienteDAO.PesquisarCliente();

            for (int num = 0; num < listar.size(); num++) {
                model.addRow(new Object[]{
                    listar.get(num).getId_cliente(),
                    listar.get(num).getNome_cliente(),
                    listar.get(num).getEmail_cliente(),
                    listar.get(num).getTelefone_cliente(),
                    listar.get(num).getNome_animal(),
                    listar.get(num).getRaca_animal(),
                    listar.get(num).getEspecie_animal(),
                    listar.get(num).getTipo_servico(),
                    listar.get(num).getFuncionario_servico(),
                    listar.get(num).getAgendamento_servico(),});
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Listar Valores" + erro);
        }
    }
    
    private void editarCampos(){
            int id_cliente;
            String nome_cliente;
            String email_cliente;
            String telefone_cliente;
            String nome_animal;
            String raca_animal;
            String especie_animal;
            String tipo_servico;
            String funcionario_servico;
            String agendamento_servico;
            
            id_cliente = Integer.parseInt(txtcodigo.getText());
            nome_cliente = txtnome.getText();
            email_cliente = txtemail.getText();
            telefone_cliente = txttelefone.getText();
            nome_animal = txtnomepet.getText();
            raca_animal = txtraca.getText();
            especie_animal = txtespecie.getText();
            tipo_servico = txttipo.getText();
            funcionario_servico = txtfuncionario.getText();
            agendamento_servico = txtagendamento.getText();

            ClienteDTO objclientedto = new ClienteDTO();
            objclientedto.setId_cliente(id_cliente);
            objclientedto.setNome_cliente(nome_cliente);
            objclientedto.setEmail_cliente(email_cliente);
            objclientedto.setTelefone_cliente(telefone_cliente);
            objclientedto.setNome_animal(nome_animal);
            objclientedto.setRaca_animal(nome_animal);
            objclientedto.setEspecie_animal(nome_animal);
            objclientedto.setTipo_servico(tipo_servico);
            objclientedto.setFuncionario_servico(funcionario_servico);
            objclientedto.setAgendamento_servico(agendamento_servico);

            ClienteDAO objclientedao = new ClienteDAO();
            objclientedao.editarCliente(objclientedto);
    }
    
    private void deletarCampos(){
        int id_cliente;
        
        id_cliente = Integer.parseInt(txtcodigo.getText());
        
        ClienteDTO objClienteDTO = new ClienteDTO();
        objClienteDTO.setId_cliente(id_cliente);
        
        ClienteDAO objClienteDAO = new ClienteDAO();
        objClienteDAO.deletarCliente(objClienteDTO);
    }

    private void selectRegistryTable() {
        //txtID.setText(tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 0).toString());
        txtcodigo.setText(tabela.getValueAt(tabela.getSelectedRow(), 0).toString());

        //Object objNome = tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 1);
        //txtNome.setText(tbListagemUsuario.getValueAt(tbListagemUsuario.getSelectedRow(), 1).toString());
        txtnome.setText(tabela.getValueAt(tabela.getSelectedRow(), 1).toString());
        txtemail.setText(tabela.getValueAt(tabela.getSelectedRow(), 2).toString());
        txttelefone.setText(tabela.getValueAt(tabela.getSelectedRow(), 3).toString());
        txtnomepet.setText(tabela.getValueAt(tabela.getSelectedRow(), 4).toString());
        txtraca.setText(tabela.getValueAt(tabela.getSelectedRow(), 5).toString());
        txtespecie.setText(tabela.getValueAt(tabela.getSelectedRow(), 6).toString());
        txttipo.setText(tabela.getValueAt(tabela.getSelectedRow(), 7).toString());
        txtfuncionario.setText(tabela.getValueAt(tabela.getSelectedRow(), 8).toString());
        txtagendamento.setText(tabela.getValueAt(tabela.getSelectedRow(), 9).toString());

    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndeletar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnlimpar;
    private javax.swing.JButton btnsalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabela;
    private javax.swing.JFormattedTextField txtagendamento;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtespecie;
    private javax.swing.JTextField txtfuncionario;
    private javax.swing.JTextField txtnome;
    private javax.swing.JTextField txtnomepet;
    private javax.swing.JTextField txtraca;
    private javax.swing.JTextField txttelefone;
    private javax.swing.JTextField txttipo;
    // End of variables declaration//GEN-END:variables
}
