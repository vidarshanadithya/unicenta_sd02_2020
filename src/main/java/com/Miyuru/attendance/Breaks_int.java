/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Miyuru.attendance;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miyuru_cg
 */
public class Breaks_int extends javax.swing.JPanel {

    Connection con;
    String emp_name;
    String note;
    /**
     * Creates new form Breaks_int
     */
    public Breaks_int() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    public void panelNavigator(JPanel panel){
        breaksInt.removeAll();
        breaksInt.add(panel);
        breaksInt.repaint();
        breaksInt.revalidate();
        //this.navbar.setText(name);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        breaksInt = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        eName = new javax.swing.JTextField();
        JLabel_e = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Note = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        note_Table = new javax.swing.JTable();
        btn_Add = new javax.swing.JButton();
        btn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(28, 35, 51));
        setPreferredSize(new java.awt.Dimension(1260, 730));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        breaksInt.setPreferredSize(new java.awt.Dimension(1260, 730));
        breaksInt.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(28, 35, 51));

        eName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNameActionPerformed(evt);
            }
        });

        JLabel_e.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        JLabel_e.setForeground(new java.awt.Color(255, 255, 255));
        JLabel_e.setText("Employee");

        txt_Note.setColumns(20);
        txt_Note.setRows(5);
        jScrollPane1.setViewportView(txt_Note);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Note");

        note_Table.setBackground(new java.awt.Color(28, 35, 51));
        note_Table.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        note_Table.setForeground(new java.awt.Color(255, 255, 255));
        note_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Note"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        note_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                note_TableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(note_Table);

        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });

        btn.setText("new");
        btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActionPerformed(evt);
            }
        });

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(JLabel_e, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(64, 64, 64)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Add))
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(421, 421, 421)))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JLabel_e, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Add)
                    .addComponent(btn))
                .addGap(263, 263, 263))
        );

        breaksInt.add(jPanel1, "card2");

        add(breaksInt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));
    }// </editor-fold>//GEN-END:initComponents

    private void eNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNameActionPerformed

    private void note_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_note_TableMouseClicked
        // TODO add your handling code here:
        //jTable.getRow
    }//GEN-LAST:event_note_TableMouseClicked

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed

        emp_name = eName.getText();
        note = txt_Note.getText();

        try{
            Statement smt = con.createStatement();
            smt.execute("INSERT INTO Emp_Breaks (Employee,Note) values('"+eName.getText()+"','"+txt_Note.getText()+"')");
            JOptionPane.showMessageDialog(this, "Record Submitted");
            setBreakTableData();
            smt.close();

            /*

            Statement smt = con.createStatement();
            smt.execute("INSERT INTO sales(product_name,product_price,product_quantity,sales_value,tax,commision) values('"+productName+"','"+productPrice+"','"+productQuantity+"','"+salesValue+"','"+tax+"','"+commision+"')");
            JOptionPane.showMessageDialog(this, "Record Submitted");
            setSalesTableData();
            getGrandTotal();
            smt.close();

            */

        }catch(Exception e){
            JOptionPane.showMessageDialog(this, " error adding data >>> "+e);
        }

        //  DefaultTableModel model = (DefaultTableModel)note_Table.getModel();

        // model.addRow(new Object[]{eName.getText(),txt_Note.getText()});

    }//GEN-LAST:event_btn_AddActionPerformed

    private void btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActionPerformed
        // clear data to db

        eName.setText(null);
        txt_Note.setText(null);
    }//GEN-LAST:event_btnActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AttendenceInterfave a = new AttendenceInterfave();
        
        panelNavigator(a);
        
    }//GEN-LAST:event_jButton1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_e;
    private javax.swing.JLayeredPane breaksInt;
    private javax.swing.JButton btn;
    private javax.swing.JButton btn_Add;
    private javax.swing.JTextField eName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable note_Table;
    private javax.swing.JTextArea txt_Note;
    // End of variables declaration//GEN-END:variables

    private void setBreakTableData() {
        try{
            int rows = 0;
            int rowIndex = 0;
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM sales");
            if(rs.next()){
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();
            }
            String[][] data = new String[rows][2];
            while(rs.next()){
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getString(2);      
                rowIndex++;
            }
            String[] cols={"Employee","Note"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            note_Table.setModel(model);
            rs.close();
            smt.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e +" Retreiving Failed");
        }
    }
}
