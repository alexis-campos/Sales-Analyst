# Sales Analyst - Java Streams API

This project is a sales data analysis engine built with **Modern Java**. It was designed with a clean architecture and a **100% declarative** approach, completely eliminating the use of traditional loops (`for`, `while`) in favor of the Java **Stream API**.

This project is part of my intensive training to master solid Java fundamentals before transitioning to Spring Boot.

## Applied Technical Concepts

* **Declarative Programming:** Collection processing using Stream pipelines (`filter`, `map`, `reduce`, `collect`).
* **Immutability (Records):** Use of `java.lang.Record` (Java 14+) to model Data Transfer Objects (DTOs) without boilerplate code.
* **Safe Null Handling:** Implementation of `Optional<T>` to prevent `NullPointerException` in search queries (`max`, `findFirst`).
* **Advanced Grouping:** Use of `Collectors.groupingBy` and `Collectors.summingDouble` to generate complex financial reports.
* **Separation of Concerns:** Architecture divided into Model (`Venta`), Data (`RepositorioVentas`), Business Logic (`AnalistaDeVentas`), and View/Orchestrator (`Main`).

## Analyst Features

The system processes a batch of 100 transactions and can resolve the following queries at runtime:

1.  **Total by Specific Category:** Calculates the exact sum of revenue for the "Electrónica" (Electronics) category.
2.  **Peak Identification:** Finds the transaction with the highest amount using `Comparator`.
3.  **Exclusive Client Filtering:** Extracts a clean list of clients who exceed a specific purchase ticket amount.
4.  **Average Calculation:** Obtains the overall average sales of the batch.
5.  **Profitability Report:** Generates a dictionary (`Map`) with the total revenue grouped by each category.
6.  **Top Category:** Evaluates the profitability report to extract the most lucrative category for the business.

## Code Structure

* `Venta.java`: Immutable record defining the structure of a transaction (id, date, client, category, amount).
* `RepositorioVentas.java`: Simulates a database by providing a static list of 100 records.
* `AnalistaDeVentas.java`: The engine (Service) containing all the business logic and Stream operations.
* `Main.java`: The entry point that orchestrates the execution and prints the formatted reports (`DecimalFormat`).

## How to Run the Project

1. Clone this repository.
2. Open the project in your preferred IDE (IntelliJ IDEA recommended).
3. Ensure you have **JDK 14 or higher** installed (due to the use of `records`).
4. Run the `Main.java` class.

---
*Developed by Alexis Campos*