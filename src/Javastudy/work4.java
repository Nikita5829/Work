package Javastudy;

import java.util.Scanner;

public class work4 {
    //Ряд Фибоначчи
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Введите желаемое количество цифр ряда Фибоначчи");
        int y = number.nextInt();
        int a = 1;
        int b = 0;
        for (int i = 0; i < y; i++) {
            int c = a;
            a = a + b;
            b = c;
            System.out.print(" "+ a +" ");

        }
    }
}