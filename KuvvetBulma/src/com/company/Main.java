package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
    //Girilen sayıdan küçük olan 2'nin kuvvetlerini bulan program
        Scanner input=new Scanner(System.in);
        int num,i=0;
        do {
            System.out.print("Bir sayı giriniz: ");
            num=input.nextInt();
            if(num%4==0 && num%5==0){
                System.out.println(num+" sayısı hem 4'ün hem de 5'in katıdır.");
                continue;
            }
            else if(num%4==0){
                System.out.println(num+" sayısı 4'ün katıdır.");
            }
            else if(num%5==0){
                System.out.println(num+" sayısı 5'in katıdır.");
            }

            else{
                System.out.println(num+" sayısı ne 4'ün ne de 5'in katıdır.");
                continue;}
            i+=1;
        }while(i<num);
    }
}
