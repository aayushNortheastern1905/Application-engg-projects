/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

/**
 *
 * @author admin
 */
public class Property {
    private String propertyId;
    private String name;
    private String address;
    private String city;
    private String state;
    private String pincode;
    private University university;
    private Management management;
    private String intake;
    private boolean isTaken;
    private Broker broker;
    private String rentedTo;
    private String youtubeLink;
    private boolean isOwnerApproved;
    private Owner owner;
    private InterestedCustomerDirectory interestedCustomerDirectory; 
    private String cartpetArea;

    public String getCartpetArea() {
        return cartpetArea;
    }

    public void setCartpetArea(String cartpetArea) {
        this.cartpetArea = cartpetArea;
    }
    
    

    public String getPropertyId() {
        return propertyId;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public Management getManagement() {
        return management;
    }

    public void setManagement(Management management) {
        this.management = management;
    }

    public String getName() {
        return name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public boolean isIsOwnerApproved() {
        return isOwnerApproved;
    }

    public void setIsOwnerApproved(boolean isOwnerApproved) {
        this.isOwnerApproved = isOwnerApproved;
    }
    
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public boolean isIsTaken() {
        return isTaken;
    }

    public void setIsTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    public Broker getBroker() {
        return broker;
    }

    public void setBroker(Broker broker) {
        this.broker = broker;
    }

    public String getRentedTo() {
        return rentedTo;
    }

    public void setRentedTo(String rentedTo) {
        this.rentedTo = rentedTo;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }

    public void setYoutubeLink(String youtubeLink) {
        this.youtubeLink = youtubeLink;
    }

    public InterestedCustomerDirectory getInterestedCustomerDirectory() {
        return interestedCustomerDirectory;
    }

    public void setInterestedCustomerDirectory(InterestedCustomerDirectory interestedCustomerDirectory) {
        this.interestedCustomerDirectory = interestedCustomerDirectory;
    }
    
    
    
}
