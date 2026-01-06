public class LastDigitSum{
    public static void main(String[]args){
        int a=123;
        int b=456;
        int last1=a%10;
        int last2=b%10;
        int sum=last1+last2;
        System.out.println(sum);
    }
}