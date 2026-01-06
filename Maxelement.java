import java.util.Scanner;
public class Maxelement {
    public static void main(String[] args){
        int[] arr={10,45,23,89,34};
        int max=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}