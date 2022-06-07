import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num1 = new int[5];
        int[] arr = new int[5];

        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();
        }

        for(int num : arr){
            System.out.println(num);
        }

        System.out.println(Arrays.toString(arr));
    }
}