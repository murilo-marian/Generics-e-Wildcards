package wildcards;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        //lowerbound
        //adicionarNumeroEspecifico
        List<Integer> integers = new ArrayList<>();
        List<Number> numbers = new ArrayList<>();
        Integer integer = 33;
        Lowerbound.adicionarNumeroEspecifico(integers, integer);
        System.out.println(integers);
        Lowerbound.adicionarNumeroEspecifico(numbers, integer);
        System.out.println(numbers);

        //adicionarNumberos
        Lowerbound.adicionarNumeros(integers);
        System.out.println(integers);
        Lowerbound.adicionarNumeros(numbers);
        System.out.println(numbers);

        //UpperBound
        List<Double> doubles = new ArrayList<>();
        doubles.add(33.0);
        //transformaPraString
        System.out.println(Upperbound.transformaParaString(numbers)); //funciona pra classe pai
        System.out.println(Upperbound.transformaParaString(integers));// e todas as subclasses
        System.out.println(Upperbound.transformaParaString(doubles));// e todas as subclasses

        //somaLista
        System.out.println(Upperbound.somaLista(numbers));
        System.out.println(Upperbound.somaLista(integers));
        System.out.println(Upperbound.somaLista(doubles));

        //Unbounded
        //imprimeLista
        List<String> nomes = new ArrayList<>();
        nomes.add("Jorge");
        nomes.add("Rodrigo");
        nomes.add("Godofredo");
        nomes.add("Thiago");
        Unbounded.imprimeLista(numbers);
        Unbounded.imprimeLista(doubles);
        Unbounded.imprimeLista(nomes);

        //copiaLIsta
        List<Object> stuff = new ArrayList<>();
        stuff.add(444);
        stuff.add(333);
        stuff.add(222);
        stuff.add(111);
        Unbounded.adicionaLista(numbers, stuff);
        System.out.println(stuff);
        Unbounded.adicionaLista(nomes, stuff);
        System.out.println(stuff);


    }
}
