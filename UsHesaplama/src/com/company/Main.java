package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            int pow=0;
            System.out.print("Sayı giriniz:");
            int num1=input.nextInt();
            System.out.print("Üs giriniz: ");
            int num2=input.nextInt();
            pow=num1;
            for(int i=1; i<num2; i++){
                pow=pow*num1;
        }
        System.out.println(num1+" sayısının "+num2+". kuvveti="+pow);
    }
}
