
package ticketbooking;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JToggleButton;


public class bookseat extends javax.swing.JDialog {

    
    Date d;
    int t;
    String w;
    public static String s="";
    public static int amt=0;
    
    public bookseat() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Select seats");
        d=book.date;
        t=book.time;
        w=book.audi;
        JToggleButton[] l={S1,S2,S3,S4,S5,G1,G2,G3,G4,G5,P1,P2,P3,P4,P5};
        int i=d.getDate();
        String u=i+"a";
        String v;
        char c;
      //  P1.setEnabled(false);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbook","root","root");
            PreparedStatement smt;
            ResultSet rs;
            int x=0;
            while(x!=15){
                smt=cn.prepareStatement("select "+ u + " from "+w+" where seatNo=?");
                smt.setString(1, l[x].getText());
                rs=smt.executeQuery();
                rs.next();
                v=rs.getString(1);
                c=v.charAt(t);
                if(c=='1'){
                    l[x].setEnabled(false);
                }
                x++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        this.setModal (true);
        
        this.setModalityType (ModalityType.APPLICATION_MODAL);
    }
    
    void fun()
    {
        JToggleButton[] l={S1,S2,S3,S4,S5,G1,G2,G3,G4,G5,P1,P2,P3,P4,P5};
        s="";
        int k=0;
        while(k!=15){
            if(l[k].isSelected())
            {
                s=s+l[k].getText()+", ";
            }
            k++;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton2 = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        S1 = new javax.swing.JToggleButton();
        S2 = new javax.swing.JToggleButton();
        G2 = new javax.swing.JToggleButton();
        G1 = new javax.swing.JToggleButton();
        P1 = new javax.swing.JToggleButton();
        P2 = new javax.swing.JToggleButton();
        jSeparator4 = new javax.swing.JSeparator();
        b1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        l1 = new javax.swing.JLabel();
        S4 = new javax.swing.JToggleButton();
        S3 = new javax.swing.JToggleButton();
        G4 = new javax.swing.JToggleButton();
        G3 = new javax.swing.JToggleButton();
        G5 = new javax.swing.JToggleButton();
        S5 = new javax.swing.JToggleButton();
        P3 = new javax.swing.JToggleButton();
        P4 = new javax.swing.JToggleButton();
        P5 = new javax.swing.JToggleButton();

        jToggleButton2.setText("jToggleButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Select Seat Availaiblity");

        jLabel2.setText("Silver (Rs. 150)");

        jLabel3.setText("Gold (Rs. 200)");

        jLabel4.setText("Platinum (Rs. 250)");

        S1.setText("S1");
        S1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S1ActionPerformed(evt);
            }
        });

        S2.setText("S2");
        S2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S2ActionPerformed(evt);
            }
        });

        G2.setText("G2");
        G2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G2ActionPerformed(evt);
            }
        });

        G1.setText("G1");
        G1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G1ActionPerformed(evt);
            }
        });

        P1.setText("P1");
        P1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1ActionPerformed(evt);
            }
        });

        P2.setText("P2");
        P2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2ActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        b1.setText("Next");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setText("Your seats :");

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        S4.setText("S4");
        S4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S4ActionPerformed(evt);
            }
        });

        S3.setText("S3");
        S3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S3ActionPerformed(evt);
            }
        });

        G4.setText("G4");
        G4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G4ActionPerformed(evt);
            }
        });

        G3.setText("G3");
        G3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G3ActionPerformed(evt);
            }
        });

        G5.setText("G5");
        G5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                G5ActionPerformed(evt);
            }
        });

        S5.setText("S5");
        S5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                S5ActionPerformed(evt);
            }
        });

        P3.setText("P3");
        P3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3ActionPerformed(evt);
            }
        });

        P4.setText("P4");
        P4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4ActionPerformed(evt);
            }
        });

        P5.setText("P5");
        P5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
            .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, 461, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)
                                .addGap(61, 61, 61)
                                .addComponent(S1)
                                .addGap(29, 29, 29)
                                .addComponent(S2)
                                .addGap(29, 29, 29)
                                .addComponent(S3)
                                .addGap(29, 29, 29)
                                .addComponent(S4)
                                .addGap(35, 35, 35)
                                .addComponent(S5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(jLabel3)
                                .addGap(49, 49, 49)
                                .addComponent(G1)
                                .addGap(32, 32, 32)
                                .addComponent(G2)
                                .addGap(31, 31, 31)
                                .addComponent(G3)
                                .addGap(29, 29, 29)
                                .addComponent(G4)
                                .addGap(33, 33, 33)
                                .addComponent(G5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel4)
                                .addGap(48, 48, 48)
                                .addComponent(P1)
                                .addGap(33, 33, 33)
                                .addComponent(P2)
                                .addGap(30, 30, 30)
                                .addComponent(P3)
                                .addGap(31, 31, 31)
                                .addComponent(P4)
                                .addGap(29, 29, 29)
                                .addComponent(P5)))
                        .addGap(0, 71, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel1)
                .addContainerGap(228, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(179, 179, 179))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(S1)
                    .addComponent(S2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(S3)
                    .addComponent(S4)
                    .addComponent(S5))
                .addGap(36, 36, 36)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(G1)
                    .addComponent(G2)
                    .addComponent(jLabel3)
                    .addComponent(G3)
                    .addComponent(G4)
                    .addComponent(G5))
                .addGap(32, 32, 32)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(P1)
                    .addComponent(P2)
                    .addComponent(P3)
                    .addComponent(P4)
                    .addComponent(P5))
                .addGap(26, 26, 26)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(l1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b1, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_P2ActionPerformed

    private void S1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S1ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_S1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        
        JToggleButton[] l={S1,S2,S3,S4,S5,G1,G2,G3,G4,G5,P1,P2,P3,P4,P5};
        int i=d.getDate();
        String u=i+"a";
        int x=0;
        String v="";
        switch (t) {
            case 0:
                v="100";
                break;
            case 1:
                v="010";
                break;
            case 2:
                v="001";
                break;
        }
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbook","root","root");
            PreparedStatement smt;
            while(x!=15){
                if(l[x].isSelected())
                {
                    if(x>=0 && x<5){
                        amt=amt+150;
                    }
                    else if(x>=5 && x<10){
                        amt=amt+200;
                    }
                    else if(x>=10 && x<14){
                        amt=amt+250;
                    }
                    smt=cn.prepareStatement("update "+w+" set "+u+"=? where seatNo=?");
                    smt.setString(1, v);
                    smt.setString(2, l[x].getText());
                    smt.executeUpdate();
                }
                x++;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        this.dispose();
        bill o=new bill();
        o.setVisible(true);
        
        
    }//GEN-LAST:event_b1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        book b=new book();
        b.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void S2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S2ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_S2ActionPerformed

    private void G2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G2ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_G2ActionPerformed

    private void G1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G1ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_G1ActionPerformed

    private void P1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_P1ActionPerformed

    private void S4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S4ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_S4ActionPerformed

    private void S3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S3ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_S3ActionPerformed

    private void G4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G4ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_G4ActionPerformed

    private void G3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G3ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_G3ActionPerformed

    private void G5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_G5ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_G5ActionPerformed

    private void S5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_S5ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_S5ActionPerformed

    private void P3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_P3ActionPerformed

    private void P4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_P4ActionPerformed

    private void P5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P5ActionPerformed
        fun();
        l1.setText(s);
    }//GEN-LAST:event_P5ActionPerformed

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
            java.util.logging.Logger.getLogger(bookseat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bookseat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bookseat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bookseat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bookseat().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton G1;
    private javax.swing.JToggleButton G2;
    private javax.swing.JToggleButton G3;
    private javax.swing.JToggleButton G4;
    private javax.swing.JToggleButton G5;
    private javax.swing.JToggleButton P1;
    private javax.swing.JToggleButton P2;
    private javax.swing.JToggleButton P3;
    private javax.swing.JToggleButton P4;
    private javax.swing.JToggleButton P5;
    private javax.swing.JToggleButton S1;
    private javax.swing.JToggleButton S2;
    private javax.swing.JToggleButton S3;
    private javax.swing.JToggleButton S4;
    private javax.swing.JToggleButton S5;
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel l1;
    // End of variables declaration//GEN-END:variables
}
