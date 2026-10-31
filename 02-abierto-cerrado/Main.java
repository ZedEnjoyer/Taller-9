import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new VehiculoMensual("KLM321", "Camila Rojas", 180000));
        vehiculos.add(new VehiculoMinutos("XYZ45F", "Andrés Mora", 80, 1500)); 
        vehiculos.add(new Bicicleta("BIC-07", "Valentina Díaz", 40000));
        vehiculos.add(new VehiculoPorDia("QWE987", "Carlos Pérez", 25000, 3));

        GestorParqueadero gestor = new GestorParqueadero();
        for (Vehiculo v : vehiculos) {
            gestor.cerrarMes(v);
        }
        System.out.println(gestor.generarReporteCSV(vehiculos));
    }
}