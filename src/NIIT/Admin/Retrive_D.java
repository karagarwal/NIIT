/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NIIT.Admin;

import NIIT.stud.GroupButtonUtils;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author AGARWAL-PC
 */
public class Retrive_D extends javax.swing.JInternalFrame {
  String Sel;    
  Connection con;
    Statement stmt;
    static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/niitdb";
  DeleteStud setLbl;
    /** 
     * Creates new form Q_type
     */
     ButtonGroup group1 = new ButtonGroup();
    GroupButtonUtils select = new GroupButtonUtils();
    
    public Retrive_D(DeleteStud set) {
        initComponents();
        this.toFront();
         this.setLayer(0);
         setLbl = set;
        group1.add(Button1);
        group1.add(Button2);
            name.setEnabled(false);
             id.setEnabled(false);
           }
      
    Retrive_D() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

     /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        myGroup = new javax.swing.ButtonGroup();
        my1 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        cancel = new javax.swing.JButton();
        submit = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Button1 = new javax.swing.JRadioButton();
        Button2 = new javax.swing.JRadioButton();

        setFrameIcon(null);
        try {
            setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        setVisible(true);

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        submit.setText("Submit");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitKeyPressed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Vivaldi", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 204));
        jLabel11.setText("Enter anyone Information from below for Deleteion");

        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText(" OR");

        name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameKeyPressed(evt);
            }
        });

        Button1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button1.setText("Name");
        Button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button1ActionPerformed(evt);
            }
        });

        Button2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Button2.setText("ID");
        Button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Button1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(Button2)
                                .addGap(39, 39, 39)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 203, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(203, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Button1)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Button2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submit)
                    .addComponent(cancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(185, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
           this.setVisible(false);      
            try{
                setLbl.close.setEnabled(true);
                setLbl.delete.setEnabled(true);
                 setLbl.Re_enter.setEnabled(true);
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
               
                 
            // TODO add your handling code here:
    }//GEN-LAST:event_cancelActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        String s1=id.getText();
        String s2=name.getText();
         
            Connection con=null;
            PreparedStatement stmt=null;
            PreparedStatement stmt1=null;
            ResultSet rs = null;
            ResultSet rs1 = null;
          if(id.isEnabled()){
              ValidateStudent_id idValidator = new ValidateStudent_id();
             if(!idValidator.validate(id.getText().trim())) {
               JOptionPane.showMessageDialog(this,"Invalid Student ID","Error",JOptionPane.ERROR_MESSAGE);
             } else {
           try{ 
           Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/niitdb","root",""); 
              stmt=con.prepareStatement("select * from student_info where id=?");
                stmt.setString(1,s1);
              rs=stmt.executeQuery();   
                 
               if(rs.next()){
                  String d=rs.getString("name");
                  String e=rs.getString("course");
                  String f=rs.getString("dob");
                  String g=rs.getString("contact");
                  String h=rs.getString("mail");
                  String i=rs.getString("id");
                  String j=rs.getString("pass");
                  String k=rs.getString("gender");
                              
                             setLbl.setLabel(d,e,f,g,h,i,j,k);
                           JOptionPane.showMessageDialog(this,"Data Successfully Found","Success",JOptionPane.INFORMATION_MESSAGE);  
                       
                  this.setVisible(false);
                   
                       setLbl.Re_enter.setEnabled(true);
                          setLbl.close.setEnabled(true);
                             setLbl.delete.setEnabled(true); 
               }
               else{
                  JOptionPane.showMessageDialog(this,"No Records found with Entered Detail","Error",JOptionPane.ERROR_MESSAGE);  
                }
             }
            catch(Exception e){
              //  JOptionPane.showMessageDialog(this,e.getMessage());
            }
           finally{
               try{
                   con.close();
                    stmt.close();
                     rs.close();
               }
                catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
           }
           }
          }
          
          else if(name.isEnabled()){
              ValidateStudent_id idValidator = new ValidateStudent_id();
             if(name.getText().isEmpty()) {
               JOptionPane.showMessageDialog(this,"Invalid Name","Error",JOptionPane.ERROR_MESSAGE);
             } else {
           try{ 
           Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/niitdb","root",""); 
        stmt=con.prepareStatement("select * from student_info where name like '%"+s2+"%'");      
        //stmt=con.prepareStatement("select * from student_info where name=?"); //where name like '% and %';
             //  stmt.setString(1,s2);
               rs=stmt.executeQuery();
                int count = 0;
                  while (rs.next()) {
                    count++; 
              } 
               if(count>1){
                    JOptionPane.showMessageDialog(this,"More than one Records Please Search by ID","Error",JOptionPane.ERROR_MESSAGE);
                   
               }
               else if(count==1){
                    rs.first();
                  String d=rs.getString("name");
                  String e=rs.getString("course");
                  String f=rs.getString("dob");
                  String g=rs.getString("contact");
                  String h=rs.getString("mail");
                  String i=rs.getString("id");
                  String j=rs.getString("pass");
                  String k=rs.getString("gender");
                            setLbl.setLabel(d,e,f,g,h,i,j,k);
                         JOptionPane.showMessageDialog(this,"Data Successfully Found","Success",JOptionPane.INFORMATION_MESSAGE);  
                       this.setVisible(false);
                       setLbl.Re_enter.setEnabled(true);
                          setLbl.delete.setEnabled(true);
                             setLbl.close.setEnabled(true);
                                
               }
               else{
                  JOptionPane.showMessageDialog(this,"No Records found with Entered Detail","Error",JOptionPane.ERROR_MESSAGE);  
                }
             }
            catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
           finally{
               try{
                   con.close();
                    stmt.close();
                     rs.close();
               }
                catch(Exception e){
                JOptionPane.showMessageDialog(this,e.getMessage());
            }
           }
           }
          }
          else{
            JOptionPane.showMessageDialog(this,"Please Fill atleast one Detail","Error",JOptionPane.ERROR_MESSAGE);  
          }
         
    }//GEN-LAST:event_submitActionPerformed

    private void nameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyPressed
       String value;
                    
      if ((evt.getKeyChar() >= 'a' && evt.getKeyChar() <= 'z')||(evt.getKeyChar() >= 'A' && evt.getKeyChar() <= 'Z')||(evt.getKeyChar()== 32)||(evt.getKeyChar()== 8)) {
        name.setEditable(true);
        } 
    else {
        name.setEditable(false);
        }
       
   // TODO add your handling code here:
    }//GEN-LAST:event_nameKeyPressed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
     String value = id.getText();
    int l = value.length();
     
    if(l==13){
        if(evt.getKeyChar()== 8)
            id.setEditable(true);
        else
            id.setEditable(false);
    }
    else if ((evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9')||(evt.getKeyChar()== 8)||(evt.getKeyChar()=='s')||(evt.getKeyChar()=='S')) {
        id.setEditable(true);
        } 
    else {
        id.setEditable(false);
    }   
        // TODO add your handling code here:
    }//GEN-LAST:event_idKeyPressed

    private void Button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button1ActionPerformed
        id.setText(null);
        id.setEnabled(false);
         name.setEnabled(true);
          name.setEditable(true);
         // TODO add your handling code here:
    }//GEN-LAST:event_Button1ActionPerformed

    private void Button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Button2ActionPerformed
       name.setText(null);
        name.setEnabled(false);
         id.setEnabled(true);
         id.setEditable(true);
         // TODO add your handling code here:
    }//GEN-LAST:event_Button2ActionPerformed
 
    private void submitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitKeyPressed
      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
         java.awt.event.ActionEvent evt1 = null;
          submitActionPerformed(evt1);
      }     
        // TODO add your handling code here:
    }//GEN-LAST:event_submitKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Button1;
    private javax.swing.JRadioButton Button2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton cancel;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.ButtonGroup my1;
    private javax.swing.ButtonGroup myGroup;
    private javax.swing.JTextField name;
    private javax.swing.JButton submit;
    // End of variables declaration//GEN-END:variables

    void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
