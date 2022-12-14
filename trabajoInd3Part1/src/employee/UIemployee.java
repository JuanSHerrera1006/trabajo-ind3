/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employee;

/**
 *
 * @author cedbo
 */
public class UIemployee extends javax.swing.JFrame {

    /**
     * Creates new form UI_Employee
     */
    public UIemployee() {
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

        panelInformacion = new javax.swing.JPanel();
        lbTitleEmpleado = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbValorHoras = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbHorasPorMes = new javax.swing.JLabel();
        inputValorHoras = new javax.swing.JTextField();
        inputId = new javax.swing.JTextField();
        inputNombre = new javax.swing.JTextField();
        inputHorasPorMes = new javax.swing.JTextField();
        inputPer = new javax.swing.JTextField();
        lbPer = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        panelResultado = new javax.swing.JPanel();
        lbTitleResultado = new javax.swing.JLabel();
        lbResNombre = new javax.swing.JLabel();
        lbResId = new javax.swing.JLabel();
        inputResId = new javax.swing.JTextField();
        inputResNombre = new javax.swing.JTextField();
        inputSalarioBruto = new javax.swing.JTextField();
        lbSalarioBruto = new javax.swing.JLabel();
        lbSalarioNeto = new javax.swing.JLabel();
        inputSalarioNeto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Empleado");
        setResizable(false);

        panelInformacion.setBackground(new java.awt.Color(255, 255, 255));

        lbTitleEmpleado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitleEmpleado.setText("INFORMACION DE EMPLEADO:");

        lbId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbId.setText("ID:");

        lbValorHoras.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbValorHoras.setText("VALOR DE HORAS:");

        lbNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbNombre.setText("NOMBRE:");

        lbHorasPorMes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbHorasPorMes.setText("HORAS POR MES:");

        lbPer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbPer.setText("PORCENTAJE DE RETENCION: ");

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelInformacionLayout = new javax.swing.GroupLayout(panelInformacion);
        panelInformacion.setLayout(panelInformacionLayout);
        panelInformacionLayout.setHorizontalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitleEmpleado)
                            .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbId)
                            .addComponent(lbValorHoras))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbPer)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacionLayout.createSequentialGroup()
                                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputValorHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(inputPer, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNombre)
                                    .addComponent(inputNombre))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInformacionLayout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputHorasPorMes, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(panelInformacionLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lbHorasPorMes)))
                        .addGap(36, 36, 36))))
        );
        panelInformacionLayout.setVerticalGroup(
            panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInformacionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lbTitleEmpleado)
                .addGap(18, 18, 18)
                .addGroup(panelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(lbNombre)
                        .addGap(7, 7, 7)
                        .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbHorasPorMes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputHorasPorMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnCalcular))
                    .addGroup(panelInformacionLayout.createSequentialGroup()
                        .addComponent(lbId)
                        .addGap(7, 7, 7)
                        .addComponent(inputId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbValorHoras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputValorHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbPer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(inputPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        panelResultado.setBackground(new java.awt.Color(102, 102, 102));

        lbTitleResultado.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbTitleResultado.setForeground(new java.awt.Color(255, 255, 255));
        lbTitleResultado.setText("RESULTADOS: ");

        lbResNombre.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbResNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbResNombre.setText("NOMBRE:");

        lbResId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbResId.setForeground(new java.awt.Color(255, 255, 255));
        lbResId.setText("ID:");

        inputResId.setForeground(new java.awt.Color(0, 0, 0));
        inputResId.setEnabled(false);

        inputResNombre.setForeground(new java.awt.Color(0, 0, 0));
        inputResNombre.setEnabled(false);

        inputSalarioBruto.setForeground(new java.awt.Color(0, 0, 0));
        inputSalarioBruto.setEnabled(false);

        lbSalarioBruto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbSalarioBruto.setForeground(new java.awt.Color(255, 255, 255));
        lbSalarioBruto.setText("SALARIO BRUTO:");

        lbSalarioNeto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbSalarioNeto.setForeground(new java.awt.Color(255, 255, 255));
        lbSalarioNeto.setText("SALARIO NETO:");

        inputSalarioNeto.setForeground(new java.awt.Color(0, 0, 0));
        inputSalarioNeto.setEnabled(false);

        javax.swing.GroupLayout panelResultadoLayout = new javax.swing.GroupLayout(panelResultado);
        panelResultado.setLayout(panelResultadoLayout);
        panelResultadoLayout.setHorizontalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelResultadoLayout.createSequentialGroup()
                        .addComponent(lbTitleResultado)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelResultadoLayout.createSequentialGroup()
                        .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panelResultadoLayout.createSequentialGroup()
                                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbSalarioBruto))
                                .addGap(44, 44, 44)
                                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelResultadoLayout.createSequentialGroup()
                                        .addComponent(lbSalarioNeto)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(inputSalarioNeto)))
                            .addGroup(panelResultadoLayout.createSequentialGroup()
                                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputResId, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbResId))
                                .addGap(44, 44, 44)
                                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbResNombre)
                                    .addComponent(inputResNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(39, 39, 39))))
        );
        panelResultadoLayout.setVerticalGroup(
            panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelResultadoLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbTitleResultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbResId)
                    .addComponent(lbResNombre))
                .addGap(7, 7, 7)
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputResNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputResId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSalarioBruto)
                    .addComponent(lbSalarioNeto))
                .addGap(7, 7, 7)
                .addGroup(panelResultadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputSalarioNeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputSalarioBruto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelInformacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelResultado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        // TODO add your handling code here:
        String id = inputId.getText().toUpperCase();
        String nombre = inputNombre.getText().toUpperCase();
        double valorHoras = Double.parseDouble(inputValorHoras.getText());
        double horasPorMes = Integer.parseInt(inputHorasPorMes.getText());
        double porcentaje = Double.parseDouble(inputPer.getText());
        Employee employee = new Employee(id, nombre, (int) horasPorMes, valorHoras, porcentaje);
        inputResId.setText(id);
        inputResNombre.setText(nombre);
        inputSalarioBruto.setText(String.valueOf(employee.getGrossSalary()));
        inputSalarioNeto.setText(String.valueOf(employee.getnetSalary()));
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
            java.util.logging.Logger.getLogger(UIemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UIemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UIemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UIemployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UIemployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField inputHorasPorMes;
    private javax.swing.JTextField inputId;
    private javax.swing.JTextField inputNombre;
    private javax.swing.JTextField inputPer;
    private javax.swing.JTextField inputResId;
    private javax.swing.JTextField inputResNombre;
    private javax.swing.JTextField inputSalarioBruto;
    private javax.swing.JTextField inputSalarioNeto;
    private javax.swing.JTextField inputValorHoras;
    private javax.swing.JLabel lbHorasPorMes;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPer;
    private javax.swing.JLabel lbResId;
    private javax.swing.JLabel lbResNombre;
    private javax.swing.JLabel lbSalarioBruto;
    private javax.swing.JLabel lbSalarioNeto;
    private javax.swing.JLabel lbTitleEmpleado;
    private javax.swing.JLabel lbTitleResultado;
    private javax.swing.JLabel lbValorHoras;
    private javax.swing.JPanel panelInformacion;
    private javax.swing.JPanel panelResultado;
    // End of variables declaration//GEN-END:variables
}
