package fundamentos;

public class Temperatura {

    public static void main(String[] args) {
        // (°F - 32) x 5/9 = °C

        final int ajuste = 32;
        final double fator = 5.0 / 9.0;

        int f = 96;
        double c = (f - ajuste) * fator;

        System.out.println("Resultado: " + c + "°C");

    }
}
