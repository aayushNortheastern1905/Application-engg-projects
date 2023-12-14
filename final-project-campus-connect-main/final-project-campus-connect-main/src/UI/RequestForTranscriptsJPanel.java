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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aayush
 */
public class RequestForTranscriptsJPanel extends javax.swing.JPanel {

             private JPanel workArea;
      private CoursesDirectory coursesDirectory;
      private StudentDirectory studentDirectory;
      private Student student;
    /**
     * Creates new form RequestForTranscripts
     */
    public RequestForTranscriptsJPanel(JPanel workArea,CoursesDirectory coursesDirectory,Student student) {
        initComponents();
                        this.workArea = workArea;
        this.coursesDirectory =  coursesDirectory;
        this.studentDirectory = studentDirectory;
        this.student =student;
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

        lblRequestForTranscripts = new javax.swing.JLabel();
        btnBackRequestTranscripts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestForTranscripts = new javax.swing.JTable();
        txtRatingViewTranscripts = new javax.swing.JTextField();
        lblProfessor = new javax.swing.JLabel();
        txtLanguageViewTranscripts = new javax.swing.JTextField();
        btnViewTranscripts = new javax.swing.JButton();
        lblLanguage = new javax.swing.JLabel();
        lblCourseName = new javax.swing.JLabel();
        lblSemester = new javax.swing.JLabel();
        txtCourseNameViewTranscripts = new javax.swing.JTextField();
        radioFallViewTranscripts = new javax.swing.JRadioButton();
        txtProfessorViewTranscripts = new javax.swing.JTextField();
        lblDescription = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        radioSpringViewTranscripts = new javax.swing.JRadioButton();
        lblRatingSelectCourses = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDescriptionViewTranscripts = new javax.swing.JTextArea();
        txtRegionViewTranscripts = new javax.swing.JTextField();

        lblRequestForTranscripts.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblRequestForTranscripts.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRequestForTranscripts.setText("Request For Transcripts");

        btnBackRequestTranscripts.setText("<<Back");
        btnBackRequestTranscripts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackRequestTranscriptsActionPerformed(evt);
            }
        });

        tblRequestForTranscripts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Course ID", "Course Name", "Description", "Professor", "Region", "Semester", "Language", "Rating"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblRequestForTranscripts);

        txtRatingViewTranscripts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRatingViewTranscriptsActionPerformed(evt);
            }
        });

        lblProfessor.setText("Professor");

        btnViewTranscripts.setText("View");
        btnViewTranscripts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTranscriptsActionPerformed(evt);
            }
        });

        lblLanguage.setText("Language");

        lblCourseName.setText("Course Name");

        lblSemester.setText("Semester");

        radioFallViewTranscripts.setText("Fall");

        lblDescription.setText("Description");

        lblRegion.setText("Region");

        radioSpringViewTranscripts.setText("Spring");

        lblRatingSelectCourses.setText("Rating");

        txtAreaDescriptionViewTranscripts.setColumns(20);
        txtAreaDescriptionViewTranscripts.setRows(5);
        jScrollPane2.setViewportView(txtAreaDescriptionViewTranscripts);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLanguage)
                                    .addComponent(lblRegion)
                                    .addComponent(lblProfessor)
                                    .addComponent(lblSemester)
                                    .addComponent(lblRatingSelectCourses))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLanguageViewTranscripts)
                            .addComponent(txtRegionViewTranscripts)
                            .addComponent(txtCourseNameViewTranscripts)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioFallViewTranscripts)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioSpringViewTranscripts))
                            .addComponent(txtRatingViewTranscripts)
                            .addComponent(txtProfessorViewTranscripts)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(btnViewTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnBackRequestTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(lblRequestForTranscripts, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                                .addGap(26, 26, 26))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequestForTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBackRequestTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCourseNameViewTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewTranscripts))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescription)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProfessor)
                    .addComponent(txtProfessorViewTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRegion)
                    .addComponent(txtRegionViewTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanguage)
                    .addComponent(txtLanguageViewTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSemester)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioSpringViewTranscripts)
                        .addComponent(radioFallViewTranscripts)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRatingViewTranscripts, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRatingSelectCourses))
                .addGap(0, 11, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackRequestTranscriptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackRequestTranscriptsActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
        populateTable();
    }//GEN-LAST:event_btnBackRequestTranscriptsActionPerformed

    private void txtRatingViewTranscriptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRatingViewTranscriptsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRatingViewTranscriptsActionPerformed

    private void btnViewTranscriptsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTranscriptsActionPerformed
        // TODO add your handling code here:

        int selectedRow = tblRequestForTranscripts.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null,"Please select a row from table first to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            DefaultTableModel model = (DefaultTableModel) tblRequestForTranscripts.getModel();

            String courseID = (String) model.getValueAt(selectedRow, 0);
            String courseName = (String) model.getValueAt(selectedRow, 1);
            String description = (String) model.getValueAt(selectedRow, 2);
            String professor = (String) model.getValueAt(selectedRow,3);
            String region = (String) model.getValueAt(selectedRow, 4);

            String term = (String) model.getValueAt(selectedRow, 5);
            String language = (String) model.getValueAt(selectedRow, 6);
            Double rating = (Double) model.getValueAt(selectedRow, 7);

            txtCourseNameViewTranscripts.setText(courseName);
            txtAreaDescriptionViewTranscripts.setText(description);
            txtRegionViewTranscripts.setText(region);
            txtLanguageViewTranscripts.setText(language);
            txtProfessorViewTranscripts.setText(professor);
            txtRatingViewTranscripts.setText(rating.toString());

            if(term == "Fall") {
                radioFallViewTranscripts.setSelected(true);
                radioSpringViewTranscripts.setSelected(false);
            } else {
                radioFallViewTranscripts.setSelected(false);
                radioSpringViewTranscripts.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnViewTranscriptsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBackRequestTranscripts;
    private javax.swing.JButton btnViewTranscripts;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblProfessor;
    private javax.swing.JLabel lblRatingSelectCourses;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblRequestForTranscripts;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JRadioButton radioFallViewTranscripts;
    private javax.swing.JRadioButton radioSpringViewTranscripts;
    private javax.swing.JTable tblRequestForTranscripts;
    private javax.swing.JTextArea txtAreaDescriptionViewTranscripts;
    private javax.swing.JTextField txtCourseNameViewTranscripts;
    private javax.swing.JTextField txtLanguageViewTranscripts;
    private javax.swing.JTextField txtProfessorViewTranscripts;
    private javax.swing.JTextField txtRatingViewTranscripts;
    private javax.swing.JTextField txtRegionViewTranscripts;
    // End of variables declaration//GEN-END:variables

        private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel) tblRequestForTranscripts.getModel();
        dtm.setRowCount(0);
        for (Course course : student.getStudentCourseDirectory()){
            if(course.isIsCompleted()==true){
             Object[] row = new Object[8];
            row[0] = course.getCourseID();
            row[1] = course.getCourseName();
            row[2] = course.getDescription();
            row[3] = course.getProfessor().getProfessorName();
            row[4] = course.getRegion();
            row[5] = course.getTerm();
            row[6] = course.getLanguage();
            row[7] = course.getRating();
            
            dtm.addRow(row);
            }

            
        }
    }
}