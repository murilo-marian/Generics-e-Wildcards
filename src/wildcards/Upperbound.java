package wildcards;

import java.util.List;

public class Upperbound {
    public static String transformaParaString(List<? extends Number> vetor) { //transforma uma lista em uma string, com os números separados por um espaço
        StringBuilder numeros = new StringBuilder();
        for (Number number : vetor) {
            numeros.append(number).append(" ");
        }
        return numeros.toString();
    }

    public static double somaLista(List<? extends Number> vetor) { //soma todos os elementos de uma lista
        double soma = 0.0;
        for (Number number : vetor)
            soma += number.doubleValue();
        return soma;
    }
}
