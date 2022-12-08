package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	//Tek sayıların toplamını bulan program
        Scanner input=new Scanner(System.in);
        int num, temp,total=0;;
        do{
            System.out.print("Bir sayı giriniz: ");
            num=input.nextInt();
            temp=num;
            if(num%2==0 && num%4==0){
                total+=temp;
            }

        }while(num%2==0);
        System.out.println("Girilen çift ve 4'ün katı olan sayıların toplamı: "+total);
    }
}
