import java.io.*;
import java.util.*;

public class Segundo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[5];
        long sum = 0;
        int min = Integer.MAX_VALUE;
        int    max = 0;
        System.out.println("Ingrese los 5 números: ");
        for (int i=0;i<5;i++){
            arr[i]= in.nextInt();
            sum +=arr[i];
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println((sum - max) + " " + (sum-min));
    }
}