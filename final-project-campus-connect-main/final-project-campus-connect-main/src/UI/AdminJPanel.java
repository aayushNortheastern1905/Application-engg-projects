/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.EmployerDirectory;
import Business.StudentDirectory;
import Business.CertificateAuthorityDirectory;
import Business.StudentDirectory;
import javax.swing.JPanel;
import java.awt.CardLayout;

/**
 *
 * @author Ayush
 */
public class AdminJPanel extends javax.swing.JPanel {
        private JPanel workArea;
        private EmployerDirectory employerDirectory;
        private CertificateAuthorityDirectory certificateAuthorityDirectory;
        private StudentDirectory studentDirectory;


    /**
     * Creates new form AdminJPanel
     */
    public AdminJPanel(JPanel workArea, EmployerDirectory employerDirectory, CertificateAuthorityDirectory certificateAuthorityDirectory, StudentDirectory studentDirectory) {
        initComponents();
        this.workArea = workArea;
        this.employerDirectory = employerDirectory;
        this.certificateAuthorityDirectory = certificateAuthorityDirectory;
        this.studentDirectory = studentDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStudentArea = new javax.swing.JLabel();
        btnCreateEmployer = new javax.swing.JButton();
        btnCreateCertificateAuthority = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        btnReviewFinanicalAid = new javax.swing.JButton();
        btnAssignStudents = new javax.swing.JToggleButton();

        lblStudentArea.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblStudentArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentArea.setText("Admin Work Area");

        btnCreateEmployer.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnCreateEmployer.setText("Create Employer");
        btnCreateEmployer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployerActionPerformed(evt);
            }
        });

        btnCreateCertificateAuthority.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnCreateCertificateAuthority.setText("Create Certificate Authority");
        btnCreateCertificateAuthority.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCertificateAuthorityActionPerformed(evt);
            }
        });

        btnLogOut.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnLogOut.setText("<<Log Out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        btnReviewFinanicalAid.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnReviewFinanicalAid.setText("Review Financial Aid");
        btnReviewFinanicalAid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewFinanicalAidActionPerformed(evt);
            }
        });

        btnAssignStudents.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnAssignStudents.setText("Assign Students");
        btnAssignStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignStudentsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStudentArea, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnLogOut)
                .addContainerGap(599, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReviewFinanicalAid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateCertificateAuthority, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreateEmployer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAssignStudents, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblStudentArea, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126)
                .addComponent(btnCreateEmployer, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCreateCertificateAuthority, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReviewFinanicalAid, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAssignStudents, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 231, Short.MAX_VALUE)
                .addComponent(btnLogOut)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateEmployerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployerActionPerformed
        CreateEmployerJPanel createEmployerJPanel = new CreateEmployerJPanel(workArea,employerDirectory);
        workArea.add("CreateEmployerJPanel", createEmployerJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnCreateEmployerActionPerformed

    private void btnCreateCertificateAuthorityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCertificateAuthorityActionPerformed
        CreateCertificateAuthorityJPanel createCertificateAuthorityJPanel = new CreateCertificateAuthorityJPanel(workArea,certificateAuthorityDirectory);
        workArea.add("CreateCertificateAuthorityJPanel", createCertificateAuthorityJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);    }//GEN-LAST:event_btnCreateCertificateAuthorityActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void btnReviewFinanicalAidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewFinanicalAidActionPerformed
        // TODO add your handling code here:
        ReviewFinancialAidJPanel reviewFinancialAidJPanel = new ReviewFinancialAidJPanel(workArea,studentDirectory);
        workArea.add("ReviewFinancialAidJPanel", reviewFinancialAidJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnReviewFinanicalAidActionPerformed

    private void btnAssignStudentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignStudentsActionPerformed
        // TODO add your handling code here:
        AdminAssignJPanel adminAssignJPanel = new AdminAssignJPanel(workArea, studentDirectory, employerDirectory);
        workArea.add("AdminAssignJPanel", adminAssignJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnAssignStudentsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAssignStudents;
    private javax.swing.JButton btnCreateCertificateAuthority;
    private javax.swing.JButton btnCreateEmployer;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReviewFinanicalAid;
    private javax.swing.JLabel lblStudentArea;
    // End of variables declaration//GEN-END:variables
}
