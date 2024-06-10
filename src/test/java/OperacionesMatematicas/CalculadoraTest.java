package OperacionesMatematicas;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
Calculadora calculadora;
    @BeforeEach
    void setUp() {
         calculadora = new Calculadora();
    }

    @AfterEach
    void tearDown() {
        calculadora = null;
    }

    @BeforeAll
    static void alIniciar() {
  System.out.println("Iniciando Calculadora");
    }

    @BeforeAll
    static void alFinalizar() {
System.out.println("Finalizando Calculadora");
    }

    @Test
    void sumar() {
        int a = 5;
        int b = 6;
        int c = 11;

        int resultado = calculadora.Sumar(a,b);
        assertEquals(c,resultado);
    }

    @Test
    void restar() {
        int a = 10;
        int b = 6;
        int c = 4;

        int resultado = calculadora.Restar(a,b);
        assertTrue(c == resultado);
    }

    @Test
    void multiplicar() {
        int a = 5;
        int b = 5;
        int c = 25;

        int resultado = calculadora.Multiplicar(a,b);

        if(c != resultado){
            fail("Fallo al multiplicar");
        }
    }

    @Test
    void Dividir() {
        int num1=10;
        int num2=0;
        int resultadoEsperado = 0;
        if(num2 != 0){
            int resultado = calculadora.Dividir(num1, num2);
            if(resultadoEsperado!=resultado){
                fail("fallo la division");
            }
        }
        assertThrows(
                ArithmeticException.class,
                () -> {
                    int result = calculadora.Dividir(num1,num2);
                }
        );
    }
}