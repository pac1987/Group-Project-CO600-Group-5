/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author metdekaj
 */
public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form OXGame
     */
    public GUI() {
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

        Difficulty = new javax.swing.JPanel();
        Intelligence = new javax.swing.JLabel();
        IntelScore = new javax.swing.JTextField();
        StartTrainingButton = new javax.swing.JButton();
        StopTrainingButon = new javax.swing.JButton();
        Gameplay = new javax.swing.JPanel();
        Actions = new javax.swing.JPanel();
        JHomeButton = new javax.swing.JButton();
        JPauseButton = new javax.swing.JButton();
        JExitButton = new javax.swing.JButton();
        JReplayButton = new javax.swing.JButton();
        Score = new javax.swing.JPanel();
        JComputerLabel = new javax.swing.JLabel();
        ComputerScore = new javax.swing.JTextField();
        JHumanLabel = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ResetStatsButton = new javax.swing.JButton();
        Title = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Difficulty.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Difficulty", 2, 2));

        Intelligence.setText("Intelligence:");

        IntelScore.setText("0");
        IntelScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IntelScoreActionPerformed(evt);
            }
        });

        StartTrainingButton.setText("Start training ");

        StopTrainingButon.setText("Stop training");

        javax.swing.GroupLayout DifficultyLayout = new javax.swing.GroupLayout(Difficulty);
        Difficulty.setLayout(DifficultyLayout);
        DifficultyLayout.setHorizontalGroup(
            DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DifficultyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(StartTrainingButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(StopTrainingButon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(DifficultyLayout.createSequentialGroup()
                        .addComponent(Intelligence)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IntelScore, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        DifficultyLayout.setVerticalGroup(
            DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DifficultyLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(StartTrainingButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StopTrainingButon)
                .addGap(18, 18, 18)
                .addGroup(DifficultyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Intelligence)
                    .addComponent(IntelScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Gameplay.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Machine Learning XO", 2, 2));

        javax.swing.GroupLayout GameplayLayout = new javax.swing.GroupLayout(Gameplay);
        Gameplay.setLayout(GameplayLayout);
        GameplayLayout.setHorizontalGroup(
            GameplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GameplayLayout.setVerticalGroup(
            GameplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );

        Actions.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Actions", 2, 2));

        JHomeButton.setText("Home");

        JPauseButton.setText("Pause");
        JPauseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JPauseButtonActionPerformed(evt);
            }
        });

        JExitButton.setText("Exit");
        JExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JExitButtonActionPerformed(evt);
            }
        });

        JReplayButton.setText("Replay");

        javax.swing.GroupLayout ActionsLayout = new javax.swing.GroupLayout(Actions);
        Actions.setLayout(ActionsLayout);
        ActionsLayout.setHorizontalGroup(
            ActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionsLayout.createSequentialGroup()
                .addGroup(ActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ActionsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JHomeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(ActionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JPauseButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ActionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JExitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ActionsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JReplayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        ActionsLayout.setVerticalGroup(
            ActionsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ActionsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JHomeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JReplayButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPauseButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JExitButton))
        );

        Score.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score", 2, 2));

        JComputerLabel.setText("Computer:");

        ComputerScore.setText("0");

        JHumanLabel.setText("Human:");

        jTextField1.setText("0");

        ResetStatsButton.setText("Reset Stats");
        ResetStatsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetStatsButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ScoreLayout = new javax.swing.GroupLayout(Score);
        Score.setLayout(ScoreLayout);
        ScoreLayout.setHorizontalGroup(
            ScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScoreLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(JComputerLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComputerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ResetStatsButton)
                .addGap(30, 30, 30)
                .addComponent(JHumanLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        ScoreLayout.setVerticalGroup(
            ScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ScoreLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ScoreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComputerLabel)
                    .addComponent(ComputerScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ResetStatsButton)
                    .addComponent(JHumanLabel)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 4, Short.MAX_VALUE))
        );

        Title.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Title", 2, 2));

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Difficulty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Gameplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Score, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Actions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Difficulty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Gameplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Score, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Actions, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IntelScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IntelScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IntelScoreActionPerformed

    private void JPauseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JPauseButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JPauseButtonActionPerformed

    private void JExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JExitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JExitButtonActionPerformed

    private void ResetStatsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetStatsButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetStatsButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Actions;
    private javax.swing.JTextField ComputerScore;
    private javax.swing.JPanel Difficulty;
    private javax.swing.JPanel Gameplay;
    private javax.swing.JTextField IntelScore;
    private javax.swing.JLabel Intelligence;
    private javax.swing.JLabel JComputerLabel;
    private javax.swing.JButton JExitButton;
    private javax.swing.JButton JHomeButton;
    private javax.swing.JLabel JHumanLabel;
    private javax.swing.JButton JPauseButton;
    private javax.swing.JButton JReplayButton;
    private javax.swing.JButton ResetStatsButton;
    private javax.swing.JPanel Score;
    private javax.swing.JButton StartTrainingButton;
    private javax.swing.JButton StopTrainingButon;
    private javax.swing.JPanel Title;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
