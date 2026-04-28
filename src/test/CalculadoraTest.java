import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    Calculadora calc = new Calculadora();

    @Test
    void testSoma() {
        assertEquals(5, calc.soma(2, 3));
    }

    @Test
    void testSubtracao() {
        assertEquals(1, calc.subtracao(3, 2));
    }

    @Test
    void testMultiplicacao() {
        assertEquals(6, calc.multiplicacao(2, 3));
    }

    @Test
    void testDivisao() {
        assertEquals(2, calc.divisao(6, 3));
    }

    @Test
    void testDobro() {
        assertEquals(10, calc.dobro(5));
    }
}
