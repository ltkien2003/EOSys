/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.eos.ui;

import java.awt.Color;

/**
 *
 * @author Admin
 */
public class XemCauHoiJDialog extends javax.swing.JDialog {

    /**
     * Creates new form XemCauHoiJDialog
     */
    public XemCauHoiJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.white);

    }

    public XemCauHoiJDialog(java.awt.Frame parent, boolean modal, String maCH, String tenCH, String PA1, String PA2, String PA3, String PA4, String dapAn) {
        super(parent, modal);
        initComponents();
        getContentPane().setBackground(Color.white);
        jLabel3.setText("<html><div style=\"padding: 4px;\"><prev>" + "Câu hỏi " + maCH + "</prev><div></html>");
        jLabel2.setText("<html><div style=\"padding: 10px;\"><prev>" + tenCH + "</prev><div></html>");
        rdoPA1.setText("<html><div style=\"padding: 10px;\"><prev>" + PA1 + "</prev><div></html>");
        rdoPA2.setText("<html><div style=\"padding: 10px;\"><prev>" + PA2 + "</prev><div></html>");
        rdoPA3.setText("<html><div style=\"padding: 10px;\"><prev>" + PA3 + "</prev><div></html>");
        rdoPA4.setText("<html><div style=\"padding: 10px;\"><prev>" + PA4 + "</prev><div></html>");
        if (PA1.equals(dapAn)) {
            rdoPA1.setSelected(true);
        } else if (PA2.equals(dapAn)) {
            rdoPA2.setSelected(true);
        } else if (PA3.equals(dapAn)) {
            rdoPA3.setSelected(true);
        } else if (PA4.equals(dapAn)) {
            rdoPA4.setSelected(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        rdoPA1 = new javax.swing.JRadioButton();
        rdoPA2 = new javax.swing.JRadioButton();
        rdoPA3 = new javax.swing.JRadioButton();
        rdoPA4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EOSys - Xem câu hỏi");
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setAlignmentX(20.0F);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(4, 0, 0, 15));

        rdoPA1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoPA1);
        rdoPA1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoPA1.setText("jRadioButton1");
        rdoPA1.setEnabled(false);
        rdoPA1.setFocusable(false);
        rdoPA1.setIconTextGap(10);
        rdoPA1.setMaximumSize(new java.awt.Dimension(121, 35));
        rdoPA1.setMinimumSize(new java.awt.Dimension(121, 35));
        rdoPA1.setPreferredSize(new java.awt.Dimension(121, 35));
        jPanel1.add(rdoPA1);

        rdoPA2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoPA2);
        rdoPA2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoPA2.setText("jRadioButton2");
        rdoPA2.setEnabled(false);
        rdoPA2.setFocusable(false);
        rdoPA2.setIconTextGap(10);
        rdoPA2.setMaximumSize(new java.awt.Dimension(121, 35));
        rdoPA2.setMinimumSize(new java.awt.Dimension(121, 35));
        rdoPA2.setPreferredSize(new java.awt.Dimension(121, 35));
        jPanel1.add(rdoPA2);

        rdoPA3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoPA3);
        rdoPA3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoPA3.setText("jRadioButton3");
        rdoPA3.setEnabled(false);
        rdoPA3.setFocusable(false);
        rdoPA3.setIconTextGap(10);
        rdoPA3.setMaximumSize(new java.awt.Dimension(121, 35));
        rdoPA3.setMinimumSize(new java.awt.Dimension(121, 35));
        rdoPA3.setPreferredSize(new java.awt.Dimension(121, 35));
        jPanel1.add(rdoPA3);

        rdoPA4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rdoPA4);
        rdoPA4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdoPA4.setText("jRadioButton4");
        rdoPA4.setEnabled(false);
        rdoPA4.setFocusable(false);
        rdoPA4.setIconTextGap(10);
        rdoPA4.setMaximumSize(new java.awt.Dimension(121, 35));
        rdoPA4.setMinimumSize(new java.awt.Dimension(121, 35));
        rdoPA4.setPreferredSize(new java.awt.Dimension(121, 35));
        jPanel1.add(rdoPA4);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 103, 192));
        jLabel3.setText("Câu hỏi 1 of 40");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(190, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XemCauHoiJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemCauHoiJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemCauHoiJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemCauHoiJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                XemCauHoiJDialog dialog = new XemCauHoiJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rdoPA1;
    private javax.swing.JRadioButton rdoPA2;
    private javax.swing.JRadioButton rdoPA3;
    private javax.swing.JRadioButton rdoPA4;
    // End of variables declaration//GEN-END:variables
}