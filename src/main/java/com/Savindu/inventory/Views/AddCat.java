/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Savindu.inventory.Views;

import com.Savindu.inventory.Entity.Category;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Savindu
 */
public class AddCat extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    Category category = new Category();
    String filePath = null;
    
    public AddCat() {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    public void createFileChooser(){
        JFileChooser fileChooser = new JFileChooser();
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        fileChooser.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        fileChooser.setVisible(true);
        
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes()));
        /*fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("MS Office Documents", "docx", "xlsx", "pptx"));*/
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.showOpenDialog(null);
        
        
        File f = fileChooser.getSelectedFile();
        System.out.println("Selected file from JFileChooser => "+f.toString());
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        filePath = "Categories\\"+timestamp.getTime()+f.getName();
        Path temp = null;
        try {
            temp = Files.move 
                (Paths.get(f.toString()),
                        Paths.get(filePath));
        } catch (IOException ex) {
            System.out.println(ex);
        }
  
        if(temp != null) 
        { 
            BufferedImage img = null;
            try {
                img = ImageIO.read(new File(filePath));
            } catch (IOException e) {
                e.printStackTrace();
            }
            
            Image dimg = img.getScaledInstance(imgLbl.getWidth(), imgLbl.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon imageIcon = new ImageIcon(dimg);
            
            imgLbl.setIcon(imageIcon);
            
            System.out.println("File renamed and moved successfully"); 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        productsPanel = new javax.swing.JPanel();
        Products = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cat_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cat_name = new javax.swing.JTextField();
        imgBrowse = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        imgLbl = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(28, 35, 51));

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        productsPanel.setBackground(new java.awt.Color(55, 71, 79));

        Products.setBackground(new java.awt.Color(55, 71, 79));
        Products.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Products.setForeground(new java.awt.Color(244, 244, 244));
        Products.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Products.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-menu-36.png"))); // NOI18N
        Products.setText("Add Category");
        Products.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout productsPanelLayout = new javax.swing.GroupLayout(productsPanel);
        productsPanel.setLayout(productsPanelLayout);
        productsPanelLayout.setHorizontalGroup(
            productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
            .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Products, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE))
        );
        productsPanelLayout.setVerticalGroup(
            productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(productsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productsPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(Products, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)))
        );

        jPanel2.add(productsPanel);

        jPanel3.setBackground(new java.awt.Color(55, 71, 79));
        jPanel3.setForeground(new java.awt.Color(244, 244, 244));

        jLabel1.setBackground(new java.awt.Color(55, 71, 79));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(244, 244, 244));
        jLabel1.setText("Category ID");

        cat_ID.setBackground(new java.awt.Color(28, 35, 51));
        cat_ID.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cat_ID.setForeground(new java.awt.Color(244, 244, 244));
        cat_ID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cat_ID.setBorder(null);
        cat_ID.setMinimumSize(new java.awt.Dimension(1, 30));
        cat_ID.setPreferredSize(new java.awt.Dimension(1, 30));

        jLabel2.setBackground(new java.awt.Color(55, 71, 79));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(244, 244, 244));
        jLabel2.setText("Category Name");

        cat_name.setBackground(new java.awt.Color(28, 35, 51));
        cat_name.setFont(new java.awt.Font("Tahoma", 0, 17)); // NOI18N
        cat_name.setForeground(new java.awt.Color(244, 244, 244));
        cat_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cat_name.setBorder(null);
        cat_name.setMinimumSize(new java.awt.Dimension(1, 30));
        cat_name.setPreferredSize(new java.awt.Dimension(1, 30));

        imgBrowse.setBackground(new java.awt.Color(0, 51, 51));
        imgBrowse.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        imgBrowse.setForeground(new java.awt.Color(244, 244, 244));
        imgBrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-plus-36.png"))); // NOI18N
        imgBrowse.setText("  Browse");
        imgBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imgBrowseActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(28, 35, 51));
        jPanel4.setMaximumSize(null);

        jLayeredPane1.setLayer(imgLbl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(imgLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imgLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel5.setBackground(new java.awt.Color(46, 204, 113));

        btn_save.setBackground(new java.awt.Color(0, 153, 153));
        btn_save.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        btn_save.setForeground(new java.awt.Color(244, 244, 244));
        btn_save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pos/images/icons8-save-close-36 (1).png"))); // NOI18N
        btn_save.setText("  Save");
        btn_save.setBorder(null);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_save, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(244, 244, 244));
        jLabel3.setText("Category Image");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cat_name, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142)
                        .addComponent(cat_ID, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(179, 179, 179)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(imgBrowse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cat_ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(cat_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)))
                .addComponent(imgBrowse)
                .addGap(16, 16, 16)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductsMouseClicked

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        category.setCatID(this.cat_ID.getText());
        category.setName(this.cat_name.getText());
        category.setImg(this.filePath);
        
        if(this.cat_ID.getText() != null && this.cat_name.getText() != null){
         boolean    res;
        try {
            res = category.save(category);
            if(res){
            JOptionPane.showMessageDialog(null, "New Category has Inserted Successfully!");
            this.cat_ID.setText(null);
            this.cat_name.setText(null);
            this.imgLbl.setIcon(null);
            this.setVisible(false);
        }
        } catch (SQLException ex) {
            Logger.getLogger(AddCat.class.getName()).log(Level.SEVERE, null, ex);
        }   
        }else{
            JOptionPane.showMessageDialog(null, "Please Insert Category Details");
        }
   
    }//GEN-LAST:event_btn_saveActionPerformed

    private void imgBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imgBrowseActionPerformed
        // TODO add your handling code here:
        this.createFileChooser();
    }//GEN-LAST:event_imgBrowseActionPerformed

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
            java.util.logging.Logger.getLogger(AddCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCat().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Products;
    private javax.swing.JButton btn_save;
    private javax.swing.JTextField cat_ID;
    private javax.swing.JTextField cat_name;
    private javax.swing.JButton imgBrowse;
    private javax.swing.JLabel imgLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel productsPanel;
    // End of variables declaration//GEN-END:variables
}
