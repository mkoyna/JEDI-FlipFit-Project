package com.flipkart.bean;

public class GymOwner {
    private int gymOwnerID;
    private String password;
    private String name;

    public int getCustomerID() {
        return gymOwnerID;
    }

    public void setCustomerID(int gymOwnerID) {
        this.gymOwnerID = gymOwnerID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    private String email;
    private String contact;

}
