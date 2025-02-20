package org.example.users;

import lombok.*;

import java.util.ArrayList;

@Getter @Setter @ToString
public class User {

    private String username;
    private String password;
    private String email;
    //private String dni;
    private String name;
    private String phone_no;
    private boolean disability;
    private String tutor;
    private ArrayList<User> contacts;

    public User(String username, String password, String email, String name, String phone_no, boolean disability, String tutor) {
        this.username = username;
        this.password = password;
        this.email = email;
        //this.dni = dni;
        this.name = name;
        this.phone_no = phone_no;
        this.disability = disability;
        this.tutor = tutor;
        contacts = new ArrayList<>();
    }

    public User(String username, String password, String email, String name, String phone_no, boolean disability) {
        this.username = username;
        this.password = password;
        this.email = email;
        //this.dni = dni;
        this.name = name;
        this.phone_no = phone_no;
        this.disability = disability;
        contacts = new ArrayList<>();
    }

}
