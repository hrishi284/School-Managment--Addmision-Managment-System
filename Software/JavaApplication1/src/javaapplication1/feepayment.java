/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class feepayment extends javax.swing.JFrame {

    /**
     * Creates new form feepayment
     */
    public feepayment() {
        this.getContentPane().setBackground(Color.white);
        initComponents();
    //    cvv.setVisible(false);
        txtcno.setVisible(false);
      //  cdnm.setVisible(false);
        tctcvv.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox3.setVisible(false);
        //jRadioButton3.setVisible(false);
  //      cdexdate.setVisible(false);
        jButton3.setVisible(false);
        jLabel2.setVisible(false);
             
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
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        txtcno = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        tctcvv = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);

        jLabel1.setText("Select cast ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 60, 14);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SC", "ST", "NT ", "OBC", "OPEN", " " }));
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(100, 20, 52, 20);

        jButton2.setText("Genrate Fee");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 60, 100, 23);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 60, 70, 20);

        jLabel4.setText("Select Payment Type ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 100, 110, 14);

        jRadioButton1.setText("Credit card");
        jRadioButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jRadioButton1FocusGained(evt);
            }
        });
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(10, 120, 110, 23);

        jRadioButton2.setText("Debit card");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(150, 120, 100, 23);

        jRadioButton3.setText("Cash");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(260, 120, 100, 23);
        getContentPane().add(txtcno);
        txtcno.setBounds(10, 240, 290, 30);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(10, 380, 37, 20);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", " " }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(60, 380, 49, 20);
        getContentPane().add(tctcvv);
        tctcvv.setBounds(180, 380, 120, 20);

        jButton3.setBackground(new java.awt.Color(51, 153, 255));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("Pay");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(340, 260, 170, 70);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Documents\\credit-card-icon-blog-01.jpg")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 170, 310, 270);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
if(jRadioButton1.isSelected())
{
     jLabel2.setVisible(true);
jRadioButton2.setSelected(false);
jRadioButton3.setSelected(false);
//cvv.setVisible(true);
        txtcno.setVisible(true);
    //    cdnm.setVisible(true);
        tctcvv.setVisible(true);
        jComboBox4.setVisible(true);
        jComboBox3.setVisible(true);
        //jRadioButton3.setVisible(true);
  //      cdexdate.setVisible(true);
        jButton3.setVisible(true);
}
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
if(jRadioButton2.isSelected())
{
jRadioButton1.setSelected(false);
jRadioButton3.setSelected(false);
//cvv.setVisible(true);
jLabel2.setVisible(true);     
txtcno.setVisible(true);
        //cdnm.setVisible(true);
        tctcvv.setVisible(true);
        jComboBox4.setVisible(true);
        jComboBox3.setVisible(true);
        //jRadioButton3.setVisible(true);
        //cdexdate.setVisible(true);
        jButton3.setVisible(true);
}     // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jRadioButton1FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1FocusGained

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
if(jRadioButton3.isSelected())
{
jRadioButton2.setSelected(false);
jRadioButton1.setSelected(false);
//cvv.setVisible(false);
        txtcno.setVisible(false);
          jLabel2.setVisible(false);
      //  cdnm.setVisible(false);
        tctcvv.setVisible(false);
        jComboBox4.setVisible(false);
        jComboBox3.setVisible(false);
        //jRadioButton3.setVisible(false);
        //cdexdate.setVisible(false);
        jButton3.setVisible(true);
}        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 Connection con = null;
    PreparedStatement pst = null;
 ResultSet rs =null;
 String gender = null;
 //String R =jComboBox1.getSelectedItem().toString(); 
 //String t = "5th";
 try {
     Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    con=DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\Dell\\Documents\\NetBeansProjects\\JavaApplication1\\Studentaddmi.accdb");
        
        if ( jComboBox2.getSelectedItem().toString().equals("SC")) {
     String sql="Select * from feepay ";
        pst=con.prepareCall(sql);
        rs=pst.executeQuery();
        if(rs.next())
        {
           jLabel3.setText(rs.getString(1)); 
                    
        }
        }
         if ( jComboBox2.getSelectedItem().toString().equals("ST")) {
     String sql="Select * from feepay ";
        pst=con.prepareCall(sql);
        rs=pst.executeQuery();
        if(rs.next())
        {
           jLabel3.setText(rs.getString("ST")); 
                    
        }
         }
         if ( jComboBox2.getSelectedItem().toString().equals("NT")) {
     String sql = "Select * from feepay ";
        pst=con.prepareCall(sql);
        rs=pst.executeQuery();
        if(rs.next())
        {
           jLabel3.setText(rs.getString("NT")); 
                    
        }
        }
         if ( jComboBox2.getSelectedItem().toString().equals("OBC")) {
     String sql="Select * from feepay ";
        pst=con.prepareCall(sql);
        rs=pst.executeQuery();
        if(rs.next())
        {
           jLabel3.setText(rs.getString("OBC")); 
                    
        }
        }
   if ( jComboBox2.getSelectedItem().toString().equals("OPEN")) {
     String sql1="Select *from feepay ";
        pst=con.prepareCall(sql1);
        rs=pst.executeQuery();
        if(rs.next())
        {
           jLabel3.setText(rs.getString("OPEN")); 
                    
        }
        }
       
    }catch(Exception e){ JOptionPane.showMessageDialog(null, e);}
  //          pst=con.prepareStatement(sql);
         // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
if(jRadioButton1.isSelected() || jRadioButton2.isSelected()){
if (txtcno.getText().length() == 16)
{
    if (tctcvv.getText().length()==3) {
        
    
JOptionPane.showMessageDialog(null, "Pay Successfuly");
}
    else {
    JOptionPane.showMessageDialog(null, "Enter Valid CVV");
    }
    }
else
{
    JOptionPane.showMessageDialog(null, "Enter Vailid Card No");
}  
}
else {JOptionPane.showMessageDialog(null, "Pay to Cashier");}
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed
 
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
            java.util.logging.Logger.getLogger(feepayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(feepayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(feepayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(feepayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new feepayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField tctcvv;
    private javax.swing.JTextField txtcno;
    // End of variables declaration//GEN-END:variables
}
