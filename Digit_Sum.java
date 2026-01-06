import java.util.Scanner;
public class Digit_Sum {
    public static void main(String[]args){
        int num=12345;
        int choice=1;
        int sum=0;
        while(num>0){
            int d=num%10;
            if(choice==1&&d%2==0){
                sum=sum+d;
            }
            if(choice==2&&d%2!=0){
                sum=sum+d;
            }
            num=num/10;
        }
        System.out.println(sum);
    }
}