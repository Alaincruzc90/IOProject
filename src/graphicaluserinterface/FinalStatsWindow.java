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

        jLabelTimeJOINProcessText = new javax.swing.JLabel();
        jLabelTimeSELECTExecText = new javax.swing.JLabel();
        jLabelTimeSELECTTransText = new javax.swing.JLabel();
        jLabelTimeSELECTQueryText = new javax.swing.JLabel();
        jLabelTimeSELECTProcessText = new javax.swing.JLabel();
        jLabelConnectAvLifeTimeText = new javax.swing.JLabel();
        jLabelTimeDDLExecText = new javax.swing.JLabel();
        jLabelTimeDDLTransText = new javax.swing.JLabel();
        jLabelTimeDDLQueryText = new javax.swing.JLabel();
        jLabelTimeDDLProcessText = new javax.swing.JLabel();
        jLabelTimeUPDATEExecText = new javax.swing.JLabel();
        jLabelTimeUPDATETransText = new javax.swing.JLabel();
        jLabelTimeUPDATEQueryText = new javax.swing.JLabel();
        jLabelTimeUPDATEProcessText = new javax.swing.JLabel();
        jLabelTimeJOINExecText = new javax.swing.JLabel();
        jLabelExecLengthText = new javax.swing.JLabel();
        jLabelTransLengthText = new javax.swing.JLabel();
        jLabelQueryLengthText = new javax.swing.JLabel();
        jLabelModuleLengthText = new javax.swing.JLabel();
        jLabelRejectedConnectionsText = new javax.swing.JLabel();
        jLabelTimeJOINTransText = new javax.swing.JLabel();
        jLabelTimeJOINQueryText = new javax.swing.JLabel();
        jLabelTitleFinalSimStats = new javax.swing.JLabel();
        jLabelConfidenceIntervalText = new javax.swing.JLabel();
        jLabelExecLengthValue = new javax.swing.JLabel();
        jLabelTransLengthValue = new javax.swing.JLabel();
        jLabelQueryLengthValue = new javax.swing.JLabel();
        jLabelModuleLengthValue = new javax.swing.JLabel();
        jLabelConnectAvLifeTimeValue = new javax.swing.JLabel();
        jLabelConfidenceIntervalValue = new javax.swing.JLabel();
        jLabelRejectedConnectionsValue = new javax.swing.JLabel();
        jLabelTimeDDLExecValue = new javax.swing.JLabel();
        jLabelTimeDDLTransValue = new javax.swing.JLabel();
        jLabelTimeDDLQueryValue = new javax.swing.JLabel();
        jLabelTimeDDLProcessValue = new javax.swing.JLabel();
        jLabelTimeUPDATEExecValue = new javax.swing.JLabel();
        jLabelTimeUPDATETransValue = new javax.swing.JLabel();
        jLabelTimeUPDATEQueryValue = new javax.swing.JLabel();
        jLabelTimeUPDATEProcessValue = new javax.swing.JLabel();
        jLabelTimeJOINExecValue = new javax.swing.JLabel();
        jLabelTimeJOINTransactionValue = new javax.swing.JLabel();
        jLabelTimeJOINQueryValue = new javax.swing.JLabel();
        jLabelTimeJOINProcessValue = new javax.swing.JLabel();
        jLabelTimeSELECTExecValue = new javax.swing.JLabel();
        jLabelTimeSELECTTransValue = new javax.swing.JLabel();
        jLabelTimeSELECTQueryValue = new javax.swing.JLabel();
        jLabelTimeSELECTProcessValue = new javax.swing.JLabel();
        jButtonClose = new javax.swing.JButton();
        jButtonNew = new javax.swing.JButton();
        jButtonRepeat = new javax.swing.JButton();
        jLabelRepetitionsText = new javax.swing.JLabel();
        jLabelRepetitionsValue = new javax.swing.JLabel();
        jLabelQueriesText2 = new javax.swing.JLabel();
        jLabelQueriesText = new javax.swing.JLabel();
        jLabelQueriesText3 = new javax.swing.JLabel();
        jLabelQueriesText4 = new javax.swing.JLabel();
        jLabelSecondsText9 = new javax.swing.JLabel();
        jLabelSecondsText10 = new javax.swing.JLabel();
        jLabelConnectionsText = new javax.swing.JLabel();
        jLabelSecondsText = new javax.swing.JLabel();
        jLabelSecondsText2 = new javax.swing.JLabel();
        jLabelSecondsText3 = new javax.swing.JLabel();
        jLabelSecondsText4 = new javax.swing.JLabel();
        jLabelSecondsText11 = new javax.swing.JLabel();
        jLabelSecondsText12 = new javax.swing.JLabel();
        jLabelSecondsText13 = new javax.swing.JLabel();
        jLabelSecondsText14 = new javax.swing.JLabel();
        jLabelSecondsText5 = new javax.swing.JLabel();
        jLabelSecondsText6 = new javax.swing.JLabel();
        jLabelSecondsText7 = new javax.swing.JLabel();
        jLabelSecondsText8 = new javax.swing.JLabel();
        jLabelSecondsText15 = new javax.swing.JLabel();
        jLabelSecondsText16 = new javax.swing.JLabel();
        jLabelSecondsText17 = new javax.swing.JLabel();
        jLabelSecondsText18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        jLabelConnectAvLifeTimeText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelConnectAvLifeTimeText.setText("Connection average life time:");

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

        jLabelExecLengthText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelExecLengthText.setText("Execution Module queue average length :");

        jLabelTransLengthText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTransLengthText.setText("Transaction Module queue average length :");

        jLabelQueryLengthText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQueryLengthText.setText("Query Module queue average length :");

        jLabelModuleLengthText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelModuleLengthText.setText("Process Module queue average length :");

        jLabelRejectedConnectionsText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRejectedConnectionsText.setText("Average server rejected connections:");

        jLabelTimeJOINTransText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeJOINTransText.setText("Average time of JOIN sentences in the Transaction Module:  ");

        jLabelTimeJOINQueryText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTimeJOINQueryText.setText("Average time of JOIN sentences in the Query Module:  ");

        jLabelTitleFinalSimStats.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitleFinalSimStats.setText("Final simulation statistics");

        jLabelConfidenceIntervalText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelConfidenceIntervalText.setText("Confidence interval of the average life time:");

        jLabelExecLengthValue.setText("jLabel3");

        jLabelTransLengthValue.setText("jLabel26");

        jLabelQueryLengthValue.setText("jLabel27");

        jLabelModuleLengthValue.setText("jLabel28");

        jLabelConnectAvLifeTimeValue.setText("jLabel29");

        jLabelConfidenceIntervalValue.setText("jLabel30");

        jLabelRejectedConnectionsValue.setText("jLabel31");

        jLabelTimeDDLExecValue.setText("jLabel32");

        jLabelTimeDDLTransValue.setText("jLabel33");

        jLabelTimeDDLQueryValue.setText("jLabel34");

        jLabelTimeDDLProcessValue.setText("jLabel35");

        jLabelTimeUPDATEExecValue.setText("jLabel36");

        jLabelTimeUPDATETransValue.setText("jLabel37");

        jLabelTimeUPDATEQueryValue.setText("jLabel38");

        jLabelTimeUPDATEProcessValue.setText("jLabel39");

        jLabelTimeJOINExecValue.setText("jLabel40");

        jLabelTimeJOINTransactionValue.setText("jLabel41");

        jLabelTimeJOINQueryValue.setText("jLabel42");

        jLabelTimeJOINProcessValue.setText("jLabel43");

        jLabelTimeSELECTExecValue.setText("jLabel44");

        jLabelTimeSELECTTransValue.setText("jLabel45");

        jLabelTimeSELECTQueryValue.setText("jLabel46");

        jLabelTimeSELECTProcessValue.setText("jLabel47");

        jButtonClose.setText("Close program");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        jButtonNew.setText("Try a new simulation");
        jButtonNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNewActionPerformed(evt);
            }
        });

        jButtonRepeat.setText("Repeat this simulation");
        jButtonRepeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRepeatActionPerformed(evt);
            }
        });

        jLabelRepetitionsText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRepetitionsText.setText("Repetitions:");

        jLabelRepetitionsValue.setText("jLabel49");

        jLabelQueriesText2.setText("queries");

        jLabelQueriesText.setText("queries");

        jLabelQueriesText3.setText("queries");

        jLabelQueriesText4.setText("queries");

        jLabelSecondsText9.setText("seconds");

        jLabelSecondsText10.setText("seconds");

        jLabelConnectionsText.setText("connections");

        jLabelSecondsText.setText("seconds");

        jLabelSecondsText2.setText("seconds");

        jLabelSecondsText3.setText("seconds");

        jLabelSecondsText4.setText("seconds");

        jLabelSecondsText11.setText("seconds");

        jLabelSecondsText12.setText("seconds");

        jLabelSecondsText13.setText("seconds");

        jLabelSecondsText14.setText("seconds");

        jLabelSecondsText5.setText("seconds");

        jLabelSecondsText6.setText("seconds");

        jLabelSecondsText7.setText("seconds");

        jLabelSecondsText8.setText("seconds");

        jLabelSecondsText15.setText("seconds");

        jLabelSecondsText16.setText("seconds");

        jLabelSecondsText17.setText("seconds");

        jLabelSecondsText18.setText("seconds");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTimeDDLExecText)
                            .addComponent(jLabelTimeDDLTransText)
                            .addComponent(jLabelTimeDDLQueryText)
                            .addComponent(jLabelTimeDDLProcessText)
                            .addComponent(jLabelTimeJOINExecText)
                            .addComponent(jLabelTimeJOINTransText)
                            .addComponent(jLabelTimeJOINQueryText)
                            .addComponent(jLabelTimeJOINProcessText))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTimeJOINProcessValue)
                            .addComponent(jLabelTimeJOINQueryValue)
                            .addComponent(jLabelTimeJOINTransactionValue)
                            .addComponent(jLabelTimeJOINExecValue)
                            .addComponent(jLabelTimeDDLProcessValue)
                            .addComponent(jLabelTimeDDLQueryValue)
                            .addComponent(jLabelTimeDDLTransValue)
                            .addComponent(jLabelTimeDDLExecValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelSecondsText)
                            .addComponent(jLabelSecondsText2)
                            .addComponent(jLabelSecondsText3)
                            .addComponent(jLabelSecondsText4)
                            .addComponent(jLabelSecondsText5)
                            .addComponent(jLabelSecondsText6)
                            .addComponent(jLabelSecondsText7)
                            .addComponent(jLabelSecondsText8))
                        .addGap(99, 607, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelRepetitionsText)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelRepetitionsValue))
                            .addComponent(jLabelTitleFinalSimStats))
                        .addContainerGap(831, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelExecLengthText)
                            .addComponent(jLabelTransLengthText)
                            .addComponent(jLabelQueryLengthText)
                            .addComponent(jLabelModuleLengthText))
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelModuleLengthValue)
                            .addComponent(jLabelQueryLengthValue)
                            .addComponent(jLabelTransLengthValue)
                            .addComponent(jLabelExecLengthValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelQueriesText3)
                            .addComponent(jLabelQueriesText4)
                            .addComponent(jLabelQueriesText2)
                            .addComponent(jLabelQueriesText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTimeUPDATEExecText)
                                    .addComponent(jLabelTimeUPDATETransText)
                                    .addComponent(jLabelTimeUPDATEQueryText)
                                    .addComponent(jLabelTimeUPDATEProcessText))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTimeUPDATEProcessValue)
                                    .addComponent(jLabelTimeUPDATEQueryValue)
                                    .addComponent(jLabelTimeUPDATETransValue)
                                    .addComponent(jLabelTimeUPDATEExecValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSecondsText11)
                                    .addComponent(jLabelSecondsText12)
                                    .addComponent(jLabelSecondsText13)
                                    .addComponent(jLabelSecondsText14)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTimeSELECTExecText)
                                    .addComponent(jLabelTimeSELECTTransText)
                                    .addComponent(jLabelTimeSELECTQueryText)
                                    .addComponent(jLabelTimeSELECTProcessText))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTimeSELECTProcessValue)
                                    .addComponent(jLabelTimeSELECTQueryValue)
                                    .addComponent(jLabelTimeSELECTTransValue)
                                    .addComponent(jLabelTimeSELECTExecValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelSecondsText15)
                                    .addComponent(jLabelSecondsText16)
                                    .addComponent(jLabelSecondsText17)
                                    .addComponent(jLabelSecondsText18)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelConnectAvLifeTimeText)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelConfidenceIntervalText, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabelRejectedConnectionsText)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelConfidenceIntervalValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelSecondsText10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelRejectedConnectionsValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelConnectionsText))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelConnectAvLifeTimeValue)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelSecondsText9)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonRepeat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonClose)
                .addGap(37, 37, 37))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabelTitleFinalSimStats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelRepetitionsText)
                            .addComponent(jLabelRepetitionsValue))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelTransLengthText)
                                        .addGap(28, 28, 28))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabelQueriesText)
                                                    .addComponent(jLabelExecLengthValue)
                                                    .addComponent(jLabelExecLengthText)
                                                    .addComponent(jLabelConnectAvLifeTimeText))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabelConnectAvLifeTimeValue)
                                                    .addComponent(jLabelSecondsText9))
                                                .addGap(6, 6, 6)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabelQueriesText2)
                                                    .addComponent(jLabelTransLengthValue))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jLabelQueryLengthValue)
                                                    .addComponent(jLabelQueriesText3)
                                                    .addComponent(jLabelQueryLengthText)))
                                            .addComponent(jLabelRejectedConnectionsText, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelModuleLengthText)
                                    .addComponent(jLabelModuleLengthValue)
                                    .addComponent(jLabelQueriesText4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelConfidenceIntervalText)
                                    .addComponent(jLabelConfidenceIntervalValue)
                                    .addComponent(jLabelSecondsText10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelRejectedConnectionsValue)
                                    .addComponent(jLabelConnectionsText))))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeUPDATEExecText)
                            .addComponent(jLabelTimeUPDATEExecValue)
                            .addComponent(jLabelSecondsText11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeUPDATETransText)
                            .addComponent(jLabelTimeUPDATETransValue)
                            .addComponent(jLabelSecondsText12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeUPDATEQueryText)
                            .addComponent(jLabelTimeUPDATEQueryValue)
                            .addComponent(jLabelSecondsText13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeUPDATEProcessText)
                            .addComponent(jLabelTimeUPDATEProcessValue)
                            .addComponent(jLabelSecondsText14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeSELECTExecText)
                            .addComponent(jLabelTimeSELECTExecValue)
                            .addComponent(jLabelSecondsText15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeSELECTTransText)
                            .addComponent(jLabelTimeSELECTTransValue)
                            .addComponent(jLabelSecondsText16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeSELECTQueryText)
                            .addComponent(jLabelTimeSELECTQueryValue)
                            .addComponent(jLabelSecondsText17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTimeSELECTProcessText)
                            .addComponent(jLabelTimeSELECTProcessValue)
                            .addComponent(jLabelSecondsText18)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelTimeDDLExecText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelTimeDDLTransText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelTimeDDLQueryText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelTimeDDLProcessText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTimeJOINExecText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelTimeJOINTransText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelTimeJOINQueryText)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelTimeJOINProcessText))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTimeDDLExecValue)
                                .addComponent(jLabelSecondsText))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTimeDDLTransValue)
                                .addComponent(jLabelSecondsText2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTimeDDLQueryValue)
                                .addComponent(jLabelSecondsText3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTimeDDLProcessValue)
                                .addComponent(jLabelSecondsText4))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTimeJOINExecValue)
                                .addComponent(jLabelSecondsText5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTimeJOINTransactionValue)
                                .addComponent(jLabelSecondsText6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTimeJOINQueryValue)
                                .addComponent(jLabelSecondsText7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelTimeJOINProcessValue)
                                .addComponent(jLabelSecondsText8)))))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonClose)
                    .addComponent(jButtonNew)
                    .addComponent(jButtonRepeat))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseActionPerformed


    
    private void jButtonRepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRepeatActionPerformed
        java.awt.Window win[] = java.awt.Window.getWindows();
        for (int i = 0; i < win.length; i++) {
            win[i].dispose();
        }
        this.graphicalInterfaceController.restartSameSimulation();
    }//GEN-LAST:event_jButtonRepeatActionPerformed

    private void jButtonNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNewActionPerformed
        java.awt.Window win[] = java.awt.Window.getWindows();
        for (int i = 0; i < win.length; i++) {
            win[i].dispose();
        }
        this.graphicalInterfaceController.restartNewSimulation();
    }//GEN-LAST:event_jButtonNewActionPerformed

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
        jLabelRepetitionsValue.setText(decimalFormat.format(repetitions));
        jLabelExecLengthValue.setText(decimalFormat.format(execModAvgTotal));
        jLabelTransLengthValue.setText(decimalFormat.format(transacModAvgTotal));
        jLabelQueryLengthValue.setText(decimalFormat.format(querycModAvgTotal));
        jLabelModuleLengthValue.setText(decimalFormat.format(processModAvgTotal));
        if(!(Double.isNaN(connectionAvgLifeTime))){
            jLabelConnectAvLifeTimeValue.setText(decimalFormat.format(connectionAvgLifeTime));
        }else {
            jLabelConnectAvLifeTimeValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(avgRejectedConnections))){
            jLabelRejectedConnectionsValue.setText(decimalFormat.format(avgRejectedConnections));
        }else{
            jLabelRejectedConnectionsValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(ddlAvgTimeExec))){
            jLabelTimeDDLExecValue.setText(decimalFormat.format(ddlAvgTimeExec));
        }else{
            jLabelTimeDDLExecValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(ddlAvgTimeTrans))){
            jLabelTimeDDLTransValue.setText(decimalFormat.format(ddlAvgTimeTrans));
        }else {
            jLabelTimeDDLTransValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(ddlAvgTimeQuery))){
            jLabelTimeDDLQueryValue.setText(decimalFormat.format(ddlAvgTimeQuery));
        }else {
            jLabelTimeDDLQueryValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(ddlAvgTimeProcess))){
            jLabelTimeDDLProcessValue.setText(decimalFormat.format(ddlAvgTimeProcess));
        }else {
            jLabelTimeDDLProcessValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(updateAvgTimeExec))){
            jLabelTimeUPDATEExecValue.setText(decimalFormat.format(updateAvgTimeExec));
        }else {
            jLabelTimeUPDATEExecValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(updateAvgTimeTrans))){
            jLabelTimeUPDATETransValue.setText(decimalFormat.format(updateAvgTimeTrans));
        }else {
            jLabelTimeUPDATETransValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(updateAvgTimeQuery))){
            jLabelTimeUPDATEQueryValue.setText(decimalFormat.format(updateAvgTimeQuery));
        }else {
            jLabelTimeUPDATEQueryValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(updateAvgTimeProcess))){
            jLabelTimeUPDATEProcessValue.setText(decimalFormat.format(updateAvgTimeProcess));
        }else {
            jLabelTimeUPDATEProcessValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(joinAvgTimeExec))){
            jLabelTimeJOINExecValue.setText(decimalFormat.format(joinAvgTimeExec));
        }else {
            jLabelTimeJOINExecValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(joinAvgTimeTrans))){
            jLabelTimeJOINTransactionValue.setText(decimalFormat.format(joinAvgTimeTrans));
        }else {
            jLabelTimeJOINTransactionValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(joinAvgTimeQuery))){
            jLabelTimeJOINQueryValue.setText(decimalFormat.format(joinAvgTimeQuery));
        }else {
            jLabelTimeJOINQueryValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(joinAvgTimeProcess))){
            jLabelTimeJOINProcessValue.setText(decimalFormat.format(joinAvgTimeProcess));
        }else {
            jLabelTimeJOINProcessValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(selectAvgTimeExec))){
            jLabelTimeSELECTExecValue.setText(decimalFormat.format(selectAvgTimeExec));
        }else {
            jLabelTimeSELECTExecValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(selectAvgTimeTrans))){
            jLabelTimeSELECTTransValue.setText(decimalFormat.format(selectAvgTimeTrans));
        }else {
            jLabelTimeSELECTTransValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(selectAvgTimeQuery))){
            jLabelTimeSELECTQueryValue.setText(decimalFormat.format(selectAvgTimeQuery));
        }else {
            jLabelTimeSELECTQueryValue.setText(decimalFormat.format(0));
        }
        if(!(Double.isNaN(selectAvgTimeProcess))){
            jLabelTimeSELECTProcessValue.setText(decimalFormat.format(selectAvgTimeProcess));
        }else {
            jLabelTimeSELECTProcessValue.setText(decimalFormat.format(0));
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
        jLabelConfidenceIntervalValue.setText("[" + decimalFormat.format(media - result) + " , " + decimalFormat.format(media + result) + "]");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonNew;
    private javax.swing.JButton jButtonRepeat;
    private javax.swing.JLabel jLabelConfidenceIntervalText;
    private javax.swing.JLabel jLabelConfidenceIntervalValue;
    private javax.swing.JLabel jLabelConnectAvLifeTimeText;
    private javax.swing.JLabel jLabelConnectAvLifeTimeValue;
    private javax.swing.JLabel jLabelConnectionsText;
    private javax.swing.JLabel jLabelExecLengthText;
    private javax.swing.JLabel jLabelExecLengthValue;
    private javax.swing.JLabel jLabelModuleLengthText;
    private javax.swing.JLabel jLabelModuleLengthValue;
    private javax.swing.JLabel jLabelQueriesText;
    private javax.swing.JLabel jLabelQueriesText2;
    private javax.swing.JLabel jLabelQueriesText3;
    private javax.swing.JLabel jLabelQueriesText4;
    private javax.swing.JLabel jLabelQueryLengthText;
    private javax.swing.JLabel jLabelQueryLengthValue;
    private javax.swing.JLabel jLabelRejectedConnectionsText;
    private javax.swing.JLabel jLabelRejectedConnectionsValue;
    private javax.swing.JLabel jLabelRepetitionsText;
    private javax.swing.JLabel jLabelRepetitionsValue;
    private javax.swing.JLabel jLabelSecondsText;
    private javax.swing.JLabel jLabelSecondsText10;
    private javax.swing.JLabel jLabelSecondsText11;
    private javax.swing.JLabel jLabelSecondsText12;
    private javax.swing.JLabel jLabelSecondsText13;
    private javax.swing.JLabel jLabelSecondsText14;
    private javax.swing.JLabel jLabelSecondsText15;
    private javax.swing.JLabel jLabelSecondsText16;
    private javax.swing.JLabel jLabelSecondsText17;
    private javax.swing.JLabel jLabelSecondsText18;
    private javax.swing.JLabel jLabelSecondsText2;
    private javax.swing.JLabel jLabelSecondsText3;
    private javax.swing.JLabel jLabelSecondsText4;
    private javax.swing.JLabel jLabelSecondsText5;
    private javax.swing.JLabel jLabelSecondsText6;
    private javax.swing.JLabel jLabelSecondsText7;
    private javax.swing.JLabel jLabelSecondsText8;
    private javax.swing.JLabel jLabelSecondsText9;
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
    private javax.swing.JLabel jLabelTimeJOINTransactionValue;
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
    private javax.swing.JLabel jLabelTitleFinalSimStats;
    private javax.swing.JLabel jLabelTransLengthText;
    private javax.swing.JLabel jLabelTransLengthValue;
    // End of variables declaration//GEN-END:variables
}
