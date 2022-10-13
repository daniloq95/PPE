import java.io.*;
import java.util.*;

public class Tercero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escriba cuantos años tiene: ");
        int n = scanner.nextInt();
        int max = 0;
        int count = 0;
        System.out.println("Escriba el valor de largo de cada vela: ");
        for (int i = 0; i < n; ++i) {
            int h = scanner.nextInt();
            if (h > max) {
                count = 1;
                max = h;
            } else if (h == max) {
                ++count;
            }
        }
        System.out.println(count);
    }
}