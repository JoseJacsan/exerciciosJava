package exerciciosJava;
import java.util.Scanner;

public class ConsumoCombustivel {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        double distanciaTotalPercorrida = sc.nextDouble();
        double totalGastoCombustivel = sc.nextDouble();
        double consumoMedio = distanciaTotalPercorrida / totalGastoCombustivel;
        System.out.printf("O consumo médio de combustível foi de: %.2f km/l", consumoMedio);

        sc.close();
    }
}
