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

    // Pruebas por tipo
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


// Pruebas de borde
    @Test
    void prueba_prioridad_borde5(){
        int resultado = calc.prioridad("Incidente", 5, false);
        assertEquals(3, resultado);
    }

    @Test
    void prueba_prioridad_borde6(){
        int resultado = calc.prioridad("Incidente", 6, false);
        assertEquals(4, resultado);
    }


// Pruebas de Citicidad
    @Test
    void prueba_prioridad_critica1(){
        int resultado = calc.prioridad("Incidente", 6, true);
        assertEquals(5, resultado);
    }

    @Test
    void prueba_prioridad_critica2(){
        int resultado = calc.prioridad("Incidente", 5, true);
        assertEquals(5, resultado);
    }

    @Test
    void prueba_prioridad_critica3(){
        int resultado = calc.prioridad("Solicitud", 3, true);
        assertEquals(5, resultado);
    }


// Prueba de dias negativos
    @Test
    void prueba_prioridad_error(){
        assertThrows(IllegalArgumentException.class,
                () -> calc.prioridad("Incidente", -1, false));
    }


// Pruebas de nivel
    @Test
    void prueba_nivel_Urgente(){
        String resultado = calc.nivel(5);
        assertEquals("Urgente", resultado);
    }

    @Test
    void prueba_nivel_Alta(){
        String resultado = calc.nivel(4);
        assertEquals("Alta", resultado);
    }

    @Test
    void prueba_nivel_Media(){
        String resultado = calc.nivel(3);
        assertEquals("Media", resultado);
    }

    @Test
    void prueba_nivel_Baja2(){
        String resultado = calc.nivel(2);
        assertEquals("Baja", resultado);
    }

    @Test
    void prueba_nivel_Baja1(){
        String resultado = calc.nivel(1);
        assertEquals("Baja", resultado);
    }





}

