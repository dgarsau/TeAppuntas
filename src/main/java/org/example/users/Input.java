package org.example.users;

import java.util.Scanner;

public class Input {

    static Scanner entrada = new Scanner(System.in);

    public static char inputMenu(){

        return entrada.next().toUpperCase().charAt(0);

    }



}
