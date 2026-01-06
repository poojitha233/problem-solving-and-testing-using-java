import java.util.Arrays;
public class Kth_Element {
    public static void main(String[] args) {
        int[] num = {7, 10, 4, 3, 20, 15};
        int k = 3;
        Arrays.sort(num);   
        System.out.println("Kth smallest element is: " + num[k - 1]);
    }
}
