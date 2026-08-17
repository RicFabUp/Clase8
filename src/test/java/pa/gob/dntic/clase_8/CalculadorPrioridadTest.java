package pa.gob.dntic.clase_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadorPrioridadTest {
    private CalculadoraDePrioridad calc;

    @BeforeEach
    void setup(){
        calc = new CalculadoraDePrioridad();
    }

    @Test
    void prueba_prioridad_incidente(){
        int resultado = calc.prioridad("Incidente", 2, false);
        assertEquals(3, resultado);
    }

    @Test
    void prueba_prioridad_cambio(){
        int resultado = calc.prioridad("Cambio", 2, false);
        assertEquals(2, resultado);
    }

    @Test
    void prueba_prioridad_otro(){
        int resultado = calc.prioridad("Otro", 2, false);
        assertEquals(1, resultado);
    }



    @Test
    void prueba_prioridad_limite1(){
        int resultado = calc.prioridad("Incidente", 5, false);
        assertEquals(3, resultado);
    }

    @Test
    void prueba_prioridad_limite2(){
        int resultado = calc.prioridad("Incidente", 6, false);
        assertEquals(4, resultado);
    }



    @Test
    void prueba_prioridad_error(){
        assertThrows(IllegalArgumentException.class,
                () -> calc.prioridad("Incidente", -1, false));
    }



    @Test
    void prueba_nivel_5(){
        String resultado = calc.nivel(5);
        assertEquals("Urgente", resultado);
    }

    @Test
    void prueba_nivel_4(){
        String resultado = calc.nivel(4);
        assertEquals("Alta", resultado);
    }

    @Test
    void prueba_nivel_3(){
        String resultado = calc.nivel(3);
        assertEquals("Media", resultado);
    }

    @Test
    void prueba_nivel_2(){
        String resultado = calc.nivel(2);
        assertEquals("Baja", resultado);
    }

    @Test
    void prueba_nivel_1(){
        String resultado = calc.nivel(1);
        assertEquals("Baja", resultado);
    }





}

