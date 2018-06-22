package graphicaluserinterface;

import javax.swing.JFrame;
import java.text.DecimalFormat;

public class RunStatsWindow extends javax.swing.JFrame {

    //Creates new form SimulationStatsWindow
    public RunStatsWindow() {
        initComponents();
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }

    private static DecimalFormat decimalFormat = new DecimalFormat("#.####");

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
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
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Run statistics");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Run number:");

        jLabel3.setText("jLabel3");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Execution Module queue average length :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Transaction Module queue average length :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Query Module queue average length :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Process Module queue average length :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Server rejected connections:");

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

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel19.setText("Average time of JOIN sentences in the Transaction Module:  ");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel20.setText("Average time of JOIN sentences in the Query Module:  ");

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

        jButton1.setText("Close window");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel48.setText("queries");

        jLabel49.setText("queries");

        jLabel50.setText("queries");

        jLabel51.setText("queries");

        jLabel52.setText("seconds");

        jLabel53.setText("seconds");

        jLabel54.setText("connections");

        jLabel55.setText("seconds");

        jLabel56.setText("seconds");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel40)
                                    .addComponent(jLabel41)
                                    .addComponent(jLabel42)
                                    .addComponent(jLabel43))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel65)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel52)
                                    .addComponent(jLabel64)
                                    .addComponent(jLabel63)
                                    .addComponent(jLabel62)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel29)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel51))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel27)
                                            .addComponent(jLabel28))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel50)
                                            .addComponent(jLabel49)
                                            .addComponent(jLabel48))))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel31))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel53)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel16))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel45)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel47)))
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel60)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel59)
                                    .addComponent(jLabel61)
                                    .addComponent(jLabel66)
                                    .addComponent(jLabel67)
                                    .addComponent(jLabel68)
                                    .addComponent(jLabel69)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel27))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel28)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel48)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel50)
                                    .addComponent(jLabel7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel29)
                            .addComponent(jLabel51))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel32)
                            .addComponent(jLabel52)
                            .addComponent(jLabel14)
                            .addComponent(jLabel36)
                            .addComponent(jLabel58))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel33)
                            .addComponent(jLabel55)
                            .addComponent(jLabel15)
                            .addComponent(jLabel37)
                            .addComponent(jLabel59))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel34)
                            .addComponent(jLabel56)
                            .addComponent(jLabel16)
                            .addComponent(jLabel38)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel35)
                            .addComponent(jLabel57)
                            .addComponent(jLabel17)
                            .addComponent(jLabel39)
                            .addComponent(jLabel61))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jLabel40)
                            .addComponent(jLabel62)
                            .addComponent(jLabel22)
                            .addComponent(jLabel44)
                            .addComponent(jLabel66))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel41)
                            .addComponent(jLabel63)
                            .addComponent(jLabel23)
                            .addComponent(jLabel45)
                            .addComponent(jLabel67))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel42)
                            .addComponent(jLabel64)
                            .addComponent(jLabel24)
                            .addComponent(jLabel46)
                            .addComponent(jLabel68))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel43)
                            .addComponent(jLabel65)
                            .addComponent(jLabel25)
                            .addComponent(jLabel47)
                            .addComponent(jLabel69))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jLabel53))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jLabel54))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(RunStatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RunStatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RunStatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RunStatsWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RunStatsWindow().setVisible(true);
            }
        });
    }

    public void setStats(int runNumber, double execModQueueLength, double transModQueueLength, double queryModQueueLength, double processModQueueLength, int rejectedConnections, double connectionAverageLifeTime, double avgDDLExec, double avgDDLTrans, double avgDDLQuery, double avgDDLProcess, double avgUpdateExec, double avgUpdateTrans, double avgUpdateaQuery, double avgUpdateProcess, double avgJoinExec, double avgJoinTrans, double avgJoinQuery, double avgJoinProcess, double avgSelectExec, double avgSelectTrans, double avgSelectQuery, double avgSelectProcess) {
        jLabel3.setText(decimalFormat.format(runNumber));
        jLabel26.setText(decimalFormat.format(execModQueueLength));
        jLabel27.setText(decimalFormat.format(transModQueueLength));
        jLabel28.setText(decimalFormat.format(queryModQueueLength));
        jLabel29.setText(decimalFormat.format(processModQueueLength));
        if(!(Double.isNaN(connectionAverageLifeTime))){
            jLabel30.setText(decimalFormat.format(connectionAverageLifeTime));
        }else {
            jLabel30.setText(decimalFormat.format(0));
        }
        jLabel31.setText(decimalFormat.format(rejectedConnections));
        if(!(Double.isNaN(avgDDLExec))){
            jLabel32.setText(decimalFormat.format(avgDDLExec));
        }else{
            jLabel32.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgDDLTrans))){
            jLabel33.setText(decimalFormat.format(avgDDLTrans));
        }else{
            jLabel33.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgDDLQuery))){
            jLabel34.setText(decimalFormat.format(avgDDLQuery));
        }else{
            jLabel34.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgDDLProcess))){
            jLabel35.setText(decimalFormat.format(avgDDLProcess));
        }else{
            jLabel35.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgUpdateExec))){
            jLabel36.setText(decimalFormat.format(avgUpdateExec));
        }else{
            jLabel36.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgUpdateTrans))){
            jLabel37.setText(decimalFormat.format(avgUpdateTrans));
        }else{
            jLabel37.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgUpdateaQuery))){
            jLabel38.setText(decimalFormat.format(avgUpdateaQuery));
        }else{
            jLabel38.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgUpdateProcess))){
            jLabel39.setText(decimalFormat.format(avgUpdateProcess));
        }else{
            jLabel39.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgJoinExec))){
            jLabel40.setText(decimalFormat.format(avgJoinExec));
        }else{
            jLabel40.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgJoinTrans))){
            jLabel41.setText(decimalFormat.format(avgJoinTrans));
        }else{
            jLabel41.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgJoinQuery))){
            jLabel42.setText(decimalFormat.format(avgJoinQuery));
        }else{
            jLabel42.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgJoinProcess))){
            jLabel43.setText(decimalFormat.format(avgJoinProcess));
        }else{
            jLabel43.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgSelectExec))){
            jLabel44.setText(decimalFormat.format(avgSelectExec));
        }else{
            jLabel44.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgSelectTrans))){
            jLabel45.setText(decimalFormat.format(avgSelectTrans));
        }else{
            jLabel45.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgSelectQuery))){
            jLabel46.setText(decimalFormat.format(avgSelectQuery));
        }else{
            jLabel46.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgSelectProcess))){
            jLabel47.setText(decimalFormat.format(avgSelectProcess));
        }else {
            jLabel47.setText(decimalFormat.format(0));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
