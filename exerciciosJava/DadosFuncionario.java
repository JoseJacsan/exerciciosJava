package exerciciosJava;

import java.util.Locale;
import java.util.Scanner;

public class DadosFuncionario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número do funcionário");
        int numFuncionario = leitor.nextInt();

        System.out.println("Digite o número de horas trabalhadas");
        int horasTrabalhadas = leitor.nextInt();

        System.out.println("Digite o valor recebido por hora trabalhada");
        double valorHora = leitor.nextDouble();

        double salarioFuncionario = horasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numFuncionario);
        System.out.printf(Locale.US, "SALARY = U$ %.2f%n", salarioFuncionario);

        leitor.close();
    }
}

/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas
 * trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o
 * salário do funcionário, com duas casas
 * decimais.
 * 
 * Entrada:
 * 25
 * 100
 * 5.50
 * 
 * Saída:
 * NUMBER = 25
 * SALARY = U$ 550.00
 * 
 * Entrada:
 * 1
 * 200
 * 20.50
 * 
 * Saída:
 * NUMBER = 1
 * SALARY = U$ 4100.00
 * 
 * Entrada:
 * 6
 * 145
 * 15.55
 * 
 * Saída:
 * NUMBER = 6
 * SALARY = U$ 2254.75
 * 
 */