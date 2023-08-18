package SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumeros = new ArrayList<>();
        SomaNumeros somaNumeros = new SomaNumeros(listNumeros);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(56);
        somaNumeros.adicionarNumero(81);


        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumeros());
        System.out.println(somaNumeros.calcularSoma());
    }
}
