package org.example;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Venta> ventas = RepositorioVentas.obtenerVentas();
        AnalistaDeVentas analista = new AnalistaDeVentas();
        DecimalFormat df = new DecimalFormat("#.00");


        double totalElectronica = analista.ventasElectronica(ventas);
        Optional<Venta> ventaMasAlta = analista.ventaMasAlta(ventas);
        List<String> clientesMasDeCien = analista.clientesMasDeSeiscientos(ventas);
        double promVentas = analista.promVentas(ventas);
        Map<String, Double> reporteCategorias = analista.totalPorCategoria(ventas);
        Optional<Map.Entry<String, Double>> categoriaTop = reporteCategorias.entrySet().stream()
                .max(Map.Entry.comparingByValue());


        System.out.println("\n--- Total vendido en Electrónica ---");
        System.out.println("Total vendido en Electrónica: $" + df.format(totalElectronica));
        System.out.println("\n--- La venta más alta ---");
        ventaMasAlta.ifPresent(v -> System.out.println("El cliente " + v.cliente() + " gastó $" + v.monto() + " en " + v.categoria()));
        System.out.println("\n--- Clientes que gastaron más de $600 ---");
        System.out.println("Los clientes que gastaron más de cien fueron: "+ clientesMasDeCien);
        System.out.println("\n--- Promedio de ventas ---");
        System.out.println("El promedio de ventas fue de: "+ df.format(promVentas));
        System.out.println("\n--- Ventas por Categoria ---");
        System.out.println(reporteCategorias);
        System.out.println("\n--- Categoría Más Lucrativa ---");
        categoriaTop.ifPresent(pareja -> System.out.println(pareja.getKey() + " generó un total de $" + pareja.getValue()));
    }
}