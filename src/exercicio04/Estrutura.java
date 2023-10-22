package exercicio04;

import java.util.ArrayList;

public class Estrutura<T> {
    private ArrayList<Par> pares = new ArrayList<>();

    public boolean add(String chave, T valor) {
        boolean permitido = true;
        if (!pares.isEmpty()) {
            for (Par pare : pares) {
                if (pare.getChave().equals(chave)) {
                    permitido = false;
                    break;
                }
            }
        }
        if (permitido) {
            Par<T> parNovo = new Par<>(chave, valor);
            pares.add(parNovo);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estrutura{");
        sb.append("pares=").append(pares);
        sb.append('}');
        return sb.toString();
    }
}
