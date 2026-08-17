package pa.gob.dntic.clase_8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidacionEdadTest {
    private ValidadorEdad edad;

    @BeforeEach
    void setup(){
        edad = new ValidadorEdad();
    }

    @Test
    void prueba_menor18(){
        boolean resultado = edad.esMayorDeEdad(17);
        assertFalse(resultado);
    }

    @Test
    void prueba_mayor18(){
        boolean resultado = edad.esMayorDeEdad(19);
        assertTrue( resultado);
    }

    @Test
    void prueba_igual18(){
        boolean resultado = edad.esMayorDeEdad(18);
        assertTrue(resultado);
    }
}
