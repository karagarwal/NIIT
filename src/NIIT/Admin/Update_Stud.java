/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIIT.Admin;

import java.awt.Color;
import java.awt.Dimension;
import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author AGARWAL-PC
 */
public class Update_Stud extends javax.swing.JInternalFrame {

    /**
     * Creates new form Update_Stud
     */
    public Update_Stud() {
        initComponents();
         close.setEnabled(false);
          update.setEnabled(false);
            Re_enter.setEnabled(false);
         course.setEnabled(false);
          gendr.setEnabled(false);
         name.setEnabled(false);
         contact.setEnabled(false);
         email.setEnabled(false);
         id1.setEnabled(false);
         password.setEnabled(false);
         dob.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        Re_enter = new javax.swing.JButton();
        close = new javax.swing.JButton();
        pane = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        id1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        course = new javax.swing.JComboBox<>();
        dob = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        gendr = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();

        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/NIIT/Admin/NIIT.png"))); // NOI18N
        setPreferredSize(new java.awt.Dimension(792, 492));

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        Re_enter.setText("Re-Enter Details");
        Re_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Re_enterActionPerformed(evt);
            }
        });

        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Course");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Contact");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("D.O.B.");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("E-Mail ID");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("ID");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Password");

        id1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id1.setForeground(new java.awt.Color(153, 153, 153));
        id1.setText("ID");
        id1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        name.setForeground(new java.awt.Color(153, 153, 153));
        name.setText("Name");
        name.setToolTipText("NAME");
        name.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        password.setForeground(new java.awt.Color(153, 153, 153));
        password.setText("Password");
        password.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        contact.setForeground(new java.awt.Color(153, 153, 153));
        contact.setText("Contact");
        contact.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactKeyPressed(evt);
            }
        });

        email.setForeground(new java.awt.Color(153, 153, 153));
        email.setText("E-Mail");
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        course.setMaximumRowCount(5);
        course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "JAVA", "C", "CPP", "DotNet", "Php" }));
        course.setBorder(null);

        dob.setForeground(new java.awt.Color(153, 153, 153));
        dob.setText("D.O.B.");
        dob.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Gender");

        gendr.setMaximumRowCount(3);
        gendr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        gendr.setBorder(null);

        javax.swing.GroupLayout paneLayout = new javax.swing.GroupLayout(pane);
        pane.setLayout(paneLayout);
        paneLayout.setHorizontalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(gendr, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(paneLayout.createSequentialGroup()
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(paneLayout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                            .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneLayout.createSequentialGroup()
                            .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(paneLayout.createSequentialGroup()
                                            .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneLayout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(28, 28, 28)))
                                    .addGroup(paneLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))
                                .addGroup(paneLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)))
                            .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(email)
                                .addComponent(name)
                                .addComponent(contact, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dob, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        paneLayout.setVerticalGroup(
            paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(course, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(gendr, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(30, 30, 30)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(paneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Trajan Pro", 1, 18)); // NOI18N
        jLabel11.setText("UPDATE STUDENT DATA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Re_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 1029, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(474, 474, 474)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Re_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(pane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        Connection con=null;
        Statement stmt=null;
        String SQL;
        String s1=id1.getText();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yyyy");
           int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = 0; 
            if(!"ID".equals(s1))
              dialogResult = JOptionPane.showConfirmDialog(this,"Are you sure to Update Student id '"+s1+"' ","Warning",dialogButton,JOptionPane.WARNING_MESSAGE,null);
                if(dialogResult == JOptionPane.YES_OPTION)
           
        try{
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/niitdb","root","");
            stmt=con.createStatement();
            if("ID".equals(s1))
            JOptionPane.showMessageDialog(this,"Please Enter Details","Empty!",JOptionPane.ERROR_MESSAGE);
            else{                    
                
                String nm,corse,numb,sid,passwd,mail,dobsend,gndr;
                EmailValidator emailValidator = new EmailValidator();  
                ValidatePhoneNumber phoneValidator = new ValidatePhoneNumber();
                
                
            Date dobr = new Date(); 
            nm= name.getText();
            corse = course.getSelectedItem().toString();
             gndr=gendr.getSelectedItem().toString();
            numb = contact.getText();
            sid = id1.getText();
            passwd = password.getText();
       //   dobsend = sdf.format(dob.getDate());
            mail = email.getText();
                if(name.getText().isEmpty()){
                 JOptionPane.showMessageDialog(this,"Please Enter Name","Error",JOptionPane.ERROR_MESSAGE);
             }
                 
             else if("Select".equalsIgnoreCase((String) course.getSelectedItem())){
                JOptionPane.showMessageDialog(this,"Choose a Valid Course","Error",JOptionPane.ERROR_MESSAGE);
            }
            
            else if(!phoneValidator.validate(contact.getText().trim())){
         JOptionPane.showMessageDialog(this,"Invalid Contact Number","Error",JOptionPane.ERROR_MESSAGE);
               }
            
            else if(!emailValidator.validate(email.getText().trim())) {
         JOptionPane.showMessageDialog(this,"Invalid E-Mail ID","Error",JOptionPane.ERROR_MESSAGE);
               }
            else if(password.getText().length()<8){
               JOptionPane.showMessageDialog(this,"Password should be atleast 8 characters long","Error",JOptionPane.ERROR_MESSAGE);
               }
            else 
            {
                SQL="UPDATE student_info SET name = '"+name.getText()+"',course = '"+course.getSelectedItem().toString()+"',gender = '"+gendr.getSelectedItem().toString()+"',dob = '"+dob.getText()+"',contact = '"+contact.getText()+"',mail = '"+email.getText()+"',pass = '"+password.getText()+"' WHERE id = '"+sid+"' ";
                stmt.executeUpdate(SQL);
                name.setText("Name");
                name.setEnabled(false);
                  course.setSelectedIndex(0);
                  course.setEnabled(false);
                   gendr.setSelectedIndex(0);
                  gendr.setEnabled(false);
                   dob.setText("D.O.B.");
                    dob.setEnabled(false);
                       contact.setText("Contact");
                       contact.setEnabled(false);
                         email.setText("E-mail");
                         email.setEnabled(false);
                           id1.setText("ID");
                           id1.setEnabled(false);
                             password.setText("Password");
                             password.setEnabled(false);
                JOptionPane.showMessageDialog(this,"Data Updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
            }
         }  
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    private void Re_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Re_enterActionPerformed
                  close.setEnabled(false);
          update.setEnabled(false);
           Re_enter.setEnabled(false);
        Retrive_U r2 = new Retrive_U(this);
        this.getParent().add(r2);
        Dimension desktop = this.getSize();
        Dimension jinternalFrame = r2.getSize();
        int width = (desktop.width - jinternalFrame.width)/2;
        int height = (desktop.height - jinternalFrame.height)/2;
        try{
            r2.setSelected(true);
            r2.setLocation(width,height);
        } catch (PropertyVetoException ex) {
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }
        r2.setVisible(true);// TODO add your handling code here:

    }//GEN-LAST:event_Re_enterActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_closeActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
        String value = name.getText();
       
    if ((evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')||(evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z')||(evt.getKeyChar()== 32)||(evt.getKeyChar()== 8)) {
        name.setEditable(true);
        } 
    else {
        name.setEditable(false);
    }  // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyPressed

    private void contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyPressed
        String value = contact.getText();
    int l = value.length();
    if(l==10){
        if(evt.getKeyChar()== 8)
            contact.setEditable(true);
        else
            contact.setEditable(false);
    }
    else if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')||(evt.getKeyChar()== 8)) {
        contact.setEditable(true);
        } 
    else {
        contact.setEditable(false);
    }        // TODO add your handling code here:
    }//GEN-LAST:event_contactKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton Re_enter;
    protected javax.swing.JButton close;
    private javax.swing.JTextField contact;
    private javax.swing.JComboBox<String> course;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField email;
    private javax.swing.JComboBox<String> gendr;
    private javax.swing.JLabel id1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField name;
    private javax.swing.JPanel pane;
    private javax.swing.JTextField password;
    protected javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    void setLabel(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) {
                    course.setEnabled(true);
                    name.setEnabled(true);
                    contact.setEnabled(true);
                     gendr.setEnabled(true);
                    email.setEnabled(true);
                    id1.setEnabled(true);
                    password.setEnabled(true);
                    dob.setEnabled(true);
            
       name.setText(s1);
       name.setForeground(Color.BLACK); 
         course.setSelectedItem(s2);
           dob.setText(s3); 
           dob.setEnabled(false);
             contact.setText(s4);
             contact.setForeground(Color.BLACK);  
               email.setText(s5);
               email.setForeground(Color.BLACK); 
                 id1.setText(s6); 
                 id1.setForeground(Color.BLACK); 
                   password.setText(s7);
                   password.setForeground(Color.BLACK); 
                    gendr.setSelectedItem(s8);
          
          
        //To change body of generated methods, choose Tools | Templates.
    }
}
