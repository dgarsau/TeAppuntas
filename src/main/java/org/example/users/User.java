package org.example.users;

public class User {

    private String username;
    private String password;
    private String email;
    private String dni;
    private String name;
    private String surname;
    private String phone_no;
    private boolean disability;

    public User(String username, String password, String email, String dni, String name, String surname, String phone_no, boolean disability) {
        setUsername(username);
        this.password = password;
        this.email = email;
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.phone_no = phone_no;
        this.disability = disability;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {

        boolean error=true;

        while(error){

            if(username.length()>=15 || username.length()<=4){
                if(username.length()>15){
                    System.out.println("ERROR. El nombre de usuario es muy largo.");
                }else {
                    System.out.println("ERROR. El nombre de usuario es muy corto.");
                }
            } else {
                this.username = username;
                error=false;
            }

            // comprobar que no esté else if () {
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public boolean isDisability() {
        return disability;
    }

    public void setDisability(boolean disability) {
        this.disability = disability;
    }

}
