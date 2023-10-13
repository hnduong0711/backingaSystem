/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;

/**
 *
 * @author DUC PHU
 */
public class AccountForm extends javax.swing.JPanel {

    /**
     * Creates new form AccountForm
     */
    
    public AccountForm(PaymentAccountDTO account, CustomerDTO customer) {
        initComponents(account, customer);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents(PaymentAccountDTO account, CustomerDTO customer) {

        lbAccID = new javax.swing.JLabel();
        lbAccNumber = new javax.swing.JLabel();
        lbAccOwner = new javax.swing.JLabel();
        jbtnEdit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 255));
        setPreferredSize(new java.awt.Dimension(540, 60));

        lbAccID.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAccID.setText("ACC12345");

        lbAccNumber.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAccNumber.setText("00000000");

        lbAccOwner.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAccOwner.setText("Test Test Test Test");

        jbtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/edit-icon-20.png"))); // NOI18N
        jbtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditActionPerformed(evt, account, customer);
            }
        });

        jbtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/delete-2-icon-20.png"))); // NOI18N
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt, account);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbAccID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lbAccNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(lbAccOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jbtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbAccID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAccNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbAccOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnEdit)
                    .addComponent(jbtnDelete))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbAccID.setText("" +account.getAccountID());
        lbAccNumber.setText("" +account.getAccountNumber());
        lbAccOwner.setText("" +customer.getCusFullName());
        
        setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));

    }// </editor-fold>//GEN-END:initComponents

    private void jbtnEditActionPerformed(java.awt.event.ActionEvent evt, PaymentAccountDTO account, CustomerDTO customer) {//GEN-FIRST:event_jbtnEditActionPerformed
        AccountInfo accInfo = new AccountInfo(account, customer);
        accInfo.setVisible(true);
    }//GEN-LAST:event_jbtnEditActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt, PaymentAccountDTO account) {//GEN-FIRST:event_jbtnDeleteActionPerformed
       PaymentAccountBUS accBus = new PaymentAccountBUS();
       int result = JOptionPane.showConfirmDialog(null, "Xóa tài khoản : "+account.getAccountID()+" ?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            accBus.delete(account.getAccountID());
            JOptionPane.showMessageDialog(null, "Xóa tài khoản thành công");
            JOptionPane.getRootFrame().dispose();
        } else {
            // Đóng cửa sổ hiện lên
        }

    }//GEN-LAST:event_jbtnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnEdit;
    private javax.swing.JLabel lbAccID;
    private javax.swing.JLabel lbAccNumber;
    private javax.swing.JLabel lbAccOwner;
    // End of variables declaration//GEN-END:variables
}
