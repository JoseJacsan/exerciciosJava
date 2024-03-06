package exerciciosJava;
import java.util.Scanner;

public class Exercicio16 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        int numero = sc.nextInt();
        if(numero >= 100 && numero <= 200) {
            System.out.println("O número está no intervalo");
        }
        else {
            System.out.println("O número não está no intervalo");
        }


        sc.close();
    }
}