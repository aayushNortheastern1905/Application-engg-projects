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
public class InterestedCustomerDirectory {
            private ArrayList<InterestedCustomer> interestedCustomerDirectory;
            
            public InterestedCustomerDirectory(){
                this.interestedCustomerDirectory = new ArrayList<InterestedCustomer>();
            }

            public ArrayList<InterestedCustomer> getInterestedCustomerDirectory() {
                return interestedCustomerDirectory;
            }

            public void setInterestedCustomerDirectory(ArrayList<InterestedCustomer> interestedCustomerDirectory) {
                this.interestedCustomerDirectory = interestedCustomerDirectory;
            }
            
            public InterestedCustomer addInterestedCustomer(InterestedCustomer interestedCustomer) {
                interestedCustomerDirectory.add(interestedCustomer);
                return interestedCustomer;
            }
            
            
             public InterestedCustomer addInterestedCustomer() {
                 InterestedCustomer ic = new InterestedCustomer();
                interestedCustomerDirectory.add(ic);
                return ic;
            }
            
                public InterestedCustomer getInterestedCustomerById(String interestedCustomerID) {
        for (InterestedCustomer customer : interestedCustomerDirectory) {
            if (customer.getInterestedCustomerID().equals(interestedCustomerID)) {
                return customer; 
            }
        }
        return null; // Return null if the customer with the specified ID is not found
    }
            
        public void removeInterestedCustomerByApplicationId(String applicationId) {
        InterestedCustomer customerToRemove = null;

        // Find the interestedCustomer with the matching applicationId
        for (InterestedCustomer customer : interestedCustomerDirectory) {
            if (customer.getInterestedCustomerID().equals(applicationId)) {
                customerToRemove = customer;
                break; // Stop the loop once a matching customer is found
            }
        }

        // Remove the customer if found
        if (customerToRemove != null) {
            interestedCustomerDirectory.remove(customerToRemove);
        }
    }
            
}
