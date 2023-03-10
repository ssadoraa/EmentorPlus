/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author isado
 */
public class UserEdit extends javax.swing.JFrame {
private User person = new User();
private String typeAcess;

    /**
     * Creates new form UserRegistration
     */
    public UserEdit() {
        initComponents();
        setTitle("Editar Usuário");
        getContentPane().setBackground(new Color(235,237,255));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        VisitorChoice = new javax.swing.JRadioButton();
        AdministrationChoice = new javax.swing.JRadioButton();
        UserPassword = new javax.swing.JTextField();
        UserPasswordConfirm = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        UserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        SalvedButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        UserNameSearch = new javax.swing.JTextField();
        SearchButton = new javax.swing.JButton();
        BackBotton = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(60, 117, 186));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Edição de Usuário");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        VisitorChoice.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(VisitorChoice);
        VisitorChoice.setText("Visitante");
        VisitorChoice.setEnabled(false);

        AdministrationChoice.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(AdministrationChoice);
        AdministrationChoice.setText("Administrativo");
        AdministrationChoice.setEnabled(false);
        AdministrationChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdministrationChoiceActionPerformed(evt);
            }
        });

        UserPassword.setEditable(false);

        UserPasswordConfirm.setEditable(false);

        jLabel4.setText("Repetir Senha:");
        jLabel4.setEnabled(false);

        jLabel24.setForeground(new java.awt.Color(240, 0, 0));
        jLabel24.setText("*");
        jLabel24.setEnabled(false);

        jLabel3.setText("Senha:");
        jLabel3.setEnabled(false);

        jLabel23.setForeground(new java.awt.Color(240, 0, 0));
        jLabel23.setText("*");
        jLabel23.setEnabled(false);

        UserName.setEditable(false);

        jLabel2.setText("Nome de Usuário:");
        jLabel2.setEnabled(false);

        jLabel22.setForeground(new java.awt.Color(240, 0, 0));
        jLabel22.setText("*");
        jLabel22.setEnabled(false);

        jLabel5.setText("Escolha o tipo de acesso:");
        jLabel5.setEnabled(false);

        jLabel25.setForeground(new java.awt.Color(240, 0, 0));
        jLabel25.setText("*");
        jLabel25.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23)
                            .addComponent(jLabel25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel24))
                            .addComponent(jLabel5)
                            .addComponent(AdministrationChoice))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VisitorChoice)
                            .addComponent(jLabel4)
                            .addComponent(UserPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserPasswordConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdministrationChoice)
                    .addComponent(VisitorChoice))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        SalvedButton.setBackground(new java.awt.Color(243, 243, 243));
        SalvedButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-concluido.png"))); // NOI18N
        SalvedButton.setText("Salvar");
        SalvedButton.setEnabled(false);
        SalvedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvedButtonActionPerformed(evt);
            }
        });

        CancelButton.setBackground(new java.awt.Color(243, 243, 243));
        CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-cancelar.png"))); // NOI18N
        CancelButton.setText("Cancelar");
        CancelButton.setEnabled(false);
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        jLabel6.setText("Digite o nome do usuário:");

        SearchButton.setBackground(new java.awt.Color(243, 243, 243));
        SearchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-procurar.png"))); // NOI18N
        SearchButton.setText("Procurar");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        BackBotton.setBackground(new java.awt.Color(243, 243, 243));
        BackBotton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/botao-voltar.png"))); // NOI18N
        BackBotton.setText("Voltar");
        BackBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBottonActionPerformed(evt);
            }
        });

        jLabel26.setForeground(new java.awt.Color(240, 0, 0));
        jLabel26.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CancelButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SalvedButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(UserNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(SearchButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BackBotton))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(26, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel26))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchButton)
                    .addComponent(BackBotton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvedButton)
                    .addComponent(CancelButton))
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdministrationChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdministrationChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdministrationChoiceActionPerformed

    private void BackBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBottonActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_BackBottonActionPerformed

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        if (UserNameSearch.getText().equals(""))
            JOptionPane.showMessageDialog(null, "Campo não preenchido!", "Editar Dados do Usuário", WARNING_MESSAGE);
        else{
            ConexaoMySQL conection = new ConexaoMySQL();
            person = conection.searchUser(UserNameSearch.getText());
            
            if (person != null){
                UserName.setText(person.getNome());
                UserPassword.setText(person.getSenha());
                

                UserName.setEditable(true);
                UserPassword.setEditable(true);
                UserPasswordConfirm.setEditable(true);
                
                jLabel2.setEnabled(true);
                jLabel3.setEnabled(true);
                jLabel4.setEnabled(true);
                jLabel5.setEnabled(true);
                jLabel22.setEnabled(true);
                jLabel23.setEnabled(true);
                jLabel24.setEnabled(true);
                jLabel25.setEnabled(true);

                AdministrationChoice.setEnabled(true);
                VisitorChoice.setEnabled(true);

                SalvedButton.setEnabled(true);
                CancelButton.setEnabled(true);                
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Aluno não encontrado","Alteração de Dados do Aluno",ERROR_MESSAGE);
                UserNameSearch.setText("");
            }
        }
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        UserNameSearch.setText("");
        UserName.setText("");
        UserPassword.setText("");
        UserPasswordConfirm.setText("");

        UserName.setEditable(false);
        UserPassword.setEditable(false);
        UserPasswordConfirm.setEditable(false);

        jLabel2.setEnabled(false);
        jLabel3.setEnabled(false);
        jLabel4.setEnabled(false);
        jLabel5.setEnabled(false);
        jLabel22.setEnabled(false);
        jLabel23.setEnabled(false);
        jLabel24.setEnabled(false);
        jLabel25.setEnabled(false);
        
        AdministrationChoice.setEnabled(false);
        VisitorChoice.setEnabled(false);

        SalvedButton.setEnabled(false);
        CancelButton.setEnabled(false);
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SalvedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvedButtonActionPerformed
        if (UserName.getText().equals("") || UserPassword.getText().equals("") || UserPasswordConfirm.getText().equals("") || (AdministrationChoice.isSelected() == false && VisitorChoice.isSelected() == false))
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Cadastrar Usuário", WARNING_MESSAGE);
        else {
            if (UserPassword.getText().equals(UserPasswordConfirm.getText())){
                if (AdministrationChoice.isSelected())
                    typeAcess = "Administrativo";
                else if (VisitorChoice.isSelected())
                    typeAcess = "Visitante";
                    
                ConexaoMySQL conection = new ConexaoMySQL();
                conection.updateUser(UserName.getText(), UserPassword.getText(), typeAcess);
                JOptionPane.showMessageDialog(null, "Edição Realizada com Sucesso", "Edição Usuário", INFORMATION_MESSAGE);
                setVisible(false);
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "As senhas não são iguais!", "Edição Usuário", WARNING_MESSAGE);
                UserPasswordConfirm.setText("");
            }
        }
    }//GEN-LAST:event_SalvedButtonActionPerformed

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
            java.util.logging.Logger.getLogger(UserEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton AdministrationChoice;
    private javax.swing.JButton BackBotton;
    private javax.swing.JButton CancelButton;
    private javax.swing.JButton SalvedButton;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField UserName;
    private javax.swing.JTextField UserNameSearch;
    private javax.swing.JTextField UserPassword;
    private javax.swing.JTextField UserPasswordConfirm;
    private javax.swing.JRadioButton VisitorChoice;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
