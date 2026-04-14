package entornos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CalculadoraRiesgoTest {
    CalculadoraRiesgo calc = new CalculadoraRiesgo();

    @Test
    void testEdadNegativa() {
        assertEquals("Error", calc.evaluarEdad(-5));
    }

    @Test
    void testAdulto() {
        assertEquals("Adulto", calc.evaluarEdad(25));
    }

    @Test
    void testSenior() {
        // RETO: Alguien con 70 años debe ser Senior
        assertEquals("Senior", calc.evaluarEdad(70));
    }

    @Test
    void testLimiteDieciocho() {
        // RETO: Alguien con 18 años exactos debe ser Adulto
        assertEquals("Adulto", calc.evaluarEdad(18));
    }
}