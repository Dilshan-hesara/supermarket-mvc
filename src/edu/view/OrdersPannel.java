/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package edu.view;

import edu.controller.CustomerController;
import edu.controller.ItemController;
import edu.dto.CustomerDto;
import javax.swing.JOptionPane;
import edu.dto.ItemDto;
import javax.swing.table.DefaultTableModel;
import edu.dto.OrderDetailDto;
import java.util.ArrayList;
import java.util.Date;
import edu.dto.OrderDto;
import java.text.SimpleDateFormat;
import edu.controller.OrderController;




/**
 *
 * @author DILSHAN HESARA
 */
public class OrdersPannel extends javax.swing.JPanel {

    
        private ItemController itemController = new ItemController();
    private CustomerController customerController = new CustomerController();
        private OrderController orderController = new OrderController();

        private ArrayList<OrderDetailDto> orderDetailDtos = new ArrayList<>();

    /**
     * Creates new form OrderPannel
     */
    public OrdersPannel() {
        initComponents();
        loadTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        delete2 = new javax.swing.JButton();
        txtqty = new javax.swing.JTextField();
        cu = new javax.swing.JLabel();
        lic = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        delete1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtorid = new javax.swing.JTextField();
        txtic = new javax.swing.JTextField();
        txtdis = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ortable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        delete2.setText("SEARCH");
        delete2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete2MouseClicked(evt);
            }
        });

        txtqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtqtyActionPerformed(evt);
            }
        });

        cu.setText(" ");

        lic.setText(" ");

        update.setText("ADD CART");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("ORDER FROM");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setText("CUST ID");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("ORDER ID");

        txtcid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcidActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("QTY");

        delete1.setText("SEARCH");
        delete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("DIICOUNT");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setText("ITEM CODE");

        txtorid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtoridActionPerformed(evt);
            }
        });

        txtic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txticActionPerformed(evt);
            }
        });

        txtdis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdisActionPerformed(evt);
            }
        });

        ortable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        ortable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ortableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ortable);

        jButton1.setText("PLACE ODER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(207, 207, 207)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(40, 40, 40)
                                        .addComponent(txtorid, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(delete1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cu, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtic, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(delete2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lic, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 34, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdis, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(update)
                        .addGap(37, 37, 37))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtorid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtqty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtdis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(1, 1, 1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void delete2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete2MouseClicked
        searchItem();        // TODO add your handling code here:
    }//GEN-LAST:event_delete2MouseClicked

    private void txtqtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtqtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtqtyActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     addCart();        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void txtcidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcidActionPerformed

    private void delete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete1ActionPerformed
       searcCustomer();        // TODO add your handling code here:
    }//GEN-LAST:event_delete1ActionPerformed

    private void txtoridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtoridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtoridActionPerformed

    private void txticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txticActionPerformed

    private void txtdisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdisActionPerformed

    private void ortableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ortableMouseClicked

    }//GEN-LAST:event_ortableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       placeOrder();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cu;
    private javax.swing.JButton delete1;
    private javax.swing.JButton delete2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lic;
    private javax.swing.JTable ortable;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txtdis;
    private javax.swing.JTextField txtic;
    private javax.swing.JTextField txtorid;
    private javax.swing.JTextField txtqty;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables



   public void searcCustomer(){
        String customerId = txtcid.getText();
        try {
            CustomerDto customerDto = customerController.searchCustomer(customerId);
            if(customerDto != null){
                cu.setText(customerDto.getCustTitle() + ". " + customerDto.getName());
            } else {
                JOptionPane.showMessageDialog(this, "Customer not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }


    public void searchItem(){
        String itemCode = txtic.getText();
        try {
            ItemDto itemDto = itemController.searchItem(itemCode);
            if(itemDto != null){
                lic.setText(itemDto.getDescription() + " | " + itemDto.getPackSize() + " | " + itemDto.getQoh() + " | " + itemDto.getUnitPrice());
            } else {
                JOptionPane.showMessageDialog(this, "Item not found");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    
        private void loadTable() {
        String columns [] = {"Item Code", "Qty", "Discount"};
        DefaultTableModel dtm = new DefaultTableModel(columns, 0){
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        ortable.setModel(dtm);
    }
        
        
        private void addCart(){
        try {
            OrderDetailDto dto = new OrderDetailDto();
            dto.setItemCode(txtic.getText());
            dto.setQty(Integer.parseInt(txtqty.getText()));
            dto.setDiscount(Double.parseDouble(txtdis.getText()));
            
            orderDetailDtos.add(dto);
            Object [] rowData = {dto.getItemCode(), dto.getDiscount(), dto.getQty()};
            DefaultTableModel dtm = (DefaultTableModel) ortable.getModel();
            dtm.addRow(rowData);
            clearItem();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    
    private void clearItem(){
        txtic.setText("");
        txtdis.setText("");
        txtqty.setText("");
        lic.setText("");
    }
    
    
    
     private void placeOrder() {
        try {
            OrderDto orderDto = new OrderDto();
            orderDto.setOrderId(txtorid.getText());
            orderDto.setCustId(txtcid.getText());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String date = sdf.format(new Date());
            orderDto.setOrderDate(date);
            orderDto.setOrderDetailDtos(orderDetailDtos);
            
           // System.out.println(orderDto.toString());
             String resp = orderController.placeOrder(orderDto);
            JOptionPane.showMessageDialog(this, resp);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
    }
}
