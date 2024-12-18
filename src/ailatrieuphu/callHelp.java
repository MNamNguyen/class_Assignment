/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ailatrieuphu;

import java.awt.Cursor;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author mnngu
 */
public class callHelp extends javax.swing.JFrame {

    private int width = 431;
    private int height = 650;
    private Timer time;
    static String question;
    int sec = 30;
    int currentQues = 1;
    static String correctAns;
    Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
    /**
     * Creates new form callHelp
     */
    String arr1[] = new String[2];
    String arr2[] = new String[2];
    String arr3[] = new String[2];

    public callHelp() throws HeadlessException {
        initComponents();
        setSize(width, height);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        messAns1.setVisible(false);
        //Play p=new Play();
        btnQues1.setVisible(false);
        btnQues2.setVisible(false);
        btnQues3.setVisible(false);
        setLocationRelativeTo(null);

        setResizable(true);
        setTitle("Mess Support");
        setVisible(true);
        TimeCountDown.setEditable(false);
        TimeCountDown.setText("30 S");
        TimeCountDown.getCaret().deinstall(TimeCountDown);
        btnQues1.setEditable(false);
        btnQues2.setEditable(false);
        btnQues3.setEditable(false);
        messAns1.setEditable(false);
        btnQues1.getCaret().deinstall(btnQues1);
        btnQues2.getCaret().deinstall(btnQues2);
        btnQues3.getCaret().deinstall(btnQues3);
        messAns1.getCaret().deinstall(messAns1);
    }

    private String[] qst1 = {"How are you?!I'm fine.Thank you", "Can you support me?!Of course", "Good Afternoon ^^!You're welcome"};
    private String[] qst2 = {"Can you help me?!Of course", "You are so beautiful!Oh^^Thank you so much", "How are you?!I'm fine.Thank you"};
    private String[] qst3 = {"What is answer for this question?!I think the answer is " + correctAns,
         "What do you think about this question?!I think the answer is " + correctAns,
         "I think the answer is" + correctAns + " do you think so?!Hmm Let me check"};
    private String[] qst4 = {"Are you sure about that?! I sure 100%"};
    private String[] qst5 = {"Thank you so much^^! Good Luck"};

