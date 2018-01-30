package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Įveskite savo vardą");
        Scanner sc = new Scanner(System.in);
        String vardas = sc.nextLine();
        System.out.println(vardas.length());
    }
}
