/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package the.multi.choicable.thing;

/**
 *
 * @author hayou1838
 */
public class MCframe extends javax.swing.JFrame {

    /**
     * Creates new form MCframe
     */
    public MCframe() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        Canvas = new javax.swing.JPanel();
        NamePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BluePanel = new javax.swing.JPanel();
        PurplePanel = new javax.swing.JPanel();
        OrangePanel = new javax.swing.JPanel();
        GreenPanel = new javax.swing.JPanel();
        RedPanel = new javax.swing.JPanel();
        Q1txt = new javax.swing.JLabel();
        Q2txt = new javax.swing.JLabel();
        Q3txt = new javax.swing.JLabel();
        Q4txt = new javax.swing.JLabel();
        Q5txt = new javax.swing.JLabel();
        Check = new javax.swing.JButton();
        AmountCorrect = new javax.swing.JLabel();
        Correct = new javax.swing.JLabel();
        AmountIncorrect = new javax.swing.JLabel();
        Incorrect = new javax.swing.JLabel();
        Answer5txt = new javax.swing.JTextField();
        Answer4txt = new javax.swing.JTextField();
        Answer3txt = new javax.swing.JTextField();
        Answer2txt = new javax.swing.JTextField();
        Answer1txt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Canvas.setBackground(new java.awt.Color(255, 255, 153));

