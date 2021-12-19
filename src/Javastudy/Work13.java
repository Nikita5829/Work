package Javastudy;

import java.util.Random;
import java.util.Scanner;

public class Work13 {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        int n= number.nextInt();
        int [] data = new int [n];
        Random rnd = new Random();
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
