/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package learnjava;


import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class Menu extends javax.swing.JFrame {
    DefaultListModel<String> model;
    int index_current;
    String ten_xe_current,so_xe_current;
    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        LoadCar();
    }
    public void LoadCar(){
        model = new DefaultListModel<>(){};
        
//        model.addElement("Rice");
//        model.addElement("Meat");
//        model.addElement("Noodle");
//          model.addElement(tbProduct_name.getText());
        String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=java_base_connect;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String pass = "admin";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql = "SELECT * FROM ql_xe";
            ResultSet rs = stmt.executeQuery(sql);
//            int c = stmt.executeUpdate(sql);
            while (rs.next()) {                
                model.addElement(rs.getString("ten_xe"));
            }
//            if(rs.next()){
//                lb_stt.setText("Them thanh cong");
//            }
//            else{
//                lb_stt.setText("Them That bai");
//            }
            //rs.close();
            stmt.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        jList1.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        tbProduct_name = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lb_stt = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tbSeri = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        jButton1.setBackground(new java.awt.Color(242, 242, 242));
        jButton1.setIcon(new javax.swing.ImageIcon("D:\\Java\\LearnJava\\src\\learnjava\\img\\icon-developer-icon.png")); // NOI18N
        jButton1.setText("Draw");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);
        jToolBar1.add(jSeparator2);
        jToolBar1.add(jSeparator4);

        jButton4.setBackground(new java.awt.Color(242, 242, 242));
        jButton4.setIcon(new javax.swing.ImageIcon("D:\\Java\\LearnJava\\src\\learnjava\\img\\Untitled.png")); // NOI18N
        jButton4.setText("Calc");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4jMenuItem1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton4);

        jPanel1.setToolTipText("");

        jList1.setToolTipText("");
        jList1.setName(""); // NOI18N
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);
        jList1.getAccessibleContext().setAccessibleName("");

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Product name");

        lb_stt.setText("Connect To SQL Server");

        jButton3.setText("Show all");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Seri");

        jLabel3.setText("Mau xe dang co");

        jButton5.setText("Edit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(lb_stt)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbSeri)
                            .addComponent(tbProduct_name)
                            .addComponent(jButton6))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tbProduct_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(tbSeri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_stt)
                .addGap(13, 13, 13))
        );

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("New project");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Open file");
        jMenu1.add(jMenuItem3);
        jMenu1.add(jSeparator1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("New file");
        jMenu1.add(jMenuItem2);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Open folder");
        jMenu1.add(jMenuItem4);

        jMenu5.setText("Option");

        jMenuItem5.setText("Menu1");
        jMenu5.add(jMenuItem5);

        jMenuItem6.setText("Menu2");
        jMenu5.add(jMenuItem6);

        jMenuItem7.setText("Menu3");
        jMenu5.add(jMenuItem7);

        jMenu1.add(jMenu5);

        jMenu6.setText("Color");

        jRadioButtonMenuItem1.setText("Red");
        jMenu6.add(jRadioButtonMenuItem1);

        jRadioButtonMenuItem2.setText("Green");
        jMenu6.add(jRadioButtonMenuItem2);

        jRadioButtonMenuItem3.setText("Blue");
        jMenu6.add(jRadioButtonMenuItem3);

        jMenu1.add(jMenu6);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem8.setText("Exit");
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("More");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem9.setText("Help");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
//        MayTinhBoTui mt = new MayTinhBoTui();
//        mt.setVisible(true);
        Color fcolor = new Color();
        fcolor.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
//        model = new DefaultListModel<>();
        
//        model.addElement(tbProduct_name.getText());
//          model.addElement(tbProduct_name.getText());
        String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=java_base_connect;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String pass = "admin";
        int i = 0;
        if (tbProduct_name.getText().trim().isBlank()||tbSeri.getText().trim().isBlank()){
            JOptionPane.showMessageDialog(this, "Khong duoc de trong thong tin!");
        }
        else{
            try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql = ("INSERT INTO ql_xe VALUES(N'"+tbProduct_name.getText().trim()+"','"+tbSeri.getText().trim()+"')");
            String sql_check = "SELECT * FROM ql_xe";
            ResultSet rs = stmt.executeQuery(sql_check);
            while (rs.next()) {                
                if (tbProduct_name.getText().trim().equals(rs.getString("ten_xe")) || tbSeri.getText().trim().equals(rs.getString("so_xe"))){
                    JOptionPane.showMessageDialog(this, "Mau xe da ton tai!");
                    i++;
                    rs.close();
                    break;
                }
            }
            
//            int c = stmt.executeUpdate(sql);
            if(i==0){
                int c = stmt.executeUpdate(sql);
                if(c>0){

                lb_stt.setText("Them thanh cong");
                model.addElement(tbProduct_name.getText().trim());
                }
                else{
                lb_stt.setText("Them That bai");
                }
            }

            //rs.close();
            stmt.close();
            con.close();
            } catch (Exception e) {
                e.printStackTrace();
    //            JOptionPane.showMessageDialog(this, "messbox error");
            }
        }
        
          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        ten_xe_current = jList1.getSelectedValue();
        tbProduct_name.setText(ten_xe_current);
        
