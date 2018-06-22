package graphicaluserinterface;
import java.text.DecimalFormat;

public class FinalStatsWindow extends javax.swing.JFrame {

    //Creates new form FinalStastWindow    
    public FinalStatsWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    
    private GUIController graphicalInterfaceController;

    public void setController(GUIController simulationController) {
        this.graphicalInterfaceController = simulationController;
    }

    private static DecimalFormat decimalFormat = new DecimalFormat("#.####");

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel21.setText("Average time of JOIN sentences in the Process Module:  ");

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel22.setText("Average time of SELECT sentences in the Execution Module:  ");

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel23.setText("Average time of SELECT sentences in the Transaction Module:  ");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel24.setText("Average time of SELECT sentences in the Query Module:  ");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel25.setText("Average time of SELECT sentences in the Process Module:  ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Connection average life time:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Average time of DDL sentences in the Execution Module:  ");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Average time of DDL sentences in the Transaction Module:  ");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Average time of DDL sentences in the Query Module:  ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Average time of DDL sentences in the Process Module:  ");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel14.setText("Average time of UPDATE sentences in the Execution Module:  ");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel15.setText("Average time of UPDATE sentences in the Transaction Module:  ");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel16.setText("Average time of UPDATE sentences in the Query Module:  ");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel17.setText("Average time of UPDATE sentences in the Process Module:  ");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel18.setText("Average time of JOIN sentences in the Execution Module:  ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Execution Module queue average length :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Transaction Module queue average length :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Query Module queue average length :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Process Module queue average length :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Average server rejected connections:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Average time of JOIN sentences in the Transaction Module:  ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Average time of JOIN sentences in the Query Module:  ");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Final simulation statistics");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Confidence interval of the average life time:");

        jLabel3.setText("jLabel3");

        jLabel26.setText("jLabel26");

        jLabel27.setText("jLabel27");

        jLabel28.setText("jLabel28");

        jLabel29.setText("jLabel29");

        jLabel30.setText("jLabel30");

        jLabel31.setText("jLabel31");

        jLabel32.setText("jLabel32");

        jLabel33.setText("jLabel33");

        jLabel34.setText("jLabel34");

        jLabel35.setText("jLabel35");

        jLabel36.setText("jLabel36");

        jLabel37.setText("jLabel37");

        jLabel38.setText("jLabel38");

        jLabel39.setText("jLabel39");

        jLabel40.setText("jLabel40");

        jLabel41.setText("jLabel41");

        jLabel42.setText("jLabel42");

        jLabel43.setText("jLabel43");

        jLabel44.setText("jLabel44");

        jLabel45.setText("jLabel45");

        jLabel46.setText("jLabel46");

        jLabel47.setText("jLabel47");

        jButton1.setText("Close program");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Try a new simulation");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Repeat this simulation");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel48.setText("Repetitions:");

        jLabel49.setText("jLabel49");

        jLabel50.setText("queries");

        jLabel51.setText("queries");

        jLabel52.setText("queries");

        jLabel53.setText("queries");

        jLabel54.setText("seconds");

        jLabel55.setText("seconds");

        jLabel56.setText("connections");

        jLabel57.setText("seconds");

        jLabel58.setText("seconds");

        jLabel59.setText("seconds");

        jLabel60.setText("seconds");

        jLabel61.setText("seconds");

        jLabel62.setText("seconds");

        jLabel63.setText("seconds");

        jLabel64.setText("seconds");

        jLabel65.setText("seconds");

        jLabel66.setText("seconds");

        jLabel67.setText("seconds");

        jLabel68.setText("seconds");

        jLabel69.setText("seconds");

        jLabel70.setText("seconds");

        jLabel71.setText("seconds");

        jLabel72.setText("seconds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel49))
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel23)
                            .addComponent(jLabel24)
                            .addComponent(jLabel25))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel47)
                            .addComponent(jLabel46)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel43)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41)
                            .addComponent(jLabel40)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36)
                            .addComponent(jLabel35)
                            .addComponent(jLabel34)
                            .addComponent(jLabel33)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel28)
                            .addComponent(jLabel27)
                            .addComponent(jLabel26)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel51)
                            .addComponent(jLabel50)
                            .addComponent(jLabel52)
                            .addComponent(jLabel53)
                            .addComponent(jLabel54)
                            .addComponent(jLabel55)
                            .addComponent(jLabel56)
                            .addComponent(jLabel57)
                            .addComponent(jLabel58)
                            .addComponent(jLabel59)
                            .addComponent(jLabel60)
                            .addComponent(jLabel61)
                            .addComponent(jLabel62)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64)
                            .addComponent(jLabel65)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(jLabel68)
                            .addComponent(jLabel69)
                            .addComponent(jLabel70)
                            .addComponent(jLabel71)
                            .addComponent(jLabel72))))
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel51))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel26)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel27)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel28)
                    .addComponent(jLabel53))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel29)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel30)
                    .addComponent(jLabel55))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel31)
                    .addComponent(jLabel56))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel32)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel33)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel34)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel35)
                    .addComponent(jLabel60))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel36)
                    .addComponent(jLabel61))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel37)
                    .addComponent(jLabel62))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel38)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel39)
                    .addComponent(jLabel64))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel40)
                    .addComponent(jLabel65))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel41)
                    .addComponent(jLabel66))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel42)
                    .addComponent(jLabel67))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel43)
                    .addComponent(jLabel68))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel44)
                    .addComponent(jLabel69))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jLabel45)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel46)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(jLabel47)
                    .addComponent(jLabel72))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed


    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        java.awt.Window win[] = java.awt.Window.getWindows();
        for (int i = 0; i < win.length; i++) {
            win[i].dispose();
        }
        this.graphicalInterfaceController.restartSameSimulation();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        java.awt.Window win[] = java.awt.Window.getWindows();
        for (int i = 0; i < win.length; i++) {
            win[i].dispose();
        }
        this.graphicalInterfaceController.restartNewSimulation();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FinalStatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalStatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalStatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalStatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalStatsWindow().setVisible(true);
            }
        });
    }
    
    public void setFinalStats(int repetitions, double execModAvgTotal, double transacModAvgTotal, double querycModAvgTotal, double processModAvgTotal, double connectionAvgLifeTime, double[] connectionAvgLifeTimeVector,double avgRejectedConnections, double ddlAvgTimeExec, double ddlAvgTimeTrans, double ddlAvgTimeQuery, double ddlAvgTimeProcess, double updateAvgTimeExec, double updateAvgTimeTrans, double updateAvgTimeQuery, double updateAvgTimeProcess, double joinAvgTimeExec, double joinAvgTimeTrans, double joinAvgTimeQuery, double joinAvgTimeProcess, double selectAvgTimeExec, double selectAvgTimeTrans, double selectAvgTimeQuery, double selectAvgTimeProcess) {
        jLabel49.setText(decimalFormat.format(repetitions));
        jLabel3.setText(decimalFormat.format(execModAvgTotal));
        jLabel26.setText(decimalFormat.format(transacModAvgTotal));
        jLabel27.setText(decimalFormat.format(querycModAvgTotal));
        jLabel28.setText(decimalFormat.format(processModAvgTotal));
        if(!(Double.isNaN(connectionAvgLifeTime))){
            jLabel29.setText(decimalFormat.format(connectionAvgLifeTime));
        }else {
            jLabel29.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgRejectedConnections))){
            jLabel31.setText(decimalFormat.format(avgRejectedConnections));
        }else{
            jLabel31.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(ddlAvgTimeExec))){
            jLabel32.setText(decimalFormat.format(ddlAvgTimeExec));
        }else{
            jLabel32.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(ddlAvgTimeTrans))){
            jLabel33.setText(decimalFormat.format(ddlAvgTimeTrans));
        }else {
            jLabel33.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(ddlAvgTimeQuery))){
            jLabel34.setText(decimalFormat.format(ddlAvgTimeQuery));
        }else {
            jLabel34.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(ddlAvgTimeProcess))){
            jLabel35.setText(decimalFormat.format(ddlAvgTimeProcess));
        }else {
            jLabel35.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(updateAvgTimeExec))){
            jLabel36.setText(decimalFormat.format(updateAvgTimeExec));
        }else {
            jLabel36.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(updateAvgTimeTrans))){
            jLabel37.setText(decimalFormat.format(updateAvgTimeTrans));
        }else {
            jLabel37.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(updateAvgTimeQuery))){
            jLabel38.setText(decimalFormat.format(updateAvgTimeQuery));
        }else {
            jLabel38.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(updateAvgTimeProcess))){
            jLabel39.setText(decimalFormat.format(updateAvgTimeProcess));
        }else {
            jLabel39.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(joinAvgTimeExec))){
            jLabel40.setText(decimalFormat.format(joinAvgTimeExec));
        }else {
            jLabel40.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(joinAvgTimeTrans))){
            jLabel41.setText(decimalFormat.format(joinAvgTimeTrans));
        }else {
            jLabel41.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(joinAvgTimeQuery))){
            jLabel42.setText(decimalFormat.format(joinAvgTimeQuery));
        }else {
            jLabel42.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(joinAvgTimeProcess))){
            jLabel43.setText(decimalFormat.format(joinAvgTimeProcess));
        }else {
            jLabel43.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(selectAvgTimeExec))){
            jLabel44.setText(decimalFormat.format(selectAvgTimeExec));
        }else {
            jLabel44.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(selectAvgTimeTrans))){
            jLabel45.setText(decimalFormat.format(selectAvgTimeTrans));
        }else {
            jLabel45.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(selectAvgTimeQuery))){
            jLabel46.setText(decimalFormat.format(selectAvgTimeQuery));
        }else {
            jLabel46.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(selectAvgTimeProcess))){
            jLabel47.setText(decimalFormat.format(selectAvgTimeProcess));
        }else {
            jLabel47.setText(decimalFormat.format(0));
        }
        // Calculate the confidence interval
        double media = connectionAvgLifeTime;
        double varianza;
        double sumatoria = 0;
        for (int iterator = 0; iterator < repetitions; iterator = iterator + 1) {
            sumatoria += Math.pow((connectionAvgLifeTimeVector[iterator] - media), 2);
        }
        varianza = sumatoria / (repetitions - 1);
        double desviacionEstandar = Math.sqrt(varianza);
        // Using 1.96 as zα/2
        double result = 1.96 * desviacionEstandar / Math.sqrt(repetitions);
        jLabel30.setText("[" + decimalFormat.format(media - result) + " , " + decimalFormat.format(media + result) + "]");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
