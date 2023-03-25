import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculadora;

    @BeforeEach
    public void inicio() {
        calculadora = new Calculadora();
    }

    @Test
    public void deveSomarCerto() {
        //Given
        //When
        int a = 10;
        int b = 5;
        int resultado = calculadora.soma(a, b);

        //Then
        Assertions.assertEquals(15, resultado);
    }

    @Test
    public void deveSubtrairCerto() {
        //Given
        //When
        int a = 20;
        int b = 10;
        int resultado = calculadora.subtrair(a, b);

        //Then
        Assertions.assertTrue(10 == resultado);
    }

    @Test
    public void deveMultiplicarCerto() {
        //Given
        //When
        int a = 10;
        int b = 5;
        int resultado = calculadora.multiplicar(a, b);

        //Then
        Assertions.assertEquals(50, resultado);
    }

    @Test
    public void deveDividirCerto() {
        //Given
        //When
        int a = 10;
        int b = 5;
        int resultado = calculadora.dividir(a, b);

        //Then
        Assertions.assertTrue(2 == resultado);
    }

}
