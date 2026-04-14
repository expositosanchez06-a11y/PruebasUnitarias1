# Práctica: Pruebas Unitarias con JUnit 5 en VS Code

Este proyecto es una práctica de configuración de JUnit 5 con Maven en Visual Studio Code.

## Estructura

- `src/main/java/entornos/CalculadoraRiesgo.java`: lógica para clasificar edades.
- `src/test/java/entornos/CalculadoraRiesgoTest.java`: tests unitarios con JUnit 5.

## Dependencias

Se usa JUnit 5 en `pom.xml`:

- `org.junit.jupiter:junit-jupiter-api:5.10.0`
- `org.junit.jupiter:junit-jupiter-engine:5.10.0`

## Comandos útiles

- Ejecutar todos los tests:

```bash
mvn test
```

- Ejecutar un test específico desde VS Code:

  1. Abre el archivo `CalculadoraRiesgoTest.java`.
  2. Usa el texto `Run | Debug` sobre cada `@Test`.

## Tests incluidos

- `testEdadNegativa`: valida que valores negativos devuelvan `Error`.
- `testAdulto`: valida un adulto de 25 años.
- `testSenior`: valida un senior de 70 años.
- `testLimiteDieciocho`: valida el límite de 18 años como `Adulto`.

## Nota para entrega

Incluye una captura de pantalla del Testing Explorer o del resultado de los tests ejecutados en VS Code.

## Repositorio de entrega

Repositorio usado en esta práctica: https://github.com/expositosanchez06-a11y/PruebasUnitarias1
