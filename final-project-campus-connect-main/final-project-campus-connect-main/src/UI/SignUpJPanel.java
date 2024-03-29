/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.Applicant;
import Business.ApplicantDirectory;
import Business.ApplicationDirectory;
import Business.Hashing;
import Business.Professor;
import Business.ProfessorDirectory;
import Business.Student;
import Business.StudentDirectory;
import Business.University;
import Business.UniversityDirectory;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class SignUpJPanel extends javax.swing.JPanel {
    private JPanel workArea;
    private ProfessorDirectory professorDirectory;
    private StudentDirectory studentDirectory;
    private ApplicantDirectory applicantDirectory;
    private UniversityDirectory universityDirectory;

    /**
     * Creates new form SignUpJPanel
     */
    SignUpJPanel(JPanel workArea, ApplicantDirectory applicantDirectory, UniversityDirectory universityDirectory) {
        initComponents();
        this.workArea = workArea;
        this.applicantDirectory = applicantDirectory;
        this.universityDirectory = universityDirectory;
        fillDropDown();
    }
    
    public void fillDropDown() {
        for(University university : universityDirectory.getUniversityDirectory()) {
            unidropdown.addItem(university.getUniversityName());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSignUp = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblContact = new javax.swing.JLabel();
        lblEmailID = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        btnSignUp = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        passwordChangeToggle = new javax.swing.JToggleButton();
        lblEmailID1 = new javax.swing.JLabel();
        unidropdown = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(223, 223, 223));

        lblSignUp.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSignUp.setText("Applicant Sign Up");

        lblFullName.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblFullName.setText("Name:");

        lblUserName.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblUserName.setText("Username:");

        lblPassword.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblPassword.setText("Password:");

        lblContact.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblContact.setText("Contact:");

        lblEmailID.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblEmailID.setText("Email ID:");

        txtFullName.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N

        txtUserName.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtContact.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        txtContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactActionPerformed(evt);
            }
        });

        txtEmailID.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        txtEmailID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailIDActionPerformed(evt);
            }
        });

        btnSignUp.setBackground(new java.awt.Color(0, 0, 0));
        btnSignUp.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N

        passwordChangeToggle.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        passwordChangeToggle.setText("Show Password");
        passwordChangeToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordChangeToggleActionPerformed(evt);
            }
        });

        lblEmailID1.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblEmailID1.setText("University:");

        unidropdown.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmailID1)
                    .addComponent(lblUserName)
                    .addComponent(lblPassword)
                    .addComponent(lblContact)
                    .addComponent(lblEmailID)
                    .addComponent(lblFullName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                        .addComponent(txtFullName))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtContact, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(unidropdown, javax.swing.GroupLayout.Alignment.LEADING, 0, 156, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(passwordChangeToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordChangeToggle))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContact, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContact))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(unidropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmailID1))
                .addGap(50, 50, 50)
                .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactActionPerformed

    private void txtEmailIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailIDActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // Handle professor, student and employer sign up:
        String university = unidropdown.getSelectedItem().toString();
        String fullName = txtFullName.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String contact = txtContact.getText();
        String emailID = txtEmailID.getText();
        String hashedPassword = Hashing.encrypt(password, "secretKey");
        
        // TODO: Validation
        
        if(fullName.equals("")) {
            JOptionPane.showMessageDialog(null,"Full Name cannot be empty", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if(fullName.length() <= 2) {
            JOptionPane.showMessageDialog(null,"Full Name should have more than 2 characters", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if(userName.equals("")) {
            JOptionPane.showMessageDialog(null,"Username cannot be empty", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if(userName.length() <= 3) {
            JOptionPane.showMessageDialog(null,"Username should have more than 3 characters", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if(password.equals("")) {
            JOptionPane.showMessageDialog(null,"Password cannot be empty", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if(contact.equals("")) {
            JOptionPane.showMessageDialog(null,"Contact cannot be empty", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if(contact.matches(".*[^0-9].*") || contact.length() != 10 ) {
            JOptionPane.showMessageDialog(null,"Invalid contact", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if(emailID.equals("")) {
            JOptionPane.showMessageDialog(null,"Email ID cannot be empty", "Warning",JOptionPane.WARNING_MESSAGE);
        }
//        } else if(emailID.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]+$")) {
//            JOptionPane.showMessageDialog(null,"Invalid Email ID format", "Warning",JOptionPane.WARNING_MESSAGE);
//        }
        else {
            
            UUID applicantID =  null;
            applicantID = UUID.randomUUID();
            
            ApplicationDirectory applicationDirectory = new ApplicationDirectory();
            
            Applicant applicant = applicantDirectory.addApplicant();
            applicant.setApplicantID("Applicant-"+applicantID.toString());
            applicant.setApplicantName(fullName);
            applicant.setApplicantUserName(userName);
            applicant.setApplicantPassword(hashedPassword);
            applicant.setApplicantPhoneNumber(contact);
            applicant.setApplicantEmailID(emailID);
            applicant.setApplicantUniversity(university);
            applicant.setApplicationDirectory(applicationDirectory);
            String uniId = "";
            for(University uni : universityDirectory.getUniversityDirectory()) {
                if(uni.getUniversityName().equals(uni)) {
                    uniId = uni.getUniversityId();
                }
            } 
            
            JOptionPane.showMessageDialog(null,"Applicant Registered Successfully!");
            
            unidropdown.setSelectedItem("Professor");
            txtFullName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
            txtContact.setText("");
            txtEmailID.setText("");
            
            
        }
        
        
        
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void passwordChangeToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordChangeToggleActionPerformed
        // TODO add your handling code here:
        togglePasswordVisibility();
    }//GEN-LAST:event_passwordChangeToggleActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblEmailID1;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JToggleButton passwordChangeToggle;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JComboBox<String> unidropdown;
    // End of variables declaration//GEN-END:variables

    private void togglePasswordVisibility() {
        char echoChar = txtPassword.getEchoChar();
         if (echoChar == '\0') {
            txtPassword.setEchoChar('*');
            passwordChangeToggle.setText("Show Password");
        } else {
            txtPassword.setEchoChar('\0');
            passwordChangeToggle.setText("Hide Password");
        }
    }
}
