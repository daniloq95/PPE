import java.util.*;
import java.util.stream.*;

public class Primero {

    public static void main(String[] args) {
        System.out.print(" Indique cuantos calcetines tiene: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] colors = new int[101];
        System.out.println(" Indique el código de color correspondiente de cada calcetín: ");
        for (int i = 0; i < n; ++i) {
            int c = in.nextInt();
            colors[c]++;
        }
        System.out.println(" Los pares totales serán : " +Arrays.stream(colors).map(count -> count / 2).sum());
    }
}

