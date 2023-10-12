// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.awt.*;
import java.security.KeyStore;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Mr. International");
        Scanner skan = new Scanner(System.in);
        int liczbaA = 15;
        int liczbaB = 4;
        int sumaLiczb = liczbaA + liczbaB;

        System.out.println("Wartość zmiennej wynosi " + liczbaA + liczbaB);
        System.out.println("Wartość sumy wynosi " + sumaLiczb);

        double numerC = 2.250154;
        System.out.println(liczbaA / numerC);
        System.out.printf("Wynik dzielenia %d", (int) (liczbaA / numerC));
        System.out.println();
        System.out.printf("Wynik dzielenia %.3f", (double) (liczbaA / numerC));
        System.out.println();

        boolean isTrue;
        if (liczbaA > liczbaB) {
            isTrue = true;
            System.out.println(isTrue);
        } else {
            isTrue = false;
            System.out.println(isTrue);
        }

    }
}