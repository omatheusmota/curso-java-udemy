package fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.5; // declaração e inicialização da variável
        System.out.println(a);

        /*
        java infere o tipo da variável pelo valor atribuído.
        utilizando este método, devemos declarar e inicializar a variável na mesma linha.
        */
        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        double d; // declaração da variável
        d = 123.65; // inicialização da variável
        System.out.println(d); // utilizada
    }
}
