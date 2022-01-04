
package ticketbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Calendar;


public class mainwindow extends javax.swing.JDialog {

   
    public mainwindow() {
        initComponents();
        updateAudi();
        updateMovies();
    /*    try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                     SwingUtilities.updateComponentTreeUI(this);
        }
        catch(Exception e){
            System.out.println(e);
            
        }*/
        this.setModal (true);
        
        this.setModalityType (ModalityType.APPLICATION_MODAL);
        this.setTitle("Movie ticket booking");
        this.setLocationRelativeTo(null);
        this.setSize(581, 294);
        
    }
    
    final void updateAudi()
    {
        Calendar a=Calendar.getInstance();
        int aa1=a.get(Calendar.DATE);
        String s=aa1+"a";
        String gg="";
        int xx=2;
        while(xx!=0){
            try{
                if(xx==2){
                    gg="audi1";
                }
                else if(xx==1){
                    gg="audi2";
                }
                Class.forName("com.mysql.jdbc.Driver");
                Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbook","root","root");

                PreparedStatement ps=cn.prepareStatement("select * from "+gg);  
                ResultSet rs=ps.executeQuery(); 

                ResultSetMetaData k=rs.getMetaData();
                int y=k.getColumnCount();
                if(y>1){
                    String g=k.getColumnName(2);
                    while(!s.equals(g)){
                        String h="alter table "+gg+" drop column "+g;
                        ps=cn.prepareStatement(h);
                        ps.executeUpdate();
                        ps=cn.prepareStatement("select * from "+gg);  
                        rs=ps.executeQuery(); 
                        k=rs.getMetaData();
                        y=k.getColumnCount();
                        if(y>1){
                            g=k.getColumnName(2);
                        }
                        else {
                            break;
                        }
                    }
                }
                ps=cn.prepareStatement("select * from "+gg);  
                    rs=ps.executeQuery(); 
                    k=rs.getMetaData();

                int p=k.getColumnCount();
                int x=p-1;
                p=8-p;
                while(p!=0)
                {
                    a=Calendar.getInstance();
                    a.add(Calendar.DATE, x);
                    aa1=a.get(Calendar.DATE);
                    String ss=aa1+"a";
                    String h="alter table " +gg +" add column "+ss+" varchar(3) default '000'";
                    ps=cn.prepareStatement(h);
                    ps.executeUpdate();
                    x++;
                    p--;
                }

            }
            catch(Exception e)
            {
                System.out.println(e);
            }
            xx--;
        }
    }
    
    final void updateMovies()
    {
       java.util.Date u = new java.util.Date();
       java.sql.Date s = new java.sql.Date(u.getTime());
       String aa=s.toString();
       String gg="";
       int xx=2;
       while(xx!=0){ 
        try{
            if(xx==2){
                gg="movies1";
            }
            else if(xx==1){
                gg="movies2";
            }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ticketbook","root","root");
            
            PreparedStatement ps=con.prepareStatement("select date from "+gg);  
            ResultSet rs=ps.executeQuery();
            if(rs.next())
            {    
                java.sql.Date s1=rs.getDate(1);
                String bb=s1.toString();
                
                while(!aa.equals(bb))
                {
                    String h="delete from "+gg+" where date='"+s1+"'";
                    ps=con.prepareStatement(h);
                    ps.executeUpdate();
                    ps=con.prepareStatement("select date from "+gg);  
                    rs=ps.executeQuery();
                    if(rs.next()) {
                        s1=rs.getDate(1);
                        bb=s1.toString();
                    }
                    else {
                        break;
                    }
                }    
            }

            ps=con.prepareStatement("select count(*) from "+gg);  
            rs=ps.executeQuery(); 
            rs.next();
            int p=rs.getInt(1);
            int x=p;
            p=7-p;
            while(p!=0)
            {
                Calendar a=Calendar.getInstance();
                a.add(Calendar.DATE, x);
                u=a.getTime();
                s = new java.sql.Date(u.getTime());
                ps=con.prepareStatement("insert into "+gg+" values(?,?)");
                ps.setString(1, "");
                ps.setDate(2, s);
                ps.executeUpdate();
                x++;
                p--;
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        xx--;
      }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 204));
        jButton2.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 0, 0));
        jButton2.setText("Add Movie");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 140, 150, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setFont(new java.awt.Font("Aharoni", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Book Movie");
        jButton1.setOpaque(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 160, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myicons/butterfly.jpeg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        book b=new book();
        b.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addmovie c=new addmovie();
        c.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainwindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                mainwindow o=new mainwindow();
                o.setVisible(true);
                
                
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
