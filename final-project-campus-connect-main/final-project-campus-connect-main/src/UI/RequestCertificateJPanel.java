/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Student;
import javax.swing.JPanel;
import java.awt.CardLayout;


/**
 *
 * @author Ayush
 */
public class RequestCertificateJPanel extends javax.swing.JPanel {
        private JPanel workArea;
    private Student student;


    /**
     * Creates new form RequestCertificateJPanel
     */
    public RequestCertificateJPanel(JPanel workArea  ,Student student) {
        initComponents();
        this.workArea = workArea;
        this.student = student;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCertificatePanelTitle = new javax.swing.JLabel();
        lblRequestCertificate = new javax.swing.JLabel();
        btnRequestCertificate = new javax.swing.JButton();
        btnBackRequestForFinancialAid = new javax.swing.JButton();
        btnShowDegree = new javax.swing.JToggleButton();
        lblDegreeGranted = new javax.swing.JLabel();

        lblCertificatePanelTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblCertificatePanelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCertificatePanelTitle.setText("Certificates");

        lblRequestCertificate.setText("Request certificate by clicking on the button below :");

        btnRequestCertificate.setText("Request");
        btnRequestCertificate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestCertificateActionPerformed(evt);
            }
        });

        btnBackRequestForFinancialAid.setText("<<Back");
        btnBackRequestForFinancialAid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRequestForFinancialAidActionPerformed(evt);
            }
        });

        btnShowDegree.setText("Show Degree");
        btnShowDegree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDegreeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCertificatePanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblRequestCertificate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRequestCertificate)
                        .addGap(124, 124, 124))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBackRequestForFinancialAid, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnShowDegree))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(lblDegreeGranted, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblCertificatePanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBackRequestForFinancialAid, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestCertificate)
                    .addComponent(btnRequestCertificate))
                .addGap(62, 62, 62)
                .addComponent(btnShowDegree)
                .addGap(18, 18, 18)
                .addComponent(lblDegreeGranted, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 352, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestCertificateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestCertificateActionPerformed
        // TODO add your handling code here:
        student.setCertificateRequested(true);
    }//GEN-LAST:event_btnRequestCertificateActionPerformed

    private void btnBackRequestForFinancialAidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRequestForFinancialAidActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBackRequestForFinancialAidActionPerformed

    private void btnShowDegreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDegreeActionPerformed
        // TODO add your handling code here:
        if(student.isDegreegranted()){
                lblDegreeGranted.setText("Degree granted");
        }
        else{
                lblDegreeGranted.setText("Please request a degree");
        }
    }//GEN-LAST:event_btnShowDegreeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackRequestForFinancialAid;
    private javax.swing.JButton btnRequestCertificate;
    private javax.swing.JToggleButton btnShowDegree;
    private javax.swing.JLabel lblCertificatePanelTitle;
    private javax.swing.JLabel lblDegreeGranted;
    private javax.swing.JLabel lblRequestCertificate;
    // End of variables declaration//GEN-END:variables
}
