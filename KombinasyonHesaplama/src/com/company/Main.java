package com.company;
import java.util.*;

public class Main {
public static int factoriel(int a){
    int fact=0;
    for(int i=a; i<=1; i--){

        fact*=a;
    }
    return fact;
}
    public static void main(String[] args) {
	// Kombinasyon hesaplayan program
        Scanner input=new Scanner(System.in);
        System.out.print("n değerini giriniz: ");
        int n=input.nextInt();
        System.out.print("r değerini giriniz: ");
        int r=input.nextInt();
        int com, a;
        a=n-r;
        com=factoriel(n)/(factoriel(r)*factoriel(a));
        System.out.println("C("+n+","+r+")="+com);
    }
}
