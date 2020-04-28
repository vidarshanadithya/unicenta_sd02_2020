/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Miyuru.attendance;

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
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
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
        btn_back = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        newBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        deleteBtn3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(28, 35, 51));

        breaksLayer.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(28, 35, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Attendance > Breaks");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 343, 53));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 65, 1270, 10));

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

        btn_back.setBackground(new java.awt.Color(102, 102, 255));
        btn_back.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        btn_back.setText("Back");
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(102, 102, 255));
        editBtn.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        editBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        editBtn.setText("Edit");
        editBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editBtnMouseClicked(evt);
            }
        });
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        newBtn.setBackground(new java.awt.Color(102, 102, 255));
        newBtn.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        newBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        newBtn.setText("New");
        newBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                newBtnMouseClicked(evt);
            }
        });
        newBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newBtnActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(102, 102, 255));
        addBtn.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        addBtn.setText("Add");
        addBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addBtnMouseClicked(evt);
            }
        });
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        deleteBtn3.setBackground(new java.awt.Color(102, 102, 255));
        deleteBtn3.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        deleteBtn3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        deleteBtn3.setText("Delete");
        deleteBtn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBtn3MouseClicked(evt);
            }
        });
        deleteBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(deleteBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JLabel_e, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabel_e, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 93, 1080, -1));

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
        //jTable.getRow
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

    private void editBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editBtnMouseClicked
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
    }//GEN-LAST:event_editBtnMouseClicked

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
//               DefaultTableModel model = (DefaultTableModel)note_Table.getModel();
//       
//        if (note_Table.getSelectedRow() == -1) {
//            if(note_Table.getRowCount()== 0){
//              JOptionPane.showMessageDialog(this, "Table is empty !");
//          }else{
//              JOptionPane.showMessageDialog(this, "Please select a row!");
//          }
//        }
//        else{
//            model.removeRow(note_Table.getSelectedRow());
////            model.setValueAt(null, note_Table.getSelectedRow(), 0);
////            model.setValueAt(null, note_Table.getSelectedRow(), 1);
//        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void newBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_newBtnMouseClicked
        // TODO add your handling code here:
        eName.setText(null);
        txt_Note.setText(null);
    }//GEN-LAST:event_newBtnMouseClicked

    private void newBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newBtnActionPerformed

    private void addBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addBtnMouseClicked
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

         model.addRow(new Object[]{eName.getText(),txt_Note.getText()});
    }//GEN-LAST:event_addBtnMouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBtn3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtn3MouseClicked

    private void deleteBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn3ActionPerformed
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
    }//GEN-LAST:event_deleteBtn3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel_e;
    private javax.swing.JButton addBtn;
    private javax.swing.JLayeredPane breaksLayer;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton deleteBtn3;
    private javax.swing.JTextField eName;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton newBtn;
    private javax.swing.JTable note_Table;
    private javax.swing.JTextArea txt_Note;
    // End of variables declaration//GEN-END:variables

    private void setBreakTableData() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
