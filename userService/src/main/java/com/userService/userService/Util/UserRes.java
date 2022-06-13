package com.userService.userService.Util;


import java.util.Date;
public class UserRes {
    int id;
    String firstName, lastName, middleName, phoneNumber, email, address, gender;
    Date dateOfBirth;
    public UserRes(int id, String firstName, String lastName, String middleName, String phoneNumber, String email,
                   String address, Date dateOfBirth, String gender){
        this.id = id;
        this.firstName = firstName;
        this.lastName  = lastName;
        this.phoneNumber = phoneNumber;
        this.middleName = middleName;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;

    }
}
