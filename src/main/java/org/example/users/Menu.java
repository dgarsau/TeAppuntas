package org.example.users;

import java.sql.SQLOutput;

public class Menu {

    public static void loginMenu(){

        System.out.println("BIENVENIDO A TEAPPUNTAS");
        System.out.println("\t[1] LOGIN:");
        System.out.println("\t[2] REGISTER");
        System.out.println("\t[0] QUIT");
        choiceLogin();

    }

    public static void mainMenu(){

        System.out.println("\t[1] EVENTOS:");
        System.out.println("\t[2] CONTACTOS:");
        System.out.println("\t[3] PERFIL");
        System.out.println("\t[0] CERRAR SESIÓN");
        choiceMenu();

    }

    public static void eventsMenu(){

        System.out.println("\t[1] CREAR:");
        System.out.println("\t[2] EDITAR:");
        System.out.println("\t[3] VER");
        System.out.println("\t[0] VOLVER AL MENU PRINCIPAL");

    }

    public static void choiceLogin(){
        char choice=Input.inputMenu();
        switch (choice){
            case '1':
                Login.login();
                break;
            case '2':
                Login.register();
                break;
            default:
                System.out.println("Cerrando el programa...");
                System.exit(0);
        }

    }

    public static void choiceMenu(){
        char choice=Input.inputMenu();
        switch (choice){
            case '1':
                Login.login();
                break;
            case '2':
                Login.register();
                break;
            case '3':
                Login.register();
                break;
            default:
                choiceLogin();
        }

    }

    public static void choiceEvents(){
        char choice=Input.inputMenu();
        switch (choice){
            case '1':
                Login.login();
                break;
            case '2':
                Login.register();
                break;
            case '3':
                Login.register();
                break;
            default:
                System.exit(0);
        }

    }




}
