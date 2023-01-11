/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author isado
 */
public class UserList extends javax.swing.JFrame {

    /**
     * Creates new form UserList
     */
    public UserList() {
        initComponents();
        setTitle("Listagem de Usuários");
        getContentPane().setBackground(new Color(235,237,255));
        
        searchUsersList();
        if (UsersTable.getRowCount() == 0)
            JOptionPane.showMessageDialog(null, "No momento não há usuários cadastrados.", "Listar Usuário", INFORMATION_MESSAGE);
        else
            DeleteButton.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        UsersTable = new javax.swing.JTable();
        BackBotton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 117, 186));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listagem dos Usuário Cadastrados");

        UsersTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuário", "Tipo de Acessor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(UsersTable);

        BackBotton.setBackground(new java.awt.Color(243, 243, 243));
        BackBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-voltar.png"))); // NOI18N
        BackBotton.setText("Voltar");
        BackBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBottonActionPerformed(evt);
            }
        });

        DeleteButton.setBackground(new java.awt.Color(243, 243, 243));
        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-excluir.png"))); // NOI18N
        DeleteButton.setText("Excluir");
        DeleteButton.setEnabled(false);
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(BackBotton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteButton))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DeleteButton)
                    .addComponent(BackBotton))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBottonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BackBottonActionPerformed
    
    public void searchUsersList(){
        ConexaoMySQL conection = new ConexaoMySQL();
        Connection conexao = conection.realizaConexao();
        
        DefaultTableModel Table = (DefaultTableModel) UsersTable.getModel();
        
        while (Table.getRowCount() > 0)
            Table.removeRow(0);
        
        try {
            String sql_select_user_list = "SELECT * FROM ementorplus.usuario";
            PreparedStatement Atuador_select_user_list = conexao.prepareStatement(sql_select_user_list);
            ResultSet Result_select = Atuador_select_user_list.executeQuery();
            
            while (Result_select.next()){
                Table.addRow(new Object [] {Result_select.getString("Nome"), Result_select.getString("TipoAcesso")});
            }
            
            Result_select.close();
            Atuador_select_user_list.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Algum imprevisto ocorreu "+e+"","ERRO", JOptionPane.ERROR_MESSAGE);
        }
        conection.desconectaMySQL(conexao);
    }
    
    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        if (UsersTable.getSelectedRow() != -1){
            ConexaoMySQL conection = new ConexaoMySQL();
            int line = UsersTable.getSelectedRow();
            String Name = (UsersTable.getModel().getValueAt(line, 0).toString());
            int option = JOptionPane.showConfirmDialog(null, "Deseja deletar o usuário ?", "Excluir Usuário", YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION){
                conection.RemoveUser(Name);
                ((DefaultTableModel) UsersTable.getModel()).removeRow(UsersTable.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Usuário Excluido com Sucesso.", "Excluir Usuário", WARNING_MESSAGE);
                conection.RemovePerson(Name);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "É necessário selecionar um usuário para exclusão.", "Excluir Aluno", WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBotton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JTable UsersTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
