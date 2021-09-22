package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Zadej S");
        double S = scan.nextDouble();
        double x0=S/2;
        double x1=0;
        for (int i = 0; i < 100; i++) {
            x1=(x0 + (S/x0))/2;
            x0=x1;
            System.out.println(x1);
        }
    }
}
