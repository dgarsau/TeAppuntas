package org.example.users;

import java.util.Scanner;

public class Login {

    static Scanner entrada = new Scanner(System.in);

    public static void login(){

    }

    public static void register(){

        String username = checkUsername();
        String password = checkPassword();
        String email = checkEmail();
        System.out.println("Introduce tu nombre:");
        String nombre = entrada.next();

    }

    public static String checkUsername(){

        System.out.println("Introduce el nombre de usuario:");
        String username = entrada.next();

        while (username.length()>15 || username.length()<4){
            System.out.println("ERROR. El usuario debe tener entre 4 y 15 caracteres.");
            System.out.println("Introduce un nuevo nombre de usuario:");
            username = entrada.next();
        }

        return username;

    }

    public static String checkPassword(){

        System.out.println("Introduce una contraseña:");
        String password = entrada.next();

        while (password.length()>40 || password.length()<8){
            System.out.println("ERROR. La contraseña debe tener entre 8 y 40 caracteres.");
            System.out.println("Introduce una nueva contraseña:");
            password = entrada.next();
        }

        return password;

    }

    public static String checkEmail(){

        System.out.println("Introduce un email:");
        String email = entrada.next();

        while (!email.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")){
            System.out.println("ERROR. Formato de email incorrecto.");
            System.out.println("Introduce un nuevo email:");
            email = entrada.next();
        }

        return email;

    }

    public static boolean checkDisability(){

        System.out.println("¿Posee alguna discapacidad? (S/N)");
        char respuesta = entrada.next().toUpperCase().charAt(0);
        switch (respuesta){
            case 'S':
                return true;
            case 'N':
                return false;
            default:
                return checkDisability();
        }

    }

}
