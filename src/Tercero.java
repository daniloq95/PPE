import java.util.*;

public class Tercero {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escriba cuantos años tiene: ");
        int edad = in.nextInt();
        int max = 0;
        int cont = 0;
        System.out.println("Escriba el valor de largo de cada vela: ");
        for (int i = 0; i < edad; ++i) {
            int x = in.nextInt();
            if (x > max) {
                cont = 1;
                max = x;
            } else if (x == max) {
                ++cont;
            }
        }
        System.out.println("Se apagarán: " + cont + "Velas");
    }
}