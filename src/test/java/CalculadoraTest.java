

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test void testSumar() { assertEquals(5, calc.sumar(2, 3)); }
    @Test void testRestar() { assertEquals(1, calc.restar(3, 2)); }
    @Test void testMultiplicar() { assertEquals(6, calc.multiplicar(2, 3)); }
    @Test void testDividir() { assertEquals(2, calc.dividir(6, 3)); }

    @Test void testDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calc.dividir(10, 0));
    }

    @Test void testModulo() { assertEquals(1, calc.modulo(7, 3)); }

    @Test void testRaizCuadrada() { assertEquals(4.0, calc.raizCuadrada(16), 0.01); }

    @Test void testRaizCuadradaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> calc.raizCuadrada(-4));
    }

    @Test void testPotencia() { assertEquals(8, calc.potencia(2, 3)); }

    @Test void testEsParTrue() { assertTrue(calc.esPar(4)); }

    @Test void testEsParFalse() { assertFalse(calc.esPar(5)); }

    @Test void testEsPositivoTrue() { assertTrue(calc.esPositivo(10)); }

    @Test void testEsPositivoFalse() { assertFalse(calc.esPositivo(-1)); }

    @Test void testSumarNegativos() { assertEquals(-5, calc.sumar(-2, -3)); }

    @Test void testRestarNegativos() { assertEquals(1, calc.restar(-2, -3)); }

    @Test void testMultiplicarNegativos() { assertEquals(6, calc.multiplicar(-2, -3)); }

    @Test void testDividirNegativos() { assertEquals(2, calc.dividir(-6, -3)); }

    @Test void testModuloNegativos() { assertEquals(-1, calc.modulo(-7, 3)); }

    @Test void testPotenciaNegativo() { assertEquals(-8, calc.potencia(-2, 3)); }
}
