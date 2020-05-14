/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Miyuru.attendance;

import com.Miyuru.login.SignIn;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author miyuru_cg
 */
public class BreaksInterface extends javax.swing.JPanel {

    Connection con;
    String emp_name;
    String note;
    /**
     * Creates new form BreaksInterface
     */
    public BreaksInterface() {
        initComponents();
        
         if(SignIn.username.equals("Admin")){
            AcceptBtn.setEnabled(true);
            declineBtn.setEnabled(true);
        }else{
            AcceptBtn.setEnabled(false);
            declineBtn.setEnabled(false);
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

        breaksLayer = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        eName = new javax.swing.JTextField();
        JLabel_e = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Note = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        note_Table = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        deleteBtn4 = new javax.swing.JButton();
        editBtn1 = new javax.swing.JButton();
        newBtn1 = new javax.swing.JButton();
        addBtn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        AcceptBtn = new javax.swing.JButton();
        declineBtn = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();

        setBackground(new java.awt.Color(28, 35, 51));

        breaksLayer.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(28, 35, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(28, 35, 51));

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

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Note");

        note_Table.setBackground(new java.awt.Color(28, 35, 51));
        note_Table.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        note_Table.setForeground(new java.awt.Color(255, 255, 255));
        note_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee", "Note", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
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

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Attendance > Breaks");

        deleteBtn4.setBackground(new java.awt.Color(255, 51, 51));
        deleteBtn4.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        deleteBtn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/delete30.png"))); // NOI18N
        deleteBtn4.setText("Delete");
        deleteBtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtn4MouseClicked(evt);
            }
        });
        deleteBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn4ActionPerformed(evt);
            }
        });

        editBtn1.setBackground(new java.awt.Color(102, 102, 255));
        editBtn1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        editBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-edit-30.png"))); // NOI18N
        editBtn1.setText("Edit");
        editBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtn1MouseClicked(evt);
            }
        });
        editBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtn1ActionPerformed(evt);
            }
        });

        newBtn1.setBackground(new java.awt.Color(0, 153, 153));
        newBtn1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        newBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-new-contact-30.png"))); // NOI18N
        newBtn1.setText("New");
        newBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newBtn1MouseClicked(evt);
            }
        });
        newBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtn1ActionPerformed(evt);
            }
        });

        addBtn1.setBackground(new java.awt.Color(0, 153, 51));
        addBtn1.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        addBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/add30.png"))); // NOI18N
        addBtn1.setText("Add");
        addBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtn1MouseClicked(evt);
            }
        });
        addBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(28, 35, 51));

        AcceptBtn.setBackground(new java.awt.Color(0, 188, 61));
        AcceptBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-approval-30.png"))); // NOI18N
        AcceptBtn.setText("Accept");
        AcceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptBtnActionPerformed(evt);
            }
        });

        declineBtn.setBackground(new java.awt.Color(255, 96, 96));
        declineBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-unavailable-30.png"))); // NOI18N
        declineBtn.setText("Decline");
        declineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(AcceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(declineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(8, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 156, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(51, 51, 51)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(declineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AcceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(52, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(addBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(JLabel_e, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabel_e, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(70, 70, 70))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 1210, -1));

        btn_back.setBackground(new java.awt.Color(0, 106, 78));
        btn_back.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/backW_32.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel1.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 130, 57));

        breaksLayer.add(jPanel1, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1438, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(breaksLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 1438, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 764, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(breaksLayer, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void eNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNameActionPerformed

    private void note_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_note_TableMouseClicked
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel)note_Table.getModel();
        
        if(note_Table.getSelectedRow()== -1){
            if(note_Table.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "Table is empty !");
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row !");
            }
        }else{
            eName.setText((String) note_Table.getValueAt(note_Table.getSelectedRow(), 0));
            txt_Note.setText((String) note_Table.getValueAt(note_Table.getSelectedRow(), 1));

        }

    }//GEN-LAST:event_note_TableMouseClicked

  public void panelNavigator(JPanel panel){
        breaksLayer.removeAll();
        breaksLayer.add(panel);
        breaksLayer.repaint();
        breaksLayer.revalidate();
        //this.navbar.setText(name);
    }
    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        AttendenceInterfave a = new AttendenceInterfave();

        panelNavigator(a);

    }//GEN-LAST:event_btn_backMouseClicked

    private void deleteBtn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtn4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtn4MouseClicked

    private void deleteBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn4ActionPerformed
         DefaultTableModel model = (DefaultTableModel)note_Table.getModel();

        if (note_Table.getSelectedRow() == -1) {
            if(note_Table.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "Table is empty !");
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row!");
            }
        }
        else{
            model.removeRow(note_Table.getSelectedRow());
            //            model.setValueAt(null, note_Table.getSelectedRow(), 0);
            //            model.setValueAt(null, note_Table.getSelectedRow(), 1);
        }
    }//GEN-LAST:event_deleteBtn4ActionPerformed

    private void editBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtn1MouseClicked
        DefaultTableModel model = (DefaultTableModel)note_Table.getModel();

        if(note_Table.getSelectedRow()== -1){
            if(note_Table.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "Table is empty !");
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row !");
            }
        }else{
            model.setValueAt(eName.getText(), note_Table.getSelectedRow(), 0);
            model.setValueAt(txt_Note.getText(), note_Table.getSelectedRow(), 1);
            JOptionPane.showMessageDialog(this, "Data Edited Successfully !");
        }
    }//GEN-LAST:event_editBtn1MouseClicked

    private void editBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtn1ActionPerformed

    }//GEN-LAST:event_editBtn1ActionPerformed

    private void newBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBtn1MouseClicked
        // TODO add your handling code here:
        eName.setText(null);
        txt_Note.setText(null);
    }//GEN-LAST:event_newBtn1MouseClicked

    private void newBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newBtn1ActionPerformed

    private void addBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtn1MouseClicked
 // TODO add your handling code here:
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

        DefaultTableModel model = (DefaultTableModel)note_Table.getModel();

        model.addRow(new Object[]{eName.getText(),txt_Note.getText(), "Pending"});
    }//GEN-LAST:event_addBtn1MouseClicked

    private void addBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn1ActionPerformed

    }//GEN-LAST:event_addBtn1ActionPerformed

    private void AcceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptBtnActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel)note_Table.getModel();

        if(note_Table.getSelectedRow()== -1){
            if(note_Table.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "Table is empty !");
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row !");
            }
        }else{

            model.setValueAt("Accept", note_Table.getSelectedRow(), 2);

            JOptionPane.showMessageDialog(this, "Accepted");
        }

    }//GEN-LAST:event_AcceptBtnActionPerformed

    private void declineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)note_Table.getModel();

        if(note_Table.getSelectedRow()== -1){
            if(note_Table.getRowCount()== 0){
                JOptionPane.showMessageDialog(this, "Table is empty !");
            }else{
                JOptionPane.showMessageDialog(this, "Please select a row !");
            }
        }else{

            model.setValueAt("Decline", note_Table.getSelectedRow(), 2);

            JOptionPane.showMessageDialog(this, "Declined");
        }
    }//GEN-LAST:event_declineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptBtn;
    private javax.swing.JLabel JLabel_e;
    private javax.swing.JButton addBtn1;
    private javax.swing.JLayeredPane breaksLayer;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton declineBtn;
    private javax.swing.JButton deleteBtn4;
    private javax.swing.JTextField eName;
    private javax.swing.JButton editBtn1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton newBtn1;
    private javax.swing.JTable note_Table;
    private javax.swing.JTextArea txt_Note;
    // End of variables declaration//GEN-END:variables

    private void setBreakTableData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
