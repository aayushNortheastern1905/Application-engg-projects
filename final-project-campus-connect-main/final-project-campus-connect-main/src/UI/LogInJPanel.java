/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Business.AnnouncementDirectory;
import Business.CertificateAuthorityDirectory;
import Business.CoursesDirectory;
import Business.Professor;
import Business.ProfessorDirectory;
import Business.Applicant;
import Business.ApplicantDirectory;
import Business.Broker;
import Business.BrokerDirectory;
import Business.Student;
import Business.Employer;
import Business.StudentDirectory;
import Business.EmployerDirectory;
import Business.CertificateAuthority;
import Business.Hashing;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Hashing;
import Business.Management;
import Business.ManagementDirectory;
import Business.Owner;
import Business.OwnerDirectory;
import Business.PropertyDirectory;
import Business.University;
import Business.UniversityDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author admin
 */
public class LogInJPanel extends javax.swing.JPanel {
    private JPanel workArea;
    private ProfessorDirectory professorDirectory;
    private ApplicantDirectory applicantDirectory;
    private BrokerDirectory brokerDirectory;
    private StudentDirectory studentDirectory;
    private CoursesDirectory coursesDirectory;
    private EmployerDirectory employerDirectory;
    private CertificateAuthorityDirectory certificateAuthorityDirectory;
    private UniversityDirectory universityDirectory;
    private PropertyDirectory propertyDirectory;
    private ManagementDirectory managementDirectory;
    private OwnerDirectory ownerDirectory;
    private AnnouncementDirectory announcementDirectory;
    private University university;

    

