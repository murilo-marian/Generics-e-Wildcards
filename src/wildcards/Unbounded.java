package wildcards;

import java.util.List;

public class Unbounded {
    public static void imprimeLista(List<?> lista) {
        for (Object o : lista) {
            System.out.print(o + "/");
        }
        System.out.println();
    }

    public static void adicionaLista(List<?> original, List<? super Object> destino) {
        destino.addAll(original);
    }
}
