package instituto;

public class ValidadorRegistro {
    // Regla: El nombre no puede estar vacío ni ser nulo
    public boolean validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return false;
        }
        return true;
    }

    // Regla: La password debe tener al menos 8 caracteres
    public boolean validarPassword(String password) {
        if (password == null) {
            return false;
        }
        return password.length() >= 8;
    }

    // Regla: El email debe contener un símbolo '@'
    public boolean validarEmail(String email) {
        if (email == null) {
            return false;
        }
        return email.contains("@");
    }

    // Regla: El usuario debe tener 16 años o más
    public boolean validarEdad(int edad) {
        return edad >= 16;
    }
}
