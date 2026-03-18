package instituto;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorRegistroTest {

    ValidadorRegistro validador = new ValidadorRegistro();

    @Test
    @DisplayName("Ejemplo: Un nombre válido debe ser aceptado")
    public void testNombreValido() {
        boolean resultado = validador.validarNombre("Carlos");
        assertTrue(resultado, "Error: El sistema rechazó un nombre válido");
    }

    @Test
    @DisplayName("Reto 1: Nombre vacío")
    public void testNombreVacio() {
        assertFalse(validador.validarNombre(""), "Debería rechazar nombre vacío");
    }

    @Test
    @DisplayName("Reto 2: Password justa (8 caracteres)")
    public void testPasswordJusta() {
        assertTrue(validador.validarPassword("12345678"), "Debería aceptar 8 caracteres");
    }

    @Test
    @DisplayName("Reto 3: Password corta")
    public void testPasswordCorta() {
        assertFalse(validador.validarPassword("Admin"), "Debería rechazar password corta");
    }

    @Test
    @DisplayName("Reto 4: Email sin arroba")
    public void testEmailSinArroba() {
        assertFalse(validador.validarEmail("usuario.gmail.com"), "Debería rechazar email sin @");
    }

    @Test
    @DisplayName("Reto 5: Edad límite (16 años)")
    public void testEdadLimite() {
        assertTrue(validador.validarEdad(16), "Debería aceptar exactamente 16 años");
    }
}