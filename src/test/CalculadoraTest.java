public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        assert calc.soma(2,3) == 5;
        assert calc.subtracao(3,2) == 1;
        assert calc.multiplicacao(2,3) == 6;
        assert calc.divisao(6,3) == 2;
        assert calc.dobro(5) == 10;

        System.out.println("TODOS OS TESTES PASSARAM");
    }
}
