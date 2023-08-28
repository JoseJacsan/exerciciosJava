package exercicios;
import java.util.Scanner;

public class NumerosMultiplos {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);

        int numA = sc.nextInt();
        int numB = sc.nextInt();

        if (numA % numB == 0 || numB % numA == 0) {
            System.out.println("Sao Multiplos");
        }
        else {
            System.out.println("Nao Sao Multiplos");
        }

        sc.close();
    }
}
