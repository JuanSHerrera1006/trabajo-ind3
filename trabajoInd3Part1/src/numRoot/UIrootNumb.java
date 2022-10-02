/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package numRoot;

import java.util.Arrays;

/**
 *
 * @author cedbo
 */
public class UIrootNumb extends javax.swing.JFrame {

    /**
     * Creates new form UIrootNumb
     */
    public UIrootNumb() {
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
        inputNums = new javax.swing.JTextField();
        lbNums = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        lbSqrt = new javax.swing.JLabel();
        lbCbrt = new javax.swing.JLabel();
        lbCuadrado = new javax.swing.JLabel();
        inputSqrt = new javax.swing.JTextField();
        inputCbrt = new javax.swing.JTextField();
        inputCuadrado = new javax.swing.JTextField();
        lbTitleRaices = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Descripcion de numero");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inputNums.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNumsActionPerformed(evt);
            }
        });
        jPanel1.add(inputNums, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 340, -1));

        lbNums.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNums.setText("NUMEROS (DEBEN SER SEPARADOS POR UNA \", \")");
        jPanel1.add(lbNums, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        jPanel1.add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 125, -1));

        lbSqrt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbSqrt.setText("RAIZ CUADRADA:");
        jPanel1.add(lbSqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, 20));

        lbCbrt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCbrt.setText("RAIZ CUBICA:");
        jPanel1.add(lbCbrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, 20));

        lbCuadrado.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbCuadrado.setText("CUADRADO:");
        jPanel1.add(lbCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        inputSqrt.setText("0.");
        inputSqrt.setEnabled(false);
        jPanel1.add(inputSqrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 340, -1));

        inputCbrt.setText("0.");
        inputCbrt.setEnabled(false);
        jPanel1.add(inputCbrt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 340, -1));

        inputCuadrado.setText("0.");
        inputCuadrado.setEnabled(false);
        jPanel1.add(inputCuadrado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 340, -1));

        lbTitleRaices.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitleRaices.setText("RAICES DE UN NUMERO");
        jPanel1.add(lbTitleRaices, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String[] numbs = inputNums.getText().split(", ");
        System.out.println(numbs);
        RootNumbs roots = new RootNumbs(numbs);
        System.out.println(Arrays.toString(roots.sqrtNumbs()));
        inputSqrt.setText(Arrays.toString(roots.sqrtNumbs()));
        inputCbrt.setText(Arrays.toString(roots.cbrtNumbs()));
        inputCuadrado.setText(Arrays.toString(roots.pow2Numbs()));

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void inputNumsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNumsActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_inputNumsActionPerformed

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
            java.util.logging.Logger.getLogger(UIrootNumb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIrootNumb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIrootNumb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIrootNumb.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIrootNumb().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField inputCbrt;
    private javax.swing.JTextField inputCuadrado;
    private javax.swing.JTextField inputNums;
    private javax.swing.JTextField inputSqrt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCbrt;
    private javax.swing.JLabel lbCuadrado;
    private javax.swing.JLabel lbNums;
    private javax.swing.JLabel lbSqrt;
    private javax.swing.JLabel lbTitleRaices;
    // End of variables declaration//GEN-END:variables
}