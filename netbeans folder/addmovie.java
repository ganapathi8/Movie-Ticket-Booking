package ticketbooking;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.commons.io.FileUtils;
public class addmovie extends javax.swing.JDialog {
        
    
    public addmovie(){
        initComponents();
       Date d;
       Calendar a=Calendar.getInstance();
       d=a.getTime();
       n1.getMonthView().setLowerBound(d);
       n2.getMonthView().setLowerBound(d);
       a.add(Calendar.DATE, 6);
       d=a.getTime();
       n1.getMonthView().setUpperBound(d);
       n2.getMonthView().setUpperBound(d);
       
                this.setModal (true);
         //       this.setAlwaysOnTop (true);
                this.setModalityType (ModalityType.APPLICATION_MODAL);
                this.setTitle("Add Movie");
                this.setLocationRelativeTo(null);
    }
    JFileChooser f;
    int o;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        n1 = new org.jdesktop.swingx.JXDatePicker();
        n2 = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setText("Movie Name");

        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });

        jLabel2.setText("From date");

        jLabel3.setText("To date");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Auditorium");

        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Audi 1", "Audi 2" }));

        jButton2.setText("Choose movie poster (450 x 450)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(74, 74, 74)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jButton2))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jButton1)))
                .addContainerGap(268, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(t1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(n1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(n2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       String a=t1.getText();
       String b=(String)c1.getSelectedItem();
       Date d1 = n1.getDate();
       Date d2 = n2.getDate();
       int x=0;
       java.sql.Date s = new java.sql.Date(d1.getTime());
       java.sql.Date s2 = new java.sql.Date(d2.getTime());
       Calendar c=Calendar.getInstance();
       String rr="";
       if(b.equals("Audi 1")){
           rr="movies1";
       }
       else if(b.equals("Audi 2")){
           rr="movies2";
       }
       
       try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbook","root","root");
            PreparedStatement smt=cn.prepareStatement("select date from "+rr);
            ResultSet rs=smt.executeQuery();
            rs.next();
            Date d3=rs.getDate(1);
            java.sql.Date s3 = new java.sql.Date(d3.getTime());
            while(!s.toString().equals(s3.toString()))
            {
                rs.next();
                d3=rs.getDate(1);
                s3 = new java.sql.Date(d3.getTime());
                x++;
            }
            
            smt=cn.prepareStatement("update "+rr+" set name=? where date=?");
            c.add(Calendar.DATE, x);
            d1=c.getTime();
            s = new java.sql.Date(d1.getTime());
            smt.setString(1,a);
            smt.setDate(2, s);
            smt.executeUpdate();
            while(!s.toString().equals(s2.toString()))
            {
                c.add(Calendar.DATE, 1);
                d1=c.getTime();
                s = new java.sql.Date(d1.getTime());
                smt.setString(1,a);
                smt.setDate(2, s);
                smt.executeUpdate();
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
       if(o == JFileChooser.APPROVE_OPTION)
        {
            try{
                File n=f.getSelectedFile();
                //String bb=n.getName();
                File p=new File("/Picture/ticketbook",a+".jpg");
                FileUtils.copyFile(n,p);
                
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
       JOptionPane.showMessageDialog(this, "Submitted Successfully");
       this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void n1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_n1PropertyChange
        
        Date d = n1.getDate();
        n2.getMonthView().setLowerBound(d);       
    }//GEN-LAST:event_n1PropertyChange

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        f=new JFileChooser();
        o=f.showOpenDialog(this);
    }//GEN-LAST:event_jButton2ActionPerformed

   
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
            java.util.logging.Logger.getLogger(addmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addmovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                addmovie a=new addmovie();
                
                a.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private org.jdesktop.swingx.JXDatePicker n1;
    private org.jdesktop.swingx.JXDatePicker n2;
    private javax.swing.JTextField t1;
    // End of variables declaration//GEN-END:variables
}
