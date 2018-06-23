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

        jLabelRunStatisticsTitle = new javax.swing.JLabel();
        jLabelRunNumberText = new javax.swing.JLabel();
        jLabelRunNumberValue = new javax.swing.JLabel();
        jLabelExecModText = new javax.swing.JLabel();
        jLabelTransModText = new javax.swing.JLabel();
        jLabelQueryModText = new javax.swing.JLabel();
        jLabelProcessModText = new javax.swing.JLabel();
        jLabelServerRejectConnecText = new javax.swing.JLabel();
        jLabelConnecLifeTimeText = new javax.swing.JLabel();
        jLabelTimeDDLExecText = new javax.swing.JLabel();
        jLabelTimeDDLTransText = new javax.swing.JLabel();
        jLabelTimeDDLQueryText = new javax.swing.JLabel();
        jLabelTimeDDLProcessText = new javax.swing.JLabel();
        jLabelTimeUPDATEExecText = new javax.swing.JLabel();
        jLabelTimeUPDATETransText = new javax.swing.JLabel();
        jLabelTimeUPDATEQueryText = new javax.swing.JLabel();
        jLabelTimeUPDATEProcessText = new javax.swing.JLabel();
        jLabelTimeJOINExecText = new javax.swing.JLabel();
        jLabelTimeJOINTransText = new javax.swing.JLabel();
        jLabelTimeJOINQueryText = new javax.swing.JLabel();
        jLabelTimeJOINProcessText = new javax.swing.JLabel();
        jLabelTimeSELECTExecText = new javax.swing.JLabel();
        jLabelTimeSELECTTransText = new javax.swing.JLabel();
        jLabelTimeSELECTQueryText = new javax.swing.JLabel();
        jLabelTimeSELECTProcessText = new javax.swing.JLabel();
        jLabelExecModValue = new javax.swing.JLabel();
        jLabelTransModValue = new javax.swing.JLabel();
        jLabelQueryModValue = new javax.swing.JLabel();
        jLabelProcessModValue = new javax.swing.JLabel();
        jLabelConnecLifeTimeValue = new javax.swing.JLabel();
        jLabelServerRejectConnecValue = new javax.swing.JLabel();
        jLabelTimeDDLExecValue = new javax.swing.JLabel();
        jLabelTimeDDLTransValue = new javax.swing.JLabel();
        jLabelTimeDDLQueryValue = new javax.swing.JLabel();
        jLabelTimeDDLProcessValue = new javax.swing.JLabel();
        jLabelTimeUPDATEExecValue = new javax.swing.JLabel();
        jLabelTimeUPDATETransValue = new javax.swing.JLabel();
        jLabelTimeUPDATEQueryValue = new javax.swing.JLabel();
        jLabelTimeUPDATEProcessValue = new javax.swing.JLabel();
        jLabelTimeJOINExecValue = new javax.swing.JLabel();
        jLabelTimeJOINTransValue = new javax.swing.JLabel();
        jLabelTimeJOINQueryValue = new javax.swing.JLabel();
        jLabelTimeJOINProcessValue = new javax.swing.JLabel();
        jLabelTimeSELECTExecValue = new javax.swing.JLabel();
        jLabelTimeSELECTTransValue = new javax.swing.JLabel();
        jLabelTimeSELECTQueryValue = new javax.swing.JLabel();
        jLabelTimeSELECTProcessValue = new javax.swing.JLabel();
        jButtonCloseWindow = new javax.swing.JButton();
        jLabelQueriesText = new javax.swing.JLabel();
        jLabelQueriesText2 = new javax.swing.JLabel();
        jLabelQueriesText3 = new javax.swing.JLabel();
        jLabelQueriesText4 = new javax.swing.JLabel();
        jLabelSecondsText2 = new javax.swing.JLabel();
        jLabelSecondsText = new javax.swing.JLabel();
        jLabelConnectionsText = new javax.swing.JLabel();
        jLabelSecondsText3 = new javax.swing.JLabel();
        jLabelSecondsText4 = new javax.swing.JLabel();
        jLabelSecondsText5 = new javax.swing.JLabel();
        jLabelSecondsText10 = new javax.swing.JLabel();
        jLabelSecondsText11 = new javax.swing.JLabel();
        jLabelSecondsText12 = new javax.swing.JLabel();
        jLabelSecondsText13 = new javax.swing.JLabel();
        jLabelSecondsText6 = new javax.swing.JLabel();
        jLabelSecondsText7 = new javax.swing.JLabel();
        jLabelSecondsText8 = new javax.swing.JLabel();
        jLabelSecondsText9 = new javax.swing.JLabel();
        jLabelSecondsText14 = new javax.swing.JLabel();
        jLabelSecondsText15 = new javax.swing.JLabel();
        jLabelSecondsText16 = new javax.swing.JLabel();
        jLabelSecondsText17 = new javax.swing.JLabel();
        jLabelConnectionsReceivedText = new javax.swing.JLabel();
        jLabelConnectionsReceivedValue = new javax.swing.JLabel();
        jLabelConnectionsText2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelRunStatisticsTitle.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelRunStatisticsTitle.setText("Run statistics");

        jLabelRunNumberText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRunNumberText.setText("Run number:");

        jLabelRunNumberValue.setText("jLabel3");

        jLabelExecModText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelExecModText.setText("Execution Module queue average length :");

        jLabelTransModText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTransModText.setText("Transaction Module queue average length :");

        jLabelQueryModText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQueryModText.setText("Query Module queue average length :");

        jLabelProcessModText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelProcessModText.setText("Process Module queue average length :");

        jLabelServerRejectConnecText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelServerRejectConnecText.setText("Server rejected connections:");

        jLabelConnecLifeTimeText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelConnecLifeTimeText.setText("Connection average life time:");

        jLabelTimeDDLExecText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeDDLExecText.setText("Average time of DDL sentences in the Execution Module:  ");

        jLabelTimeDDLTransText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeDDLTransText.setText("Average time of DDL sentences in the Transaction Module:  ");

        jLabelTimeDDLQueryText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeDDLQueryText.setText("Average time of DDL sentences in the Query Module:  ");

        jLabelTimeDDLProcessText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeDDLProcessText.setText("Average time of DDL sentences in the Process Module:  ");

        jLabelTimeUPDATEExecText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeUPDATEExecText.setText("Average time of UPDATE sentences in the Execution Module:  ");

        jLabelTimeUPDATETransText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeUPDATETransText.setText("Average time of UPDATE sentences in the Transaction Module:  ");

        jLabelTimeUPDATEQueryText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeUPDATEQueryText.setText("Average time of UPDATE sentences in the Query Module:  ");

        jLabelTimeUPDATEProcessText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeUPDATEProcessText.setText("Average time of UPDATE sentences in the Process Module:  ");

        jLabelTimeJOINExecText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeJOINExecText.setText("Average time of JOIN sentences in the Execution Module:  ");

        jLabelTimeJOINTransText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeJOINTransText.setText("Average time of JOIN sentences in the Transaction Module:  ");

        jLabelTimeJOINQueryText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeJOINQueryText.setText("Average time of JOIN sentences in the Query Module:  ");

        jLabelTimeJOINProcessText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeJOINProcessText.setText("Average time of JOIN sentences in the Process Module:  ");

        jLabelTimeSELECTExecText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeSELECTExecText.setText("Average time of SELECT sentences in the Execution Module:  ");

        jLabelTimeSELECTTransText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeSELECTTransText.setText("Average time of SELECT sentences in the Transaction Module:  ");

        jLabelTimeSELECTQueryText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeSELECTQueryText.setText("Average time of SELECT sentences in the Query Module:  ");

        jLabelTimeSELECTProcessText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeSELECTProcessText.setText("Average time of SELECT sentences in the Process Module:  ");

        jLabelExecModValue.setText("jLabel26");

        jLabelTransModValue.setText("jLabel27");

        jLabelQueryModValue.setText("jLabel28");

        jLabelProcessModValue.setText("jLabel29");

        jLabelConnecLifeTimeValue.setText("jLabel30");

        jLabelServerRejectConnecValue.setText("jLabel31");

        jLabelTimeDDLExecValue.setText("jLabel32");

        jLabelTimeDDLTransValue.setText("jLabel33");

        jLabelTimeDDLQueryValue.setText("jLabel34");

        jLabelTimeDDLProcessValue.setText("jLabel35");

        jLabelTimeUPDATEExecValue.setText("jLabel36");

        jLabelTimeUPDATETransValue.setText("jLabel37");

        jLabelTimeUPDATEQueryValue.setText("jLabel38");

        jLabelTimeUPDATEProcessValue.setText("jLabel39");

        jLabelTimeJOINExecValue.setText("jLabel40");

        jLabelTimeJOINTransValue.setText("jLabel41");

        jLabelTimeJOINQueryValue.setText("jLabel42");

        jLabelTimeJOINProcessValue.setText("jLabel43");

        jLabelTimeSELECTExecValue.setText("jLabel44");

        jLabelTimeSELECTTransValue.setText("jLabel45");

        jLabelTimeSELECTQueryValue.setText("jLabel46");

        jLabelTimeSELECTProcessValue.setText("jLabel47");

        jButtonCloseWindow.setText("Close window");
        jButtonCloseWindow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseWindowActionPerformed(evt);
            }
        });

        jLabelQueriesText.setText("queries");

        jLabelQueriesText2.setText("queries");

        jLabelQueriesText3.setText("queries");

        jLabelQueriesText4.setText("queries");

        jLabelSecondsText2.setText("seconds");

        jLabelSecondsText.setText("seconds");

        jLabelConnectionsText.setText("connections");

        jLabelSecondsText3.setText("seconds");

        jLabelSecondsText4.setText("seconds");

        jLabelSecondsText5.setText("seconds");

        jLabelSecondsText10.setText("seconds");

        jLabelSecondsText11.setText("seconds");

        jLabelSecondsText12.setText("seconds");

        jLabelSecondsText13.setText("seconds");

        jLabelSecondsText6.setText("seconds");

        jLabelSecondsText7.setText("seconds");

        jLabelSecondsText8.setText("seconds");

        jLabelSecondsText9.setText("seconds");

        jLabelSecondsText14.setText("seconds");

        jLabelSecondsText15.setText("seconds");

        jLabelSecondsText16.setText("seconds");

        jLabelSecondsText17.setText("seconds");

        jLabelConnectionsReceivedText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelConnectionsReceivedText.setText("Connections received: ");

        jLabelConnectionsReceivedValue.setText("jLabel2");

        jLabelConnectionsText2.setText("connections");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCloseWindow)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTimeJOINProcessText)
                                    .addComponent(jLabelTimeJOINQueryText)
                                    .addComponent(jLabelTimeJOINTransText)
                                    .addComponent(jLabelTimeJOINExecText)
                                    .addComponent(jLabelTimeDDLProcessText)
                                    .addComponent(jLabelTimeDDLQueryText)
                                    .addComponent(jLabelTimeDDLTransText)
                                    .addComponent(jLabelTimeDDLExecText))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTimeDDLExecValue)
                                    .addComponent(jLabelTimeDDLTransValue)
                                    .addComponent(jLabelTimeDDLQueryValue)
                                    .addComponent(jLabelTimeDDLProcessValue)
                                    .addComponent(jLabelTimeJOINExecValue)
                                    .addComponent(jLabelTimeJOINTransValue)
                                    .addComponent(jLabelTimeJOINQueryValue)
                                    .addComponent(jLabelTimeJOINProcessValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSecondsText9)
                                    .addComponent(jLabelSecondsText5)
                                    .addComponent(jLabelSecondsText4)
                                    .addComponent(jLabelSecondsText3)
                                    .addComponent(jLabelSecondsText2)
                                    .addComponent(jLabelSecondsText8)
                                    .addComponent(jLabelSecondsText7)
                                    .addComponent(jLabelSecondsText6)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelExecModText)
                                    .addComponent(jLabelTransModText)
                                    .addComponent(jLabelQueryModText)
                                    .addComponent(jLabelProcessModText))
                                .addGap(125, 125, 125)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelProcessModValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelQueriesText4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelExecModValue)
                                            .addComponent(jLabelTransModValue)
                                            .addComponent(jLabelQueryModValue))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelQueriesText3)
                                            .addComponent(jLabelQueriesText2)
                                            .addComponent(jLabelQueriesText))))))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTimeUPDATETransText)
                                            .addComponent(jLabelTimeUPDATEExecText)
                                            .addComponent(jLabelTimeUPDATEQueryText))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelTimeUPDATETransValue)
                                            .addComponent(jLabelTimeUPDATEExecValue)
                                            .addComponent(jLabelTimeUPDATEQueryValue)
                                            .addComponent(jLabelTimeUPDATEProcessValue)
                                            .addComponent(jLabelTimeSELECTExecValue)
                                            .addComponent(jLabelTimeSELECTTransValue)
                                            .addComponent(jLabelTimeSELECTQueryValue)
                                            .addComponent(jLabelTimeSELECTProcessValue)))
                                    .addComponent(jLabelTimeUPDATEProcessText)
                                    .addComponent(jLabelTimeSELECTExecText)
                                    .addComponent(jLabelTimeSELECTTransText)
                                    .addComponent(jLabelTimeSELECTQueryText)
                                    .addComponent(jLabelTimeSELECTProcessText))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSecondsText12)
                                    .addComponent(jLabelSecondsText10)
                                    .addComponent(jLabelSecondsText11)
                                    .addComponent(jLabelSecondsText13)
                                    .addComponent(jLabelSecondsText14)
                                    .addComponent(jLabelSecondsText15)
                                    .addComponent(jLabelSecondsText16)
                                    .addComponent(jLabelSecondsText17)))
                            .addComponent(jLabelServerRejectConnecText)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelConnecLifeTimeText)
                                    .addComponent(jLabelConnectionsReceivedText))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelConnectionsReceivedValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabelConnectionsText2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelConnecLifeTimeValue)
                                            .addComponent(jLabelServerRejectConnecValue))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelConnectionsText)
                                            .addComponent(jLabelSecondsText)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelRunNumberText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRunNumberValue))
                    .addComponent(jLabelRunStatisticsTitle))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabelRunStatisticsTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRunNumberText)
                    .addComponent(jLabelRunNumberValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelExecModText)
                                    .addComponent(jLabelExecModValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelTransModText)
                                    .addComponent(jLabelTransModValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelQueryModText)
                                    .addComponent(jLabelQueryModValue)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelQueriesText)
                                    .addComponent(jLabelConnecLifeTimeText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelQueriesText2)
                                    .addComponent(jLabelServerRejectConnecText)
                                    .addComponent(jLabelServerRejectConnecValue)
                                    .addComponent(jLabelConnectionsText))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelQueriesText3)
                                    .addComponent(jLabelConnectionsReceivedText)
                                    .addComponent(jLabelConnectionsReceivedValue)
                                    .addComponent(jLabelConnectionsText2))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelProcessModText)
                            .addComponent(jLabelProcessModValue)
                            .addComponent(jLabelQueriesText4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeDDLExecText)
                            .addComponent(jLabelTimeDDLExecValue)
                            .addComponent(jLabelSecondsText2)
                            .addComponent(jLabelTimeUPDATEExecText)
                            .addComponent(jLabelTimeUPDATEExecValue)
                            .addComponent(jLabelSecondsText10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeDDLTransText)
                            .addComponent(jLabelTimeDDLTransValue)
                            .addComponent(jLabelSecondsText3)
                            .addComponent(jLabelTimeUPDATETransText)
                            .addComponent(jLabelTimeUPDATETransValue)
                            .addComponent(jLabelSecondsText11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeDDLQueryText)
                            .addComponent(jLabelTimeDDLQueryValue)
                            .addComponent(jLabelSecondsText4)
                            .addComponent(jLabelTimeUPDATEQueryText)
                            .addComponent(jLabelTimeUPDATEQueryValue)
                            .addComponent(jLabelSecondsText12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeDDLProcessText)
                            .addComponent(jLabelTimeDDLProcessValue)
                            .addComponent(jLabelSecondsText5)
                            .addComponent(jLabelTimeUPDATEProcessText)
                            .addComponent(jLabelTimeUPDATEProcessValue)
                            .addComponent(jLabelSecondsText13))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeJOINExecText)
                            .addComponent(jLabelTimeJOINExecValue)
                            .addComponent(jLabelSecondsText6)
                            .addComponent(jLabelTimeSELECTExecText)
                            .addComponent(jLabelTimeSELECTExecValue)
                            .addComponent(jLabelSecondsText14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeJOINTransText)
                            .addComponent(jLabelTimeJOINTransValue)
                            .addComponent(jLabelSecondsText7)
                            .addComponent(jLabelTimeSELECTTransText)
                            .addComponent(jLabelTimeSELECTTransValue)
                            .addComponent(jLabelSecondsText15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeJOINQueryText)
                            .addComponent(jLabelTimeJOINQueryValue)
                            .addComponent(jLabelSecondsText8)
                            .addComponent(jLabelTimeSELECTQueryText)
                            .addComponent(jLabelTimeSELECTQueryValue)
                            .addComponent(jLabelSecondsText16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeJOINProcessText)
                            .addComponent(jLabelTimeJOINProcessValue)
                            .addComponent(jLabelSecondsText9)
                            .addComponent(jLabelTimeSELECTProcessText)
                            .addComponent(jLabelTimeSELECTProcessValue)
                            .addComponent(jLabelSecondsText17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(jButtonCloseWindow)
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelConnecLifeTimeValue)
                            .addComponent(jLabelSecondsText))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseWindowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseWindowActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCloseWindowActionPerformed

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

    public void setStats(int runNumber, int totalConnections, double execModQueueLength, double transModQueueLength, double queryModQueueLength, double processModQueueLength, int rejectedConnections, double connectionAverageLifeTime, double avgDDLExec, double avgDDLTrans, double avgDDLQuery, double avgDDLProcess, double avgUpdateExec, double avgUpdateTrans, double avgUpdateaQuery, double avgUpdateProcess, double avgJoinExec, double avgJoinTrans, double avgJoinQuery, double avgJoinProcess, double avgSelectExec, double avgSelectTrans, double avgSelectQuery, double avgSelectProcess) {
        jLabelConnectionsReceivedValue.setText(decimalFormat.format(totalConnections));
        jLabelRunNumberValue.setText(decimalFormat.format(runNumber));
        jLabelExecModValue.setText(decimalFormat.format(execModQueueLength));
        jLabelTransModValue.setText(decimalFormat.format(transModQueueLength));
        jLabelQueryModValue.setText(decimalFormat.format(queryModQueueLength));
        jLabelProcessModValue.setText(decimalFormat.format(processModQueueLength));
        if(!(Double.isNaN(connectionAverageLifeTime))){
            jLabelConnecLifeTimeValue.setText(decimalFormat.format(connectionAverageLifeTime));
        }else {
            jLabelConnecLifeTimeValue.setText(decimalFormat.format(0));
        }
        jLabelServerRejectConnecValue.setText(decimalFormat.format(rejectedConnections));
        if(!(Double.isNaN(avgDDLExec))){
            jLabelTimeDDLExecValue.setText(decimalFormat.format(avgDDLExec));
        }else{
            jLabelTimeDDLExecValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgDDLTrans))){
            jLabelTimeDDLTransValue.setText(decimalFormat.format(avgDDLTrans));
        }else{
            jLabelTimeDDLTransValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgDDLQuery))){
            jLabelTimeDDLQueryValue.setText(decimalFormat.format(avgDDLQuery));
        }else{
            jLabelTimeDDLQueryValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgDDLProcess))){
            jLabelTimeDDLProcessValue.setText(decimalFormat.format(avgDDLProcess));
        }else{
            jLabelTimeDDLProcessValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgUpdateExec))){
            jLabelTimeUPDATEExecValue.setText(decimalFormat.format(avgUpdateExec));
        }else{
            jLabelTimeUPDATEExecValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgUpdateTrans))){
            jLabelTimeUPDATETransValue.setText(decimalFormat.format(avgUpdateTrans));
        }else{
            jLabelTimeUPDATETransValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgUpdateaQuery))){
            jLabelTimeUPDATEQueryValue.setText(decimalFormat.format(avgUpdateaQuery));
        }else{
            jLabelTimeUPDATEQueryValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgUpdateProcess))){
            jLabelTimeUPDATEProcessValue.setText(decimalFormat.format(avgUpdateProcess));
        }else{
            jLabelTimeUPDATEProcessValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgJoinExec))){
            jLabelTimeJOINExecValue.setText(decimalFormat.format(avgJoinExec));
        }else{
            jLabelTimeJOINExecValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgJoinTrans))){
            jLabelTimeJOINTransValue.setText(decimalFormat.format(avgJoinTrans));
        }else{
            jLabelTimeJOINTransValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgJoinQuery))){
            jLabelTimeJOINQueryValue.setText(decimalFormat.format(avgJoinQuery));
        }else{
            jLabelTimeJOINQueryValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgJoinProcess))){
            jLabelTimeJOINProcessValue.setText(decimalFormat.format(avgJoinProcess));
        }else{
            jLabelTimeJOINProcessValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgSelectExec))){
            jLabelTimeSELECTExecValue.setText(decimalFormat.format(avgSelectExec));
        }else{
            jLabelTimeSELECTExecValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgSelectTrans))){
            jLabelTimeSELECTTransValue.setText(decimalFormat.format(avgSelectTrans));
        }else{
            jLabelTimeSELECTTransValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgSelectQuery))){
            jLabelTimeSELECTQueryValue.setText(decimalFormat.format(avgSelectQuery));
        }else{
            jLabelTimeSELECTQueryValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgSelectProcess))){
            jLabelTimeSELECTProcessValue.setText(decimalFormat.format(avgSelectProcess));
        }else {
            jLabelTimeSELECTProcessValue.setText(decimalFormat.format(0));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCloseWindow;
    private javax.swing.JLabel jLabelConnecLifeTimeText;
    private javax.swing.JLabel jLabelConnecLifeTimeValue;
    private javax.swing.JLabel jLabelConnectionsReceivedText;
    private javax.swing.JLabel jLabelConnectionsReceivedValue;
    private javax.swing.JLabel jLabelConnectionsText;
    private javax.swing.JLabel jLabelConnectionsText2;
    private javax.swing.JLabel jLabelExecModText;
    private javax.swing.JLabel jLabelExecModValue;
    private javax.swing.JLabel jLabelProcessModText;
    private javax.swing.JLabel jLabelProcessModValue;
    private javax.swing.JLabel jLabelQueriesText;
    private javax.swing.JLabel jLabelQueriesText2;
    private javax.swing.JLabel jLabelQueriesText3;
    private javax.swing.JLabel jLabelQueriesText4;
    private javax.swing.JLabel jLabelQueryModText;
    private javax.swing.JLabel jLabelQueryModValue;
    private javax.swing.JLabel jLabelRunNumberText;
    private javax.swing.JLabel jLabelRunNumberValue;
    private javax.swing.JLabel jLabelRunStatisticsTitle;
    private javax.swing.JLabel jLabelSecondsText;
    private javax.swing.JLabel jLabelSecondsText10;
    private javax.swing.JLabel jLabelSecondsText11;
    private javax.swing.JLabel jLabelSecondsText12;
    private javax.swing.JLabel jLabelSecondsText13;
    private javax.swing.JLabel jLabelSecondsText14;
    private javax.swing.JLabel jLabelSecondsText15;
    private javax.swing.JLabel jLabelSecondsText16;
    private javax.swing.JLabel jLabelSecondsText17;
    private javax.swing.JLabel jLabelSecondsText2;
    private javax.swing.JLabel jLabelSecondsText3;
    private javax.swing.JLabel jLabelSecondsText4;
    private javax.swing.JLabel jLabelSecondsText5;
    private javax.swing.JLabel jLabelSecondsText6;
    private javax.swing.JLabel jLabelSecondsText7;
    private javax.swing.JLabel jLabelSecondsText8;
    private javax.swing.JLabel jLabelSecondsText9;
    private javax.swing.JLabel jLabelServerRejectConnecText;
    private javax.swing.JLabel jLabelServerRejectConnecValue;
    private javax.swing.JLabel jLabelTimeDDLExecText;
    private javax.swing.JLabel jLabelTimeDDLExecValue;
    private javax.swing.JLabel jLabelTimeDDLProcessText;
    private javax.swing.JLabel jLabelTimeDDLProcessValue;
    private javax.swing.JLabel jLabelTimeDDLQueryText;
    private javax.swing.JLabel jLabelTimeDDLQueryValue;
    private javax.swing.JLabel jLabelTimeDDLTransText;
    private javax.swing.JLabel jLabelTimeDDLTransValue;
    private javax.swing.JLabel jLabelTimeJOINExecText;
    private javax.swing.JLabel jLabelTimeJOINExecValue;
    private javax.swing.JLabel jLabelTimeJOINProcessText;
    private javax.swing.JLabel jLabelTimeJOINProcessValue;
    private javax.swing.JLabel jLabelTimeJOINQueryText;
    private javax.swing.JLabel jLabelTimeJOINQueryValue;
    private javax.swing.JLabel jLabelTimeJOINTransText;
    private javax.swing.JLabel jLabelTimeJOINTransValue;
    private javax.swing.JLabel jLabelTimeSELECTExecText;
    private javax.swing.JLabel jLabelTimeSELECTExecValue;
    private javax.swing.JLabel jLabelTimeSELECTProcessText;
    private javax.swing.JLabel jLabelTimeSELECTProcessValue;
    private javax.swing.JLabel jLabelTimeSELECTQueryText;
    private javax.swing.JLabel jLabelTimeSELECTQueryValue;
    private javax.swing.JLabel jLabelTimeSELECTTransText;
    private javax.swing.JLabel jLabelTimeSELECTTransValue;
    private javax.swing.JLabel jLabelTimeUPDATEExecText;
    private javax.swing.JLabel jLabelTimeUPDATEExecValue;
    private javax.swing.JLabel jLabelTimeUPDATEProcessText;
    private javax.swing.JLabel jLabelTimeUPDATEProcessValue;
    private javax.swing.JLabel jLabelTimeUPDATEQueryText;
    private javax.swing.JLabel jLabelTimeUPDATEQueryValue;
    private javax.swing.JLabel jLabelTimeUPDATETransText;
    private javax.swing.JLabel jLabelTimeUPDATETransValue;
    private javax.swing.JLabel jLabelTransModText;
    private javax.swing.JLabel jLabelTransModValue;
    // End of variables declaration//GEN-END:variables
}
