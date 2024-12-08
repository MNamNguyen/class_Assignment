/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ailatrieuphu;

import java.awt.Color;
import java.awt.Cursor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author mnngu
 */
public class Play extends javax.swing.JFrame {
    String tmp[];
    private int width = 1200;
    private int height = 690;
    
    /**
     * Creates new form Play
     */
    private int callQuestion =6;

    private boolean isCorrect;
    String ansClicked;
    Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
    Cursor c2 = new Cursor(Cursor.DEFAULT_CURSOR);
    private String correctAns;
    khanGia k;
    Clip spinningClip;
    callHelp c;
    
    Random rand=new Random();
    public String getCorrectAns(){
        return this.correctAns;
    }
    public void init() {
        ansClicked = "";
        
        //question.setBackground(transparent);
        

//        ansB.setBackground(new java.awt.Color(0,0,0,1));
//        ansA.setBackground(new java.awt.Color(0,0,0,1));
//        ansC.setBackground(new java.awt.Color(0,0,0,1));
//        ansD.setBackground(new java.awt.Color(0,0,0,1));
        
        ansA.setBackground(Color.WHITE);
        ansB.setBackground(Color.WHITE);
        ansC.setBackground(Color.WHITE);
        ansD.setBackground(Color.WHITE);
        int randQues=0;
        //nextQuesBtn.setVisible(false);
        
        Question q = new Question();
        
        if (callQuestion == 1) { 
            
            tmp = q.getQs1()[randQues].split("!");
            question.setText(tmp[0]);
            System.out.println(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 2) {
            
            
            tmp = q.getQs2()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 3) {
            
            tmp = q.getQs3()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 4) {
            
            tmp = q.getQs4()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 5) {
            
            tmp = q.getQs5()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 6) {
            btnChangeQuestion.setVisible(true);
            tmp = q.getQs6()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 7) {
            
            tmp = q.getQs7()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 8) {
            String tmp[];
            
            tmp = q.getQs8()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 9) {
            
            tmp = q.getQs9()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 10) {
            
            tmp = q.getQs10()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 11) {
            
            tmp = q.getQs11()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 12) {
            String tmp[];
            
            tmp = q.getQs12()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 13) {
            
            tmp = q.getQs13()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 14) {
            String tmp[];
            
            tmp = q.getQs14()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion == 15) {
            
            tmp = q.getQs15()[randQues].split("!");
            question.setText(tmp[0]);
            ansA.setText(tmp[1]);
            ansB.setText(tmp[2]);
            ansC.setText(tmp[3]);
            ansD.setText(tmp[4]);
            correctAns = tmp[5];
        }
        if (callQuestion==16){
            JOptionPane.showMessageDialog(this, "Congratulations! You're a Millionaire","Winning", JOptionPane.OK_OPTION);
            setVisible(false);
        }

    }
    
    public Play() {
        initComponents();
        setSize(width, height);
        
        setLocationRelativeTo(null);
        setResizable(true);
        setTitle("Play");
        setVisible(true);
        arrow.setVisible(false);
        btnChangeQuestion.setVisible(false);
        ansA.setEditable(false);
        ansB.setEditable(false);
        ansC.setEditable(false); 
        
        ansD.setEditable(false);
        btnStopHere.setVisible(true);
        correctLabel.setVisible(false);
        explain.setVisible(false);
        nextQuesBtn.setVisible(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        question.setEditable(false);
        question.getCaret().deinstall(question);
        //ansA.setText("hehlllldjfoaijof");
        //question.setBackground(new java.awt.Color(0,0,0,1));
        
        question.setBackground(Color.white);
        init();
    }

    @SuppressWarnings("unchecked")
   
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        explain = new javax.swing.JLabel();
        btnAskAudience = new javax.swing.JLabel();
        ansA = new javax.swing.JTextField();
        ansB = new javax.swing.JTextField();
        ansC = new javax.swing.JTextField();
        nextQuesBtn = new javax.swing.JLabel();
        ansD = new javax.swing.JTextField();
        btnStopHere = new javax.swing.JLabel();
        correctLabel = new javax.swing.JLabel();
        btnCheckAns = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        question = new javax.swing.JTextArea();
        btn50_50 = new javax.swing.JLabel();
        btnChatHelp = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 200), new java.awt.Dimension(0, 200), new java.awt.Dimension(32767, 200));
        arrow = new javax.swing.JLabel();
        btnChangeQuestion = new javax.swing.JLabel();
        jframe = new javax.swing.JLabel();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        explain.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        explain.setForeground(new java.awt.Color(102, 255, 51));
        getContentPane().add(explain);
        explain.setBounds(60, 310, 680, 110);

