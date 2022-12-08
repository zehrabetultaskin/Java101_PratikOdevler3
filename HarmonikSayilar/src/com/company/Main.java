package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	// Harmonik sayıları bulan program
        double harm=0.0; double sayi;
        System.out.print("Bir sayı giriniz: ");
        Scanner giris=new Scanner(System.in);
        sayi=giris.nextDouble();
        while(sayi>0)
        {
            harm = harm + (1/sayi);
            sayi--;
        }
        System.out.println("Harmonik Sayılar: "+harm);
    }
}
