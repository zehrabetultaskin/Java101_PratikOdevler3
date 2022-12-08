package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    //Girilen sayının basamak rakamlarının toplamını veren program
        Scanner giris=new Scanner(System.in);
        System.out.println("3 basamaklı bir sayı giriniz: ");
        int sayi=giris.nextInt();
        int a=sayi;
        int yuzler,onlar, birler,arm;
        birler=a%10;
        a/=10;
        onlar=a%10;
        yuzler=a/10;
        arm=(birler*birler*birler)+(onlar*onlar*onlar)+(yuzler*yuzler*yuzler);
        if(arm==sayi)
        {
            System.out.println("Girdiğiniz sayı bir armstrong sayıdır.");
        }
        else
        {
            System.out.println("Giridiğiniz sayı bir armstrong sayı değildir. ");
        }
    }
}
