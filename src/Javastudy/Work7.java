package Javastudy;

import java.util.Random;
import java.util.Scanner;
// рандом
public class Work7 {
    public static void main(String[] args) {
        int [] data= new int[10];
        System.out.println(data.length);
        for (int i = 0; i < data.length; i++) {
            Random rnd= new Random();
            data[i]= rnd.nextInt(99);
            System.out.print(data[i]);
            System.out.print(" ");
        }

        for (int i = 0; i < data.length; i++) {
            data[i]=10;
            System.out.print(data[i]);
            System.out.print("______");

        }
            
        }

}
