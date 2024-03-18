package exerciciosJava;
import java.util.Locale;
import java.util.Scanner;

public class ProblemaPecas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o código da peça 1");
        double valorPeca1 = leitor.nextDouble();

        System.out.println("Digite o número de peças 1");
        int qntdPeca1 = leitor.nextInt();

        System.out.println("Valor unitário de cada peça 1");
        double valorUnitPeca1 = leitor.nextDouble();

        System.out.println("Digite o código da peça 2");
        double valorPeca2 = leitor.nextDouble();

        System.out.println("Digite o número de peças 2");
        int qntdPeca2 = leitor.nextInt();

        System.out.println("Valor unitário de cada peça 2");
        double valorUnitPeca2 = leitor.nextDouble();

        double valorPago = (qntdPeca1 * valorUnitPeca1) + (qntdPeca2 * valorUnitPeca2);

        System.out.printf(Locale.US, "VALOR A PAGAR = R$ %.2f%n", valorPago);


        leitor.close();
    }
}

/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 * 
 * 
 * Entrada:
 * 12 1 5.30
 * 16 2 5.10
 * 
 * Saída:
 * VALOR A PAGAR: R$ 15.50
 * 
 * 
 * Entrada:
 * 13 2 15.30
 * 161 4 5.20
 * 
 * Saída:
 * VALOR A PAGAR: R$ 51.40
 * 
 * 
 * Entrada:
 * 1 1 15.10
 * 2 1 15.10
 * 
 * Saída:
 * VALOR A PAGAR: R$ 30.20
 */
