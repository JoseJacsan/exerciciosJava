package exerciciosJava;
import java.util.Locale;
import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor do raio");
        double raio = leitor.nextDouble();
        double pi = 3.14159;
        
        double area = pi * (raio * raio);
        
        System.out.printf("A = %.4f%n", area);


        leitor.close();
    }
}

/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
 * valor da área deste círculo com quatro
 * casas decimais conforme exemplos.
 * 
 * Fórmula da área: area = π . raio^2
 * Considere o valor de π = 3.14159
 * 
 * Entrada: Saída:
 * 2.00 A=12.5664
 * 
 * Entrada: Saída:
 * 100.64 A=31819.3103
 * 
 * Entrada: Saída:
 * 150.00 A=70685.7750
 */