        NamePanel.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setBackground(new java.awt.Color(102, 102, 0));
        jLabel1.setFont(new java.awt.Font("Mesquite Std", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("MULTIPLE CHOICE QuIZ");

        javax.swing.GroupLayout NamePanelLayout = new javax.swing.GroupLayout(NamePanel);
        NamePanel.setLayout(NamePanelLayout);
        NamePanelLayout.setHorizontalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(172, 172, 172))
        );
        NamePanelLayout.setVerticalGroup(
            NamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NamePanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        BluePanel.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout BluePanelLayout = new javax.swing.GroupLayout(BluePanel);
        BluePanel.setLayout(BluePanelLayout);
        BluePanelLayout.setHorizontalGroup(
            BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        BluePanelLayout.setVerticalGroup(
            BluePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 59, Short.MAX_VALUE)
        );

        PurplePanel.setBackground(new java.awt.Color(153, 51, 255));

        javax.swing.GroupLayout PurplePanelLayout = new javax.swing.GroupLayout(PurplePanel);
        PurplePanel.setLayout(PurplePanelLayout);
        PurplePanelLayout.setHorizontalGroup(
            PurplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        PurplePanelLayout.setVerticalGroup(
            PurplePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        OrangePanel.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout OrangePanelLayout = new javax.swing.GroupLayout(OrangePanel);
        OrangePanel.setLayout(OrangePanelLayout);
        OrangePanelLayout.setHorizontalGroup(
            OrangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        OrangePanelLayout.setVerticalGroup(
            OrangePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        GreenPanel.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout GreenPanelLayout = new javax.swing.GroupLayout(GreenPanel);
        GreenPanel.setLayout(GreenPanelLayout);
        GreenPanelLayout.setHorizontalGroup(
            GreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        GreenPanelLayout.setVerticalGroup(
            GreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        RedPanel.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout RedPanelLayout = new javax.swing.GroupLayout(RedPanel);
        RedPanel.setLayout(RedPanelLayout);
        RedPanelLayout.setHorizontalGroup(
            RedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        RedPanelLayout.setVerticalGroup(
            RedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        Q1txt.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        Q1txt.setText("Question 1: What's the Hex Code for Blue");

        Q2txt.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        Q2txt.setText("Question 2: What's the Hex Code for purple");

        Q3txt.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        Q3txt.setText("Question 3: What's the Hex Code for Mango");

        Q4txt.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        Q4txt.setText("Question 4: What's the Hex Code for Ectoplasm");

        Q5txt.setFont(new java.awt.Font("Trajan Pro", 1, 14)); // NOI18N
        Q5txt.setText("Question 5: What's the Hex Code for Watermelon");

        Check.setText("Check Your Answers!");
        Check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActionPerformed(evt);
            }
        });

        AmountCorrect.setFont(new java.awt.Font("Microsoft Himalaya", 0, 36)); // NOI18N
        AmountCorrect.setText("How Many Did You Get Correct");

        Correct.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        AmountIncorrect.setFont(new java.awt.Font("Microsoft Himalaya", 0, 36)); // NOI18N
        AmountIncorrect.setText("How Many Did You Get Incorrect");

        Incorrect.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        Answer5txt.setText("jTextField1");

        Answer4txt.setText("jTextField2");

        Answer3txt.setText("jTextField3");

        Answer2txt.setText("jTextField4");

        Answer1txt.setText("jTextField5");

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CanvasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Check, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(CanvasLayout.createSequentialGroup()
                                .addComponent(NamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(CanvasLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CanvasLayout.createSequentialGroup()
                                        .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(Q3txt)
                                                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Q1txt)
                                                    .addComponent(Q2txt)))
                                            .addComponent(Q4txt)
                                            .addComponent(Q5txt))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CanvasLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(PurplePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CanvasLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(Answer5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CanvasLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(Answer4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(GreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CanvasLayout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(Answer3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OrangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CanvasLayout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(Answer1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)))
                        .addContainerGap())
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AmountCorrect)
                            .addComponent(AmountIncorrect))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(CanvasLayout.createSequentialGroup()
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Correct)
                            .addGroup(CanvasLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(Incorrect))))
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(Answer2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CanvasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(Q1txt)
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(BluePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(Answer1txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addComponent(Q2txt)
                        .addGap(32, 32, 32)
                        .addComponent(PurplePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(Answer2txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Q3txt)
                        .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CanvasLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(OrangePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(16, 16, 16))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CanvasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Answer3txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)))
                        .addComponent(Q4txt)
                        .addGap(74, 74, 74)
                        .addComponent(Answer4txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addComponent(GreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(Q5txt)
                .addGroup(CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CanvasLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(RedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CanvasLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Answer5txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)))
                .addComponent(Check)
                .addGap(44, 44, 44)
                .addComponent(AmountCorrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Correct)
                .addGap(19, 19, 19)
                .addComponent(AmountIncorrect)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Incorrect)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(Canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1308, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Canvas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActionPerformed
        //this is where all the variables will be added and outputted
        final String Answer1 = "0000FF";
        final String Answer2 = "800080";
        final String Answer3 = "FFA500";
        final String Answer4 = "008000";
        final String Answer5 = "FF0000";
        
        int Acorrect = 0;
        
        String keyedAnswer1;
        String keyedAnswer2;
        String keyedAnswer3;
        String keyedAnswer4;
        String keyedAnswer5;
        
        if(keyedAnswer1 == "Answer1")(Acorrect + 1);
        if(keyedAnswer2 == "Answer2")(Acorrect + 1);
        if(keyedAnswer3 == "Answer3")(Acorrect + 1);
        if(keyedAnswer4 == "Answer4")(Acorrect + 1);
        if(keyedAnswer5 == "Answer5")(Acorrect + 1);
        
        kAnswer1 = String.parseString(Answer1txt.getText());
        kAnswer2 = String.parseString(Answer2txt.getText());
        kAnswer3 = String.parseString(Answer3txt.getText());
        kAnswer4 = String.parseString(Answer4txt.getText());
        kAnswer5 = String.parseString(Answer5txt.getText());
        
    }//GEN-LAST:event_CheckActionPerformed

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
            java.util.logging.Logger.getLogger(MCframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MCframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MCframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MCframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MCframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AmountCorrect;
    private javax.swing.JLabel AmountIncorrect;
    private javax.swing.JTextField Answer1txt;
    private javax.swing.JTextField Answer2txt;
    private javax.swing.JTextField Answer3txt;
    private javax.swing.JTextField Answer4txt;
    private javax.swing.JTextField Answer5txt;
    private javax.swing.JPanel BluePanel;
    private javax.swing.JPanel Canvas;
    private javax.swing.JButton Check;
    private javax.swing.JLabel Correct;
    private javax.swing.JPanel GreenPanel;
    private javax.swing.JLabel Incorrect;
    private javax.swing.JPanel NamePanel;
    private javax.swing.JPanel OrangePanel;
    private javax.swing.JPanel PurplePanel;
    private javax.swing.JLabel Q1txt;
    private javax.swing.JLabel Q2txt;
    private javax.swing.JLabel Q3txt;
    private javax.swing.JLabel Q4txt;
    private javax.swing.JLabel Q5txt;
    private javax.swing.JPanel RedPanel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
