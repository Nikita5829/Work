package Javastudy;

public class Work1 {
    public static void main(String[] args) {
        // песня про 99 бутылок пива
        int beerNum = 99;
        String word = " бутылок(бутылки) ";
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = " бутылка ";
            }
            System.out.println(beerNum + "" + word + " Пива на стене ");
            System.out.println(beerNum + "" + word + " пива ");
            System.out.println(" Возьми одну ");
            System.out.println(" Пусти по кругу ");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + "" + word + " Пива на стене ");
            } else {
                System.out.println(" Нет бутылок пива на стене ");
            }
        }

    }
}
