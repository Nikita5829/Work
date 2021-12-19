package Javastudy;

public class work2 {
    public static void main(String[] args) {
        String[] wordListOne={"круглосуточный","трёх-звенный","30000-футовый","Взаимный"};
        String[] wordListTwo={"уполномоченный","трудный","чистый продукт","ориентированный"};
        String[] wordListThree={"процесс","пункт разгрузки","выход из положения","тип структуры"};
        int oneLenght= wordListOne.length;
        int twoLenght= wordListTwo.length;
        int threelenght= wordListThree.length;


        int rand1=(int) (Math.random()* oneLenght);
        int rand2=(int) (Math.random()* twoLenght);
        int rand3=(int)(Math.random()* threelenght);

        String phrase = wordListOne[rand1]+ "" +wordListTwo [rand3]+ "" + wordListThree[rand3];
        System.out.println("Всё, что нам нужно,- это" + phrase);
    }
}
