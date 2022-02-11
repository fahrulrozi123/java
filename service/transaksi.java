package service;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class transaksi extends javax.swing.JInternalFrame {

    public transaksi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        rdbuton = new javax.swing.ButtonGroup();
        radiobt = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        noknd = new javax.swing.JTextField();
        tgl = new javax.swing.JTextField();
        cbarea = new javax.swing.JComboBox<>();
        motor = new javax.swing.JRadioButton();
        mobil = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        hrg = new javax.swing.JTextField();
        cbsp = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        ongkos = new javax.swing.JTextField();
        total = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        setuju = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        bayar = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        kendala = new javax.swing.JTextField();
        cbmk = new javax.swing.JComboBox<>();
        batal = new javax.swing.JButton();
        pesan = new javax.swing.JButton();
        tf = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        user = new javax.swing.JMenuItem();
        pelanggan = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        out = new javax.swing.JMenuItem();
        keluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        transaksi = new javax.swing.JMenuItem();

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setForeground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Transaksi Service");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(243, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setForeground(new java.awt.Color(0, 153, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Transaksi Service");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setForeground(new java.awt.Color(0, 153, 153));

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

        jLabel18.setText("Nama");

        jLabel19.setText("No Kendraan");

        jLabel20.setText("Tanggal Service");

        jLabel21.setText("Jenis Kendaraan");

        jLabel22.setText("Area");

        cbarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Area--", "Tangerang", "Bekasi", "Jakarta", "Bogor", "Luar JABODETABEK" }));
        cbarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbareaActionPerformed(evt);
            }
        });

        rdbuton.add(motor);
        motor.setText("Motor");
        motor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motorActionPerformed(evt);
            }
        });

        rdbuton.add(mobil);
        mobil.setText("Mobil");
        mobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                        .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(noknd, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbarea, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(motor)
                                .addGap(18, 18, 18)
                                .addComponent(mobil))
                            .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(noknd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cbarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(motor)
                    .addComponent(mobil))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));

        jLabel7.setText("Kode Sperpate");

        jLabel11.setText("Harga");

        hrg.setEnabled(false);

        cbsp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-kd sperpate--", "sp001", "sp002", "sp003", "sp004", "sp005" }));

        jLabel12.setText("Ongkos");

        ongkos.setEnabled(false);

        total.setEnabled(false);

        jLabel14.setText("Total");

        setuju.setText("Setuju");
        setuju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setujuActionPerformed(evt);
            }
        });

        jLabel23.setText("Pembayaran");

        bayar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--pilih pembayaran--", "COD", "Transfer" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbsp, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hrg, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(ongkos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(setuju)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(total)
                                .addComponent(bayar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(25, 25, 25))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbsp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(hrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ongkos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(setuju)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        jLabel9.setText("Kendala");

        jLabel13.setText("Mekanik");

        cbmk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Mekanik--", "Jepry", "Rudin", "Boy", "Jarot", "Alex" }));
        cbmk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kendala, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbmk, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(kendala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbmk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        batal.setText("BATAL");
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });

        pesan.setText("PESAN");
        pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesanActionPerformed(evt);
            }
        });

        tf.setText("TRANSFER");
        tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pesan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(batal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(pesan)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(tf)
                            .addGap(11, 11, 11)
                            .addComponent(batal)
                            .addGap(5, 5, 5))
                        .addGroup(jPanel9Layout.createSequentialGroup()
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jMenu1.setText("Master Data");

        user.setText("Datta User");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jMenu1.add(user);

        pelanggan.setText("Data Pelanggan");
        pelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelangganActionPerformed(evt);
            }
        });
        jMenu1.add(pelanggan);

        jMenuItem1.setText("Data Pembayaran");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        out.setText("Log Out");
        out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outActionPerformed(evt);
            }
        });
        jMenu1.add(out);

        keluar.setText("Keluar");
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        jMenu1.add(keluar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Transaksi Service");

        transaksi.setText("Transaksi Service");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        jMenu2.add(transaksi);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbareaActionPerformed
        switch(cbarea.getSelectedIndex()){
            case 0:
                hrg.setText("");
                ongkos.setText("");
                total.setText("");
                nama.setText("");
                noknd.setText("");
                rdbuton.clearSelection();
                tgl.setText("");
                kendala.setText("");
                cbmk.setSelectedItem("");
                cbsp.setSelectedItem("");
                bayar.setSelectedItem("");
                setuju.setSelected(false);
                break;
                
            case 1:
                hrg.setText("100000");
                ongkos.setText("");
                total.setText("");
                rdbuton.clearSelection();
                cbmk.setSelectedItem("");
                cbsp.setSelectedItem("");
                bayar.setSelectedItem("");
                setuju.setSelected(false);
                break;
                
            case 2:
                hrg.setText("170000");
                ongkos.setText("");
                total.setText("");
                rdbuton.clearSelection();
                cbmk.setSelectedItem("");
                cbsp.setSelectedItem("");
                bayar.setSelectedItem("");
                setuju.setSelected(false);
                break;
                
            case 3:
                hrg.setText("210000");
                ongkos.setText("");
                total.setText("");
                rdbuton.clearSelection();
                cbmk.setSelectedItem("");
                cbsp.setSelectedItem("");
                bayar.setSelectedItem("");
                setuju.setSelected(false);
                break;
                
            case 4:
                hrg.setText("240000");
                ongkos.setText("");
                total.setText("");
                rdbuton.clearSelection();
                cbmk.setSelectedItem("");
                cbsp.setSelectedItem("");
                bayar.setSelectedItem("");
                setuju.setSelected(false);
                break;
                
            default:
                hrg.setText("270000");
                ongkos.setText("");
                total.setText("");
                rdbuton.clearSelection();
                cbmk.setSelectedItem("");
                cbsp.setSelectedItem("");
                bayar.setSelectedItem("");
                setuju.setSelected(false);
                break;
        }
    }//GEN-LAST:event_cbareaActionPerformed

    private void motorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motorActionPerformed
        if(cbarea.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulu");
            rdbuton.clearSelection();
        }else{
            ongkos.setText("30000");
            long Ongkos = Long.parseLong(ongkos.getText()),
                    harga = Long.parseLong(hrg.getText()),
                    totalharga;
           totalharga  = (harga + Ongkos);
           total.setText(""+ totalharga);
           
        }
    }//GEN-LAST:event_motorActionPerformed

    private void mobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilActionPerformed
        if(cbarea.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Pilih area terlebih dahulu");
            rdbuton.clearSelection();
        }else{
            ongkos.setText("50000");
            long Ongkos = Long.parseLong(ongkos.getText()),
                    harga = Long.parseLong(hrg.getText()),
                    totalharga;
           totalharga  = (harga + Ongkos);
           total.setText(""+ totalharga);  
        }
    }//GEN-LAST:event_mobilActionPerformed

    private void pesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesanActionPerformed
        if(setuju.isSelected() == false){
            JOptionPane.showMessageDialog(null, "Klik centang SETUJU untuk menyimpan data anda");
        }else {
            String jenis = null;
            if (motor.isSelected()){
                jenis = "Motor";
            }else if (mobil.isSelected()){
                jenis = "Mobil";
            }
      
            
            
        try {
            Connection conn = (Connection)koneksi.connectDatabase();
            Statement stat = conn.createStatement();     
            String Nama = nama.getText();
            String kendaraan = noknd.getText();
            String tanggal = tgl.getText();
            String Area = cbarea.getSelectedItem().toString();         
            String Kendala = kendala.getText();
            String mekanik = cbmk.getSelectedItem().toString();
            String kdsperpat = cbsp.getSelectedItem().toString();
            String Harga = hrg.getText();
            String Ongkos = ongkos.getText();
            String Total = total.getText() ;
            String Bayar = bayar.getSelectedItem().toString();
            try {
                String sql = "insert into transaksi values(NULL,'"+Nama+"','"+kendaraan
                    +"','"+tanggal+"','"+Area+"','"+jenis+"','"+Kendala+"','"+mekanik+"',"
                        + "'"+kdsperpat+"','"+Harga+"','"+Ongkos+"','"+Total+"','"+Bayar+"')";
                stat.execute(sql);
                stat.close();
            } catch (SQLException ex) {
                System.out.println(ex);
            }
            }   catch (SQLException ex) {    
                    Logger.getLogger(transaksi.class.getName()).log(Level.SEVERE, null, ex);
                }
        nama.setText("");
        noknd.setText("");
        tgl.setText("");
        cbarea.setSelectedIndex(0);
        rdbuton.clearSelection();
        kendala.setText("");
        cbmk.setSelectedIndex(0);
        cbsp.setSelectedIndex(0);
        hrg.setText("");
        ongkos.setText("");
        total.setText("");
        }
        
    }//GEN-LAST:event_pesanActionPerformed

    private void cbmkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbmkActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        nama.setText("");
        noknd.setText("");
        tgl.setText("");
        cbarea.setSelectedIndex(0);
        rdbuton.clearSelection();
        kendala.setText("");
        cbmk.setSelectedIndex(0);
        cbsp.setSelectedIndex(0);
        hrg.setText("");
        ongkos.setText("");
        bayar.setSelectedItem("");
        total.setText("");
    }//GEN-LAST:event_batalActionPerformed

    private void setujuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setujuActionPerformed
        if(nama.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Nama harus diisi");
            setuju.setSelected(false);
        }else if(noknd.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Nomor kendaraan harus diisi");
            setuju.setSelected(false);
        }else if(tgl.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Anda harus melengkapi Data terlebih dahulu");
            setuju.setSelected(false);
        }else if(kendala.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Anda harus melengkapi Data terlebih dahulu");
            setuju.setSelected(false);
        }else if(cbmk.getSelectedIndex() == 0){
            JOptionPane.showConfirmDialog(null, "Anda harus melengkapi Data terlebih dahulu");
            setuju.setSelected(false);
        }else if(cbsp.getSelectedIndex() == 0){
            JOptionPane.showConfirmDialog(null, "Anda harus melengkapi Data terlebih dahulu");
            setuju.setSelected(false);
        }else if(bayar.getSelectedIndex() == 0){
            JOptionPane.showConfirmDialog(null, "Anda harus melengkapi Data terlebih dahulu");
            setuju.setSelected(false);
        }else if(setuju.isSelected() == true){
            JOptionPane.showConfirmDialog(null, "Anda menyetujui");
            setuju.setSelected(true);
        }else{
            JOptionPane.showConfirmDialog(null, "Anda belum menyetujui");
            setuju.setSelected(false);
        }
    }//GEN-LAST:event_setujuActionPerformed

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        transaksi a = new transaksi();
        a.setVisible(true);
        this.getDesktopPane().add(a);
        this.dispose();
        transaksi.setEnabled(false);
    }//GEN-LAST:event_transaksiActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        dtuser a = new dtuser();
        a.setVisible(true);
        this.getDesktopPane().add(a);
        this.dispose();
        transaksi.setEnabled(true);
        pelanggan.setEnabled(true);
        user.setEnabled(false);
        out.setEnabled(true);
    }//GEN-LAST:event_userActionPerformed

    private void pelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelangganActionPerformed
        dtpelanggan a = new dtpelanggan();
        a.setVisible(true);
        this.getDesktopPane().add(a);
        this.dispose();
        transaksi.setEnabled(true);
        pelanggan.setEnabled(false);
        user.setEnabled(true);
        out.setEnabled(true);
    }//GEN-LAST:event_pelangganActionPerformed

    private void outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outActionPerformed
        int pilih = JOptionPane.showConfirmDialog(null, "Apa Anda Yakin Ingin Keluar???",
                "konfirmasi", JOptionPane.OK_CANCEL_OPTION);
        if(pilih == JOptionPane.OK_OPTION){
            formlogin a = new formlogin();
            a.setVisible(true);
            this.getDesktopPane().add(a);
            this.dispose();
            out.setEnabled(false);
        }else{
            JOptionPane.getRootFrame();
        }
    }//GEN-LAST:event_outActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_keluarActionPerformed

    private void tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfActionPerformed
        pembayaran a = new pembayaran();
        a.setVisible(true);
        this.getDesktopPane().add(a);
        this.dispose();
    }//GEN-LAST:event_tfActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        tbl_bayar a = new tbl_bayar();
        a.setVisible(true);
        this.getDesktopPane().add(a);
        this.dispose();
        transaksi.setEnabled(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JComboBox<String> bayar;
    private javax.swing.JComboBox<String> cbarea;
    private javax.swing.JComboBox<String> cbmk;
    private javax.swing.JComboBox<String> cbsp;
    private javax.swing.JTextField hrg;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JMenuItem keluar;
    private javax.swing.JTextField kendala;
    private javax.swing.JRadioButton mobil;
    private javax.swing.JRadioButton motor;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField noknd;
    private javax.swing.JTextField ongkos;
    private javax.swing.JMenuItem out;
    private javax.swing.JMenuItem pelanggan;
    private javax.swing.JButton pesan;
    private javax.swing.ButtonGroup radiobt;
    private javax.swing.ButtonGroup rdbuton;
    private javax.swing.JCheckBox setuju;
    private javax.swing.JButton tf;
    private javax.swing.JTextField tgl;
    private javax.swing.JTextField total;
    private javax.swing.JMenuItem transaksi;
    private javax.swing.JMenuItem user;
    // End of variables declaration//GEN-END:variables
}
