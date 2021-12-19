package Javastudy;

import java.util.Scanner;
//Сумма цифр массива
public class Work14 {
    public static void main(String[] args) {
        int [] number = new int[] { 2, 5, -6, 35,57};
        int a =0;
        for (int i = 0; i < number.length; i++) {
            if (number[i]>0 && number[i]%2==0);
                a += number[i];
        }
        System.out.println(a);
        }



    }






