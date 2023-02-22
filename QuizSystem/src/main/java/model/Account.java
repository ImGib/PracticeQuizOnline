/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lenovo
 */
public class Account {
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String gmail;
    private String phone;
    private int role;
    private String address;
    private boolean isActive;
    private String img;

    public Account() {
    }

    public Account(String userName, String password, String gmail, int role, boolean isActive) {
        this.userName = userName;
        this.password = password;
        this.gmail = gmail;
        this.role = role;
        this.isActive = isActive;
    }
    
    

    public Account(String userName, String password, String firstName, String lastName, String gmail, String phone, int role, String address, boolean isActive, String img) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gmail = gmail;
        this.phone = phone;
        this.role = role;
        this.address = address;
        this.isActive = isActive;
        this.img = img;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Account{" + "userName=" + userName + ", password=" + password + ", firstName=" + firstName + ", lastName=" + lastName + ", gmail=" + gmail + ", phone=" + phone + ", role=" + role + ", address=" + address + ", isActive=" + isActive + ", img=" + img + '}';
    }
    
    
    
}
