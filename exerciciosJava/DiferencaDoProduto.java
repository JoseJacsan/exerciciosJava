package exerciciosJava;
import java.util.Scanner;

public class DiferencaDoProduto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite quatro valores inteiros: ");
        int A = leitor.nextInt();
        int B = leitor.nextInt();
        int C = leitor.nextInt();
        int D = leitor.nextInt();

        int diferenca = (A * B - C * D);

        System.out.println("DIFERENCA = " + diferenca);

        leitor.close();
    }
}

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
 * calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula:
 * DIFERENCA = (A * B - C * D).
 * 
 * Entrada:
 * 5
 * 6
 * 7
 * 8
 * Saída: DIFERENCA = -26
 * 
 * Entrada:
 * 5
 * 6
 * -7
 * 8
 * Saída: DIFERENCA = 86
 */