/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package learnjava;

import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class MayTinhBoTui extends javax.swing.JFrame {
    String tb ="";
    int value1 = 0;
    String command ="";
    /**
     * Creates new form MayTinhBoTui
     */
    public MayTinhBoTui() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tbHienThi = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btCong = new javax.swing.JButton();
        btSqrt = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btTru = new javax.swing.JButton();
        btPhanTram = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btNhan = new javax.swing.JButton();
        btMotPhanX = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btCongTru = new javax.swing.JButton();
        btClear = new javax.swing.JButton();
        btChia = new javax.swing.JButton();
        btBang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 204, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(252, 236, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 255)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("CASIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, -1, -1));

        tbHienThi.setEditable(false);
        tbHienThi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbHienThi.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tbHienThi.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tbHienThi.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tbHienThi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, 430, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 450, 70));

        jPanel2.setBackground(new java.awt.Color(249, 226, 226));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), new java.awt.Color(51, 51, 51), null));
        jPanel2.setLayout(new java.awt.GridLayout(4, 5, 10, 10));

        bt7.setBackground(new java.awt.Color(255, 204, 204));
        bt7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt7);

        bt8.setBackground(new java.awt.Color(255, 204, 204));
        bt8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt8);

        bt9.setBackground(new java.awt.Color(255, 204, 204));
        bt9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt9);

        btCong.setBackground(new java.awt.Color(255, 204, 204));
        btCong.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCong.setText("+");
        btCong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCongActionPerformed(evt);
            }
        });
        jPanel2.add(btCong);

        btSqrt.setBackground(new java.awt.Color(255, 204, 204));
        btSqrt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btSqrt.setText("sqrt");
        jPanel2.add(btSqrt);

        bt4.setBackground(new java.awt.Color(255, 204, 204));
        bt4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt4);

        bt5.setBackground(new java.awt.Color(255, 204, 204));
        bt5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt5);

        bt6.setBackground(new java.awt.Color(255, 204, 204));
        bt6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt6);

        btTru.setBackground(new java.awt.Color(255, 204, 204));
        btTru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btTru.setText("-");
        btTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCongActionPerformed(evt);
            }
        });
        jPanel2.add(btTru);

        btPhanTram.setBackground(new java.awt.Color(255, 204, 204));
        btPhanTram.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btPhanTram.setText("%");
        jPanel2.add(btPhanTram);

        bt1.setBackground(new java.awt.Color(255, 204, 204));
        bt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt1);

        bt2.setBackground(new java.awt.Color(255, 204, 204));
        bt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt2);

        bt3.setBackground(new java.awt.Color(255, 204, 204));
        bt3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt3);

        btNhan.setBackground(new java.awt.Color(255, 204, 204));
        btNhan.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btNhan.setText("*");
        btNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCongActionPerformed(evt);
            }
        });
        jPanel2.add(btNhan);

        btMotPhanX.setBackground(new java.awt.Color(255, 204, 204));
        btMotPhanX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btMotPhanX.setText("1/x");
        jPanel2.add(btMotPhanX);

        bt0.setBackground(new java.awt.Color(255, 204, 204));
        bt0.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNumberActionPerformed(evt);
            }
        });
        jPanel2.add(bt0);

        btCongTru.setBackground(new java.awt.Color(255, 204, 204));
        btCongTru.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btCongTru.setText("+/-");
        btCongTru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCongTruActionPerformed(evt);
            }
        });
        jPanel2.add(btCongTru);

        btClear.setBackground(new java.awt.Color(255, 153, 153));
        btClear.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btClear.setText("C");
        btClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClearActionPerformed(evt);
            }
        });
        jPanel2.add(btClear);

        btChia.setBackground(new java.awt.Color(255, 204, 204));
        btChia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btChia.setText("/");
        btChia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCongActionPerformed(evt);
            }
        });
        jPanel2.add(btChia);

        btBang.setBackground(new java.awt.Color(255, 153, 153));
        btBang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btBang.setText("=");
        btBang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBangActionPerformed(evt);
            }
        });
        jPanel2.add(btBang);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 450, 270));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNumberActionPerformed
        // TODO add your handling code here:
        if(tb.length()<=10){
            tb+= evt.getActionCommand();
        if(tb.length() == 1 && tb.equals("0")){
            tb = "";
        }
        tbHienThi.setText(tb);
        }
        else{
            JOptionPane.showMessageDialog(this, "Ðô dài dat tôi da");
        }
    }//GEN-LAST:event_btNumberActionPerformed

    private void btCongTruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCongTruActionPerformed
        // TODO add your handling code here:
        int value = Integer.parseInt(tbHienThi.getText());
        //Dao dau
        value = -value;
        tb = String.valueOf(value);
        tbHienThi.setText(String.valueOf(value));
        
    }//GEN-LAST:event_btCongTruActionPerformed

    private void btClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClearActionPerformed
        // TODO add your handling code here:
        Clear();
//                value1 = Integer.parseInt(tbHienThi.getText());
//        command = evt.getActionCommand();
//        Clear();
    }//GEN-LAST:event_btClearActionPerformed

    private void btBangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBangActionPerformed
        // TODO add your handling code here:
        int value2 = Integer.parseInt(tbHienThi.getText());
        int kq = 0;
        if(command == "+"){
            kq = value1 + value2;
        }
        else if(command == "-"){
            kq = value1 - value2;
        }
        else if(command == "*"){
            kq = value1 * value2;
        }
        else if(command == "/"){
            kq = value1 / value2;
        }
        else{
            //Xu ly ngoai le
        }
        tb=String.valueOf(kq);
        tbHienThi.setText(tb);
    }//GEN-LAST:event_btBangActionPerformed

    private void btCongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCongActionPerformed
        // TODO add your handling code here:
        value1 = Integer.parseInt(tbHienThi.getText());
        command = evt.getActionCommand();
        Clear();
    }//GEN-LAST:event_btCongActionPerformed

    private void Clear(){
        tb="";
        tbHienThi.setText(tb);
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MayTinhBoTui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayTinhBoTui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayTinhBoTui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayTinhBoTui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MayTinhBoTui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btBang;
    private javax.swing.JButton btChia;
    private javax.swing.JButton btClear;
    private javax.swing.JButton btCong;
    private javax.swing.JButton btCongTru;
    private javax.swing.JButton btMotPhanX;
    private javax.swing.JButton btNhan;
    private javax.swing.JButton btPhanTram;
    private javax.swing.JButton btSqrt;
    private javax.swing.JButton btTru;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField tbHienThi;
    // End of variables declaration//GEN-END:variables
}