package Javastudy;

import java.util.Random;
// Вероятность выпадения четных случайных чисел
public class Work10 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int a;
        double chet = 0;
        double verChet;
        for (int i = 0; i < 1000; i++){
            a = rnd.nextInt();
            if (a%2 == 0){
                chet++;
            }
        }
        verChet = chet / 1000 * 100;
        System.out.println("Вероятность выпадения четных чисел в % " + String.format("%.4g%n", verChet) );

    }
}
