package exerciciosJava.aprendizado;

import java.util.Locale;

public class FormatacaoExemplo {
    public static void main (String[] args) {
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        Locale.setDefault(Locale.US);
        System.out.printf("%s tem %d anos e ganha %.2f reais%n", nome, idade, renda);
    }
}
