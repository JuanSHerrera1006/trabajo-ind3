/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package groupNumbs;

import comparator.*;

/**
 *
 * @author cedbo
 */
public class UIgroupNumbs extends javax.swing.JFrame {

    /**
     * Creates new form UIcomparator
     */
    public UIgroupNumbs() {
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
        lbTitleNums = new javax.swing.JLabel();
        inputNums = new javax.swing.JTextField();
        lbNums = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        inputMaxNum = new javax.swing.JTextField();
        lbMaxnumb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Numero mayor");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTitleNums.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitleNums.setText("NUMERO MAYOR");
        jPanel1.add(lbTitleNums, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));
        jPanel1.add(inputNums, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 340, -1));

        lbNums.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNums.setText("NUMEROS (DEBEN SER SEPARADOS POR UNA \", \")");
        jPanel1.add(lbNums, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, -1));

        inputMaxNum.setEnabled(false);
        jPanel1.add(inputMaxNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 110, -1));

        lbMaxnumb.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMaxnumb.setText("NUMERO MAYOR: ");
        jPanel1.add(lbMaxnumb, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String[] numbs = inputNums.getText().split(", ");
        GroupNumbs arrayNumbs = new GroupNumbs(numbs);
        inputMaxNum.setText(arrayNumbs.maxNumb());
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
            java.util.logging.Logger.getLogger(UIgroupNumbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIgroupNumbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIgroupNumbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIgroupNumbs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIgroupNumbs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField inputMaxNum;
    private javax.swing.JTextField inputNums;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbMaxnumb;
    private javax.swing.JLabel lbNums;
    private javax.swing.JLabel lbTitleNums;
    // End of variables declaration//GEN-END:variables
}
