package graphicaluserinterface;

import java.util.*;

public class SimulationWindow extends javax.swing.JFrame implements Runnable {

    String hour, minute, second, ampm;
    Thread thread;
    boolean slowMode = false;
    boolean running = false;
    private GUIController graphicalInterfaceController;

    //Creates new form SimulationWindow
    public SimulationWindow() {
        initComponents();
        thread = new Thread(this);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public void setController(GUIController simulationController) {
        this.graphicalInterfaceController = simulationController;
    }

    public void simulationThreadStart() {
        if (this.graphicalInterfaceController.getSlowMode()) {
            this.slowMode = true;
            jLabelSlowModeValue.setText("Yes");
            jButtonSimMode.setText("Normal Mode");
        } else {
            jLabelSlowModeValue.setText("No");
        }
        this.running = true;
        this.thread.start();
    }

    public void simulationThreadInterrupt() {
        this.thread.interrupt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSystemClockText = new javax.swing.JLabel();
        jLabelTitleSimulation = new javax.swing.JLabel();
        jLabelSystemClockValue = new javax.swing.JLabel();
        jLabelExecModLengthText = new javax.swing.JLabel();
        jLabelTransModLengthText = new javax.swing.JLabel();
        jLabelQueryModLengthText = new javax.swing.JLabel();
        jLabelServerRejectedConnText = new javax.swing.JLabel();
        jLabelProcessModLengthText = new javax.swing.JLabel();
        jLabelExecModLengthValue = new javax.swing.JLabel();
        jLabelTransModLengthValue = new javax.swing.JLabel();
        jLabelQueryModLengthValue = new javax.swing.JLabel();
        jLabelProcessModLengthValue = new javax.swing.JLabel();
        jLabelServerRejectedConnValue = new javax.swing.JLabel();
        jLabelSlowModeText = new javax.swing.JLabel();
        jLabelSlowModeValue = new javax.swing.JLabel();
        jButtonSimMode = new javax.swing.JButton();
        jLabelRunNumberText = new javax.swing.JLabel();
        jLabelRunNumberValue = new javax.swing.JLabel();
        jLabelQueriesText = new javax.swing.JLabel();
        jLabelQueriesText2 = new javax.swing.JLabel();
        jLabelQueriesText3 = new javax.swing.JLabel();
        jLabelQueriesText4 = new javax.swing.JLabel();
        jLabelConnectionsText = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelSystemClockText.setText("System clock :");

        jLabelTitleSimulation.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelTitleSimulation.setText("Simulation");

        jLabelSystemClockValue.setText("jLabel3");

        jLabelExecModLengthText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelExecModLengthText.setText("Execution Module queue length :");

        jLabelTransModLengthText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelTransModLengthText.setText("Transaction Module queue length :");

        jLabelQueryModLengthText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelQueryModLengthText.setText("Query Module queue length :");

        jLabelServerRejectedConnText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelServerRejectedConnText.setText("Server rejected connections:");

        jLabelProcessModLengthText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelProcessModLengthText.setText("Process Module queue length :");

        jLabelExecModLengthValue.setText("jLabel9");

        jLabelTransModLengthValue.setText("jLabel10");

        jLabelQueryModLengthValue.setText("jLabel11");

        jLabelProcessModLengthValue.setText("jLabel12");

        jLabelServerRejectedConnValue.setText("jLabel13");

        jLabelSlowModeText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelSlowModeText.setText("Slow Mode:");

        jLabelSlowModeValue.setText("jLabel15");

        jButtonSimMode.setText("Slow Mode");
        jButtonSimMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimModeActionPerformed(evt);
            }
        });

        jLabelRunNumberText.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabelRunNumberText.setText("Run number:");

        jLabelRunNumberValue.setText("jLabel3");

        jLabelQueriesText.setText("queries");

        jLabelQueriesText2.setText("queries");

        jLabelQueriesText3.setText("queries");

        jLabelQueriesText4.setText("queries");

        jLabelConnectionsText.setText("connections");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelRunNumberText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelRunNumberValue)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelExecModLengthText)
                                    .addComponent(jLabelTransModLengthText)
                                    .addComponent(jLabelQueryModLengthText)
                                    .addComponent(jLabelProcessModLengthText)
                                    .addComponent(jLabelServerRejectedConnText))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelExecModLengthValue)
                                    .addComponent(jLabelServerRejectedConnValue)
                                    .addComponent(jLabelProcessModLengthValue)
                                    .addComponent(jLabelQueryModLengthValue)
                                    .addComponent(jLabelTransModLengthValue))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelConnectionsText)
                                    .addComponent(jLabelQueriesText4)
                                    .addComponent(jLabelQueriesText3)
                                    .addComponent(jLabelQueriesText2)
                                    .addComponent(jLabelQueriesText))
                                .addGap(0, 42, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelTitleSimulation, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelSlowModeText)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabelSlowModeValue)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonSimMode, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelSystemClockText)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelSystemClockValue)))))
                        .addGap(35, 35, 35))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTitleSimulation)
                    .addComponent(jLabelSystemClockText)
                    .addComponent(jLabelSystemClockValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelRunNumberText)
                    .addComponent(jLabelRunNumberValue))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelExecModLengthText)
                    .addComponent(jLabelExecModLengthValue)
                    .addComponent(jLabelQueriesText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTransModLengthText)
                    .addComponent(jLabelTransModLengthValue, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelQueriesText2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelQueryModLengthText)
                    .addComponent(jLabelQueryModLengthValue)
                    .addComponent(jLabelQueriesText3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProcessModLengthText)
                    .addComponent(jLabelProcessModLengthValue)
                    .addComponent(jLabelQueriesText4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelServerRejectedConnText)
                    .addComponent(jLabelServerRejectedConnValue)
                    .addComponent(jLabelConnectionsText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSlowModeText)
                    .addComponent(jLabelSlowModeValue)
                    .addComponent(jButtonSimMode))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSimModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimModeActionPerformed
        if (this.slowMode) {
            slowMode = false;
            jButtonSimMode.setText("Slow Mode");
            jLabelSlowModeValue.setText("No");
        } else {
            slowMode = true;
            jButtonSimMode.setText("Normal Mode");
            jLabelSlowModeValue.setText("Yes");
        }
    }//GEN-LAST:event_jButtonSimModeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSimMode;
    private javax.swing.JLabel jLabelConnectionsText;
    private javax.swing.JLabel jLabelExecModLengthText;
    private javax.swing.JLabel jLabelExecModLengthValue;
    private javax.swing.JLabel jLabelProcessModLengthText;
    private javax.swing.JLabel jLabelProcessModLengthValue;
    private javax.swing.JLabel jLabelQueriesText;
    private javax.swing.JLabel jLabelQueriesText2;
    private javax.swing.JLabel jLabelQueriesText3;
    private javax.swing.JLabel jLabelQueriesText4;
    private javax.swing.JLabel jLabelQueryModLengthText;
    private javax.swing.JLabel jLabelQueryModLengthValue;
    private javax.swing.JLabel jLabelRunNumberText;
    private javax.swing.JLabel jLabelRunNumberValue;
    private javax.swing.JLabel jLabelServerRejectedConnText;
    private javax.swing.JLabel jLabelServerRejectedConnValue;
    private javax.swing.JLabel jLabelSlowModeText;
    private javax.swing.JLabel jLabelSlowModeValue;
    private javax.swing.JLabel jLabelSystemClockText;
    private javax.swing.JLabel jLabelSystemClockValue;
    private javax.swing.JLabel jLabelTitleSimulation;
    private javax.swing.JLabel jLabelTransModLengthText;
    private javax.swing.JLabel jLabelTransModLengthValue;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        while (this.running) {
            updateSystem();
            jLabelSystemClockValue.setText(hour + ":" + minute + ":" + second + " " + ampm);
            if(this.graphicalInterfaceController.getSimWindowRunning()) {
                SimulationParams parameters = this.graphicalInterfaceController.getSimParams();
                jLabelRunNumberValue.setText(Integer.toString(parameters.getRunNumber()));
                jLabelExecModLengthValue.setText(Integer.toString(parameters.getexecModQueueLength()));
                jLabelTransModLengthValue.setText(Integer.toString(parameters.gettransacModQueueLength()));
                jLabelQueryModLengthValue.setText(Integer.toString(parameters.getqueryModQueueLength()));
                jLabelProcessModLengthValue.setText(Integer.toString(parameters.getprocessModQueueLength()));
                jLabelServerRejectedConnValue.setText(Integer.toString(parameters.getserverRejectedConnnections()));
                if (this.slowMode) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                }
            } else {
                this.thread.interrupt();
                this.running=false;
            }
        }
    }

    /*
    ** Update system clock
     */
    private void updateSystem() {
        Calendar calendar = new GregorianCalendar();
        Date currentTime = new Date();

        calendar.setTime(currentTime);
        ampm = calendar.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int currentHour = calendar.get(Calendar.HOUR_OF_DAY) - 12;
            hour = currentHour > 9 ? "" + currentHour : "0" + currentHour;
        } else {
            hour = calendar.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendar.get(Calendar.HOUR_OF_DAY) : "0" + calendar.get(Calendar.HOUR_OF_DAY);
        }
        minute = calendar.get(Calendar.MINUTE) > 9 ? "" + calendar.get(Calendar.MINUTE) : "0" + calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND) > 9 ? "" + calendar.get(Calendar.SECOND) : "0" + calendar.get(Calendar.SECOND);
    }
}
