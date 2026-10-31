import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new VehiculoMensual("KLM321", "Camila Rojas", 180000));
        vehiculos.add(new VehiculoMinutos("XYZ45F", "Andrés Mora", 80, 1500));
        vehiculos.add(new Bicicleta("BIC-07", "Valentina Díaz", 40000));
        vehiculos.add(new VehiculoPorDia("QWE987", "Carlos Pérez", 25000, 3));

        RepositorioParqueadero repoPrueba = new RepositorioEnMemoria();
        GestorParqueadero gestor = new GestorParqueadero(repoPrueba);

        for (Vehiculo v : vehiculos) {
            gestor.cerrarMes(v);

            if (v instanceof AcumulaPuntos) {
                AcumulaPuntos ap = (AcumulaPuntos) v;
                System.out.println("Puntos acumulados para " + v.getPlaca() + ": " + ap.calcularPuntos());
            }

            if (v instanceof ConSeguro) {
                ConSeguro cs = (ConSeguro) v;
                System.out.println("Seguro de " + v.getPlaca() + ": $" + cs.calcularSeguro());
            }
        }

        Casillero casillero = new Casillero("CAS-01", "Diego Torres", 50);
        casillero.registrarMinutos(120);
        System.out.println("Valor casillero: $" + casillero.valorAlquiler());

        System.out.println(gestor.generarReporteCSV(vehiculos));
    }
}