    /**
     * Creates new form LogInJPanel
     */
    LogInJPanel(JPanel workArea, ProfessorDirectory professorDirectory, ApplicantDirectory applicantDirectory, BrokerDirectory brokerDirectory, ManagementDirectory managementDirectory,StudentDirectory studentDirectory, UniversityDirectory universityDirectory, PropertyDirectory propertyDirectory, OwnerDirectory ownerDirectory, CoursesDirectory coursesDirectory, EmployerDirectory employerDirectory, CertificateAuthorityDirectory certificateAuthorityDirectory, AnnouncementDirectory announcementDirectory) {


        initComponents();
        this.workArea = workArea;
        this.professorDirectory = professorDirectory;
        this.applicantDirectory = applicantDirectory;
        this.brokerDirectory = brokerDirectory;
        this.studentDirectory = studentDirectory;
        this.coursesDirectory = coursesDirectory;
        this.employerDirectory = employerDirectory;
        this.certificateAuthorityDirectory = certificateAuthorityDirectory;
        this.universityDirectory = universityDirectory;
        this.propertyDirectory = propertyDirectory;
        this.managementDirectory = managementDirectory;
        this.ownerDirectory = ownerDirectory;
        this.announcementDirectory = announcementDirectory;
        this.university = university;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLogIn = new javax.swing.JLabel();
        lblYouAre = new javax.swing.JLabel();
        userDropDown = new javax.swing.JComboBox<>();
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogIn = new javax.swing.JButton();
        passwordChangeToggle = new javax.swing.JToggleButton();

        setBackground(new java.awt.Color(223, 223, 223));

        lblLogIn.setFont(new java.awt.Font("MS UI Gothic", 1, 24)); // NOI18N
        lblLogIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogIn.setText("Log In");

        lblYouAre.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblYouAre.setText("You are...");

        userDropDown.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        userDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Applicant", "Broker", "Management", "Owner", "University" }));
        userDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userDropDownActionPerformed(evt);
            }
        });

        lblUserName.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblUserName.setText("Username:");

        txtUserName.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("MS UI Gothic", 1, 16)); // NOI18N
        lblPassword.setText("Password:");

        txtPassword.setFont(new java.awt.Font("MS UI Gothic", 0, 16)); // NOI18N

        btnLogIn.setBackground(new java.awt.Color(0, 0, 0));
        btnLogIn.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        btnLogIn.setForeground(new java.awt.Color(255, 255, 255));
        btnLogIn.setText("Log In");
        btnLogIn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogInActionPerformed(evt);
            }
        });

        passwordChangeToggle.setFont(new java.awt.Font("MS UI Gothic", 0, 14)); // NOI18N
        passwordChangeToggle.setText("Show Password");
        passwordChangeToggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordChangeToggleActionPerformed(evt);
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
                        .addComponent(lblLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUserName)
                            .addComponent(lblPassword)
                            .addComponent(lblYouAre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(passwordChangeToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUserName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(userDropDown, javax.swing.GroupLayout.Alignment.LEADING, 0, 140, Short.MAX_VALUE)))
                            .addComponent(btnLogIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblLogIn)
                .addGap(132, 132, 132)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYouAre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(passwordChangeToggle, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnLogIn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userDropDownActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void btnLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogInActionPerformed
        // Handle professor, student, CA and employer log in here:
        String user = userDropDown.getSelectedItem().toString();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String hashedPassword = Hashing.encrypt(password, "secretKey");
        
        System.out.println(password);
        System.out.println(hashedPassword);
        
        if(userName.equals("")) {
            JOptionPane.showMessageDialog(null,"Username cannot be empty", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if (userName.length() <= 3) {
            JOptionPane.showMessageDialog(null,"Username should have more than 3 characters", "Warning",JOptionPane.WARNING_MESSAGE);
        } else if(password.equals("")) {
           JOptionPane.showMessageDialog(null,"Password cannot be empty", "Warning",JOptionPane.WARNING_MESSAGE);
        } else {
            if(user.equals("Owner")) {
                Owner loggedInOwner = null;
                loggedInOwner = ownerDirectory.ownerAuthentication(userName, hashedPassword);
                if(loggedInOwner !=null){
                    OwnerJPanel ownerJPanel = new OwnerJPanel(workArea, loggedInOwner, ownerDirectory, propertyDirectory, brokerDirectory, managementDirectory, universityDirectory);
                    workArea.add("OwnerJPanel",ownerJPanel);
                                    CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
                txtUserName.setText("");
                txtPassword.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
                }
//            Professor loggedInProfessor = null;
//            loggedInProfessor = professorDirectory.professorAuthentication(userName, hashedPassword);
//            if(loggedInProfessor != null) {
//                ProfessorJPanel professorJPanel = new ProfessorJPanel(workArea, professorDirectory, loggedInProfessor, coursesDirectory, studentDirectory);
//                workArea.add("ProfessorJPanel", professorJPanel);
//                CardLayout layout = (CardLayout) workArea.getLayout();
//                layout.next(workArea);
//                txtUserName.setText("");
//                txtPassword.setText("");
//            } else {
//                JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
//            }
               
                
        }
        else if(user.equals("Applicant")) {
                
            Applicant loggedInApplicant = null;
            loggedInApplicant = applicantDirectory.applicantAuthentication(userName, hashedPassword);
            System.out.println(loggedInApplicant);
            if(loggedInApplicant != null) {
                ApplicantJPanel applicantJPanel = new ApplicantJPanel(workArea, applicantDirectory, loggedInApplicant, propertyDirectory, announcementDirectory);
                workArea.add("ApplicantJPanel", applicantJPanel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
                txtUserName.setText("");
                txtPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
            }
        }  
            else if(user.equals("Broker")) {
                
            Broker loggedInBroker = null;
            loggedInBroker = brokerDirectory.brokerAuthentication(userName, hashedPassword);
            if(loggedInBroker != null) {
                BrokerJPanel brokerJPanel = new BrokerJPanel(workArea, brokerDirectory, loggedInBroker, propertyDirectory, announcementDirectory);
                workArea.add("BrokerJPanel", brokerJPanel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
                txtUserName.setText("");
                txtPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
            }
        }  
            else if(user.equals("University")) {
                University loggedInUniversity = null;
                loggedInUniversity = universityDirectory.universityAuthentication(userName, hashedPassword);
                if(loggedInUniversity != null) {
                UniversityJPanel universityJPanel = new UniversityJPanel(workArea, universityDirectory, loggedInUniversity);
                workArea.add("UniversityJPanel", universityJPanel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
                txtUserName.setText("");
                txtPassword.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
            }
            }
            else if(user.equals("Management")) {
            // Student Log in
            
            Management loggedInStudent = null;
            loggedInStudent = managementDirectory.managementAuthentication(userName, hashedPassword);
            if(loggedInStudent != null){
                ManagementJPanel studentJPanel = new ManagementJPanel(workArea, loggedInStudent, managementDirectory, propertyDirectory,universityDirectory,university);
                workArea.add("ManagementJPanel", studentJPanel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
                userDropDown.setSelectedItem("Student");
                txtUserName.setText("");
                txtPassword.setText("");
                
            } else{
                JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
            }
            
        } else if (user.equals("Certification Authority")) {
            // CA Log in
            
            // CertificateAuthority Log in
            CertificateAuthority loggedInCertificateAuthority = null;
            loggedInCertificateAuthority = certificateAuthorityDirectory.certificateAuthorityAuthentication(userName, hashedPassword);
            if(loggedInCertificateAuthority != null){
                CertificateAuthorityJPanel certificateAuthorityJPanel = new CertificateAuthorityJPanel(workArea,studentDirectory);
                workArea.add("CertificateAuthorityJPanel", certificateAuthorityJPanel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
                userDropDown.setSelectedItem("CertificateAuthority");
                txtUserName.setText("");
                txtPassword.setText("");            
            }
             else{
                JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
            }
        } else if (user.equals("Admin")) {
            if(userName.equals("admin") && password.equals("admin")){
                AdminJPanel adminJPanel = new AdminJPanel(workArea,employerDirectory,certificateAuthorityDirectory, studentDirectory);

                workArea.add("AdminJPanel", adminJPanel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
                userDropDown.setSelectedItem("admin");
                txtUserName.setText("");
                txtPassword.setText(""); 
            }
            else{
                JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
            }
        } else if (user.equals("Employer")) {
            // Employer Log in
            Employer loggedInEmployer = null;
            loggedInEmployer = employerDirectory.employerAuthentication(userName, hashedPassword);
            if(loggedInEmployer != null){
                EmployerJPanel employerJPanel = new EmployerJPanel(studentDirectory, workArea, loggedInEmployer);
                workArea.add("EmployerJPanel", employerJPanel);
                CardLayout layout = (CardLayout) workArea.getLayout();
                layout.next(workArea);
                userDropDown.setSelectedItem("Employer");
                txtUserName.setText("");
                txtPassword.setText("");            
            }
             else{
                JOptionPane.showMessageDialog(null, "Sorry, the username and password does not match!");
            }
        } else {
            System.out.println("Something went wrong");
        }
        }
        
        
    }//GEN-LAST:event_btnLogInActionPerformed

    private void passwordChangeToggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordChangeToggleActionPerformed
        // TODO add your handling code here:
        togglePasswordVisibility();
    }//GEN-LAST:event_passwordChangeToggleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogIn;
    private javax.swing.JLabel lblLogIn;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lblYouAre;
    private javax.swing.JToggleButton passwordChangeToggle;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JComboBox<String> userDropDown;
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