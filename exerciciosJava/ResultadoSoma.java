package exerciciosJava;
import java.util.Scanner;


public class ResultadoSoma {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + soma);
        System.out.println("O resultado da soma é " + soma);
        sc.close();
    }
}