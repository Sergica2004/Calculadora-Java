

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
        return a / b;
    }

    public int modulo(int a, int b) {
        return a % b;
    }

    public double raizCuadrada(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("No se puede sacar raíz de número negativo");
        }
        return Math.sqrt(a);
    }

    public int potencia(int base, int exponente) {
        return (int) Math.pow(base, exponente);
    }

    public boolean esPar(int a) {
        return a % 2 == 0;
    }

    public boolean esPositivo(int a) {
        return a > 0;
    }
}
