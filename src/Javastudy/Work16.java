package Javastudy;
// Найти два наименьших элемента массива
public class Work16 {
    public static void main(String[] args) {
            int[] arr = new int[]{1,2,3,4,5,6};
            int a=0;
            for (int i=0;i< arr.length;i++){
                a+=arr[i];
            }
            a/=arr.length;
            for (int j=0;j< arr.length;j++){
                if (arr[j]<a){
                    System.out.println(arr[j]);
                }
            }
        }
    }



