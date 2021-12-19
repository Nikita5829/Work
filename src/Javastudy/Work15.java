package Javastudy;
//Максимальный из элеметов массива с четным индексом
public class Work15 {
    public static void main(String[] args) {
        int[] data = new int[]{2, 28, 6, 15};
        int a = -1;
        for (int i =0;data[i]%2==0 ;i++){
            if (data[i]>a){
                a=data[i];
            }
        }
        System.out.println(a);

    }
}
