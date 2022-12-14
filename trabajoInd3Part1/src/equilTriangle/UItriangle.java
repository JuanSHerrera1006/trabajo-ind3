/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package equilTriangle;

import comparator.*;

/**
 *
 * @author cedbo
 */
public class UItriangle extends javax.swing.JFrame {

    /**
     * Creates new form UIcomparator
     */
    public UItriangle() {
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

        jPanel1 = new javax.swing.JPanel();
        lbTitleTriang = new javax.swing.JLabel();
        inputLado = new javax.swing.JTextField();
        lbLado = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        inputAltura = new javax.swing.JTextField();
        lbAltura = new javax.swing.JLabel();
        inputArea = new javax.swing.JTextField();
        lbArea = new javax.swing.JLabel();
        inputPer = new javax.swing.JTextField();
        lbPer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Triangulo equilatero");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitleTriang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitleTriang.setText("TRIANGULO EQUILATERO");
        jPanel1.add(lbTitleTriang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));
        jPanel1.add(inputLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, -1));

        lbLado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbLado.setText("LADO:");
        jPanel1.add(lbLado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 70, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, -1));

        inputAltura.setEnabled(false);
        jPanel1.add(inputAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 340, -1));

        lbAltura.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbAltura.setText("ALTURA:");
        jPanel1.add(lbAltura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        inputArea.setEnabled(false);
        jPanel1.add(inputArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 340, -1));

        lbArea.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbArea.setText("AREA:");
        jPanel1.add(lbArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        inputPer.setEnabled(false);
        jPanel1.add(inputPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 340, -1));

        lbPer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPer.setText("PERIMETRO:");
        jPanel1.add(lbPer, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:;
        double side = Double.parseDouble(inputLado.getText());
        Triangle triangle = new Triangle(side);
        inputPer.setText(String.valueOf(triangle.getPerimeter()));
        inputArea.setText(String.valueOf(triangle.getArea()));
        inputAltura.setText(String.valueOf(triangle.getAltura()));

    }//GEN-LAST:event_btnCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(UItriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UItriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UItriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UItriangle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UItriangle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField inputAltura;
    private javax.swing.JTextField inputArea;
    private javax.swing.JTextField inputLado;
    private javax.swing.JTextField inputPer;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbAltura;
    private javax.swing.JLabel lbArea;
    private javax.swing.JLabel lbLado;
    private javax.swing.JLabel lbPer;
    private javax.swing.JLabel lbTitleTriang;
    // End of variables declaration//GEN-END:variables
}
