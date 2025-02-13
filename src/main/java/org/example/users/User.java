package org.example.users;

import lombok.*;

import java.util.ArrayList;

@Getter @Setter @ToString
public class User {

    private String username;
    private String password;
    private String email;
    private String dni;
    private String name;
    private String phone_no;
    private boolean disability;
    private User tutor;
    private ArrayList<User> contacts;

    public User(String username, String password, String email, String dni, String name, String surname, String phone_no, boolean disability, User tutor) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.dni = dni;
        this.name = name;
        this.phone_no = phone_no;
        this.disability = disability;
        this.tutor = tutor;
        contacts = new ArrayList<>();
    }

}
