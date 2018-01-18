/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIIT.stud;

import NIIT.login;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.beans.PropertyVetoException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.plaf.InternalFrameUI;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Dev
 */
public class Main extends javax.swing.JFrame {
    String numberOfQuestions, totalQuestions[] = {" ","6","10","20","30","40","50","69"};
    public String studName, studID;
    HashMap runningFrames = new HashMap(2);
    /**
     * Creates new form student
     */
    public Main() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.setIconImage(new ImageIcon(getClass().getResource("icon/NIIT.png")).getImage());
        
        WindowListener exitListener = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                Exit.doClick();
            }
        };
        this.addWindowListener(exitListener);
        aboutjLabel.setText("<html>Copyright © 2016-17<br><b>Devendra Suthar</b><br>(Contact: 7877776831)<br><b>Kartik Agarwal</b><br>(Contact: 7597824223)");
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
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Home = new javax.swing.JButton();
        Performance = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        aboutjLabel = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        desktopPane = new javax.swing.JDesktopPane();
        defaultPanel = new javax.swing.JPanel();
        Java = new javax.swing.JButton();
        Cpp = new javax.swing.JButton();
        android = new javax.swing.JButton();
        C = new javax.swing.JButton();
        php = new javax.swing.JButton();
        dotNet = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("NIIT Mock Test Application");
        setAlwaysOnTop(true);
        setExtendedState(1);
        setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        setIconImages(null);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1366, 768));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.setMinimumSize(new java.awt.Dimension(68, 768));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 1080));

        jLayeredPane1.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(155, 768));
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(150, 768));
        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Home.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        Home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/home-alt1.png"))); // NOI18N
        Home.setBorder(null);
        Home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });
        Home.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                HomeKeyPressed(evt);
            }
        });
        jLayeredPane1.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 75, 75));

        Performance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/135778-200.png"))); // NOI18N
        Performance.setBorder(null);
        Performance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerformanceActionPerformed(evt);
            }
        });
        Performance.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PerformanceKeyPressed(evt);
            }
        });
        jLayeredPane1.add(Performance, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 75, 75));

        Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/exit.png"))); // NOI18N
        Exit.setBorder(null);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Exit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ExitKeyPressed(evt);
            }
        });
        jLayeredPane1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 75, 75));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel4.setText("Home");
        jLayeredPane1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel2.setText("Performance");
        jLayeredPane1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel6.setText("LogOut");
        jLayeredPane1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        aboutjLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLayeredPane1.add(aboutjLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 140, 200));

        jLayeredPane2.setBackground(java.awt.SystemColor.controlHighlight);
        jLayeredPane2.setMinimumSize(new java.awt.Dimension(160, 768));
        jLayeredPane2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/wood _texture528.jpg"))); // NOI18N
        jLabel3.setAlignmentX(2.0F);
        jLabel3.setAlignmentY(0.0F);
        jLabel3.setFocusable(false);
        jLayeredPane2.setLayer(jLabel3, javax.swing.JLayeredPane.PALETTE_LAYER);
        jLayeredPane2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 160, 1430));

        jLayeredPane1.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 0, 160, 768));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);

        desktopPane.setBackground(new java.awt.Color(153, 153, 153));
        desktopPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        desktopPane.setAutoscrolls(true);
        desktopPane.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desktopPane.setFocusCycleRoot(false);
        desktopPane.setFocusable(false);
        desktopPane.setInheritsPopupMenu(true);

        defaultPanel.setOpaque(false);

        Java.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/Apps-File-Java-icon.png"))); // NOI18N
        Java.setBorder(null);
        Java.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaActionPerformed(evt);
            }
        });
        Java.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JavaKeyPressed(evt);
            }
        });

        Cpp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/106776-3d-glossy-pink-orb-icon-alphanumeric-crossing.png"))); // NOI18N
        Cpp.setBorder(null);
        Cpp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CppActionPerformed(evt);
            }
        });
        Cpp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CppKeyPressed(evt);
            }
        });

        android.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/MetroUI_OS_Android  - Copy.png"))); // NOI18N
        android.setBorder(null);
        android.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                androidActionPerformed(evt);
            }
        });
        android.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                androidKeyPressed(evt);
            }
        });

        C.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/alphanum_lowercase-letter-c_flat-rounded-square-white-on-blue_512x512.png"))); // NOI18N
        C.setBorder(null);
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        C.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CKeyPressed(evt);
            }
        });

        php.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/logo-php-xx.png"))); // NOI18N
        php.setBorder(null);
        php.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phpActionPerformed(evt);
            }
        });
        php.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phpKeyPressed(evt);
            }
        });

        dotNet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/stud/icon/asp-net .png"))); // NOI18N
        dotNet.setBorder(null);
        dotNet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dotNetActionPerformed(evt);
            }
        });
        dotNet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dotNetKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        jLabel1.setText("Choose any of the below mentioned course to start your test.");

        username.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel5.setText("WELCOME");

        jLabel20.setBackground(new java.awt.Color(51, 255, 0));
        jLabel20.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel20.setOpaque(true);

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultPanelLayout.createSequentialGroup()
                            .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(defaultPanelLayout.createSequentialGroup()
                                    .addComponent(android, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(php, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(defaultPanelLayout.createSequentialGroup()
                                    .addComponent(Java, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(100, 100, 100)
                                    .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(100, 100, 100)
                            .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Cpp, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dotNet, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(96, 96, 96))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultPanelLayout.createSequentialGroup()
                            .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(defaultPanelLayout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addContainerGap()))))
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(C, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cpp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Java, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(php, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(android, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dotNet, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        desktopPane.setLayer(defaultPanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(defaultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(defaultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(614, Short.MAX_VALUE))
        );

        getContentPane().add(desktopPane);

        pack();
    }// </editor-fold>//GEN-END:initComponents
       
    public void setStudName(String name){
        username.setText(studName);
    }
    
    public void frameclosed(String value){
        runningFrames.remove(value);
    }
    
    private void initiate_startTest(String course){
        numberOfQuestions = (String) JOptionPane.showInternalInputDialog(desktopPane,
                                                "Select number of questions for test : ",
                                                "Select total Questions",
                                                JOptionPane.INFORMATION_MESSAGE,
                                                null,
                                                totalQuestions ,
                                                totalQuestions[0]);
        if((" ".equals(numberOfQuestions)) || numberOfQuestions==null)
            JOptionPane.showInternalMessageDialog(desktopPane,
                                                  "Please select the no of questions to start the test",
                                                  "Attention",
                                                  JOptionPane.ERROR_MESSAGE);
        else{
            setRootPaneCheckingEnabled(false);
            
            
            showQues show = new showQues(numberOfQuestions, course, studName, studID, this);
            desktopPane.add(show);
            //runningFrames.put("test",1);
            show.setVisible(true);
            try {
                show.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            javax.swing.plaf.InternalFrameUI ifu= show.getUI();
            ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setSouthPane(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setEastPane(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setWestPane(null);
            
            Instructions readMe = new Instructions(show);
            desktopPane.add(readMe);
            try {
                readMe.setSelected(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Dimension desktop = desktopPane.getSize();
            Dimension jinternal = readMe.getSize();
            int width = (desktop.width -125 - jinternal.width)/2;
            int height = (desktop.height -65 - jinternal.height)/2;
            readMe.setLocation(width, height);

            InternalFrameUI ifu1= readMe.getUI();
            ((BasicInternalFrameUI)ifu1).setNorthPane(null);
            ((BasicInternalFrameUI)ifu1).setEastPane(null);
            ((BasicInternalFrameUI)ifu1).setSouthPane(null);
            ((BasicInternalFrameUI)ifu1).setWestPane(null);
        }
    }
    
    private void HomeEvent(){
        if(runningFrames.containsKey("test"))
        JOptionPane.showMessageDialog(this,
            "Test is in progress\nYou must complete your test first",
            "Test not Completed",
            JOptionPane.ERROR_MESSAGE);
        else{
            int result =JOptionPane.showInternalConfirmDialog(desktopPane,
                "\nThis will close all current windows and return to the home\n"
                + "Any unsaved changes will be lost.\n\n"
                + "Are you sure you want to continue ?",
                "Home",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.ERROR_MESSAGE);
            if(result == JOptionPane.YES_OPTION)
            desktopPane.removeAll();

            desktopPane.add(defaultPanel);
        }
    }
    
    private void PerformanceEvent(){
        if(runningFrames.containsKey("test"))
        JOptionPane.showMessageDialog(this,
            "Test is in progress\nYou must complete your test first",
            "Test not Completed",
            JOptionPane.ERROR_MESSAGE);

        else
        try {
            score showScore = new score(this);
            desktopPane.add(showScore);
            
            setRootPaneCheckingEnabled(false);
            javax.swing.plaf.InternalFrameUI ifu= showScore.getUI();
            ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setNorthPane(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setSouthPane(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setEastPane(null);
            ((javax.swing.plaf.basic.BasicInternalFrameUI)ifu).setWestPane(null);
            
            showScore.setVisible(true);
            showScore.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void exitEvent(){
        if(runningFrames.containsKey("test"))
        JOptionPane.showMessageDialog(this,
            "Test is in progress\nYou must complete your test first",
            "Test not Completed",
            JOptionPane.ERROR_MESSAGE);
        else{
            int value = JOptionPane.showInternalConfirmDialog(desktopPane,
                "\nYou are about to exit\nYou will be logged out and any unsaved changes will be discarded\n",
                "Exit",JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
            if (value == JOptionPane.YES_OPTION) {
                this.dispose();
            }
        }
    }
    
    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        HomeEvent();
    }//GEN-LAST:event_HomeActionPerformed

    private void PerformanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerformanceActionPerformed
        PerformanceEvent();
    }//GEN-LAST:event_PerformanceActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        exitEvent();
    }//GEN-LAST:event_ExitActionPerformed

    private void JavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JavaActionPerformed
        initiate_startTest("java");
    }//GEN-LAST:event_JavaActionPerformed

    private void CppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CppActionPerformed
        initiate_startTest("cpp");
    }//GEN-LAST:event_CppActionPerformed

    private void androidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_androidActionPerformed
        initiate_startTest("android");
    }//GEN-LAST:event_androidActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        initiate_startTest("clang");
    }//GEN-LAST:event_CActionPerformed

    private void phpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phpActionPerformed
        initiate_startTest("php");
    }//GEN-LAST:event_phpActionPerformed

    private void dotNetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dotNetActionPerformed
        initiate_startTest("dotNet");
    }//GEN-LAST:event_dotNetActionPerformed

    private void JavaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JavaKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            initiate_startTest("java");
    }//GEN-LAST:event_JavaKeyPressed

    private void CKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            initiate_startTest("clang");
    }//GEN-LAST:event_CKeyPressed

    private void CppKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CppKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            initiate_startTest("cpp");
    }//GEN-LAST:event_CppKeyPressed

    private void androidKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_androidKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            initiate_startTest("android");
    }//GEN-LAST:event_androidKeyPressed

    private void phpKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phpKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            initiate_startTest("php");
    }//GEN-LAST:event_phpKeyPressed

    private void dotNetKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dotNetKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            initiate_startTest("dotNet");
    }//GEN-LAST:event_dotNetKeyPressed

    private void HomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HomeKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            HomeEvent();
    }//GEN-LAST:event_HomeKeyPressed

    private void PerformanceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PerformanceKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            PerformanceEvent();
    }//GEN-LAST:event_PerformanceKeyPressed

    private void ExitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ExitKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            exitEvent();
    }//GEN-LAST:event_ExitKeyPressed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton C;
    private javax.swing.JButton Cpp;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Home;
    private javax.swing.JButton Java;
    private javax.swing.JButton Performance;
    private javax.swing.JLabel aboutjLabel;
    private javax.swing.JButton android;
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JButton dotNet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton php;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables

}
