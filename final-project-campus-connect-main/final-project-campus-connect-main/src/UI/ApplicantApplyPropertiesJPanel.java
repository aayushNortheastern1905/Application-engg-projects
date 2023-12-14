/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Applicant;
import Business.ApplicantDirectory;
import Business.Application;
import Business.ApplicationDirectory;
import Business.Property;
import Business.InterestedCustomerDirectory;
import Business.InterestedCustomer;
import Business.PropertyDirectory;
import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ayush
 */
public class ApplicantApplyPropertiesJPanel extends javax.swing.JPanel {
    private JPanel workArea;
    private ApplicantDirectory applicantDirectory;
    private Applicant applicant;
    private PropertyDirectory propertyDirectory;

    /**
     * Creates new form ApplicantApplyPropertiesJPanel
     */
    public ApplicantApplyPropertiesJPanel(JPanel workArea, ApplicantDirectory applicantDirectory, Applicant applicant, PropertyDirectory propertyDirectory) {
        initComponents();
        this.workArea = workArea;
        this.applicantDirectory = applicantDirectory;
        this.applicant = applicant;
        this.propertyDirectory = propertyDirectory;
        populateTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAvailablePropertiesList = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblApplyProperties = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        lblPropertyName = new javax.swing.JLabel();
        lblPropertyNameValue = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblAddressValue = new javax.swing.JLabel();
        lblNumberOfRoomates = new javax.swing.JLabel();
        lblBudget = new javax.swing.JLabel();
        txtNumberOfRoomates = new javax.swing.JTextField();
        txtBudget = new javax.swing.JTextField();
        btnApply = new javax.swing.JButton();

        setBackground(new java.awt.Color(223, 223, 223));

        lblAvailablePropertiesList.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblAvailablePropertiesList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAvailablePropertiesList.setText("List of Available Properties");

        btnBack.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblApplyProperties.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        tblApplyProperties.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Name", "Address", "Pincode", "Tour", "Intake", "Broker Name", "Broker Email", "Broker Number", "Carpet Area"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblApplyProperties);

        btnView.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblPropertyName.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblPropertyName.setText("Property Name :");

        lblPropertyNameValue.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        lblPropertyNameValue.setText("        ");

        lblAddress.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblAddress.setText("Address :");

        lblAddressValue.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        lblAddressValue.setText("    ");

        lblNumberOfRoomates.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblNumberOfRoomates.setText("Number of Roomates :");

        lblBudget.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblBudget.setText("Budget :");

        txtNumberOfRoomates.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        txtNumberOfRoomates.setText(" ");

        txtBudget.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N

        btnApply.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnApply.setText("Apply");
        btnApply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAvailablePropertiesList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(601, 601, 601)
                        .addComponent(btnView))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(181, 181, 181)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblPropertyName)
                            .addComponent(lblAddress)
                            .addComponent(lblNumberOfRoomates)
                            .addComponent(lblBudget))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblAddressValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPropertyNameValue, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                            .addComponent(txtBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNumberOfRoomates, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApply)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 667, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAvailablePropertiesList, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPropertyName)
                    .addComponent(lblPropertyNameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(lblAddressValue, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumberOfRoomates, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumberOfRoomates))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBudget, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBudget))
                .addGap(18, 18, 18)
                .addComponent(btnApply, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblApplyProperties.getSelectedRow();
        
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row from table first to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) tblApplyProperties.getModel();
            
            String propertyName = (String) model.getValueAt(selectedRow, 1);
            String Address = (String) model.getValueAt(selectedRow, 2);
            lblPropertyNameValue.setText(propertyName);
            lblAddressValue.setText(Address);
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnApplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyActionPerformed
        // TODO add your handling code here:
        
        int selectedRow = tblApplyProperties.getSelectedRow();
        
        DefaultTableModel model = (DefaultTableModel) tblApplyProperties.getModel();
        String propertyId = (String) model.getValueAt(selectedRow, 0);
        
        Property selectedProperty = propertyDirectory.searchPropertyById(propertyId);
        
        String numberOfRoomates = txtNumberOfRoomates.getText();
                
        String depositAmount = txtBudget.getText();
        
        /* Adding to the applications of Applicant */
        ApplicationDirectory applicationDirectory = applicant.getApplicationDirectory();
                
        Application application = new Application();
        
        application.setApplicationID(propertyId);
        application.setNumberOfRoomates(numberOfRoomates);
        application.setDepositAmount(depositAmount);
        
        applicationDirectory.addApplication(application);
        
        /* Adding to Interested Customer */
        InterestedCustomerDirectory interestedCustomerDirectory = selectedProperty.getInterestedCustomerDirectory();
        
        InterestedCustomer interestedCustomer = new InterestedCustomer();
        
        interestedCustomer.setInterestedCustomerID(applicant.getApplicantID());
        interestedCustomer.setInterestedCustomerName(applicant.getApplicantName());
        interestedCustomer.setInterestedCustomerPhoneNumber(applicant.getApplicantPhoneNumber());
        interestedCustomer.setInterestedCustomerUserName(applicant.getApplicantUserName());
        interestedCustomer.setNumberOfRoomates(txtNumberOfRoomates.getText());
        interestedCustomer.setDepositAmount(txtBudget.getText());
        
        interestedCustomerDirectory.getInterestedCustomerDirectory().add(interestedCustomer);
        
        JOptionPane.showMessageDialog(null,"Application submitted!");
        lblPropertyNameValue.setText("");
        lblAddressValue.setText("");
        txtNumberOfRoomates.setText("");
        txtBudget.setText("");
    }//GEN-LAST:event_btnApplyActionPerformed

        private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblApplyProperties.getModel();
        dtm.setRowCount(0);
        for (Property property : propertyDirectory.getPropertyDirectory()){
            
            if(applicant.getApplicantUniversity().equals(property.getUniversity().getUniversityName()) && property.isIsOwnerApproved() && !property.isIsTaken()) {
                Object[] row = new Object[10];
                row[0] = property.getPropertyId();
                row[1] = property.getName();
                row[2] = property.getAddress();
                row[3] = property.getPincode();
                row[4] = property.getYoutubeLink();
                row[5] = property.getIntake();
                row[6] = property.getBroker().getBrokerName();
                row[7] = property.getBroker().getBrokerEmailID();
                row[8] = property.getBroker().getBrokerPhoneNumber();
                row[9] = property.getCartpetArea();
                dtm.addRow(row);                             
            }
        }
    }
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApply;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblAddressValue;
    private javax.swing.JLabel lblAvailablePropertiesList;
    private javax.swing.JLabel lblBudget;
    private javax.swing.JLabel lblNumberOfRoomates;
    private javax.swing.JLabel lblPropertyName;
    private javax.swing.JLabel lblPropertyNameValue;
    private javax.swing.JTable tblApplyProperties;
    private javax.swing.JTextField txtBudget;
    private javax.swing.JTextField txtNumberOfRoomates;
    // End of variables declaration//GEN-END:variables



}