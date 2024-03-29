/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.BrokerDirectory;
import Business.ManagementDirectory;
import Business.Owner;
import Business.OwnerDirectory;
import Business.PropertyDirectory;
import Business.UniversityDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sawan
 */
public class OwnerJPanel extends javax.swing.JPanel {
 private JPanel workArea;
 private OwnerDirectory ownerDirectory;
 private Owner owner;
 private PropertyDirectory propertyDirectory;
 private BrokerDirectory brokerDirectory;
 private ManagementDirectory managementDIrectory;
 private UniversityDirectory universityDirectory;
    /**
     * Creates new form OwnerJPanel
     */
    public OwnerJPanel(JPanel workArea,Owner owner,OwnerDirectory ownerDirectory, PropertyDirectory propertyDirectory, BrokerDirectory brokerDirectory, ManagementDirectory managementDIrectory, UniversityDirectory universityDirectory  ) {
        this.workArea = workArea;
        this.owner = owner;
        this.ownerDirectory = ownerDirectory;
        this.propertyDirectory = propertyDirectory;
        this.managementDIrectory = managementDIrectory;
        this.brokerDirectory = brokerDirectory;
        this.universityDirectory = universityDirectory;
        

        initComponents();
                        lblOwner.setText("Welcome " + owner.getOwnerName());

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOwner = new javax.swing.JLabel();
        btnAddProperty = new javax.swing.JButton();
        btnViewProps = new javax.swing.JButton();
        btnLogOutStudentArea = new javax.swing.JButton();

        setBackground(new java.awt.Color(223, 223, 223));

        lblOwner.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblOwner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOwner.setText("Welcome Owner");

        btnAddProperty.setBackground(new java.awt.Color(0, 0, 0));
        btnAddProperty.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnAddProperty.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProperty.setText("Add Property");
        btnAddProperty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPropertyActionPerformed(evt);
            }
        });

        btnViewProps.setBackground(new java.awt.Color(0, 0, 0));
        btnViewProps.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnViewProps.setForeground(new java.awt.Color(255, 255, 255));
        btnViewProps.setText("View Properties");
        btnViewProps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPropsActionPerformed(evt);
            }
        });

        btnLogOutStudentArea.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnLogOutStudentArea.setText("<< Log Out");
        btnLogOutStudentArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutStudentAreaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblOwner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(btnAddProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewProps))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLogOutStudentArea, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(194, 194, 194)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProperty, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewProps, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(btnLogOutStudentArea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPropertyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPropertyActionPerformed
        OwnerAddPropJPanel oapjp = new OwnerAddPropJPanel(workArea, propertyDirectory, owner, brokerDirectory, managementDIrectory, universityDirectory);
        workArea.add("OwnerAddPropJPanel",oapjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnAddPropertyActionPerformed

    private void btnViewPropsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPropsActionPerformed
        OwnerViewJPanel oapjp = new OwnerViewJPanel(workArea, owner, propertyDirectory);
        workArea.add("OwnerViewJPanel",oapjp);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewPropsActionPerformed

    private void btnLogOutStudentAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutStudentAreaActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnLogOutStudentAreaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProperty;
    private javax.swing.JButton btnLogOutStudentArea;
    private javax.swing.JButton btnViewProps;
    private javax.swing.JLabel lblOwner;
    // End of variables declaration//GEN-END:variables
}
