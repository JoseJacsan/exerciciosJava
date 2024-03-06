package exerciciosJava.aprendizado;
import java.util.Scanner;

public class EstruturaFor {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = sc.nextInt(); i <= 10; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}