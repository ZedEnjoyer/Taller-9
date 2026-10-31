import java.util.List;

public class GestorParqueadero {
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    private ExportadorCSV exportadorCSV = new ExportadorCSV(); // Paso
    private ServicioNotificacion servicioNotificacion = new ServicioNotificacion(); // Paso

    public double calcularCobro(Vehiculo v) {
        switch (v.getTipo()) {
            case "MENSUAL": return v.getValorMensualidad();
            case "MINUTOS": return v.getMinutos() * v.getTarifaMinuto();
            default: throw new IllegalArgumentException("Tipo desconocido: " + v.getTipo());
        }
    }

    public void guardar(Vehiculo v, double cobro) {
        repositorio.insertar(v.getPlaca(), cobro);
    }

    public void cerrarMes(Vehiculo v) {
        double cobro = calcularCobro(v); 
        guardar(v, cobro); // Paso
        servicioNotificacion.enviarRecibo(v, cobro);
    }

    public String generarReporteCSV(List<Vehiculo> vehiculos) {
        return exportadorCSV.exportarCSV(vehiculos, this);
    }
}