/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package application.views;

import application.dao.SelectionDao;
import application.daoimpl.SelectionDaoImpl;
import application.models.SelectionModel;
import application.models.SelectionTableModel;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author yusuf
 */
public class SelectionData extends javax.swing.JPanel {
    private final SelectionDao selectionDao;
    private int id;
    /**
     * Creates new form SelectionData
     */
    public SelectionData() {
        initComponents();
        selectionDao = new SelectionDaoImpl();
        this.loadTable();
        tombolLihatPerhitunganAHP.setBackground(Color.white);
    }
    
    public void loadTable() {
        List<SelectionModel> selections = this.selectionDao.findAll();
        SelectionTableModel selectionTableModel = new SelectionTableModel(selections);
        
        tableRanking.setModel(selectionTableModel);
        
//        TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>(tableRanking.getModel());
//        tableRanking.setRowSorter(sorter);
//
//        List<RowSorter.SortKey> sortKeys = new ArrayList<>(25);
//        sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
//        sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
//        sortKeys.add(new RowSorter.SortKey(2, SortOrder.ASCENDING));
//        sorter.setSortKeys(sortKeys);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        judul = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableRanking = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonDelete = new javax.swing.JButton();
        tombolLihatPerhitunganAHP = new javax.swing.JButton();

        setBackground(new java.awt.Color(245, 247, 250));

        judul.setBackground(new java.awt.Color(45, 49, 74));
        judul.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        judul.setForeground(new java.awt.Color(255, 187, 0));
        judul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judul.setText("  Ranking Hasil Seleksi Calon Pelamar");
        judul.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tableRanking.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ranking", "No.ID", "Nama Calon Pelamar", "No. HP", "Hasil Penilaian"
            }
        ));
        tableRanking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableRankingMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableRanking);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("- Klik tombol Update untuk mengupdate data tabel");

        jLabel3.setText("Catatan : ");

        jLabel4.setText("- Hapus dengan mengklik data tabel yang ingin dihapus ");

        jLabel5.setText("- Ranking diurutkan berdasarkan hasil penilaian terbesar sampai terkecil calon pelamar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        buttonDelete.setBackground(new java.awt.Color(179, 30, 114));
        buttonDelete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buttonDelete.setForeground(new java.awt.Color(255, 255, 255));
        buttonDelete.setText("Hapus");
        buttonDelete.setBorder(null);
        buttonDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                buttonDeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                buttonDeleteMouseExited(evt);
            }
        });
        buttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteActionPerformed(evt);
            }
        });

        tombolLihatPerhitunganAHP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        tombolLihatPerhitunganAHP.setForeground(new java.awt.Color(179, 30, 144));
        tombolLihatPerhitunganAHP.setText("Mulai Penilaian Calon Pelamar Metode AHP");
        tombolLihatPerhitunganAHP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(202, 210, 226)));
        tombolLihatPerhitunganAHP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tombolLihatPerhitunganAHPMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tombolLihatPerhitunganAHPMouseExited(evt);
            }
        });
        tombolLihatPerhitunganAHP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tombolLihatPerhitunganAHPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 115, Short.MAX_VALUE)
                        .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(tombolLihatPerhitunganAHP, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tombolLihatPerhitunganAHP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(judul, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(judul, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(191, 191, 191))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableRankingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableRankingMouseClicked
        // TODO add your handling code here:
        int selectedRow = tableRanking.getSelectedRow();

        TableModel model = tableRanking.getModel();
        String id = model.getValueAt(selectedRow, 0).toString();

        this.id = Integer.parseInt(id);
    }//GEN-LAST:event_tableRankingMouseClicked

    private void buttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteActionPerformed
        // TODO add your handling code here:
        try{
            int ok = JOptionPane.showConfirmDialog(null,"hapus","Konfirmasi Dialog",JOptionPane.YES_NO_CANCEL_OPTION);
            if(ok == 0){
                selectionDao.delete(this.id);
                JOptionPane.showMessageDialog(null, "Data Berhasil diHapus ");
                loadTable();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Data Gagal diHapus " + e);
        }
    }//GEN-LAST:event_buttonDeleteActionPerformed

    private void tombolLihatPerhitunganAHPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tombolLihatPerhitunganAHPActionPerformed
        // TODO add your handling code here:
        AHPCalculationDialog dialog = new AHPCalculationDialog(null, true);
        dialog.show();
        loadTable();
    }//GEN-LAST:event_tombolLihatPerhitunganAHPActionPerformed

    private void buttonDeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteMouseEntered
        // TODO add your handling code here:
        buttonDelete.setBackground(new Color(132, 0, 74));
    }//GEN-LAST:event_buttonDeleteMouseEntered

    private void buttonDeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonDeleteMouseExited
        // TODO add your handling code here:
        buttonDelete.setBackground(new Color(179, 30, 114));
    }//GEN-LAST:event_buttonDeleteMouseExited

    private void tombolLihatPerhitunganAHPMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolLihatPerhitunganAHPMouseEntered
        // TODO add your handling code here:
        tombolLihatPerhitunganAHP.setBackground(new Color(250, 239, 245));
    }//GEN-LAST:event_tombolLihatPerhitunganAHPMouseEntered

    private void tombolLihatPerhitunganAHPMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tombolLihatPerhitunganAHPMouseExited
        // TODO add your handling code here:
        tombolLihatPerhitunganAHP.setBackground(Color.white);
    }//GEN-LAST:event_tombolLihatPerhitunganAHPMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel judul;
    private javax.swing.JTable tableRanking;
    private javax.swing.JButton tombolLihatPerhitunganAHP;
    // End of variables declaration//GEN-END:variables
}
