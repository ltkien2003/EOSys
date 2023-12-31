package com.eos.ui;

import com.eos.dao.KhoaHocDAO;
import com.eos.model.KhoaHoc;
import com.eos.untils.MsgBox;
import com.eos.untils.XImage;
import com.eos.untils.Auth;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
/**
 *
 * @author Admin
 */
public class VaoHocJDialog extends javax.swing.JDialog {

    /**
     * Creates new form ThamGiaKHJDialog
     */
    JFileChooser fileChooser = new JFileChooser();
    KhoaHocDAO khdao = new KhoaHocDAO();
    int row = -1;

    public VaoHocJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    void init() {
        getRootPane().setOpaque(false);
        getContentPane().setBackground(Color.white);
        setBackground(Color.white);
        txtMaKH.requestFocus();
        btnTabDanhSach.doClick();
        tblKhoaHoc.getTableHeader().setFont(new Font("Segoe UI", Font.PLAIN, 13));
        tblKhoaHoc.getTableHeader().setForeground(Color.white);
        tblKhoaHoc.getTableHeader().setOpaque(false);
        tblKhoaHoc.getTableHeader().setBackground(new Color(0, 103, 192));
        tblKhoaHoc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.fillTable();
        canGiua();
        lblHinh.setToolTipText("no-image.png");
        lblHinh.setIcon(new ImageIcon(new ImageIcon(XImage.read("no-image.png").toString()).getImage().getScaledInstance(185, 188, Image.SCALE_DEFAULT)));
    }

    void setForm(KhoaHoc kh) {
        txtMaKH.setText(String.valueOf(kh.getMaKH()));
        txtTenKH.setText(kh.getTenKH());
        txtHocPhi.setText(String.valueOf(kh.getHocPhi()));
        txtTongSoChuong.setText(String.valueOf(kh.getTongSoChuong()));
        if (kh.getHinh() != null) {
            lblHinh.setToolTipText(kh.getHinh());
            ImageIcon icon = new ImageIcon(XImage.read(kh.getHinh()).getImage().getScaledInstance(185, 188, Image.SCALE_DEFAULT));
            lblHinh.setIcon(icon);
        }
    }

    void edit() {
        int maKH = (int) tblKhoaHoc.getValueAt(this.row, 0);
        KhoaHoc kh = khdao.selectById(maKH);
        this.setForm(kh);
        btnTabCapNhat.doClick();
    }