    public void helpQuestion() {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TimeCountDown = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        messAns1 = new javax.swing.JTextField();
        btnStartDialog = new javax.swing.JButton();
        btnQues1 = new javax.swing.JTextField();
        btnQues2 = new javax.swing.JTextField();
        btnQues3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        TimeCountDown.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TimeCountDown.setForeground(new java.awt.Color(255, 51, 51));
        TimeCountDown.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TimeCountDown.setBorder(new javax.swing.border.MatteBorder(null));
        TimeCountDown.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TimeCountDown.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                TimeCountDownMouseMoved(evt);
            }
        });
        TimeCountDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeCountDownActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(TimeCountDown, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(158, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(TimeCountDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(25, 6, 374, 70);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        messAns1.setEditable(false);
        messAns1.setBackground(new java.awt.Color(153, 153, 153));
        messAns1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messAns1ActionPerformed(evt);
            }
        });

        btnStartDialog.setBackground(new java.awt.Color(102, 255, 102));
        btnStartDialog.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        btnStartDialog.setForeground(new java.awt.Color(255, 51, 51));
        btnStartDialog.setText("Start Dialog");
        btnStartDialog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnStartDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartDialogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnStartDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(messAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(btnStartDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(messAns1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(25, 88, 374, 340);

        btnQues1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnQues1MouseMoved(evt);
            }
        });
        btnQues1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQues1MouseClicked(evt);
            }
        });
        btnQues1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQues1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnQues1);
        btnQues1.setBounds(50, 432, 320, 30);

        btnQues2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnQues2MouseMoved(evt);
            }
        });
        btnQues2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQues2MouseClicked(evt);
            }
        });
        btnQues2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQues2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnQues2);
        btnQues2.setBounds(50, 470, 320, 30);

        btnQues3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnQues3MouseMoved(evt);
            }
        });
        btnQues3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnQues3MouseClicked(evt);
            }
        });
        btnQues3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQues3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnQues3);
        btnQues3.setBounds(50, 512, 320, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TimeCountDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeCountDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TimeCountDownActionPerformed

    private void btnStartDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartDialogActionPerformed
        // TODO add your handling code here:
        btnStartDialog.setVisible(false);
        btnQues1.setVisible(true);
        btnQues2.setVisible(true);
        btnQues3.setVisible(true);

        time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (sec == 0) {
                    JOptionPane.showMessageDialog(rootPane, "Times Up", "Stopped", 0);
                    time.stop();
                    setVisible(false);
                }
                sec--;
                TimeCountDown.setText(sec + " S");
            }

        });
        time.start();
        messAns1.setVisible(true);
        arr1 = qst1[0].split("!");
        arr2 = qst1[1].split("!");
        arr3 = qst1[2].split("!");
        btnQues1.setText(arr1[0]);
        btnQues2.setText(arr2[0]);
        btnQues3.setText(arr3[0]);
        
                    
                    


    }//GEN-LAST:event_btnStartDialogActionPerformed

    public void nextQues2() {

        switch (currentQues) {
            case 2:
                arr1 = qst2[0].split("!");
                arr2 = qst2[1].split("!");
                arr3 = qst2[2].split("!");
                btnQues1.setText(arr1[0]);
                btnQues2.setText(arr2[0]);
                btnQues3.setText(arr3[0]);
                break;
            case 3:
                arr1 = qst3[0].split("!");
                arr2 = qst3[1].split("!");
                arr3 = qst3[2].split("!");
                btnQues1.setText(arr1[0]);
                btnQues2.setText(arr2[0]);
                btnQues3.setText(arr3[0]);
                break;
            case 4:
                arr1 = qst4[0].split("!");
                
                btnQues1.setText(arr1[0]);
                btnQues2.setVisible(false);
                btnQues3.setVisible(false);
                break;
            case 5:
                arr1 = qst5[0].split("!");
                
                btnQues1.setText(arr1[0]);
                
                break;
            default:
                JOptionPane.showMessageDialog(rootPane, "End Dialog!", "Stopped", 0);
                    
                    setVisible(false);
                
        }

    }
    private void TimeCountDownMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimeCountDownMouseMoved
        // TODO add your handling code here:

    }//GEN-LAST:event_TimeCountDownMouseMoved

    private void messAns1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messAns1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_messAns1ActionPerformed

    private void btnQues1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQues1MouseClicked
        // TODO add your handling code here:
       
        messAns1.setText(arr1[1]);
        currentQues++;
        nextQues2();
    }//GEN-LAST:event_btnQues1MouseClicked

    private void btnQues1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQues1MouseMoved
        // TODO add your handling code here:
        setCursor(c1);
    }//GEN-LAST:event_btnQues1MouseMoved

    private void btnQues2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQues2MouseMoved
        // TODO add your handling code here:
        setCursor(c1);
    }//GEN-LAST:event_btnQues2MouseMoved

    private void btnQues3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQues3MouseMoved
        // TODO add your handling code here:
        setCursor(c1);
    }//GEN-LAST:event_btnQues3MouseMoved

    private void btnQues1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQues1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnQues1ActionPerformed

    private void btnQues2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQues2ActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnQues2ActionPerformed

    private void btnQues3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQues3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnQues3ActionPerformed

    private void btnQues2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQues2MouseClicked
        // TODO add your handling code here:
        messAns1.setText(arr2[1]);
        currentQues++;
        nextQues2();
    }//GEN-LAST:event_btnQues2MouseClicked

    private void btnQues3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQues3MouseClicked
        // TODO add your handling code here:
        messAns1.setText(arr3[1]);
        currentQues++;
        nextQues2();
    }//GEN-LAST:event_btnQues3MouseClicked

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
            java.util.logging.Logger.getLogger(callHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(callHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(callHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(callHelp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new callHelp().setVisible(true);

            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TimeCountDown;
    private javax.swing.JTextField btnQues1;
    private javax.swing.JTextField btnQues2;
    private javax.swing.JTextField btnQues3;
    private javax.swing.JButton btnStartDialog;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField messAns1;
    // End of variables declaration//GEN-END:variables
}
