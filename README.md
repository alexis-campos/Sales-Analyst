# Analista de Ventas - Java Streams API

Este proyecto es un motor de análisis de datos de ventas construido con **Java Moderno**. Fue diseñado con una arquitectura limpia y un enfoque **100% declarativo**, eliminando por completo el uso de bucles tradicionales (`for`, `while`) a favor de la **Stream API** de Java.

Este proyecto forma parte de mi entrenamiento intensivo para dominar las bases sólidas de Java antes de transicionar a Spring Boot.

## Conceptos Técnicos Aplicados

* **Programación Declarativa:** Procesamiento de colecciones mediante pipelines de Streams (`filter`, `map`, `reduce`, `collect`).
* **Inmutabilidad (Records):** Uso de `java.lang.Record` (Java 14+) para modelar los objetos de transferencia de datos (DTOs) sin código basura (boilerplate).
* **Manejo Seguro de Nulos:** Implementación de `Optional<T>` para evitar `NullPointerException` en consultas de búsqueda (`max`, `findFirst`).
* **Agrupamiento Avanzado:** Uso de `Collectors.groupingBy` y `Collectors.summingDouble` para generar reportes financieros complejos.
* **Separación de Responsabilidades:** Arquitectura dividida en Modelo (`Venta`), Datos (`RepositorioVentas`), Lógica de Negocio (`AnalistaDeVentas`) y Vista/Orquestador (`Main`).

## Funcionalidades del Analista

El sistema procesa un lote de 100 transacciones y es capaz de resolver las siguientes consultas en tiempo de ejecución:

1.  **Total por Categoría Específica:** Calcula la sumatoria exacta de ingresos para la categoría "Electrónica".
2.  **Identificación de Picos:** Encuentra la transacción con el monto más alto usando `Comparator`.
3.  **Filtrado de Clientes Exclusivos:** Extrae una lista limpia de clientes que superan un ticket de compra específico.
4.  **Cálculo de Promedios:** Obtiene el promedio general de ventas del lote.
5.  **Reporte de Rentabilidad:** Genera un diccionario (`Map`) con el total de ingresos agrupado por cada categoría.
6.  **Categoría Top:** Evalúa el reporte de rentabilidad para extraer la categoría más lucrativa del negocio.

## Estructura del Código

* `Venta.java`: Record inmutable que define la estructura de una transacción (id, fecha, cliente, categoría, monto).
* `RepositorioVentas.java`: Simula una base de datos entregando una lista estática de 100 registros.
* `AnalistaDeVentas.java`: El motor (Service) que contiene toda la lógica de negocio y las operaciones de Stream.
* `Main.java`: El punto de entrada que orquesta la ejecución e imprime los reportes formateados (`DecimalFormat`).

## Cómo ejecutar el proyecto

1. Clona este repositorio.
2. Abre el proyecto en tu IDE preferido (IntelliJ IDEA recomendado).
3. Asegúrate de tener instalado **JDK 14 o superior** (debido al uso de `records`).
4. Ejecuta la clase `Main.java`.

---
*Desarrollado por Alexis Campos*