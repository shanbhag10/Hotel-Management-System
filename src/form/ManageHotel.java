/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author neelkapadia
 */
public class ManageHotel extends javax.swing.JFrame {

    /**
     * Creates new form ManageHotel
     */
    public ManageHotel() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        addHotel = new javax.swing.JRadioButton();
        updateHotel = new javax.swing.JRadioButton();
        deleteHotel = new javax.swing.JRadioButton();
        viewHotel = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        submitHotel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonGroup1.add(addHotel);
        addHotel.setText("Add Hotel");
        addHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addHotelActionPerformed(evt);
            }
        });

        buttonGroup1.add(updateHotel);
        updateHotel.setText("Update Hotel");
        updateHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateHotelActionPerformed(evt);
            }
        });

        buttonGroup1.add(deleteHotel);
        deleteHotel.setText("Delete Hotel");

        buttonGroup1.add(viewHotel);
        viewHotel.setText("View Hotels");

        jLabel4.setFont(new java.awt.Font("Silom", 2, 24)); // NOI18N
        jLabel4.setText("Wolf Inns");

        jLabel3.setText("Please Choose Task:");

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        submitHotel.setText("Submit");
        submitHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitHotelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(deleteHotel)
                    .addComponent(updateHotel)
                    .addComponent(addHotel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submitHotel)
                        .addComponent(viewHotel)))
                .addContainerGap(220, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Home)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(22, 22, 22)
                .addComponent(addHotel)
                .addGap(18, 18, 18)
                .addComponent(updateHotel)
                .addGap(18, 18, 18)
                .addComponent(deleteHotel)
                .addGap(18, 18, 18)
                .addComponent(viewHotel)
                .addGap(18, 18, 18)
                .addComponent(submitHotel)
                .addGap(25, 25, 25)
                .addComponent(Home)
                .addGap(10, 10, 10))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addHotelActionPerformed
                // TODO add your handling code here:
               
    }//GEN-LAST:event_addHotelActionPerformed

    private void updateHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateHotelActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        Manager mng = new Manager();
        mng.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void submitHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitHotelActionPerformed
        // TODO add your handling code here:

        if(addHotel.isSelected()){
            //open add record form
            AddHotel adh = new AddHotel();
            sysExit();
            adh.setVisible(true);

        } else if(updateHotel.isSelected()){
            //open update record form
            UpdateHotel uph = new UpdateHotel();
            sysExit();
            uph.setVisible(true);
        } else if(deleteHotel.isSelected()){

            DeleteHotel dlh = new DeleteHotel();
            sysExit();
            dlh.setVisible(true);
            //open delete record form
        } else if(viewHotel.isSelected()){
            //view list of records
            
            ViewHotels vh = new ViewHotels();
            sysExit();
            vh.setVisible(true);
        } else {
            //throw error
            
                                        JFrame jf = new JFrame();
                JOptionPane.showMessageDialog(jf,"PLEASE CHOOSE","ERROR",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_submitHotelActionPerformed

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
            java.util.logging.Logger.getLogger(ManageHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageHotel().setVisible(true);
            }
        });
    }
    
       public void sysExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JRadioButton addHotel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton deleteHotel;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton submitHotel;
    private javax.swing.JRadioButton updateHotel;
    private javax.swing.JRadioButton viewHotel;
    // End of variables declaration//GEN-END:variables
}
