package SomaNumeros;



import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int total = 0;
        for (Integer numero : numeros){
            total+=numero;
        }
        return total;
    }

    public int encontrarMaiorNumero(){
        int maior = numeros.get(0);
        for (Integer numero : numeros){
            if (numero > maior){
                maior = numero;
            }
        }
        return maior;
    }

    public int encontrarMenorNumero(){
        int menor = numeros.get(0);
        for (Integer numero : numeros){
            if (numero < menor){
                menor = numero;
            }
        }
        return menor;
    }

    public String exibirNumeros(){
        String s = "";
        for (Integer numero : numeros){
            s+= numero + ", ";
        }
        return s;
    }

}
