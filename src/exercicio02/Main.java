package exercicio02;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Produto<Integer> produto1 = new Produto<>();
        Produto<String> produto2 = new Produto<>();

        produto1.setId(1);
        produto1.setDataFabricacao(LocalDateTime.now());
        produto1.setValor(13.99f);
        produto1.setDataVencimento(LocalDate.now());


        produto2.setId("12F3H");
        produto2.setDataFabricacao(LocalDateTime.now());
        produto2.setValor(27.99f);
        produto2.setDataVencimento(LocalDate.now());

        System.out.println(produto1);
        System.out.println(produto2);
    }

}
