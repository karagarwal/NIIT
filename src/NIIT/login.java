/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIIT;

import NIIT.Admin.admin;
import NIIT.stud.Main;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class login extends javax.swing.JFrame{
    String loginType;
    int loginAttempt = 0;
    private GroupButtonUtils select = new GroupButtonUtils();
    Timer t;
    Main launchTest;
    admin launch;
            
    /**
     * Creates new form startScreen
     */

    public login() {
        initComponents();
        setVisibilityOfFields(false);
        loginTypejLabel.setVisible(false);
        byID.setVisible(false);
        byName.setVisible(false);
        
        buttonGroup.add(byName);
        buttonGroup.add(byID);
        
        jProgressBar.setVisible(false);
        t = new Timer(80, (ActionEvent e) -> {
            if(jProgressBar.getValue()<100)
                jProgressBar.setValue(jProgressBar.getValue()+5);
            else{
                t.stop();
                this.dispose();
                launchTest.setVisible(true);
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        exitjButton = new javax.swing.JButton();
        loginjButton = new javax.swing.JButton();
        jProgressBar = new javax.swing.JProgressBar();
        jPanel2 = new javax.swing.JPanel();
        combotype = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        unameLabel = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        byName = new javax.swing.JRadioButton();
        byID = new javax.swing.JRadioButton();
        loginTypejLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setMinimumSize(new java.awt.Dimension(650, 375));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(650, 375));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setOpaque(false);

        exitjButton.setFont(new java.awt.Font("Vrinda", 0, 15)); // NOI18N
        exitjButton.setText("Exit");
        exitjButton.setPreferredSize(new java.awt.Dimension(70, 25));
        exitjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitjButtonMouseClicked(evt);
            }
        });

        loginjButton.setFont(new java.awt.Font("Vrinda", 0, 15)); // NOI18N
        loginjButton.setText("Login");
        loginjButton.setPreferredSize(new java.awt.Dimension(70, 25));
        loginjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginjButtonMouseClicked(evt);
            }
        });

        jProgressBar.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 655, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(exitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitjButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginjButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 300, 660, 60));

        jPanel2.setMaximumSize(new java.awt.Dimension(650, 375));
        jPanel2.setMinimumSize(new java.awt.Dimension(650, 375));
        jPanel2.setOpaque(false);
        jPanel2.setPreferredSize(new java.awt.Dimension(650, 375));

        combotype.setFont(new java.awt.Font("Vrinda", 0, 14)); // NOI18N
        combotype.setMaximumRowCount(3);
        combotype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Student" }));
        combotype.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        combotype.setMaximumSize(new java.awt.Dimension(63, 20));
        combotype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotypeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        jLabel1.setText("Login As");
        jLabel1.setMaximumSize(new java.awt.Dimension(63, 23));
        jLabel1.setMinimumSize(new java.awt.Dimension(63, 23));
        jLabel1.setPreferredSize(new java.awt.Dimension(63, 20));

        unameLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        unameLabel.setText("Username");
        unameLabel.setMaximumSize(new java.awt.Dimension(63, 23));
        unameLabel.setMinimumSize(new java.awt.Dimension(63, 23));
        unameLabel.setPreferredSize(new java.awt.Dimension(69, 20));

        passLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        passLabel.setText("Password");
        passLabel.setMaximumSize(new java.awt.Dimension(63, 23));
        passLabel.setMinimumSize(new java.awt.Dimension(63, 23));
        passLabel.setPreferredSize(new java.awt.Dimension(65, 20));

        uname.setFont(new java.awt.Font("Vrinda", 0, 15)); // NOI18N
        uname.setForeground(new java.awt.Color(204, 204, 204));
        uname.setText("Enter Username");
        uname.setToolTipText("Enter your Username");
        uname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        uname.setMinimumSize(new java.awt.Dimension(63, 23));
        uname.setName(""); // NOI18N
        uname.setPreferredSize(new java.awt.Dimension(63, 23));
        uname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                unameMouseClicked(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                unameKeyTyped(evt);
            }
        });

        pass.setFont(new java.awt.Font("Vrinda", 0, 15)); // NOI18N
        pass.setForeground(new java.awt.Color(204, 204, 204));
        pass.setText("Enter Passw");
        pass.setToolTipText("Enter your Password");
        pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pass.setMaximumSize(new java.awt.Dimension(63, 20));
        pass.setMinimumSize(new java.awt.Dimension(63, 23));
        pass.setName(""); // NOI18N
        pass.setPreferredSize(new java.awt.Dimension(63, 23));
        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passKeyPressed(evt);
            }
        });

        buttonGroup.add(byName);
        byName.setFont(new java.awt.Font("Vrinda", 0, 15)); // NOI18N
        byName.setText("Student Name");
        byName.setOpaque(false);
        byName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byNameActionPerformed(evt);
            }
        });

        buttonGroup.add(byID);
        byID.setFont(new java.awt.Font("Vrinda", 0, 15)); // NOI18N
        byID.setText("Student ID");
        byID.setOpaque(false);
        byID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                byIDActionPerformed(evt);
            }
        });

        loginTypejLabel.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        loginTypejLabel.setText("Login Using ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(unameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(combotype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(loginTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(byName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(byID)))
                .addGap(141, 141, 141))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combotype, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(byName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(loginTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(byID, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, 650, 340));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/login Background.jpg"))); // NOI18N
        jLabel4.setAlignmentY(0.0F);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showPanel(){
        loginType = select.getSelectedButtonText(buttonGroup);
        setVisibilityOfFields(true);
        unameLabel.setText("Enter " +loginType);
        uname.setText("Enter " +loginType);
        pass.setText("Enter Password");
        pass.setForeground(Color.LIGHT_GRAY);
        uname.setForeground(Color.LIGHT_GRAY);
        pass.setEchoChar((char)0);
    }
    
    private void setVisibilityOfFields(Boolean bool){
        unameLabel.setVisible(bool);
        passLabel.setVisible(bool);
        uname.setVisible(bool);
        pass.setVisible(bool);
        loginjButton.setEnabled(bool);
    }
    
    private void loginUser(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/niitdb","root","");
            Statement stmt = (Statement) con.createStatement();
            ResultSet rs ;
            String person = combotype.getSelectedItem().toString();
            String name = uname.getText();
            String passwd = pass.getText();
            String SQL, name_id;

            if((("Enter "+loginType).equals(name) || "".equals(name)) && ("Enter Password".equals(passwd) || "".equals(passwd)))
                JOptionPane.showMessageDialog(this,
                    "Please Enter " +loginType+" and Password",
                    "Details Empty!",
                    JOptionPane.ERROR_MESSAGE);
            
            else if((("Enter "+loginType).equals(name) || "".equals(name)) && !("Enter Password".equals(passwd) || "".equals(passwd)))
                JOptionPane.showMessageDialog(this,
                    "Please Enter " +loginType,
                    "Details Empty!",
                    JOptionPane.ERROR_MESSAGE);
                        
            else if(("Enter Password".equals(passwd) || "".equals(passwd)) && !(("Enter "+loginType).equals(name) || "".equals(name)))
                JOptionPane.showMessageDialog(this,
                    "Please Enter Password",
                    "Password Empty!",
                    JOptionPane.ERROR_MESSAGE);
            else if("Student".equals(combotype.getSelectedItem().toString())){
                    if((select.getSelectedButtonText(buttonGroup)).equals("Student ID"))
                        name_id = "id";
                    else
                        name_id = "name";
                
                    SQL = "SELECT * FROM student_info WHERE " +name_id+ " = '" +name+ "'";
                    rs =  (ResultSet) stmt.executeQuery(SQL);

                    if(rs.next()){
                        rs.close();

                        SQL = "SELECT * FROM student_info WHERE " +name_id+"= '" +name+ "' AND "
                                                            + "pass = '" +passwd+"'";
                        rs =  (ResultSet) stmt.executeQuery(SQL);

                        if(rs.next()){
                            jProgressBar.setVisible(true);
                            t.start();
                            launchTest = new Main();
                            launchTest.studName = rs.getString("name");
                            launchTest.studID = rs.getString("id");
                            launchTest.setStudName(launchTest.studName);
                        }
                        else
                        JOptionPane.showMessageDialog(this,
                                    "Password incorrect",
                                    "Try Again",
                                    JOptionPane.ERROR_MESSAGE);
                    }
                    else if(loginAttempt < 3){
                        loginAttempt++;
                        JOptionPane.showMessageDialog(this,
                                    "Sorry!! " +name.toUpperCase()+ " is not a registered user",
                                    "Try Again",
                                    JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        JOptionPane.showMessageDialog(this,
                                    "Sorry!! you have exceeded the number of login attempts allowed",
                                    null,
                                    JOptionPane.ERROR_MESSAGE);
                        System.exit(0);
                    }
            }
            else{
                SQL = "SELECT * FROM admin_info WHERE `id`  = '" +name+ "'";
                rs =  (ResultSet) stmt.executeQuery(SQL);

                if(rs.next()){
                    rs.close();

                    SQL = "SELECT * FROM admin_info WHERE `id` = '" +name+ "' AND "
                                                        + "pass = '" +passwd+"'";
                    rs =  (ResultSet) stmt.executeQuery(SQL);

                    if(rs.next()){
                      this.dispose();
                        launch = new admin();
                       launch.setAdminId(name);
                       launch.setVisible(true);
                       
                    }
                    else
                    JOptionPane.showMessageDialog(this,
                                "Password incorrect",
                                "Try Again",
                                JOptionPane.ERROR_MESSAGE);
                }
                else
                    JOptionPane.showMessageDialog(this,
                                "Sorry!! " +name.toUpperCase()+ " is not a registered admin",
                                "Try Again",
                                JOptionPane.ERROR_MESSAGE);
            }

        } catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
            e.printStackTrace();
        }
    }
    
    private void unameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_unameMouseClicked
        if("Enter Student Name".equals(uname.getText())|| "Enter Student ID".equals(uname.getText()) ||"Enter Admin ID".equals(uname.getText()) )
            uname.setText(null);
        uname.setForeground(Color.BLACK);
    }//GEN-LAST:event_unameMouseClicked

    private void unameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyTyped
        if("Enter Student Name".equals(uname.getText())|| "Enter Student ID".equals(uname.getText()) )
            uname.setText(null);
        uname.setForeground(Color.BLACK);
    }//GEN-LAST:event_unameKeyTyped

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
        if("Enter Password".equals(pass.getText()))
            pass.setText(null);
        pass.setForeground(Color.BLACK);
        pass.setEchoChar('*');
    }//GEN-LAST:event_passMouseClicked

    private void passKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyPressed
        if("Enter Password".equals(pass.getText()))
            pass.setText(null);
        pass.setForeground(Color.BLACK);
        pass.setEchoChar('*');

        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
            loginUser();
    }//GEN-LAST:event_passKeyPressed

    private void loginjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginjButtonMouseClicked
        loginUser();
    }//GEN-LAST:event_loginjButtonMouseClicked

    private void exitjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitjButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitjButtonMouseClicked

    private void byNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byNameActionPerformed
        showPanel();
    }//GEN-LAST:event_byNameActionPerformed

    private void byIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_byIDActionPerformed
        showPanel();
    }//GEN-LAST:event_byIDActionPerformed

    private void combotypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotypeActionPerformed
        combotype.removeItem("Select");
        if("Admin".equals(combotype.getSelectedItem().toString())){
            unameLabel.setText("Admin ID");
            uname.setText("Enter Admin ID");
            pass.setText("Enter Password");
            uname.setForeground(Color.lightGray);
            pass.setForeground(Color.lightGray);
            pass.setEchoChar((char)0);
            setVisibilityOfFields(true);
            byName.setVisible(false);
            byID.setVisible(false);
            loginTypejLabel.setVisible(false);
        }
        else{
            buttonGroup.clearSelection();
            byName.setVisible(true);
            byID.setVisible(true);
            loginTypejLabel.setVisible(true);
            setVisibilityOfFields(false);
        }
    }//GEN-LAST:event_combotypeActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login start =  new login();
                start.pack();
                start.setLocationRelativeTo(null);
                start.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JRadioButton byID;
    private javax.swing.JRadioButton byName;
    private javax.swing.JComboBox<String> combotype;
    private javax.swing.JButton exitjButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JLabel loginTypejLabel;
    private javax.swing.JButton loginjButton;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel passLabel;
    private javax.swing.JTextField uname;
    private javax.swing.JLabel unameLabel;
    // End of variables declaration//GEN-END:variables
}
