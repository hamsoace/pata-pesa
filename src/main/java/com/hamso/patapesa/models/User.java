package com.hamso.patapesa.models;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class User {

    @Id
    @GeneratedValue
    private UUID id = UUID.randomUUID();

    private String username;
    private String phoneNumber;
    private String accountBalance;

    public User() {
    }

    public User(UUID id, String username, String phoneNumber, String accountBalance) {
        this.id = id;
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.accountBalance = accountBalance;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", phoneNumber='" + phoneNumber + '\'' +
//                ", accountBalance=" + accountBalance +
//                '}';
//    }
}
