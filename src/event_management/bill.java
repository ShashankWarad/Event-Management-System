/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package event_management;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql. ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jeeva
 */
public class bill extends javax.swing.JFrame {

    /**
     * Creates new form bill
     */
    public bill() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txteid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 36)); // NOI18N
        jLabel1.setText("     BILLING");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 240, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Enter EID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 110, -1));
        getContentPane().add(txteid, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 130, -1));

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pexels-cottonbro-5054532.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             if (txteid.getText().equals("")){
               JOptionPane.showMessageDialog(this,"All values are mandatory");
              txteid.requestFocus();
           } 
else
          {
              Connection con =null;
            Statement st=null;
            PreparedStatement pst=null;
            ResultSet rs;
                 rs = null;
                 try {
                     Class.forName("com.mysql.cj.jdbc.Driver");
                      con=DriverManager.getConnection("jdbc:mysql://localhost:3360/event_management","root","jeevan@123");
                      pst =con.prepareStatement("select food from events where Eid=?");
                      pst.setString(1,txteid.getText());
                      rs = pst.executeQuery();
                          while(rs.next()){
                            // System.out.println("veg" + rs.getString("food"));
                            //String food1 = rs.getString("food");
                            if ( "veg".equals(rs.getString("food")))
                                 JOptionPane.showMessageDialog(this,"TOTAL BILL IS 15000 RS\n" + "THANK YOU FOR BOOKING\n");
                            else if("nonveg".equals(rs.getString("food")))
                                 JOptionPane.showMessageDialog(this,"TOTAL BILL IS 18000 RS\n" + "THANK YOU FOR BOOKING\n");
                            else if("veg and nonveg".equals(rs.getString("food")))
                                JOptionPane.showMessageDialog(this,"TOTAL BILL IS 22000 RS\n" + "THANK YOU FOR BOOKING\n");
                            else
                                
                JOptionPane.showMessageDialog(this,"TOTAL BILL IS 10000 RS\n" + "THANK YOU FOR BOOKING\n");
                                   
                          }// if (food != null) switch (food) {
                      //case "veg" -> JOptionPane.showMessageDialog(this,"10000");
                      //case "nonveg" -> JOptionPane.showMessageDialog(this,"15000");
                      //case "veg_nonveg" -> JOptionPane.showMessageDialog(this,"20000");
                      //default -> JOptionPane.showMessageDialog(this,"select proper option");
                 // } else {
                   
                 
                 } catch (ClassNotFoundException | SQLException ex) {
                     Logger.getLogger(bill.class.getName()).log(Level.SEVERE, null, ex);
                 }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
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
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
       }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txteid;
    // End of variables declaration//GEN-END:variables
}