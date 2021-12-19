package Javastudy;

import java.util.Scanner;
// Посчитать четные и нечетные цифры числа
public class Work11 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число чтобы узнать сколько в нем четных и нечетных цифр");
        int vvodChislo = console.nextInt();
        int chet = 0;
        int neChet = 0;
        int nulev = 0;
        int c;
        while (vvodChislo > 0){
            c = vvodChislo % 10;
            if (c == 0) {
                nulev++;
            } else if (c%2 == 0) {
                chet++;
            } else {
                neChet++;
            }
            vvodChislo /= 10;
        }
        System.out.println("Четных цифр - " + chet + ". Нечетных цифр " + neChet);
    }

}
