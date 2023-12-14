/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Ayush
 */
public class CertificateAuthorityDirectory {
        private ArrayList<CertificateAuthority> certificateAuthorityDirectory;
        
        public CertificateAuthorityDirectory() {
            this.certificateAuthorityDirectory = new ArrayList<CertificateAuthority>();
        }

        public ArrayList<CertificateAuthority> getCertificateAuthorityDirectory() {
            return certificateAuthorityDirectory;
        } 
        
        public void setCertificateAuthority(ArrayList<CertificateAuthority> certificateAuthorityDirectory) {
        this.certificateAuthorityDirectory = certificateAuthorityDirectory;
        }
        
        public CertificateAuthority addCertificateAuthority() {
            CertificateAuthority certificateAuthority = new CertificateAuthority();
            certificateAuthorityDirectory.add(certificateAuthority);
            return certificateAuthority;
        }
        
            
        public CertificateAuthority certificateAuthorityAuthentication(String username, String password) {
        for(CertificateAuthority certificateAuthority : certificateAuthorityDirectory) {
            if(certificateAuthority.getCertificateAuthorityUserName().equals(username) && certificateAuthority.getCertificateAuthorityPassword().equals(password)) {
                return certificateAuthority;
            }
        }
        return null;
    }
    
}
