# Juego de Adivinanza de un Número

## Enunciado del ejercicio

Se desarrollará un programa en Java que genere un número entero aleatorio entre 0 y 100.  
El programa solicitará al usuario que intente adivinar dicho número.  
Después de cada intento, el sistema indicará si el número ingresado es mayor o menor que el número generado.  
El proceso se repetirá hasta que el usuario adivine correctamente el valor.

---

## Entradas

- Un número entero ingresado por el usuario desde el teclado.

---

## Salidas

- Mensajes que indiquen:
  - Si el número ingresado es mayor que el número generado (“Te pasaste”).
  - Si el número ingresado es menor que el número generado (“Te falta”).
  - Un mensaje final cuando el usuario adivina correctamente el número (“Le atinaste”).

---

## Variables a emplear

| Variable  | Tipo de dato | Descripción |
|---------|-------------|-------------|
| `numrand` | `int` | Número aleatorio generado por el programa entre 0 y 100 |
| `val` | `int` | Número ingresado por el usuario |
| `input` | `Scanner` | Objeto para leer datos desde el teclado |

---

## Análisis del problema

El problema consiste en implementar un ciclo de repetición que permita comparar continuamente el número ingresado por el usuario con un número generado aleatoriamente por el sistema.  
El ciclo debe continuar ejecutándose hasta que ambos valores sean iguales.  
Para ello, se requiere:
- Generar un número aleatorio dentro de un rango específico.
- Leer datos desde la entrada estándar.
- Comparar valores numéricos.
- Utilizar estructuras de control condicionales y repetitivas.

---

## Diseño del algoritmo

1. Generar un número aleatorio entre 0 y 100.
2. Inicializar la variable del valor ingresado por el usuario.
3. Mostrar un mensaje indicando las instrucciones del juego.
4. Repetir:
   - Leer el número ingresado por el usuario.
   - Comparar el número con el valor aleatorio.
   - Mostrar un mensaje indicando si el valor es mayor o menor.
5. Finalizar cuando el usuario adivine el número.
6. Mostrar un mensaje de éxito.


