/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tuition;

/**
 *
 * @author cedbo
 */
public class UItuition extends javax.swing.JFrame {

    /**
     * Creates new form UItuition
     */
    public UItuition() {
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

        lbTitleMatricula = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        inputNombre = new javax.swing.JTextField();
        lbNroRegistro = new javax.swing.JLabel();
        inputNroRegistro = new javax.swing.JTextField();
        lbEstrato = new javax.swing.JLabel();
        inputEstrato = new javax.swing.JTextField();
        inputPatrimonio = new javax.swing.JTextField();
        lbPatrimonio = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lbValorMatricula = new javax.swing.JLabel();
        inputValorMatricula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Costo matricula");
        setResizable(false);

        lbTitleMatricula.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbTitleMatricula.setText("MATRICULA");

        lbNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNombre.setText("NOMBRE:");

        lbNroRegistro.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNroRegistro.setText("NUMERO DE REGISTRO:");

        lbEstrato.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbEstrato.setText("ESTRATO SOCIAL:");

        inputPatrimonio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPatrimonioActionPerformed(evt);
            }
        });

        lbPatrimonio.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPatrimonio.setText("PATRIMONIO:");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lbValorMatricula.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbValorMatricula.setText("VALOR DE MATRICULA:");

        inputValorMatricula.setEnabled(false);
        inputValorMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputValorMatriculaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputValorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorMatricula)
                    .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTitleMatricula)
                    .addComponent(lbPatrimonio)
                    .addComponent(inputPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstrato)
                    .addComponent(inputNroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNroRegistro)
                    .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(lbTitleMatricula)
                .addGap(33, 33, 33)
                .addComponent(lbNombre)
                .addGap(18, 18, 18)
                .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbNroRegistro)
                .addGap(18, 18, 18)
                .addComponent(inputNroRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lbEstrato)
                .addGap(18, 18, 18)
                .addComponent(inputEstrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbPatrimonio)
                .addGap(18, 18, 18)
                .addComponent(inputPatrimonio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbValorMatricula)
                .addGap(12, 12, 12)
                .addComponent(inputValorMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCalcular)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String name = inputNombre.getText();
        String nroRegister = inputNroRegistro.getText();
        double heritage = Double.parseDouble(inputPatrimonio.getText());
        double socialStrata = Integer.parseInt(inputEstrato.getText());
        Tuition tuition = new Tuition(nroRegister, name, heritage, (int) socialStrata);
        double tuitionValue = tuition.getPayment();
        inputValorMatricula.setText(String.valueOf(tuitionValue));
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void inputPatrimonioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPatrimonioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPatrimonioActionPerformed

    private void inputValorMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputValorMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputValorMatriculaActionPerformed

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
            java.util.logging.Logger.getLogger(UItuition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UItuition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UItuition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UItuition.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UItuition().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField inputEstrato;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputNroRegistro;
    private javax.swing.JTextField inputPatrimonio;
    private javax.swing.JTextField inputValorMatricula;
    private javax.swing.JLabel lbEstrato;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbNroRegistro;
    private javax.swing.JLabel lbPatrimonio;
    private javax.swing.JLabel lbTitleMatricula;
    private javax.swing.JLabel lbValorMatricula;
    // End of variables declaration//GEN-END:variables
}