        btnAskAudience.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ask_audience.png"))); // NOI18N
        btnAskAudience.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAskAudience.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAskAudienceMouseClicked(evt);
            }
        });
        getContentPane().add(btnAskAudience);
        btnAskAudience.setBounds(20, 20, 90, 80);

        ansA.setEditable(false);
        ansA.setBackground(new java.awt.Color(255, 255, 255));
        ansA.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ansA.setForeground(new java.awt.Color(255, 0, 0));
        ansA.setBorder(null);
        ansA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ansA.setRequestFocusEnabled(false);
        ansA.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ansAMouseMoved(evt);
            }
        });
        ansA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ansAMouseClicked(evt);
            }
        });
        ansA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansAActionPerformed(evt);
            }
        });
        getContentPane().add(ansA);
        ansA.setBounds(150, 470, 250, 70);

        ansB.setBackground(new java.awt.Color(255, 255, 255));
        ansB.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ansB.setForeground(new java.awt.Color(255, 0, 0));
        ansB.setBorder(null);
        ansB.setRequestFocusEnabled(false);
        ansB.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ansBMouseMoved(evt);
            }
        });
        ansB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ansBMouseClicked(evt);
            }
        });
        ansB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ansBActionPerformed(evt);
            }
        });
        getContentPane().add(ansB);
        ansB.setBounds(510, 470, 260, 70);

        ansC.setBackground(new java.awt.Color(255, 255, 255));
        ansC.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ansC.setForeground(new java.awt.Color(255, 0, 0));
        ansC.setBorder(null);
        ansC.setRequestFocusEnabled(false);
        ansC.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ansCMouseMoved(evt);
            }
        });
        ansC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ansCMouseClicked(evt);
            }
        });
        getContentPane().add(ansC);
        ansC.setBounds(150, 570, 250, 70);

        nextQuesBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_Button.png"))); // NOI18N
        nextQuesBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nextQuesBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextQuesBtnMouseClicked(evt);
            }
        });
        getContentPane().add(nextQuesBtn);
        nextQuesBtn.setBounds(690, 250, 90, 50);

        ansD.setBackground(new java.awt.Color(255, 255, 255));
        ansD.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        ansD.setForeground(new java.awt.Color(255, 0, 0));
        ansD.setBorder(null);
        ansD.setRequestFocusEnabled(false);
        ansD.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                ansDMouseMoved(evt);
            }
        });
        ansD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ansDMouseClicked(evt);
            }
        });
        getContentPane().add(ansD);
        ansD.setBounds(510, 570, 260, 70);

        btnStopHere.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/stopHere.png"))); // NOI18N
        btnStopHere.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStopHere.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStopHereMouseClicked(evt);
            }
        });
        getContentPane().add(btnStopHere);
        btnStopHere.setBounds(690, 10, 90, 80);

        correctLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/correct.jpg"))); // NOI18N
        getContentPane().add(correctLabel);
        correctLabel.setBounds(40, 230, 750, 210);

        btnCheckAns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/checkButton.png"))); // NOI18N
        btnCheckAns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCheckAns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCheckAnsMouseClicked(evt);
            }
        });
        getContentPane().add(btnCheckAns);
        btnCheckAns.setBounds(690, 340, 100, 100);

        question.setEditable(false);
        question.setBackground(new java.awt.Color(255, 255, 255));
        question.setColumns(20);
        question.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        question.setForeground(new java.awt.Color(255, 0, 51));
        question.setRows(5);
        question.setBorder(null);
        question.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                questionMouseMoved(evt);
            }
        });
        jScrollPane2.setViewportView(question);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(40, 230, 770, 210);

        btn50_50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/50_50.png"))); // NOI18N
        btn50_50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn50_50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn50_50MouseClicked(evt);
            }
        });
        getContentPane().add(btn50_50);
        btn50_50.setBounds(110, 30, 90, 70);

        btnChatHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/chatHelp.png"))); // NOI18N
        btnChatHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChatHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChatHelpMouseClicked(evt);
            }
        });
        getContentPane().add(btnChatHelp);
        btnChatHelp.setBounds(200, 20, 90, 80);
        getContentPane().add(filler1);
        filler1.setBounds(1100, 390, 0, 250);

        arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow.png"))); // NOI18N
        getContentPane().add(arrow);
        arrow.setBounds(830, 660, 60, 30);

        btnChangeQuestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changeQuestion.png"))); // NOI18N
        btnChangeQuestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChangeQuestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeQuestionMouseClicked(evt);
            }
        });
        getContentPane().add(btnChangeQuestion);
        btnChangeQuestion.setBounds(300, 30, 100, 70);

        jframe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inGame.png"))); // NOI18N
        jframe.setText("jLabel10");
        getContentPane().add(jframe);
        jframe.setBounds(0, -20, 1350, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //question.setText("Mai Nam Nguyên hả");
    }//GEN-LAST:event_formWindowActivated

    private void ansAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansAMouseClicked
        // TODO add your handling code here:
        ansClicked = "A";
        ansA.setBackground(Color.GREEN);
        ansB.setBackground(Color.WHITE);
        ansC.setBackground(Color.WHITE);
        ansD.setBackground(Color.WHITE);

    }//GEN-LAST:event_ansAMouseClicked

    private void ansAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansAActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ansAActionPerformed

    private void ansBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansBMouseClicked
        // TODO add your handling code here:
        //cl
        ansClicked = "B";
        ansA.setBackground(Color.WHITE);
        ansC.setBackground(Color.WHITE);
        ansD.setBackground(Color.WHITE);
        ansB.setBackground(Color.GREEN);
    }//GEN-LAST:event_ansBMouseClicked

    private void ansAMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansAMouseMoved
        // TODO add your handling code here:

        ansA.setCursor(c1);

    }//GEN-LAST:event_ansAMouseMoved

    private void ansBMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansBMouseMoved
        // TODO add your handling code here:

        ansB.setCursor(c1);
    }//GEN-LAST:event_ansBMouseMoved

    private void ansDMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansDMouseMoved
        // TODO add your handling code here:

        ansD.setCursor(c1);
    }//GEN-LAST:event_ansDMouseMoved

    private void ansCMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansCMouseMoved
        // TODO add your handling code here:
        ansC.setCursor(c1);
    }//GEN-LAST:event_ansCMouseMoved
    
    private void ansCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansCMouseClicked
        // TODO add your handling code here:

        ansClicked = "C";
        ansA.setBackground(Color.WHITE);
        ansB.setBackground(Color.WHITE);
        
        ansD.setBackground(Color.WHITE);
        ansC.setBackground(Color.GREEN);
        
    }//GEN-LAST:event_ansCMouseClicked

    private void ansDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ansDMouseClicked
        // TODO add your handling code here:

        ansClicked = "D";
        
        ansD.setBackground(Color.GREEN);
        ansA.setBackground(Color.WHITE);
        ansB.setBackground(Color.WHITE);
        ansC.setBackground(Color.WHITE);
    }//GEN-LAST:event_ansDMouseClicked

    private void ansBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ansBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ansBActionPerformed

    private void btnAskAudienceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAskAudienceMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:
            khanGia.correctAns=correctAns;
            k=new khanGia();
            btnAskAudience.setVisible(false);
            
        } catch (IOException ex) {
            Logger.getLogger(Play.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAskAudienceMouseClicked

    private void btn50_50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn50_50MouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        if (correctAns.equalsIgnoreCase("a")){
            ansB.setText("");
            ansC.setText("");
        } else if (correctAns.equalsIgnoreCase("b")){
            ansA.setText("");
            ansC.setText("");
        } else if (correctAns.equalsIgnoreCase("c")){
            ansB.setText("");
            ansD.setText("");
        } else if (correctAns.equalsIgnoreCase("d")){
            ansB.setText("");
            ansA.setText("");
        } 
        btn50_50.setVisible(false);
    }//GEN-LAST:event_btn50_50MouseClicked

    private void btnChatHelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChatHelpMouseClicked
        // TODO add your handling code here:
        callHelp.correctAns=correctAns;
            callHelp.question=tmp[0];
            c=new callHelp();
            btnChatHelp.setVisible(false);
            
    }//GEN-LAST:event_btnChatHelpMouseClicked

    private void btnChangeQuestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeQuestionMouseClicked
        // TODO add your handling code here:
        tmp[6]="Easy game";
        question.setText("1 + 1 = ");
        ansA.setText("4");
        ansB.setText("2");
        ansC.setText("3");
        ansD.setText("1");
        correctAns="B";
        
        btnChangeQuestion.setVisible(false);
    }//GEN-LAST:event_btnChangeQuestionMouseClicked

    private void btnStopHereMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStopHereMouseClicked
        // TODO add your handling code here:
        String tmp="Do you want to stop here? Your reward can be ";
        switch (callQuestion){
            case 1:
                winning.typeOfReward=0;
                tmp+="0 ";
                winning.reward="Your reward is 0 dong";
                break;
            case 2:
                winning.typeOfReward=1;
                
                tmp+="200 ";
                winning.reward="Your reward is 200 dong";
                break;
            case 3:
                winning.typeOfReward=1;
                tmp+="400 ";
                winning.reward="Your reward is 400 dong";
                break;
            case 4:
                winning.typeOfReward=1;
                winning.reward="Your reward is 600 dong";
                tmp+="600 ";
                break;
            case 5:
                winning.typeOfReward=1;
                tmp+="1.000 ";
                winning.reward="Your reward is 1.000 dong";
                break;
            case 6:
                winning.typeOfReward=2;
                winning.reward="Your reward is 2.000 dong";
                tmp+="2.000 ";
                break;
            case 7:
                winning.typeOfReward=2;
                winning.reward="Your reward is 3.000 dong";
                tmp+="3.000 ";
                break;
            case 8:
                winning.typeOfReward=2;
                winning.reward="Your reward is 6.000 dong";
                tmp+="6.000 ";
                break;
            case 9:
                winning.typeOfReward=2;
                winning.reward="Your reward is 10.000 dong";
                tmp+="10.000 ";
                break;
            case 10:
                winning.typeOfReward=2;
                winning.reward="Your reward is 14.000 dong";
                tmp+="14.000 ";
                break;
            case 11:
                winning.typeOfReward=3;
                winning.reward="Your reward is 22.000 dong";
                tmp+="22.000 ";
                break;
            case 12:
                winning.typeOfReward=3;
                winning.reward="Your reward is 30.000 dong";
                tmp+="30.000 ";
                break;
            case 13:
                winning.typeOfReward=3;
                winning.reward="Your reward is 40.000 dong";
                tmp+="40.000 ";
                break;
            case 14:
                winning.typeOfReward=3;
                winning.reward="Your reward is 60.000 dong";
                tmp+="60.000 ";
                break;
            case 15:
                winning.typeOfReward=3;
                winning.reward="Your reward is 85.000 dong";
                tmp+="85.000 ";
                break;
            case 16:
                winning.typeOfReward=4;
                winning.reward="Your reward is 150.000 dong";
                tmp+="150.000 ";
                break;
                        
        }
        tmp+="dong";
        if (JOptionPane.showConfirmDialog(this, tmp, "Warning", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            
            winning w=new winning();
            setVisible(false);
        }
    }//GEN-LAST:event_btnStopHereMouseClicked

    private void questionMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_questionMouseMoved
        // TODO add your handling code here:
        //question.setCursor(c2);
        //        question.setEditable(false);
    }//GEN-LAST:event_questionMouseMoved
    private void playCorrectSound() {
        try {
            // Load the audio file from the resources folder
            InputStream inputStream = getClass().getResourceAsStream("/sound/game.wav");
            if (inputStream == null) {
                System.err.println("Resource not found: /sound/traLoiDung.wav");
                return;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
            spinningClip = AudioSystem.getClip();
            spinningClip.open(audioInputStream);
            spinningClip.start();
            // spinningClip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the sound until stopped
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    private void playInCorrectSound() {
        try {
            // Load the audio file from the resources folder
            InputStream inputStream = getClass().getResourceAsStream("/sound/game.wav");
            if (inputStream == null) {
                System.err.println("Resource not found: /sound/traLoiSai.wav");
                return;
            }
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
            spinningClip = AudioSystem.getClip();
            spinningClip.open(audioInputStream);
            spinningClip.start();
            // spinningClip.loop(Clip.LOOP_CONTINUOUSLY); // Loop the sound until stopped
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    private void nextQuesBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextQuesBtnMouseClicked
        // TODO add your handling code here:
        spinningClip.stop();
        correctLabel.setVisible(false);
            btnCheckAns.setVisible(true);
            //btnStopHere.setVisible(true);
            explain.setVisible(false);
            explain.setText(tmp[6]);
            nextQuesBtn.setVisible(false);
            init();
    }//GEN-LAST:event_nextQuesBtnMouseClicked

    private void btnCheckAnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCheckAnsMouseClicked
        // TODO add your handling code here:
        isCorrect = false;
        if (correctAns.equalsIgnoreCase(ansClicked)) {
            nextQuesBtn.setVisible(true);
            isCorrect = true;
            correctLabel.setVisible(true);
            btnCheckAns.setVisible(false);
            //btnStopHere.setVisible(true);
            explain.setVisible(true);
            explain.setText(tmp[6]);
            callQuestion += 1;
            playCorrectSound();
        }
        else{
            playInCorrectSound();
        }

        if (isCorrect) {
            if (ansClicked == "A") {
                ansA.setBackground(Color.WHITE);
            } else if (ansClicked == "B") {
                ansB.setBackground(Color.WHITE);
            } else if (ansClicked == "C") {
                ansC.setBackground(Color.WHITE);
            } else if (ansClicked == "D") {
                ansD.setBackground(Color.WHITE);
            }

            arrow.setVisible(true);
            arrow.setLocation(830, arrow.getY()-40);

        } else {
            String lose="Sorry! You're Wrong! ";
            if (callQuestion<=5){
                winning.reward="Your reward is 0 dong";
                winning.typeOfReward=0;
            }
            else if (callQuestion<=10){
                winning.reward="Your reward is 2.000 dong";
                winning.typeOfReward=2;
            }
            else if (callQuestion<=15){
                winning.reward="Your reward is 22.000 dong";
                winning.typeOfReward=3;
            }
            JOptionPane.showMessageDialog(this, lose, "Warning", JOptionPane.OK_OPTION);
            
            winning w= new winning();
            setVisible(false);
        }
    }//GEN-LAST:event_btnCheckAnsMouseClicked

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
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Play.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Play().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ansA;
    private javax.swing.JTextField ansB;
    private javax.swing.JTextField ansC;
    private javax.swing.JTextField ansD;
    private javax.swing.JLabel arrow;
    private javax.swing.JLabel btn50_50;
    private javax.swing.JLabel btnAskAudience;
    private javax.swing.JLabel btnChangeQuestion;
    private javax.swing.JLabel btnChatHelp;
    private javax.swing.JLabel btnCheckAns;
    private javax.swing.JLabel btnStopHere;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JLabel explain;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel jframe;
    private javax.swing.JLabel nextQuesBtn;
    private javax.swing.JTextArea question;
    // End of variables declaration//GEN-END:variables
}
