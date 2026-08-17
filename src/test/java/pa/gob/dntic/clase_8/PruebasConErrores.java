package pa.gob.dntic.clase_8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/*
 * DRILL "arregla las pruebas": estas 4 pruebas están MAL. Encuentra y
 * arregla cada error. (Una lógica correcta debería quedar toda en verde,
 * y cada prueba debería verificar algo de verdad.)
 */
class PruebasConErrores {

    CalculadoraDePrioridad calc = new CalculadoraDePrioridad();
    
    // ERROR 1
    @Test
    void error_uno() {
        assertEquals(3, calc.prioridad("Incidente", 2, false));
    }

    // ERROR 2
    @Test
    void error_dos() {
        assertEquals(5, calc.prioridad("Cambio", 1, true));
    }

    // ERROR 3
    @Test
    void error_tres() {
        int resultado = calc.prioridad("Incidente", 6, false);
        //assertTrue(true);
        assertEquals(4, resultado);
    }

    // ERROR 4
    @Test
    void error_cuatro() {
        assertEquals(1, calc.prioridad("Solicitud", 1, false));
    }
}
