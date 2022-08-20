package com.company;

import java.util.Scanner;

/*
%d - Целочисленные 1,2,3...
%f - float
%.3f - округление
%c - char
%s - string
%% - проценты
 */

public class Main {
    public static void main(String[] args){
        double a,b;
        Scanner in = new Scanner(System.in);

        System.out.print("a = "); a = in.nextDouble();
        System.out.print("b = "); b = in.nextDouble();

        double p = 2*(a+b);
        System.out.printf("%.2f",p);
        in.close();

        /*
        next - До пробела
        nextLine - до перевода строки
        nextByte - считывает как byte
        nextShort - short...
        ...
         */

    }
}
