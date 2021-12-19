package Javastudy;

import java.util.Scanner;
//Переворот числа
public class Work6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.println("Введите трёхзначное число и напишу его в обратном порядке");
        int a;
        System.out.print ("a= ");
        a=sc.nextInt();

        System.out.println("обратный порядок "+a%10+""+a/10%10+""+a/100%10);

    }

}

