
package ticketbooking;

import java.awt.Dialog;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ImageIcon;


public class book extends javax.swing.JDialog {

    public static Date date;
    public static int time;
    public static String audi;
    public static String timing;
    public static String name;
    
    int y,y1;
    int i=0;
    int z,z1;
    ImageIcon[] k;
    String[] r;
    int index=0;
    public book() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Book Movie Ticket");
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbook","root","root");
            PreparedStatement smt=cn.prepareStatement("select count(distinct name) from movies1");
            ResultSet rs=smt.executeQuery();
            rs.next();
            z=rs.getInt(1);
            smt=cn.prepareStatement("select count(*) from movies1 where name=''");
            rs=smt.executeQuery();
            rs.next();
            int x=rs.getInt(1);
            if(x!=0){
                z--;
            }
            y=z;
            smt=cn.prepareStatement("select count(distinct name) from movies2");
            rs=smt.executeQuery();
            rs.next();
            z1=rs.getInt(1);
            smt=cn.prepareStatement("select count(*) from movies2 where name=''");
            rs=smt.executeQuery();
            rs.next();
            x=rs.getInt(1);
            if(x!=0){
                z1--;
            }
            y1=z1;
            
            k=new ImageIcon[z+z1];
            r=new String[z+z1];
            ImageIcon a;
            smt=cn.prepareStatement("select distinct name from movies1");
            rs=smt.executeQuery();
            rs.next();
            String s;
            while(z!=0){
                z--;
                s=rs.getString(1);
                if(s.equals("")){
                    rs.next();
                    s=rs.getString(1);
                }
                r[index]=s;
                rs.next();
                a=new ImageIcon("/Picture/ticketbook/"+s+".jpg");
                k[index]=a;
                index++;
            }
            
            smt=cn.prepareStatement("select distinct name from movies2");
            rs=smt.executeQuery();
            rs.next();
           // String s;
            while(z1!=0){
                z1--;
                s=rs.getString(1);
                if(s.equals("")){
                    rs.next();
                    s=rs.getString(1);
                }
                r[index]=s;
                rs.next();
                a=new ImageIcon("/Picture/ticketbook/"+s+".jpg");
                k[index]=a;
                index++;
            }
            
            p.setIcon(k[0]);
            String pp;
            if(y==0){
                pp="movies2";
            }
            else{
                pp="movies1";
            }
            smt=cn.prepareStatement("select date from "+pp+" where name=?");
            smt.setString(1, r[0]);
            rs=smt.executeQuery();
            while(rs.next())
            {
                Date l=rs.getDate(1);
                c1.addItem(l);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        this.setModal (true);
        
        this.setModalityType (Dialog.ModalityType.APPLICATION_MODAL);
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        c1 = new javax.swing.JComboBox();
        c2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        p = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setText("Select Date");

        jLabel3.setText("Select Time");

        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "11:00 AM", "3:30 PM", "8:00 PM" }));

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText(">");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("<");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(c2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jButton3)
                .addGap(42, 42, 42))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jButton4)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        date= (Date) c1.getSelectedItem();
        time=c2.getSelectedIndex();
        timing=(String) c2.getSelectedItem();
        name=r[i];
        if(i>=0 && i<y){
            audi="audi1";
        }
        else if(i>=y && i<(y+y1)){
            audi="audi2";
        }
        this.dispose();
        bookseat o=new bookseat();
        o.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        i++;
        if(i==(y+y1)){
            i=0;
        }
        p.setIcon(k[i]);
        c1.removeAllItems();
        String ss="";
        if(i>=0 && i<y){
            ss="movies1";
        }
        else if(i>=y && i<(y+y1)){
            ss="movies2";
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbook","root","root");
            
            PreparedStatement smt=cn.prepareStatement("select date from "+ss+" where name=?");
            smt.setString(1, r[i]);
            ResultSet rs=smt.executeQuery();
            while(rs.next())
            {
                Date l=rs.getDate(1);
                c1.addItem(l);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        //System.out.println(s);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        i--;
        if(i==-1){
            i=(y+y1-1);
        }
        p.setIcon(k[i]);
        c1.removeAllItems();
        String ss="";
        if(i>=0 && i<y){
            ss="movies1";
        }
        else if(i>=y && i<(y+y1)){
            ss="movies2";
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbook","root","root");
            
            PreparedStatement smt=cn.prepareStatement("select date from "+ss+" where name=?");
            smt.setString(1, r[i]);
            ResultSet rs=smt.executeQuery();
            while(rs.next())
            {
                Date l=rs.getDate(1);
                c1.addItem(l);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(book.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new book().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox c1;
    private javax.swing.JComboBox c2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel p;
    // End of variables declaration//GEN-END:variables
}
