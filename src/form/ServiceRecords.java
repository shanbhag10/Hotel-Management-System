/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

/**
 *
 * @author saurabhshanbhag
 */
public class ServiceRecords extends javax.swing.JFrame {

    /**
     * Creates new form ServiceRecords
     */
    public ServiceRecords() {
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

        wolfInn1 = new wolfinn.WolfInn();
        wolfInn2 = new wolfinn.WolfInn();
        addServiceRecord = new javax.swing.JRadioButton();
        updateServiceRecord = new javax.swing.JRadioButton();
        deleteServiceRecord = new javax.swing.JRadioButton();
        viewServiceRecord = new javax.swing.JRadioButton();
        submitServiceRecord = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addServiceRecord.setText("Add Service Record");

        updateServiceRecord.setText("Update Service Record");

        deleteServiceRecord.setText("Delete Service Record");

        viewServiceRecord.setText("View Service Records");

        submitServiceRecord.setText("Submit");
        submitServiceRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitServiceRecordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viewServiceRecord)
                    .addComponent(deleteServiceRecord)
                    .addComponent(updateServiceRecord)
                    .addComponent(addServiceRecord))
                .addGap(183, 183, 183))
            .addGroup(layout.createSequentialGroup()
                .addGap(203, 203, 203)
                .addComponent(submitServiceRecord)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(addServiceRecord)
                .addGap(18, 18, 18)
                .addComponent(updateServiceRecord)
                .addGap(18, 18, 18)
                .addComponent(deleteServiceRecord)
                .addGap(18, 18, 18)
                .addComponent(viewServiceRecord)
                .addGap(18, 18, 18)
                .addComponent(submitServiceRecord)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitServiceRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitServiceRecordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitServiceRecordActionPerformed

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
            java.util.logging.Logger.getLogger(ServiceRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ServiceRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ServiceRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ServiceRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServiceRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton addServiceRecord;
    private javax.swing.JRadioButton deleteServiceRecord;
    private javax.swing.JButton submitServiceRecord;
    private javax.swing.JRadioButton updateServiceRecord;
    private javax.swing.JRadioButton viewServiceRecord;
    private wolfinn.WolfInn wolfInn1;
    private wolfinn.WolfInn wolfInn2;
    // End of variables declaration//GEN-END:variables
}
