import java.io.*;
import java.util.*;

public class Segundo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int array[] = new int[5];
        long suma = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;

        System.out.println("Ingrese los 5 números: ");

        for (int i=0;i<5;i++){
            array[i]= in.nextInt();
            suma +=array[i];
            if (array[i] > max){
                max = array[i];
            }
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println("El valor mínimo es: "+(suma - max) + " \nEl valor máximo es: " + (suma-min));
    }
}