/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import main.Shop;

/**
 *
 * @author fiore
 */
public class ProductView extends javax.swing.JDialog {

    private Shop shop;
    private int option;
 
    public ProductView(int option, Shop shop) {
        initComponents();
        this.shop = shop;
        this.option = option;
        
        switch(option){
            case 2:
                setTitle("Añadir Producto");
                break;
            case 3:
                setTitle("Añadir Stock");
                jTextFieldPrecio.setVisible(false);
                jLabelPrecio.setVisible(false);
                
                break;
            case 9:
                setTitle("Eliminar Producto");
                jLabelStock.setVisible(false);
                jTextFieldStock.setVisible(false);
                jLabelPrecio.setVisible(false);
                jTextFieldPrecio.setVisible(false);
                
                break;
            default:
                //setVisible(false);
                break;
                
        }
    }
    
    
    public void openProductView(int option, Shop shop){
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelProducto = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabelPrecio = new javax.swing.JLabel();
        jTextFieldProducto = new javax.swing.JTextField();
        jTextFieldStock = new javax.swing.JTextField();
        jTextFieldPrecio = new javax.swing.JTextField();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelProducto.setText("Nombre producto:");
        getContentPane().add(jLabelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 120, -1));

        jLabelStock.setText("Stock  producto:");
        getContentPane().add(jLabelStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 120, -1));

        jLabelPrecio.setText("Precio producto:");
        getContentPane().add(jLabelPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 120, -1));
        getContentPane().add(jTextFieldProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 137, -1));
        getContentPane().add(jTextFieldStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 137, -1));
        getContentPane().add(jTextFieldPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 137, -1));

        jButtonOk.setText("OK");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOk, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 240, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 340, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        
        if (this.option == 2){
            String nombre = jTextFieldProducto.getText();
            int stock = Integer.parseInt(jTextFieldStock.getText());
            int precio = Integer.parseInt(jTextFieldPrecio.getText());
            if(shop.addProduct(nombre, stock, precio) == false){
                JOptionPane.showMessageDialog(this,
                "El producto ya existe",
                "Error", JOptionPane.ERROR_MESSAGE
                );
            }else{
                this.dispose();
            }
        }else if(this.option==3){
            String nombre = jTextFieldProducto.getText();
            int stock = Integer.parseInt(jTextFieldStock.getText());
            if(shop.addStock(nombre, stock) == false){
                JOptionPane.showMessageDialog(this,
                "El Producto no existe",
                "Error", JOptionPane.ERROR_MESSAGE
                );
            }else{
                this.dispose();
            }
            
        }else if(this.option==9){
            String nombre = jTextFieldProducto.getText();
            if(shop.deleteProduct(nombre) == false){
                JOptionPane.showMessageDialog(this,
                "No se ha podido realizar la petición",
                "Error", JOptionPane.ERROR_MESSAGE
                );
            }else{
                this.dispose();
            }
            
        }
    }//GEN-LAST:event_jButtonOkActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JLabel jLabelPrecio;
    private javax.swing.JLabel jLabelProducto;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldPrecio;
    private javax.swing.JTextField jTextFieldProducto;
    private javax.swing.JTextField jTextFieldStock;
    // End of variables declaration//GEN-END:variables
}
