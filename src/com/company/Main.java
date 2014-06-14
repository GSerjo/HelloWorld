package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World example");
        System.out.println("Input your name:");

        Scanner scanner = new Scanner(System.in);
        String value = scanner.next();

        System.out.println(String.format("Hello %s", value));

    }
}