    void canGiua() {
        TableCellRenderer rendererFromHeader = tblKhoaHoc.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        tblKhoaHoc.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tblKhoaHoc.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        tblKhoaHoc.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tblKhoaHoc.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhoaHoc.getModel();
        model.setRowCount(0);
        try {
            List<KhoaHoc> list = khdao.selectByJoined(Auth.user1.getMaND());
            for (KhoaHoc kh : list) {
                Object[] row = {kh.getMaKH(), kh.getTenKH(), kh.getHocPhi(), kh.getTongSoChuong()};
                model.addRow(row);
            }

        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
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

        btnTabCapNhat = new javax.swing.JButton();
        btnTabDanhSach = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblTenCD = new javax.swing.JLabel();
        btnVaoHoc = new javax.swing.JButton();
        lblThoiLuong = new javax.swing.JLabel();
        lblHocPhi = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtHocPhi = new javax.swing.JTextField();
        txtTongSoChuong = new javax.swing.JTextField();
        lblHinh = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMaCD = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EOSys - Vào học");

        btnTabCapNhat.setBackground(new java.awt.Color(255, 255, 255));
        btnTabCapNhat.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTabCapNhat.setForeground(new java.awt.Color(177, 177, 177));
        btnTabCapNhat.setText("Tham gia");
        btnTabCapNhat.setBorder(null);
        btnTabCapNhat.setContentAreaFilled(false);
        btnTabCapNhat.setFocusable(false);
        btnTabCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabCapNhatActionPerformed(evt);
            }
        });

        btnTabDanhSach.setBackground(new java.awt.Color(255, 255, 255));
        btnTabDanhSach.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnTabDanhSach.setForeground(new java.awt.Color(177, 177, 177));
        btnTabDanhSach.setText("Danh sách");
        btnTabDanhSach.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnTabDanhSach.setContentAreaFilled(false);
        btnTabDanhSach.setFocusable(false);
        btnTabDanhSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTabDanhSachActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblTenCD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblTenCD.setText("Tên khóa học");

        btnVaoHoc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        btnVaoHoc.setText("Vào học");
        btnVaoHoc.setFocusable(false);
        btnVaoHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaoHocActionPerformed(evt);
            }
        });

        lblThoiLuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblThoiLuong.setText("Tổng số chương");

        lblHocPhi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblHocPhi.setText("Học phí");

        txtMaKH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMaKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 177, 177)));
        txtMaKH.setEnabled(false);
        txtMaKH.setOpaque(false);
        txtMaKH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtMaKHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaKHFocusLost(evt);
            }
        });

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTenKH.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 177, 177)));
        txtTenKH.setEnabled(false);
        txtTenKH.setOpaque(false);
        txtTenKH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTenKHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTenKHFocusLost(evt);
            }
        });

        txtHocPhi.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtHocPhi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 177, 177)));
        txtHocPhi.setEnabled(false);
        txtHocPhi.setOpaque(false);
        txtHocPhi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtHocPhiFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtHocPhiFocusLost(evt);
            }
        });

        txtTongSoChuong.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtTongSoChuong.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(177, 177, 177)));
        txtTongSoChuong.setEnabled(false);
        txtTongSoChuong.setOpaque(false);
        txtTongSoChuong.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTongSoChuongFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTongSoChuongFocusLost(evt);
            }
        });

        lblHinh.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblHinh.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 103, 192)));
        lblHinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblHinhMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Hình logo");

        lblMaCD.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblMaCD.setText("Mã khóa học");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lblHinh, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaKH)
                            .addComponent(txtTenKH)
                            .addComponent(txtHocPhi)
                            .addComponent(txtTongSoChuong)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblThoiLuong)
                                    .addComponent(lblHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblMaCD, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 305, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnVaoHoc)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblMaCD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(lblTenCD)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblHocPhi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblThoiLuong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTongSoChuong, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblHinh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVaoHoc)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, "card2");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        tblKhoaHoc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ KH", "TÊN KH", "HỌC PHÍ", "TỔNG SỐ CHƯƠNG"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblKhoaHoc.setGridColor(new java.awt.Color(177, 177, 177));
        tblKhoaHoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhoaHocMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblKhoaHoc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 599, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnTabDanhSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTabCapNhat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTabCapNhat)
                    .addComponent(btnTabDanhSach))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTabCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabCapNhatActionPerformed
        btnTabCapNhat.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 103, 192)),
                BorderFactory.createEmptyBorder(5, 20, 10, 20)));
        btnTabCapNhat.setForeground(new Color(0, 103, 192));
        btnTabDanhSach.setBorder(null);
        btnTabDanhSach.setForeground(new Color(177, 177, 177));
        CardLayout layout = (CardLayout) jPanel1.getLayout();
        layout.first(jPanel1);
    }//GEN-LAST:event_btnTabCapNhatActionPerformed

    private void btnTabDanhSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTabDanhSachActionPerformed
        btnTabDanhSach.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 103, 192)),
                BorderFactory.createEmptyBorder(5, 20, 10, 20)));
        btnTabDanhSach.setForeground(new Color(0, 103, 192));
        btnTabCapNhat.setBorder(null);
        btnTabCapNhat.setForeground(new Color(177, 177, 177));
        CardLayout layout = (CardLayout) jPanel1.getLayout();
        layout.show(jPanel1, "card3");
    }//GEN-LAST:event_btnTabDanhSachActionPerformed

    private void btnVaoHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaoHocActionPerformed
        if (txtMaKH.getText().trim().equals("")) {

        } else {
            int maKH = Integer.parseInt(txtMaKH.getText().trim());
            dispose();
            new HocOnlineJDialog(maKH).setVisible(true);
        }
    }//GEN-LAST:event_btnVaoHocActionPerformed

    private void txtMaKHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaKHFocusGained
        txtMaKH.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 103, 192)));
    }//GEN-LAST:event_txtMaKHFocusGained

    private void txtMaKHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaKHFocusLost
        txtMaKH.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(177, 177, 177)));
    }//GEN-LAST:event_txtMaKHFocusLost

    private void txtTenKHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenKHFocusGained
        txtTenKH.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 103, 192)));
    }//GEN-LAST:event_txtTenKHFocusGained

    private void txtTenKHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTenKHFocusLost
        txtTenKH.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(177, 177, 177)));
    }//GEN-LAST:event_txtTenKHFocusLost

    private void txtHocPhiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHocPhiFocusGained
        txtHocPhi.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 103, 192)));
    }//GEN-LAST:event_txtHocPhiFocusGained

    private void txtHocPhiFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtHocPhiFocusLost
        txtHocPhi.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(177, 177, 177)));
    }//GEN-LAST:event_txtHocPhiFocusLost

    private void txtTongSoChuongFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTongSoChuongFocusGained
        txtTongSoChuong.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(0, 103, 192)));
    }//GEN-LAST:event_txtTongSoChuongFocusGained

    private void txtTongSoChuongFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTongSoChuongFocusLost
        txtTongSoChuong.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(177, 177, 177)));
    }//GEN-LAST:event_txtTongSoChuongFocusLost

    private void lblHinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHinhMouseClicked
    }//GEN-LAST:event_lblHinhMouseClicked

    private void tblKhoaHocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhoaHocMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblKhoaHoc.getSelectedRow();
            this.edit();
            btnTabCapNhat.doClick();
        }
    }//GEN-LAST:event_tblKhoaHocMouseClicked

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
            java.util.logging.Logger.getLogger(VaoHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaoHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaoHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaoHocJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VaoHocJDialog dialog = new VaoHocJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnTabCapNhat;
    private javax.swing.JButton btnTabDanhSach;
    private javax.swing.JButton btnVaoHoc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHinh;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblMaCD;
    private javax.swing.JLabel lblTenCD;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTongSoChuong;
    // End of variables declaration//GEN-END:variables
}
