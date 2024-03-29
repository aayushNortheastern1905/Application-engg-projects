/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Course;
import Business.CoursesDirectory;
import Business.Professor;
import Business.ProfessorDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class ProfessorViewCoursesJPanel extends javax.swing.JPanel {
    private ProfessorDirectory professorDirectory;
    private JPanel workArea;
    private CoursesDirectory coursesDirectory; 
    private Professor professor;
    private String courseID;
    /**
     * Creates new form ProfessorViewCoursesJPanel
     */
    ProfessorViewCoursesJPanel(JPanel workArea, Professor professor, CoursesDirectory coursesDirectory) {
        initComponents();
        this.professor = professor;
        this.workArea = workArea;
        this.coursesDirectory = coursesDirectory;
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblViewYourCourses = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblViewYourCourses = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        lblCourseName = new javax.swing.JLabel();
        lblDescription = new javax.swing.JLabel();
        lblRegion = new javax.swing.JLabel();
        txtCourseName = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtRegion = new javax.swing.JTextField();
        lblLanguage = new javax.swing.JLabel();
        txtLanguage = new javax.swing.JTextField();
        lblSemester = new javax.swing.JLabel();
        radioFall = new javax.swing.JRadioButton();
        radioSpring = new javax.swing.JRadioButton();
        btnBAck = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        lblViewYourCourses.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblViewYourCourses.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblViewYourCourses.setText("View Your Courses");

        tblViewYourCourses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Course Name", "Description", "Region", "Language", "Semester", "Rating"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblViewYourCourses);
        if (tblViewYourCourses.getColumnModel().getColumnCount() > 0) {
            tblViewYourCourses.getColumnModel().getColumn(0).setResizable(false);
            tblViewYourCourses.getColumnModel().getColumn(1).setResizable(false);
            tblViewYourCourses.getColumnModel().getColumn(2).setResizable(false);
            tblViewYourCourses.getColumnModel().getColumn(3).setResizable(false);
            tblViewYourCourses.getColumnModel().getColumn(4).setResizable(false);
            tblViewYourCourses.getColumnModel().getColumn(5).setResizable(false);
        }

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        lblCourseName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCourseName.setText("Course Name:");

        lblDescription.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDescription.setText("Description");

        lblRegion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblRegion.setText("Region:");

        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });

        txtDescription.setColumns(20);
        txtDescription.setRows(5);
        jScrollPane2.setViewportView(txtDescription);

        lblLanguage.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblLanguage.setText("Language:");

        txtLanguage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLanguageActionPerformed(evt);
            }
        });

        lblSemester.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSemester.setText("Semester:");

        buttonGroup1.add(radioFall);
        radioFall.setText("Fall");

        buttonGroup1.add(radioSpring);
        radioSpring.setText("Spring");

        btnBAck.setText("<<Back");
        btnBAck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBAckActionPerformed(evt);
            }
        });

        btnSearch.setText("Search by Course Name");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBAck)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblViewYourCourses, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnView))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblRegion)
                                .addComponent(lblLanguage)
                                .addComponent(lblDescription)
                                .addComponent(lblCourseName))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(lblSemester)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                                .addComponent(btnUpdate))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                            .addComponent(txtCourseName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRegion, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLanguage, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(radioFall)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(radioSpring)))
                        .addGap(0, 134, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblViewYourCourses, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBAck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCourseName)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRegion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblRegion)))
                    .addComponent(lblDescription))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLanguage)
                    .addComponent(txtLanguage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSemester)
                    .addComponent(radioFall)
                    .addComponent(radioSpring))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate)
                    .addComponent(btnSave))
                .addContainerGap(30, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBAckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBAckActionPerformed
        workArea.remove(this);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_btnBAckActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        int selectedRow = tblViewYourCourses.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from table first to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) tblViewYourCourses.getModel();
            String courseName = (String) model.getValueAt(selectedRow, 0);
            String description = (String) model.getValueAt(selectedRow, 1);
            String region = (String) model.getValueAt(selectedRow, 2);
            String language = (String) model.getValueAt(selectedRow, 3);
            String term = (String) model.getValueAt(selectedRow, 4);
            
            Course course = coursesDirectory.searchCourseByCourseName(courseName);
            courseID = course.getCourseID();

            
            txtCourseName.setText(courseName);
            txtDescription.setText(description);
            txtRegion.setText(region);
            txtLanguage.setText(language);
            
            txtCourseName.setEditable(false);
            txtDescription.setEditable(false);
            txtRegion.setEditable(false);
            txtLanguage.setEditable(false);
            
            
            if(term == "Fall") {
                radioFall.setSelected(true);
                radioSpring.setSelected(false);
            } else {
                radioFall.setSelected(false);
                radioSpring.setSelected(true);
            }
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void txtLanguageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLanguageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLanguageActionPerformed

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseNameActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed


    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        Course course = coursesDirectory.searchCourseByCourseName(txtSearch.getText());
        if(course == null) {
            JOptionPane.showMessageDialog(null, "Course Name you have entered does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
        } else {
             DefaultTableModel model = (DefaultTableModel) tblViewYourCourses.getModel();
             model.setRowCount(0);
             
             Object[] rowData = {
                 course.getCourseName(),
                 course.getDescription(),
                 course.getRegion(),
                 course.getLanguage(),
                 course.getTerm(),
             };
             model.addRow(rowData);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
            txtCourseName.setEditable(true);
            txtDescription.setEditable(true);
            txtRegion.setEditable(true);
            txtLanguage.setEditable(true);
            
            btnSave.setEnabled(true);
            btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if("".equals(txtCourseName.getText())) {
            JOptionPane.showMessageDialog(null,"Please enter the Course Name");
        } else if ("".equals(txtDescription.getText())) {
            JOptionPane.showMessageDialog(null,"Please enter the Description");
        } else if ("".equals(txtRegion.getText())){
            JOptionPane.showMessageDialog(null, "Please enter the Region");
        } else if ("".equals(txtLanguage.getText())) {
            JOptionPane.showMessageDialog(null, "Please enter the Language");
        } 
        else {
            Course course = coursesDirectory.searchCourseByCourseID(courseID);
            course.setCourseName(txtCourseName.getText());
            course.setDescription(txtDescription.getText());
            course.setRegion(txtRegion.getText());
            course.setLanguage(txtLanguage.getText());
            
            if(radioFall.isSelected() == true) {
                course.setTerm("Fall");
            } else if(radioSpring.isSelected() == true) {
                course.setTerm("Spring");
            } else {
                System.out.println("Something went wrong");
            }


            btnSave.setEnabled(false);
            btnUpdate.setEnabled(true);
            JOptionPane.showMessageDialog(null,"Course Details Updated Successfully!");
            populateTable();
        }
    }//GEN-LAST:event_btnSaveActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBAck;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCourseName;
    private javax.swing.JLabel lblDescription;
    private javax.swing.JLabel lblLanguage;
    private javax.swing.JLabel lblRegion;
    private javax.swing.JLabel lblSemester;
    private javax.swing.JLabel lblViewYourCourses;
    private javax.swing.JRadioButton radioFall;
    private javax.swing.JRadioButton radioSpring;
    private javax.swing.JTable tblViewYourCourses;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtLanguage;
    private javax.swing.JTextField txtRegion;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblViewYourCourses.getModel();
        dtm.setRowCount(0);
        for(Course course : coursesDirectory.getCourseDirectory()) {
            if(course.getProfessor().getProfessorName().equals(professor.getProfessorName())) {
                Object[] row = new Object[6];
                row[0] = course.getCourseName();
                row[1] = course.getDescription();
                row[2] = course.getRegion();
                row[3] = course.getLanguage();
                row[4] = course.getTerm();
                row[5] = course.getRating();
            
                dtm.addRow(row);
            }
        }
    }
}
