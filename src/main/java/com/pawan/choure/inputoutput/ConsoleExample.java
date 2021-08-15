package com.pawan.choure.inputoutput;

import java.io.Console;

/**
 * ConsoleExample : Scanner is not suitable for reading a password from a console. Java SE6 introduced a Console Class
 * //Console program will not work from IDE
 */
public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();

        String name = console.readLine("Name:");
        System.out.println("name is :" + name);
        String address = console.readLine("Address: ");   //Read Single Word Delimited by whitespace
        System.out.println("address is :" + address);
        char[] password = console.readPassword("Password");
        System.out.println("Password is :" + password);
        console.flush();
    }
}
