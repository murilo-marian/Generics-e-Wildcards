package wildcards;

import java.util.List;

public class Lowerbound {
    public static void adicionarNumeros(List<? super Integer> vetor) { //adiciona os números de 0 a 9 em uma lista de qualquer tipo que pode armazenar um inteiro
        for (int i = 0; i < 10; i++) {
            vetor.add(i);
        }
    }

    public static void adicionarNumeroEspecifico(List<? super Integer> lista, Integer numero) {
        lista.add(numero);
    }
}
