package exercicios;

import java.util.Scanner;

public class ExercicioSoma {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor1 = sc.nextInt();
        int valor2 = sc.nextInt();

        int SOMA = valor1 + valor2;

        System.out.println("SOMA = " + SOMA);


        sc.close();
    }
}
