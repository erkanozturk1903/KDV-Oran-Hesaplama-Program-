package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Ücret Tutarını Giriniz : ");
        tutar = input.nextDouble();
        kdvTutar = tutar * kdvOran;

        kdvliTutar = tutar + kdvTutar;
        System.out.println("KDV'siz Tutar : " + tutar);
        System.out.println("KDV oranı: " + kdvOran);
        System.out.println("Kdv Tutarı : " + kdvTutar);
        System.out.println("KDV'li Tutar : " + kdvliTutar);


    }
}
