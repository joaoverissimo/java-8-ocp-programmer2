package com.verissimo.aula013_lambda.estudo.Item002_ExpressoesLambdas;

@FunctionalInterface
interface MeuVoidSemParametro {
    void executar();
}

@FunctionalInterface
interface MinhaStringRetornaLong {
    Long converter(String s);
}

@FunctionalInterface
interface MinhasDuasStringsRetornamLong {
    Long converter(String s1, String s2);

    default String obterStrDefault() {
        return "retorno default";
    }
}


public class Ex_01_ParameterAndReturn {

    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    public static int meuInteiroStatic = 145;

    public String minhaStringIntance = "João 2018";

    public static String obterString() {
        return "Meu método de strings";
    }

    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    // .
    public static void main(String[] args) {

        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Entre parênteses, definindo o tipo:
        //

        MeuVoidSemParametro obj0 = //
                () -> System.out.println("Imprimindo em executar() de MeuVoidSemParametro");

        MinhaStringRetornaLong obj1 = //
                (String s) -> Long.valueOf(s);

        MinhasDuasStringsRetornamLong obj2 = //
                (String s1, String s2) -> Long.valueOf(s1) + Long.valueOf(s2);


        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Omitindo o tipo
        //

        MeuVoidSemParametro obj3 = //
                () -> System.out.println("Imprimindo em executar() de MeuVoidSemParametro");

        MinhaStringRetornaLong obj4 = //
                (s) -> Long.valueOf(s);

        MinhasDuasStringsRetornamLong obj5 = //
                (s1, s2) -> Long.valueOf(s1) + Long.valueOf(s2);


        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Ocultando  os parênteses, caso possua apenas um parâmetro
        //

        MinhaStringRetornaLong obj6 = //
                s -> Long.valueOf(s);


        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Retorno entre chaves
        //

        MinhaStringRetornaLong obj7 = //
                s -> {
                    return Long.valueOf(s);
                };


        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Retorno de void
        //
        MeuVoidSemParametro obj8 = //
                () -> System.out.println("void sem prm");


        MeuVoidSemParametro obj9 = //
                () -> {
                    System.out.println("void sem prm");
                };

        MeuVoidSemParametro obj10 = //
                () -> {
                    System.out.println("void sem prm");
                    return;
                };


        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Variáveis locais (variáveis ou parâmetros definidos em um método)
        // só podem ser usadas se forem declaradas finais ou efetivamente finais.
        //

        int i = 99;

        MeuVoidSemParametro obj11 = //
                () -> System.out.println(i);

        // i = i * 3; // does not compile
        // MeuVoidSemParametro obj12 = () -> i = i * 3;


        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Você pode acessar variáveis de instância ou estáticas da classe que as contém.
        //


        MinhaStringRetornaLong obj13 = (s) -> Long.valueOf(meuInteiroStatic);


        MinhaStringRetornaLong obj14 = (s) -> Long.valueOf(obterString());


        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // This resolve a classe envolvente onde o lambda é escrito.
        // For a lambda expression, this resolves to the enclosing class where the lambda is written.
        //

        Ex_01_ParameterAndReturn classeAtual = new Ex_01_ParameterAndReturn();
        MeuVoidSemParametro obj15 = () -> System.out.println(classeAtual.minhaStringIntance);

        // this does not compile
        //MeuVoidSemParametro obj16 = () -> System.out.println(this.minhaStringIntance);


        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Métodos default de uma interface funcional não podem ser acessados de dentro de expressões lambda.
        //
        MinhasDuasStringsRetornamLong obj17 = (s1, s2) -> {
            String s = "";
            //s = obterStrDefault();
            return 10L;
        };

        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // .
        // Não podem lançar exceções que não estão definidas na cláusula throws do método da interface de função
        //
        MinhasDuasStringsRetornamLong obj18 = (s1, s2) -> {
            //throw new Exception("Erro que não está na assinatura da Interface Funcional");
            return 10L;
        };
    }
}


