package graphicaluserinterface;

import javax.swing.JOptionPane;

public class SetConfigWindow extends javax.swing.JFrame {

    private StartWindow previousWindow;
    private GUIController graphicalInterfaceController;

    //Creates new form SetConfigWindow 
    public SetConfigWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void setPreviousWindow(StartWindow previousWindow) {
        this.previousWindow = previousWindow;
    }

    public void setController(GUIController simulationController) {
        this.graphicalInterfaceController = simulationController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitleSetSimParamsText = new javax.swing.JLabel();
        jLabelRepetitionsText = new javax.swing.JLabel();
        jLabelMaxTimeText = new javax.swing.JLabel();
        jLabelKText = new javax.swing.JLabel();
        jTextFieldRepetitionsValue = new javax.swing.JTextField();
        jTextFieldMaxTimeValue = new javax.swing.JTextField();
        jTextFieldKValue = new javax.swing.JTextField();
        jLabelNText = new javax.swing.JLabel();
        jTextFieldNValue = new javax.swing.JTextField();
        jLabelPText = new javax.swing.JLabel();
        jTextFieldPValue = new javax.swing.JTextField();
        jLabelMText = new javax.swing.JLabel();
        jTextFieldMValue = new javax.swing.JTextField();
        jLabelTText = new javax.swing.JLabel();
        jTextFieldTValue = new javax.swing.JTextField();
        jLabelSlowModeText = new javax.swing.JLabel();
        jComboBoxSlowModeValue = new javax.swing.JComboBox<>();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitleSetSimParamsText.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitleSetSimParamsText.setText("Set simulation parameters");

        jLabelRepetitionsText.setText("Number of times the simulation will be run :");

        jLabelMaxTimeText.setText("Total time in seconds to run each simulation (Maximum time) :");

        jLabelKText.setText("The number of concurrent connections that the system can handle (k) :");
        jLabelKText.setToolTipText("");

        jLabelNText.setText("The number of concurrent queries processing that the system can handle (n) :");

        jLabelPText.setText("The number of processes available for the execution of transactions (p) :");

        jLabelMText.setText("The number of processes available to execute queries (m) :");

        jLabelTText.setText("The timeout in seconds of the connections (t) :");

        jLabelSlowModeText.setText("Use slow mode?");

        jComboBoxSlowModeValue.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelSlowModeText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxSlowModeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelTText)
                    .addComponent(jLabelMText)
                    .addComponent(jLabelPText)
                    .addComponent(jLabelNText)
                    .addComponent(jLabelKText)
                    .addComponent(jLabelTitleSetSimParamsText)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextFieldTValue, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldMValue, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldPValue, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldNValue, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldKValue, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldMaxTimeValue, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldRepetitionsValue, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelRepetitionsText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelMaxTimeText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(251, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancel)
                .addGap(18, 18, 18)
                .addComponent(jButtonSave)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitleSetSimParamsText)
                .addGap(18, 18, 18)
                .addComponent(jLabelRepetitionsText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldRepetitionsValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMaxTimeText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMaxTimeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelKText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldKValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldPValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelMText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelTText)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldTValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSlowModeValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSlowModeText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        previousWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        boolean validSave = true;
        try {
            Integer.parseInt(jTextFieldRepetitionsValue.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input on number of times the simulation will be run");
            validSave = false;
        }
        try {
            Double.parseDouble(jTextFieldMaxTimeValue.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input on total time in seconds to run each simulation");
            validSave = false;
        }
        try {
            Integer.parseInt(jTextFieldKValue.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input on the number of concurrent connections that the system can handle (k)");
            validSave = false;
        }
        try {
            Integer.parseInt(jTextFieldNValue.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input on the number of concurrent queries processing that the system can handle (n)");
            validSave = false;
        }
        try {
            Integer.parseInt(jTextFieldPValue.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input on the number of processes available for the execution of transactions (p)");
            validSave = false;
        }
        try {
            Integer.parseInt(jTextFieldMValue.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input on the number of processes available to execute queries (m)");
            validSave = false;
        }
        try {
            Double.parseDouble(jTextFieldTValue.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input on the timeout in seconds of the connections (t)");
            validSave = false;
        }
        if (validSave) {
            graphicalInterfaceController.setConfigSet();
            graphicalInterfaceController.setRepetitions(Integer.parseInt(jTextFieldRepetitionsValue.getText()));
            graphicalInterfaceController.setSimulationTime(Double.parseDouble(jTextFieldMaxTimeValue.getText()));
            if (jComboBoxSlowModeValue.getSelectedItem().equals("Yes")) {
                graphicalInterfaceController.setSlowMode(true);
            } else {
                graphicalInterfaceController.setSlowMode(false);
            }
            graphicalInterfaceController.setConcurrentConnections(Integer.parseInt(jTextFieldKValue.getText()));
            graphicalInterfaceController.setProcessingAvailableProcesses(Integer.parseInt(jTextFieldNValue.getText()));
            graphicalInterfaceController.setTransactionsAvailableProcesses(Integer.parseInt(jTextFieldPValue.getText()));
            graphicalInterfaceController.setExecutionAvailableProcesses(Integer.parseInt(jTextFieldMValue.getText()));
            graphicalInterfaceController.setTimeOut(Double.parseDouble(jTextFieldTValue.getText()));
            previousWindow.setVisible(true);
            this.dispose();
        }


    }//GEN-LAST:event_jButtonSaveActionPerformed

    //@param args the command line arguments  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SetConfigWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SetConfigWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SetConfigWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SetConfigWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SetConfigWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox<String> jComboBoxSlowModeValue;
    private javax.swing.JLabel jLabelKText;
    private javax.swing.JLabel jLabelMText;
    private javax.swing.JLabel jLabelMaxTimeText;
    private javax.swing.JLabel jLabelNText;
    private javax.swing.JLabel jLabelPText;
    private javax.swing.JLabel jLabelRepetitionsText;
    private javax.swing.JLabel jLabelSlowModeText;
    private javax.swing.JLabel jLabelTText;
    private javax.swing.JLabel jLabelTitleSetSimParamsText;
    private javax.swing.JTextField jTextFieldKValue;
    private javax.swing.JTextField jTextFieldMValue;
    private javax.swing.JTextField jTextFieldMaxTimeValue;
    private javax.swing.JTextField jTextFieldNValue;
    private javax.swing.JTextField jTextFieldPValue;
    private javax.swing.JTextField jTextFieldRepetitionsValue;
    private javax.swing.JTextField jTextFieldTValue;
    // End of variables declaration//GEN-END:variables
}
