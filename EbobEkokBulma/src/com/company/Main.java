package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //EBOB ve EKOK bulan program
        Scanner giris= new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        int sayi1=giris.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int sayi2=giris.nextInt();
        int ebob=1, ekok;
        for (int i = 1; (i <=sayi1) && (i<=sayi2) ; i++) {
            if ((sayi1 % i==0) && (sayi2 % i==0)) {
                ebob=i;
            }
        }
        System.out.println(sayi1+" ve "+sayi2+" sayılarının EBOB'u:  "+ebob);
        ekok=(sayi1>sayi2)?  sayi1: sayi2;
        while(true) {

            if ((ekok % sayi1 == 0) && (ekok % sayi2 == 0)) {
                System.out.println(sayi1 + " ve " + sayi2 + " sayılarının EKOK'u:  " + ekok);
                break;
            }
            ++ekok;

        }
    }
}
