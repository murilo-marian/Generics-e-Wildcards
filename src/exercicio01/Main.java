package exercicio01;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Jorge", 22);
        String texto = "Teste";
        Integer inteiro = 3;

        MeuString<Pessoa> minhaPessoa = new MeuString<>(pessoa);
        MeuString<String> meuString = new MeuString<>(texto);
        MeuString<Integer> meuInteiro = new MeuString<>(inteiro);

        System.out.println(minhaPessoa.getStr());
        System.out.println(meuString.getStr());
        System.out.println(meuInteiro.getStr());
    }
}
