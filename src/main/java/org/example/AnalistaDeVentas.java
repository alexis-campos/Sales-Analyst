package org.example;
import java.util.*;
import java.util.stream.Collectors;

public class AnalistaDeVentas {

    public double ventasElectronica(List<Venta> listaVentas) {
        return listaVentas.stream()
                .filter(e -> e.categoria().equalsIgnoreCase("Electrónica"))
                .mapToDouble(Venta::monto)
                .sum();
    }

    public Optional<Venta> ventaMasAlta(List<Venta> listaVentas){
        return listaVentas.stream()
                .max(Comparator.comparing(Venta::monto));
    }

    public List<String> clientesMasDeSeiscientos(List<Venta> listaVentas){
        return listaVentas.stream()
                .filter(e -> e.monto()>600)
                .map(Venta::cliente)
                .collect(Collectors.toList());

    }

    public double promVentas(List<Venta> listaVentas) {
        return listaVentas.stream()
                .mapToDouble(Venta::monto)
                .average()
                .orElse(0.0);
    }

    public Map<String, Double> totalPorCategoria(List<Venta> listaVentas) {
        return listaVentas.stream()
                .collect(Collectors.groupingBy(
                        Venta::categoria,
                        Collectors.summingDouble(Venta::monto)
                ));
    }
}