package form;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author neelkapadia
 */
public class CheckIn extends javax.swing.JFrame {

    /**
     * Creates new form CheckInNew
     */
    
    
    
    public CheckIn() {
        initComponents();
        getDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Home = new javax.swing.JButton();
        Logout1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Room = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Customer = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        Submit = new javax.swing.JButton();
        bookingId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        startDate = new javax.swing.JTextField();
        endDate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cssn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        payType = new javax.swing.JTextField();
        addr = new javax.swing.JTextField();
        cardno = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Logout1.setText("Logout");
        Logout1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Logout1ActionPerformed(evt);
            }
        });

        Room.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RoomNum", "Category", "Capacity", "Price"
            }
        ));
        jScrollPane1.setViewportView(Room);

        Customer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cust ID", "Name", "Email"
            }
        ));
        jScrollPane2.setViewportView(Customer);

        jLabel4.setFont(new java.awt.Font("Silom", 2, 24)); // NOI18N
        jLabel4.setText("Wolf Inns");

        Submit.setText("Confirm");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });

        bookingId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingIdActionPerformed(evt);
            }
        });

        jLabel1.setText("BookingID");

        startDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateActionPerformed(evt);
            }
        });

        endDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endDateActionPerformed(evt);
            }
        });

        jLabel2.setText("Start Date (YYYY-MM-DD)");

        jLabel3.setText("End Date (YYYY-MM-DD)");

        cssn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cssnActionPerformed(evt);
            }
        });

        jLabel5.setText("Customer SSN");

        jLabel6.setText("Payment Type");

        jLabel7.setText("Address");

        jLabel8.setText("Card Number");

        payType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payTypeActionPerformed(evt);
            }
        });

        addr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addrActionPerformed(evt);
            }
        });

        cardno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cardnoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Submit)
                                .addGap(115, 115, 115)
                                .addComponent(Home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Logout1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cssn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(payType, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addGap(81, 81, 81)
                                            .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bookingId, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jLabel4)))
                        .addGap(264, 264, 264))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookingId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cssn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(addr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8)
                    .addComponent(payType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Submit)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Home)
                            .addComponent(Logout1))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        FrontDesk fd = new FrontDesk();
        sysExit();
        fd.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void Logout1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Logout1ActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        sysExit();
        l.setVisible(true);
    }//GEN-LAST:event_Logout1ActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        //commit rooms
        System.out.println("Before row selection");
        rowSelection();
        System.out.println("After row selection");

        FrontDesk fd = new FrontDesk();
        sysExit();
        fd.setVisible(true);
    }//GEN-LAST:event_SubmitActionPerformed

    private void bookingIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookingIdActionPerformed

    private void startDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startDateActionPerformed

    private void endDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endDateActionPerformed

    private void cssnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cssnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cssnActionPerformed

    private void payTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_payTypeActionPerformed

    private void addrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addrActionPerformed

    private void cardnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cardnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cardnoActionPerformed

    public void inserts(int roomNum, String roomCategory, int roomCapacity, int roomPrice, int[] custId, String[] custName, String[] custEmail){
        
        db_connection db = new db_connection();
        Connection conn = null;
        ResultSet rs;
        Statement stmt = null;
        Statement stmt2 = null;

        try {
            conn = db.connect_db();
            stmt = conn.createStatement();
            stmt2 = conn.createStatement();
            
            conn.setAutoCommit(false);
            
            System.out.println("Inside inserts");

            System.out.println(roomNum + "," + roomCategory + "," + roomCapacity + "," + roomPrice + "," + custId[0] + "," + custName[0] + "," + custEmail[0]);

            int bookId = Integer.parseInt(bookingId.getText());
            String sDate = startDate.getText();
            String eDate = endDate.getText();
            String ssn = cssn.getText();
            String address = addr.getText();
            String paymentType = payType.getText();
            int cardNumber = Integer.parseInt(cardno.getText());

            Calendar cal = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
    //        System.out.println(time);
    //        System.out.println(time.getClass().getName());
            String checkinTime = sdf.format(cal.getTime());

            //Write all queries
            // Assuming 11am as the common checkout time
            String insertBookingInfo = "INSERT INTO BookingInfo VALUES ("+bookId+", '"+checkinTime+"', '11:00:00', '"+sDate+"', '"+eDate+"')";
            String insertBillInfo = "INSERT INTO BillInfo VALUES('"+ssn+"', '"+paymentType+"', '"+address+"', "+cardNumber+")";
            String insertHas = "INSERT INTO has VALUES ("+ssn+", "+bookId+")";
            String getHotelId = "SELECT hotelid FROM worksFor WHERE staffid='"+Intermediate.getItem("frontDeskStaffId")+"'";

            stmt.executeUpdate(insertBookingInfo);
            stmt.executeUpdate(insertBillInfo);
            stmt.executeUpdate(insertHas);
            rs = stmt.executeQuery(getHotelId);
            rs.next();
            int hotelId = Integer.parseInt(rs.getString("hotelid"));

            String insertIsAssigned = "INSERT INTO isAssigned VALUES ("+bookId+", "+hotelId+", "+roomNum+")";
            stmt.executeUpdate(insertIsAssigned);

            System.out.println("Number of customers selected -"+custId.length);
            for(int i = 0; i < custId.length; i++){
                // Needs to be executed for each customer
                System.out.println(custId[i]);
                String insertGets = "INSERT INTO gets VALUES ("+custId[i]+", "+bookId+")";
                stmt.executeUpdate(insertGets);
            }
            String roomAvailabilityToggle = "UPDATE Room SET avail=0 WHERE hotelid="+hotelId+" AND roomnum="+roomNum;
            stmt.executeUpdate(roomAvailabilityToggle);

            if(roomCategory.equals("Presidential")){
                String cateringStaffAvailable = "SELECT staffid FROM Staff WHERE jobtitle='Catering Staff' AND avail=1 LIMIT 1";
                rs = stmt.executeQuery(cateringStaffAvailable);
                if(rs.next()){
                    // Add to isAssignedCaterer
                    int staffId = rs.getInt("staffid");
                    String insertCaterer = "INSERT INTO isAssignedCaterer VALUES ("+staffId+", "+hotelId+", "+roomNum+")";
                    stmt.executeUpdate(insertCaterer);

                    String updateCatererAvailability = "UPDATE Staff SET avail=0 WHERE staffid="+staffId;
                    stmt.executeUpdate(updateCatererAvailability);

                    String roomServiceStaffAvailable = "SELECT staffid FROM Staff WHERE jobtitle='Room Service Staff' AND avail=1 LIMIT 1";
                    rs = stmt2.executeQuery(roomServiceStaffAvailable);
                    if(rs.next()){
                        int staffId2 = rs.getInt("staffid");
                        String insertRoomService = "INSERT INTO isAssignedRoomService VALUES ("+staffId2+", "+hotelId+", "+roomNum+")";
                        stmt2.executeUpdate(insertRoomService);

                        String updateRoomServiceAvailability = "UPDATE Staff SET avail=0 WHERE staffid="+staffId2;
                        stmt2.executeUpdate(updateRoomServiceAvailability);

                    }
                    else{
                        JFrame jf = new JFrame();
                        JOptionPane.showMessageDialog(jf, "No Room Service Staff available. Rolled back!", "ERROR", JOptionPane.ERROR_MESSAGE);

                        System.out.println("No Room Service Staff available");
                        conn.rollback();
                    }
                }
                else{
                    JFrame jf = new JFrame();
                    JOptionPane.showMessageDialog(jf, "No Catering Staff available. ROlled back!", "ERROR", JOptionPane.ERROR_MESSAGE);

                    System.out.println("No Catering Staff available");
                    conn.rollback();
                }
                
            }
            // Success!
            conn.commit();
            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf, "BOOKING CONFIRMED", "", JOptionPane.INFORMATION_MESSAGE);

            
        } catch (Exception ex) {
            ex.printStackTrace();
            JFrame jf = new JFrame();
            JOptionPane.showMessageDialog(jf, "Error in insertions after checkin", "ERROR", JOptionPane.ERROR_MESSAGE);
            try {
                conn.rollback();
            } catch (SQLException ex1) {
                Logger.getLogger(CheckIn.class.getName()).log(Level.SEVERE, null, ex1);
            }
        }
        finally{
            if (stmt != null) {
                try {
                    stmt.close();
                    stmt2.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddRecord.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public void rowSelection(){
        // Adding selection functionality for rooms
        Room.setRowSelectionAllowed(true);
        ListSelectionModel ls = Room.getSelectionModel();
        ls.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        
        // Adding selection functionality for rooms
        Customer.setRowSelectionAllowed(true);
        ListSelectionModel lsCust = Customer.getSelectionModel();
        lsCust.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        System.out.println("Inside row selection - before room");

        int[] selectedRoom = Room.getSelectedRows();
        System.out.println("Room rows selected");
        System.out.println(selectedRoom[0]);
        int row = selectedRoom[0];
        
        // Storing room details in variables
        int roomNum = Integer.parseInt((String)Room.getValueAt(row, 0));
        String roomCategory = (String)Room.getValueAt(row, 1);
        int roomCapacity = Integer.parseInt((String)Room.getValueAt(row, 2));
        int roomPrice = Integer.parseInt((String)Room.getValueAt(row, 3));
        
        System.out.println(roomNum + "," + roomCategory + "," + roomCapacity + "," + roomPrice);
        
        System.out.println("Inside row selection - before customer");
        
        int[] selectedCusts = Customer.getSelectedRows();
        System.out.println(selectedCusts[0]);
        
        // Storing customer details
        
        System.out.println("Length - "+selectedCusts.length);
        
//        for(int i = 0; i<selectedCusts.length; i++){
//            System.out.println(selectedCusts[i]);
//            System.out.println((String)Room.getValueAt(i, 0));
//        }
        
        int[] custId = new int[selectedCusts.length];
        String[] custName = new String[selectedCusts.length];
        String[] custEmail = new String[selectedCusts.length];
        
        for(int i = 0; i < selectedCusts.length; i++){
            custId[i] = Integer.parseInt((String)Customer.getValueAt(i, 0));
            custName[i] = (String)Customer.getValueAt(i, 1);
            custEmail[i] = (String)Customer.getValueAt(i, 2);
        }
        
        inserts(roomNum, roomCategory, roomCapacity, roomPrice, custId, custName, custEmail);
        
//        ls.addListSelectionListener(new ListSelectionListener() {
//            public void valueChanged(ListSelectionEvent e) {
//                String selectedData = null;
//                // array which stores the indices of selected rows from the table
//                int[] selectedRow = Room.getSelectedRows();
//                System.out.println("Room rows selected");
//                System.out.println(selectedRow[0]);
////                    for (int i = 0; i < selectedRow.length; i++) {
////                        for (int j = 0; j < 4; j++) {
////                            selectedData = (String) Room.getValueAt(selectedRow[i], j);
////                            System.out.print(selectedData + " ");
////                        }
////                        System.out.println("");
////                    }
//                //System.out.println("Selected: " + selectedData);
//            }
//        });


//        lsCust.addListSelectionListener(new ListSelectionListener() {
//            public void valueChanged(ListSelectionEvent e) {
//                String selectedData = null;
//                int[] selectedRow = Customer.getSelectedRows();
//                System.out.println(selectedRow[0]);
////                    for (int i = 0; i < selectedRow.length; i++) {
////                        for (int j = 0; j < 3; j++) {
////                            selectedData = (String) Customer.getValueAt(selectedRow[i], j);
////                            System.out.print(selectedData + " ");
////                        }
////                        System.out.println("");
////                    }
//                //System.out.println("Selected: " + selectedData);
//            }
//        });
        System.out.println("Exiting row selection");
    }
    
    public void getDetails() {
        db_connection db = new db_connection();
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs;
        try {
//            String sid = staffid.getText();
//            int id = Integer.parseInt(sid);

            // Setting values for testing
           

            conn = db.connect_db();
            stmt = conn.createStatement();
            // Temporary query so you do not have to login. Assuming front desk staff with id 103 logs in everytime
//            rs = stmt.executeQuery("SELECT roomNum, room.category, capacity, p.price FROM Room, RoomPrice p WHERE avail = 1 AND Room.category = p.category AND HotelId = (SELECT HotelId FROM worksFor WHERE StaffId = 103) ORDER BY room.category;");

            rs = stmt.executeQuery("SELECT roomNum, room.category, capacity, p.price FROM Room, RoomPrice p WHERE avail = 1 AND Room.category = p.category AND HotelId = (SELECT HotelId FROM worksFor WHERE StaffId = " + Intermediate.getItem("frontDeskStaffId") + ") ORDER BY room.category;");
            
            DefaultTableModel model = (DefaultTableModel) Room.getModel();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
            
            rs = stmt.executeQuery("select custid, name, email from customer WHERE custid NOT IN (Select custid FROM gets)");
            DefaultTableModel modelCust = (DefaultTableModel) Customer.getModel();
            while (rs.next()) {
                modelCust.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3)});
            }

//            if(staff == false && frontDesk == false && manager == false){
//                JFrame jf = new JFrame();
//                JOptionPane.showMessageDialog(jf,"INVALID LOGIN DETAILS","LOGIN ERROR",JOptionPane.ERROR_MESSAGE);
//            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AddCustomer.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }

    public void sysExit() {
        WindowEvent winClosing = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }

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
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CheckIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CheckIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Customer;
    private javax.swing.JButton Home;
    private javax.swing.JButton Logout1;
    private javax.swing.JTable Room;
    private javax.swing.JButton Submit;
    private javax.swing.JTextField addr;
    private javax.swing.JTextField bookingId;
    private javax.swing.JTextField cardno;
    private javax.swing.JTextField cssn;
    private javax.swing.JTextField endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField payType;
    private javax.swing.JTextField startDate;
    // End of variables declaration//GEN-END:variables
}