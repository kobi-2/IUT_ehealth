/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ehealth;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author user
 */

public class doctorhome extends javax.swing.JFrame {
    public Statement st;
    public Connection cn;
    public int count =0;
    public user u;
    int c;
    public doctorhome(user _u) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth?zeroDateTimeBehavior=convertToNull","root","");
            st=cn.createStatement();
            //JOptionPane.showMessageDialog(null, "Connected");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Not Connected");
        }
        u=_u;
        initComponents();
        String sql = "select * from emergencyresponse";
            ResultSet rs = null;
        try {
            rs = st.executeQuery(sql);
            //rs.next();
            c=0;
            while(rs.next()){
                c++;
            }
            if(c>0){
                docnotifications.setBackground(Color.RED);
                docnotifications.setForeground(Color.RED);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(doctorhome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        back = new javax.swing.JButton();
        docslipreq1 = new javax.swing.JButton();
        docschedule1 = new javax.swing.JButton();
        docbillreq = new javax.swing.JButton();
        docnotifications = new javax.swing.JButton();
        myprofile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Home");

        kGradientPanel1.setkEndColor(new java.awt.Color(248, 6, 35));
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 255, 255));

        back.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        back.setText("Sign out");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        docslipreq1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        docslipreq1.setText("Slip Requests");
        docslipreq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docslipreq1ActionPerformed(evt);
            }
        });

        docschedule1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        docschedule1.setText("See Appointments");
        docschedule1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docschedule1ActionPerformed(evt);
            }
        });

        docbillreq.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        docbillreq.setText("Bill Requests");
        docbillreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docbillreqActionPerformed(evt);
            }
        });

        docnotifications.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        docnotifications.setText("Notifications");
        docnotifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docnotificationsActionPerformed(evt);
            }
        });

        myprofile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        myprofile.setText("My Profile");
        myprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myprofileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Doctor Homepage");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(230, Short.MAX_VALUE)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(myprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(docslipreq1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docbillreq, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(74, 74, 74)
                        .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(docnotifications, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(docschedule1))
                        .addGap(326, 326, 326))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(myprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(117, 117, 117)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docschedule1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docslipreq1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docnotifications, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docbillreq, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void docbillreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docbillreqActionPerformed
       String sql3 ="select *from billdatabase where accept = '"+""+"'and reject = '"+""+"'";
      
        ResultSet rss2;
        try {
            rss2 = st.executeQuery(sql3);
            while(rss2.next())
                    count++;
                if(count != 0 )
                {
                    DoctorRefund df= new DoctorRefund(u);
                    df.setVisible(true);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "All clear");
//                    dispose();
                }
        } catch (SQLException ex) {
            Logger.getLogger(doctorhome.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_docbillreqActionPerformed

    private void docnotificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docnotificationsActionPerformed
        String sql = "select * from emergencyresponse";
            ResultSet rs = null;
        try {
            rs = st.executeQuery(sql);
            //rs.next();
            c=0;
            while(rs.next()){
                c++;
            }
            if(c<=0)
                JOptionPane.showMessageDialog(null, "No Notifications to show");
            else{
                
                doctornoti dn = new doctornoti(u);
                dn.setVisible(true);
                dispose();
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(doctorhome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }//GEN-LAST:event_docnotificationsActionPerformed

    private void docslipreq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docslipreq1ActionPerformed
        // TODO add your handling code here:
        String sql9 ="select *from yellowslip where accept = '"+""+"'and reject = '"+""+"'";

            ResultSet rss9;
        try {
            rss9 = st.executeQuery(sql9);
            count =0;
            while(rss9.next())
                count++;
            if(count ==0)
                JOptionPane.showMessageDialog(null, "No slip to show");
            else
            {
                YellowSlip yl = new YellowSlip(u);
                yl.setVisible(true);
            }    
        } catch (SQLException ex) {
            Logger.getLogger(doctorhome.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_docslipreq1ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        dispose();
        signinform sr= new signinform();
        sr.setVisible(true);
        JOptionPane.showMessageDialog(null, "Logged out");
        
    }//GEN-LAST:event_backActionPerformed

    private void myprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myprofileActionPerformed
        myprofile mp = null;
        try {
            mp = new myprofile(u);
        } catch (SQLException ex) {
            Logger.getLogger(doctorhome.class.getName()).log(Level.SEVERE, null, ex);
        }
        mp.setVisible(true);
        //dispose();
    }//GEN-LAST:event_myprofileActionPerformed

    private void docschedule1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docschedule1ActionPerformed
        docappointment da= new docappointment();
        da.setVisible(true);
    }//GEN-LAST:event_docschedule1ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(doctorhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(doctorhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(doctorhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(doctorhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new doctorhome(u).setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton docbillreq;
    private javax.swing.JButton docnotifications;
    private javax.swing.JButton docschedule1;
    private javax.swing.JButton docslipreq1;
    private javax.swing.JLabel jLabel1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JButton myprofile;
    // End of variables declaration//GEN-END:variables
}