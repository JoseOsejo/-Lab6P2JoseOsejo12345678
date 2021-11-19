/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6p2_joseosejo_22051056;

/**
 *
 * @author jcoq2
 */
public class PokemonFightGUI extends javax.swing.JFrame {

    /**
     * Creates new form PokemonFightGUI
     */
    public PokemonFightGUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogInPanel = new javax.swing.JPanel();
        logInLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        userTextfield = new javax.swing.JTextField();
        passwordTextfield = new javax.swing.JTextField();
        logInButton = new javax.swing.JButton();
        registrarseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LogInPanel.setBackground(new java.awt.Color(0, 0, 0));

        logInLabel.setFont(new java.awt.Font("Courier New", 1, 36)); // NOI18N
        logInLabel.setForeground(new java.awt.Color(0, 153, 0));
        logInLabel.setText("LogIn");

        userLabel.setBackground(new java.awt.Color(222, 222, 222));
        userLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        userLabel.setForeground(new java.awt.Color(0, 153, 0));
        userLabel.setText("Usuario:");

        passwordLabel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(0, 153, 0));
        passwordLabel.setText("Registro");

        userTextfield.setForeground(new java.awt.Color(0, 51, 102));

        passwordTextfield.setForeground(new java.awt.Color(0, 51, 153));
        passwordTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTextfieldActionPerformed(evt);
            }
        });

        logInButton.setBackground(new java.awt.Color(0, 0, 0));
        logInButton.setForeground(new java.awt.Color(0, 153, 0));
        logInButton.setText("Ingresar");

        registrarseButton.setBackground(new java.awt.Color(0, 0, 0));
        registrarseButton.setForeground(new java.awt.Color(0, 153, 0));
        registrarseButton.setText("Registrarse");

        javax.swing.GroupLayout LogInPanelLayout = new javax.swing.GroupLayout(LogInPanel);
        LogInPanel.setLayout(LogInPanelLayout);
        LogInPanelLayout.setHorizontalGroup(
            LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInPanelLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(passwordLabel)
                        .addComponent(userLabel)
                        .addComponent(userTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                        .addComponent(passwordTextfield))
                    .addGroup(LogInPanelLayout.createSequentialGroup()
                        .addComponent(logInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(registrarseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(84, 84, 84))
            .addGroup(LogInPanelLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(logInLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        LogInPanelLayout.setVerticalGroup(
            LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogInPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logInLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(userLabel)
                .addGap(18, 18, 18)
                .addComponent(userTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(passwordLabel)
                .addGap(18, 18, 18)
                .addComponent(passwordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(LogInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(logInButton)
                    .addComponent(registrarseButton))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        logInLabel.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTextfieldActionPerformed

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
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PokemonFightGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokemonFightGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokemonFightGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokemonFightGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokemonFightGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogInPanel;
    private javax.swing.JButton logInButton;
    private javax.swing.JLabel logInLabel;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField passwordTextfield;
    private javax.swing.JButton registrarseButton;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField userTextfield;
    // End of variables declaration//GEN-END:variables
}
