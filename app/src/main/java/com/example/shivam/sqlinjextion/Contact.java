package com.example.shivam.sqlinjextion;

/**
 * Created by Shivam on 20-11-2016.
 */

public class Contact {

    int id;
    String name;
    String phoneNumber;
    String emailAddress;
    String password;

    public Contact(){}

    public Contact(int id,String name,String phoneNumber,String emailAddress, String password)
    {
        this.id=id;
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
        this.password = password;
    }

    public Contact(String name,String phoneNumber,String emailAddress, String password)
    {
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.emailAddress=emailAddress;
        this.password = password;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress=emailAddress;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return this.password;
    }
}
