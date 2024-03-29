/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Course;
import Business.CoursesDirectory;
import Business.Student;
import Business.StudentDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aayush
 */
public class StudentJPanel extends javax.swing.JPanel {
    
    private JPanel workArea;
    private CoursesDirectory coursesDirectory;
    private StudentDirectory studentDirectory;
    private Student student;

    /**
     * Creates new form StudentJPanel
     */
    public StudentJPanel(JPanel workArea  ,StudentDirectory studentDirectory,Student student, CoursesDirectory coursesDirectory) {
        initComponents();
        this.workArea = workArea;
        this.coursesDirectory = coursesDirectory;
        this.studentDirectory = studentDirectory;

        this.student = student;
        lblStudentArea.setText("Hello " + student.getStudentName() + "!");
        
  
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
        btnViewAllMyCourses = new javax.swing.JButton();
        btnRequestForTranscripts = new javax.swing.JButton();
        btnSelectCourses = new javax.swing.JButton();
        btnRequestForCertification = new javax.swing.JButton();
        btnLogOutStudentArea = new javax.swing.JButton();
        btnRequestForFinancialAid = new javax.swing.JButton();

        lblStudentArea.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblStudentArea.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStudentArea.setText("Student Work Area");

        btnViewAllMyCourses.setText("View All my courses");
        btnViewAllMyCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllMyCoursesActionPerformed(evt);
            }
        });

        btnRequestForTranscripts.setText("Request for Transcripts");
        btnRequestForTranscripts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestForTranscriptsActionPerformed(evt);
            }
        });

        btnSelectCourses.setText("Select courses");
        btnSelectCourses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectCoursesActionPerformed(evt);
            }
        });

        btnRequestForCertification.setText("Request for Certifications");
        btnRequestForCertification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestForCertificationActionPerformed(evt);
            }
        });

        btnLogOutStudentArea.setText("<< Log Out");
        btnLogOutStudentArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutStudentAreaActionPerformed(evt);
            }
        });

        btnRequestForFinancialAid.setText("Request for Financial Aid");
        btnRequestForFinancialAid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestForFinancialAidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblStudentArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(btnLogOutStudentArea, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnViewAllMyCourses)
                            .addComponent(btnSelectCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRequestForCertification)
                            .addComponent(btnRequestForTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(btnRequestForFinancialAid, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblStudentArea, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewAllMyCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestForTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSelectCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRequestForCertification, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnRequestForFinancialAid, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                .addComponent(btnLogOutStudentArea, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewAllMyCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllMyCoursesActionPerformed
        // TODO add your handling code here:
        
        StudentViewCoursesJPanel studentviewcoursesJPanel = new StudentViewCoursesJPanel(workArea, coursesDirectory , studentDirectory, student);
//        if(student.getStudentCourseDirectory()==null){
//            btnViewAllMyCourses.setEnabled(false);
//        }
    // check this usecase later
    // Test
        workArea.add("StudentViewCoursesJPanel", studentviewcoursesJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnViewAllMyCoursesActionPerformed

    private void btnRequestForTranscriptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestForTranscriptsActionPerformed
                RequestForTranscriptsJPanel requestForTranscriptsJPanel = new RequestForTranscriptsJPanel(workArea, coursesDirectory, student);
        workArea.add("RequestForTranscriptsJPanel", requestForTranscriptsJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnRequestForTranscriptsActionPerformed

    private void btnSelectCoursesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectCoursesActionPerformed
        // TODO add your handling code here:
        StudentSelectCourseJPanel studentSelectCourseJPanel = new StudentSelectCourseJPanel(workArea, coursesDirectory, student);
        workArea.add("StudentSelectCourseJPanel", studentSelectCourseJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnSelectCoursesActionPerformed

    private void btnRequestForCertificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestForCertificationActionPerformed
        
        if(student.getStudentCourseDirectory() == null){
                    JOptionPane.showMessageDialog(null,"You need to complete 8 courses in order to qualify for a degree", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else if(student.getStudentCourseDirectory() != null){
                int completedCourses = 0;
        for(Course course : student.getStudentCourseDirectory()) {
            if(course.isIsCompleted() == true) {
                completedCourses += 1;
            }
        }
        if(completedCourses < 8 || student.getStudentCourseDirectory() == null) {
            JOptionPane.showMessageDialog(null,"You need to complete 8 courses in order to qualify for a degree", "Warning",JOptionPane.WARNING_MESSAGE);
            }
        }
 else {
        RequestCertificateJPanel requestCertificateJPanel = new RequestCertificateJPanel(workArea, student);
        workArea.add("RequestCertificateJPanel", requestCertificateJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
        }
    }//GEN-LAST:event_btnRequestForCertificationActionPerformed

    private void btnLogOutStudentAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutStudentAreaActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnLogOutStudentAreaActionPerformed

    private void btnRequestForFinancialAidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestForFinancialAidActionPerformed
        FinancialAidRequestJPanel financialAidRequestJPanel = new FinancialAidRequestJPanel(workArea, student);
        workArea.add("FinancialAidRequestJPanel", financialAidRequestJPanel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnRequestForFinancialAidActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOutStudentArea;
    private javax.swing.JButton btnRequestForCertification;
    private javax.swing.JButton btnRequestForFinancialAid;
    private javax.swing.JButton btnRequestForTranscripts;
    private javax.swing.JButton btnSelectCourses;
    private javax.swing.JButton btnViewAllMyCourses;
    private javax.swing.JLabel lblStudentArea;
    // End of variables declaration//GEN-END:variables
}
