package graphicaluserinterface;

import javax.swing.JOptionPane;

public class StartWindow extends javax.swing.JFrame {

    /**
     * Creates new form StartSimulationWindow
     */
    public StartWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    private GUIController graphicalInterfaceController;

    public void setController(GUIController simulationController) {
        this.graphicalInterfaceController = simulationController;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitleDBMSSim = new javax.swing.JLabel();
        jButtonSetConfig = new javax.swing.JButton();
        jButtonStartSim = new javax.swing.JButton();
        jButtonDisplayConfig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabelTitleDBMSSim.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitleDBMSSim.setText("DBMS Simulation ");

        jButtonSetConfig.setText("Set simulation parameters");
        jButtonSetConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSetConfigActionPerformed(evt);
            }
        });

        jButtonStartSim.setText("Start simulation");
        jButtonStartSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStartSimActionPerformed(evt);
            }
        });

        jButtonDisplayConfig.setText("See the current parameters");
        jButtonDisplayConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisplayConfigActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabelTitleDBMSSim))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonSetConfig, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonDisplayConfig, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE))))
                .addContainerGap(213, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtonStartSim, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabelTitleDBMSSim)
                .addGap(18, 18, 18)
                .addComponent(jButtonSetConfig)
                .addGap(18, 18, 18)
                .addComponent(jButtonDisplayConfig)
                .addGap(18, 18, 18)
                .addComponent(jButtonStartSim)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Set simulation parameters button
    private void jButtonSetConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSetConfigActionPerformed
        SetConfigWindow configWindow = new SetConfigWindow();
        configWindow.setPreviousWindow(this);
        configWindow.setController(graphicalInterfaceController);
        configWindow.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonSetConfigActionPerformed

    //See the current parameters button
    private void jButtonDisplayConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisplayConfigActionPerformed
        if (graphicalInterfaceController.getConfigSet()) {
            DisplayConfigWindow currentParams = new DisplayConfigWindow();
            currentParams.setPreviousWindow(this);
            currentParams.setController(graphicalInterfaceController);
            currentParams.setWindowText();
            currentParams.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "The parameters have not been set");
        }
    }//GEN-LAST:event_jButtonDisplayConfigActionPerformed

    //Start simulation button
    private void jButtonStartSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStartSimActionPerformed
        if (graphicalInterfaceController.getConfigSet()) {
            this.graphicalInterfaceController.startSimulation();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "The parameters have not been set");
        }
    }//GEN-LAST:event_jButtonStartSimActionPerformed

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
            java.util.logging.Logger.getLogger(StartWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartWindow.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDisplayConfig;
    private javax.swing.JButton jButtonSetConfig;
    private javax.swing.JButton jButtonStartSim;
    private javax.swing.JLabel jLabelTitleDBMSSim;
    // End of variables declaration//GEN-END:variables
}
