package Javastudy;

import java.util.Scanner;
// Вывести ряд чисел в диапазоне с шагом
public class work5 {
    public static void main(String[] args) {
        Scanner number1 = new Scanner(System.in);

        System.out.println("Введите нижный предел");
        int a = number1.nextInt();

        System.out.println("Введите верхний предел");
        int b = number1.nextInt();

        System.out.println("Введите шаг");
        int x = number1.nextInt();

        for (int y=a; y<=b; y+=x){


            System.out.print(" "+y+" ");
        }
    }
}
