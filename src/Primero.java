import java.util.*;

public class Primero {

    public static void main(String[] args) {
        System.out.print(" Indique cuantos calcetines tiene: ");
        Scanner in = new Scanner(System.in);
        int calcetines = in.nextInt();
        int[] color = new int[60];
        int pares = 0;
        System.out.println(" Indique el código de color correspondiente de cada calcetín: ");
        for (int i = 0; i < calcetines; ++i) {
            int x = in.nextInt();
            if (color[x] == 1){
                color[x] = 0;
                pares++;
            }else {
                color[x]++;
            }
        }
        System.out.println(" Los pares totales serán : " + pares);
    }
}