//        jList1.getSelectedValue()
        String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=java_base_connect;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String pass = "admin";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            String sql = "SELECT so_xe FROM ql_xe WHERE ten_xe = N'"+jList1.getSelectedValue()+"'";
            ResultSet rs = stmt.executeQuery(sql);
            if(rs.next()){
                so_xe_current= rs.getString("so_xe").trim();
                tbSeri.setText(so_xe_current);
                stmt.close();
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
       
        index_current = jList1.getSelectedIndex();
    }//GEN-LAST:event_jList1ValueChanged

    private void jButton4jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4jMenuItem1ActionPerformed
        // TODO add your handling code here:
        MayTinhBoTui mt = new MayTinhBoTui();
        mt.setVisible(true);
    }//GEN-LAST:event_jButton4jMenuItem1ActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
        // TODO add your handling code here:
        Java_GiuaKy help = new Java_GiuaKy();
        help.setVisible(true);
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        Java_GiuaKy help = new Java_GiuaKy();
        help.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=java_base_connect;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String pass = "admin";
        int i = 0;
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            if (tbProduct_name.getText().isBlank()){
                JOptionPane.showMessageDialog(this, "Ban phai chon 1 mau xe");
            }
            else{
                String sql = "DELETE FROM ql_xe WHERE ten_xe = N'"+tbProduct_name.getText()+"'";
                int c = stmt.executeUpdate(sql);
                if(c>0){
                    lb_stt.setText("Xoa thanh cong");
                    model.removeElementAt(index_current);
                }
                else{
                    lb_stt.setText("Xoa That bai");
                }
                //rs.close();
                stmt.close();
                con.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "messbox error");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=java_base_connect;encrypt=true;trustServerCertificate=true;";
        String user = "sa";
        String pass = "admin";
        int i = 0;
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            Statement stmt = con.createStatement();
            if (tbProduct_name.getText().isBlank()){
                JOptionPane.showMessageDialog(this, "Ban phai chon 1 mau xe");
            }
            else{
                String sql = "update ql_xe set ten_xe = N'"+tbProduct_name.getText()+"' , so_xe = '"+
                tbSeri.getText()+"' where ten_xe = N'"+ten_xe_current+"'";
                int c = stmt.executeUpdate(sql);
                if(c>0){
                    lb_stt.setText("Doi thanh cong");
                    LoadCar();
                }
                else{
                    lb_stt.setText("Thay doi That bai");
                }
                //rs.close();
                stmt.close();
                con.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
//            JOptionPane.showMessageDialog(this, "messbox error");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        LoadCar();
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
        /* Connect to Sql server */
//        var server = "ADMIN\\SQLEXPRESS";
//        var user = "sa";
//        var pass = "admin";
//        var db = "java_base_connect";
//        var port = 1433;
//        SQLServerDataSource ds = new SQLServerDataSource();
//        ds.setUser(user);
//        ds.setPassword(pass);
//        ds.setDatabaseName(db);
//        ds.setServerName(server);
//        ds.setPortNumber(port);
//        String url = "jdbc:sqlserver://ADMIN\\SQLEXPRESS:1433;databaseName=java_base_connect;encrypt=true;trustServerCertificate=true;";
//        String user = "sa";
//        String pass = "admin";
//        try {
//            Connection con = DriverManager.getConnection(url, user, pass);
//            Statement stmt = con.createStatement();
//            String sql = "SELECT * FROM product";
//            ResultSet rs = stmt.executeQuery(sql);
//            if(rs.next()){
//                System.out.println("fff");
//            }
//            rs.close();
//            stmt.close();
//            con.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lb_stt;
    private javax.swing.JTextField tbProduct_name;
    private javax.swing.JTextField tbSeri;
    // End of variables declaration//GEN-END:variables
}
