package graphicaluserinterface;

public class DisplayConfigWindow extends javax.swing.JFrame {

    //Creates new form displayConfigWindow
    public DisplayConfigWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private StartWindow previousWindow;

    public void setPreviousWindow(StartWindow previousWindow) {
        this.previousWindow = previousWindow;
    }

    private GUIController graphicalInterfaceController;

    public void setController(GUIController simulationController) {
        this.graphicalInterfaceController = simulationController;
    }

    public void setWindowText() {
        jLabelRepetitionsValue.setText(Integer.toString(graphicalInterfaceController.getRepetitions()));
        jLabelMaximTimeValue.setText(Double.toString(graphicalInterfaceController.getSimulationTime()));
        jLabelKValue.setText(Integer.toString(graphicalInterfaceController.getConcurrentConnections()));
        jLabelNValue.setText(Integer.toString(graphicalInterfaceController.getProcessingAvailableProcesses()));
        jLabelPValue.setText(Integer.toString(graphicalInterfaceController.getTransactionsAvailableProcesses()));
        jLabelMValue.setText(Integer.toString(graphicalInterfaceController.getExecutionAvailableProcesses()));
        jLabelTValue.setText(Double.toString(graphicalInterfaceController.getTimeOut()));
        if (graphicalInterfaceController.getSlowMode()) {
            jLabelSlowModeValue.setText("Yes");
        } else {
            jLabelSlowModeValue.setText("No");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitleSimParams = new javax.swing.JLabel();
        jLabelRepetitionsText = new javax.swing.JLabel();
        jLabelMaximTimeText = new javax.swing.JLabel();
        jLabelKText = new javax.swing.JLabel();
        jLabelNText = new javax.swing.JLabel();
        jLabelPText = new javax.swing.JLabel();
        jLabelMText = new javax.swing.JLabel();
        jLabelTText = new javax.swing.JLabel();
        jLabelSlowModeText = new javax.swing.JLabel();
        jLabelRepetitionsValue = new javax.swing.JLabel();
        jLabelMaximTimeValue = new javax.swing.JLabel();
        jLabelKValue = new javax.swing.JLabel();
        jLabelNValue = new javax.swing.JLabel();
        jLabelPValue = new javax.swing.JLabel();
        jLabelMValue = new javax.swing.JLabel();
        jLabelTValue = new javax.swing.JLabel();
        jLabelSlowModeValue = new javax.swing.JLabel();
        jButtonReturn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitleSimParams.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitleSimParams.setText("Simulation parameters");

        jLabelRepetitionsText.setText("Number of times the simulation will be run :");

        jLabelMaximTimeText.setText("Total time in seconds to run each simulation (Maximum time) :");

        jLabelKText.setText("The number of concurrent connections that the system can handle (k) :");
        jLabelKText.setToolTipText("");

        jLabelNText.setText("The number of concurrent queries processing that the system can handle (n) :");

        jLabelPText.setText("The number of processes available for the execution of transactions (p) :");

        jLabelMText.setText("The number of processes available to execute queries (m) :");

        jLabelTText.setText("The timeout in seconds of the connections (t) :");

        jLabelSlowModeText.setText("Slow mode :");

        jLabelRepetitionsValue.setText("jLabel10");

        jLabelMaximTimeValue.setText("jLabel11");

        jLabelKValue.setText("jLabel12");

        jLabelNValue.setText("jLabel13");

        jLabelPValue.setText("jLabel14");

        jLabelMValue.setText("jLabel15");

        jLabelTValue.setText("jLabel16");

        jLabelSlowModeValue.setText("jLabel17");

        jButtonReturn.setText("Return");
        jButtonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitleSimParams)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonReturn)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelRepetitionsText)
                                .addComponent(jLabelSlowModeText)
                                .addComponent(jLabelTText)
                                .addComponent(jLabelMText)
                                .addComponent(jLabelPText)
                                .addComponent(jLabelNText)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelMaximTimeText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelKText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelRepetitionsValue)
                                .addComponent(jLabelMaximTimeValue)
                                .addComponent(jLabelKValue)
                                .addComponent(jLabelNValue)
                                .addComponent(jLabelPValue)
                                .addComponent(jLabelMValue)
                                .addComponent(jLabelTValue)
                                .addComponent(jLabelSlowModeValue)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelTitleSimParams)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRepetitionsText)
                    .addComponent(jLabelRepetitionsValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMaximTimeText)
                    .addComponent(jLabelMaximTimeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelKText)
                    .addComponent(jLabelKValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNText)
                    .addComponent(jLabelNValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPText)
                    .addComponent(jLabelPValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMText)
                    .addComponent(jLabelMValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTText)
                    .addComponent(jLabelTValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSlowModeText)
                    .addComponent(jLabelSlowModeValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButtonReturn)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReturnActionPerformed
        previousWindow.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonReturnActionPerformed

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
            java.util.logging.Logger.getLogger(DisplayConfigWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisplayConfigWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisplayConfigWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisplayConfigWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayConfigWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonReturn;
    private javax.swing.JLabel jLabelKText;
    private javax.swing.JLabel jLabelKValue;
    private javax.swing.JLabel jLabelMText;
    private javax.swing.JLabel jLabelMValue;
    private javax.swing.JLabel jLabelMaximTimeText;
    private javax.swing.JLabel jLabelMaximTimeValue;
    private javax.swing.JLabel jLabelNText;
    private javax.swing.JLabel jLabelNValue;
    private javax.swing.JLabel jLabelPText;
    private javax.swing.JLabel jLabelPValue;
    private javax.swing.JLabel jLabelRepetitionsText;
    private javax.swing.JLabel jLabelRepetitionsValue;
    private javax.swing.JLabel jLabelSlowModeText;
    private javax.swing.JLabel jLabelSlowModeValue;
    private javax.swing.JLabel jLabelTText;
    private javax.swing.JLabel jLabelTValue;
    private javax.swing.JLabel jLabelTitleSimParams;
    // End of variables declaration//GEN-END:variables
}
