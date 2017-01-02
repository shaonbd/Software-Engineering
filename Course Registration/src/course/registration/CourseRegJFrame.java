package course.registration;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public final class CourseRegJFrame extends javax.swing.JFrame
{
    RegisterCourseController rcc;
    int row = 0;
    public static int ck = 0;
    String[] data = new String[6];
    public static String[] ck_list = new String[7];
   
    public CourseRegJFrame()
    {
        initComponents();
        this.rcc = new RegisterCourseController();
        row = 0;
        showTable();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bNewRegistration = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        bAddCourse = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        RegTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tCourseID = new javax.swing.JTextField();
        jTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dv_fee_tax = new javax.swing.JLabel();
        grand_total = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        discount = new javax.swing.JLabel();
        cal_discount = new javax.swing.JButton();
        discount_comboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Course Registration Window");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        bNewRegistration.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bNewRegistration.setText("New Registration");
        bNewRegistration.setToolTipText("");
        bNewRegistration.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bNewRegistration.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNewRegistrationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Course ID");

        bAddCourse.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bAddCourse.setText("Add Course");
        bAddCourse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bAddCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAddCourseActionPerformed(evt);
            }
        });

        RegTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SL #", "Course ID", "Course Title", "Credit", "Tution/Credit", "Sub Total"
            }
        ));
        RegTable.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        RegTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane.setViewportView(RegTable);

        jLabel2.setText("Total");

        jTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jTotal.setText("0");

        jLabel3.setText("Development Fee / BD TAX");

        jLabel4.setText("Grand Total");

        dv_fee_tax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dv_fee_tax.setText("0");

        grand_total.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        grand_total.setText("0");

        jLabel5.setText("Discount");

        discount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        discount.setText("0");

        cal_discount.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cal_discount.setText("Calculate Discount");
        cal_discount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cal_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal_discountActionPerformed(evt);
            }
        });

        discount_comboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Academic Excellence", "Freedom Fighter", "Aboriginal / Minority Group", "Best for NSU", "Best for Student" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(bAddCourse)
                                    .addComponent(bNewRegistration, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tCourseID))))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(discount_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(40, 40, 40)))
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cal_discount)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(discount, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dv_fee_tax, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(grand_total, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bNewRegistration)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bAddCourse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTotal)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(discount_comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(dv_fee_tax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(cal_discount))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(discount))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(grand_total))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Add course Button
    
    private void bAddCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAddCourseActionPerformed
        String id = tCourseID.getText();
        String ids;
        boolean ckb = false;
        ids = id.toUpperCase();
        //DefaultTableModel model = (DefaultTableModel) RegTable.getModel();
        if(ids.equals(""))
        {
            JOptionPane.showMessageDialog(null,"Please Enter A Valid Course ID");
            tCourseID.setText(null);
        }
        else
        {
            if(ids.equals(rcc.getCourseInfo(ids).getID()))
            {
                for(int i=0; i<ck; i++){
                if(ids.equals(ck_list[i])){
                ckb = true;
                }
            }
                
              if(ckb){
                  JOptionPane.showMessageDialog(null,"Already added");
                  tCourseID.setText(null);}
              else{
              ck_list[ck]=ids;
              ck++;
              rcc.addCourse(ids);
            showTable();
            tCourseID.setText(null);
                try {
                    jTotal.setText(Integer.toString(rcc.reg.getTotal()));
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                try {
                    dv_fee_tax.setText(Integer.toString(rcc.reg.getExtraFeeAmount()));
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                
              /*  try {
                    grand_total.setText(Integer.toString(rcc.reg.getGrandTotal()));
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }   catch (IOException ex) {
                        Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }*/
              }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please Enter A Valid Course ID");
                tCourseID.setText(null);
            }
        }
    }//GEN-LAST:event_bAddCourseActionPerformed
//NewRegistration Button
    private void bNewRegistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNewRegistrationActionPerformed
        this.rcc = new RegisterCourseController();
        resetTable();
        row = 0;
        jTotal.setText("");
        discount.setText("");
        grand_total.setText("");
        dv_fee_tax.setText("");
       ck=0;
       ck_list=new String[7];
    }//GEN-LAST:event_bNewRegistrationActionPerformed
//Calculate Discount Button
    private void cal_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal_discountActionPerformed
                
        try {if((discount_comboBox.getSelectedItem().toString() == "Freedom Fighter")&&ck>5)
                 JOptionPane.showMessageDialog(null,"You can't take  more than five courses");   
                    
                   // rcc.addListenerToReg(this);
                    rcc.reg.publishPropertyEvent();
                    discount.setText(Integer.toString(rcc.reg.getDiscountAmount()));
                    grand_total.setText(Integer.toString(rcc.reg.getGrandTotal()));
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(CourseRegJFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
    }//GEN-LAST:event_cal_discountActionPerformed
//Select preferred discount    
    public static String getSelectedItem() {
        String s="";
        if(discount_comboBox.getSelectedItem().toString() == "Academic Excellence")
            s="AcademicExcellenceDiscount";
        else if(discount_comboBox.getSelectedItem().toString() == "Freedom Fighter")
            s="FreedomFighterDiscount";
        else if(discount_comboBox.getSelectedItem().toString() == "Aboriginal / Minority Group")
            s="AboriginalDiscount";
        else if(discount_comboBox.getSelectedItem().toString() == "Best for NSU")
            s="BestForNSU";
        else if(discount_comboBox.getSelectedItem().toString() == "Best for Student")
            s="BestForStudent";
        
        return s;
    }
    
    
    public void showTable()
    {
        DefaultTableModel model = (DefaultTableModel) RegTable.getModel();
        String id = tCourseID.getText();
        String ids;
        ids = id.toUpperCase();
        
        for(int i = row;i<rcc.reg.courseList.size();i++)
        {
            row++;
            data[0] = Integer.toString(row);
            data[1] = rcc.getCourseInfo(ids).getID();
            data[2] = rcc.getCourseInfo(ids).getTitle();
            data[3] = Integer.toString(rcc.getCourseInfo(ids).getCredit());
            data[4] = Integer.toString(rcc.getCourseInfo(ids).getTuitionPerCredit());
            data[5] = Integer.toString(rcc.reg.courseList.get(i).getSubTotal());
            
            model.addRow(data);
        }
        
        RegTable.setModel(model);
    }
    
    public void resetTable()
    {
        DefaultTableModel model = (DefaultTableModel) RegTable.getModel();
        for(int i=row-1 ; i>=0;i--)
        {
            model.removeRow(i);
            
            if(i==0)
            {
                JOptionPane.showMessageDialog(null, "Table Emptied and \n Ready for new Registration Process.");
            }
        }
        
        model.setRowCount(0);
        tCourseID.setText(null);
        RegTable.setModel(model);
        rcc.makeNewRegistration();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
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
            java.util.logging.Logger.getLogger(CourseRegJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseRegJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseRegJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseRegJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            @Override
            public void run() 
            {
                new CourseRegJFrame().setVisible(true);
            }
        }
        );
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable RegTable;
    private javax.swing.JButton bAddCourse;
    private javax.swing.JButton bNewRegistration;
    private javax.swing.JButton cal_discount;
    private javax.swing.JLabel discount;
    private static javax.swing.JComboBox discount_comboBox;
    private javax.swing.JLabel dv_fee_tax;
    private javax.swing.JLabel grand_total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel jTotal;
    private javax.swing.JTextField tCourseID;
    // End of variables declaration//GEN-END:variables
}
