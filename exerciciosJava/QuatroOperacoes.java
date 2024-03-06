package exerciciosJava;
import java.util.Scanner;

public class QuatroOperacoes {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número");
        int num2 = sc.nextInt();
        int soma = num1 + num2;
        int subtracao = num1 - num2;
        int multiplicacao = num1 * num2;
        int divisao = num1 / num2;
        System.out.println("Resultados");
        System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
        System.out.println("Subtração: " + num1 + " - " + num2 + " = " + subtracao);
        System.out.println("Multplicação: " + num1 + " x " + num2 + " = " + multiplicacao);
        System.out.println("Divisão: " + num1 + " / " + num2 + " = " + divisao);

        sc.close();

    }
}