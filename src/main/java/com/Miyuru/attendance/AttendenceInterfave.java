/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Miyuru.attendance;

import javax.swing.JPanel;

/**
 *
 * @author miyuru_cg
 */
public class AttendenceInterfave extends javax.swing.JPanel {

    /**
     * Creates new form AttendenceInterfave
     */
    public AttendenceInterfave() {
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

        Attendance_layer = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        btn_leaves = new javax.swing.JButton();
        btn_breaks = new javax.swing.JButton();

        setBackground(new java.awt.Color(28, 35, 51));

        Attendance_layer.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(28, 35, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Attendance");

        jPanel3.setBackground(new java.awt.Color(28, 35, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));

        btn_leaves.setBackground(new java.awt.Color(0, 51, 51));
        btn_leaves.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_leaves.setForeground(new java.awt.Color(255, 255, 255));
        btn_leaves.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-leave-100 (new).png"))); // NOI18N
        btn_leaves.setText("Leaves");
        btn_leaves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_leavesActionPerformed(evt);
            }
        });

        btn_breaks.setBackground(new java.awt.Color(0, 51, 51));
        btn_breaks.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btn_breaks.setForeground(new java.awt.Color(255, 255, 255));
        btn_breaks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-time-card-100(new).png"))); // NOI18N
        btn_breaks.setText("Breaks");
        btn_breaks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_breaksActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_leaves, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_breaks, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(445, 445, 445))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btn_leaves, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(btn_breaks, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        Attendance_layer.add(jPanel2, "card2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Attendance_layer)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Attendance_layer)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

     public void panelNavigator(JPanel panel){
        Attendance_layer.removeAll();
        Attendance_layer.add(panel);
        Attendance_layer.repaint();
        Attendance_layer.revalidate();
        //this.navbar.setText(name);
    }
    private void btn_leavesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_leavesActionPerformed
        //Roles r = new Roles();
        //panelNavigator(r);
        
        LeavesInterface l = new LeavesInterface();
        panelNavigator(l);

    }//GEN-LAST:event_btn_leavesActionPerformed

    private void btn_breaksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_breaksActionPerformed
       // Users u = new Users();
      //  panelNavigator(u);
        BreaksInterface b = new BreaksInterface();
        panelNavigator(b);
    }//GEN-LAST:event_btn_breaksActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Attendance_layer;
    private javax.swing.JButton btn_breaks;
    private javax.swing.JButton btn_leaves;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
