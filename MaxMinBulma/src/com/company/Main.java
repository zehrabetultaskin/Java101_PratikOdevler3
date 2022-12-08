package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Girilen sayıya kadar olan çift sayıları bulan program
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num=input.nextInt();
        System.out.println("Girdiğiniz sayıya kadar olan çift sayılar: ");
        for (int i=num; i>=0; i--){
            if(i%2==0){
                System.out.println(i);
            }
            else{continue;}
        }
    }
}
