package exercicio04;

public class Main {
    public static void main(String[] args) {
        Estrutura<Integer> estrutura = new Estrutura();
        Estrutura<String> estrutura2 = new Estrutura();

        System.out.println(estrutura.add("Jorge", 32));
        System.out.println(estrutura.add("Jorge", 33));
        System.out.println(estrutura.add("Godofredo", 34));

        System.out.println(estrutura2.add("Jorge", "Solteiro"));
        System.out.println(estrutura2.add("Jorge", "Casado"));
        System.out.println(estrutura2.add("Godofredo", "Divorciado"));

        System.out.println(estrutura);
        System.out.println(estrutura2);
    }
}
