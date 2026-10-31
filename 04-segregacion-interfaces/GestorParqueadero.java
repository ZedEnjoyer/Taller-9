import java.util.List;

public class GestorParqueadero {
    private RepositorioMySQL repositorio = new RepositorioMySQL();
    private ExportadorCSV exportadorCSV = new ExportadorCSV();
    private ServicioNotificacion servicioNotificacion = new ServicioNotificacion();

    public double calcularCobro(Vehiculo v) {
        return v.calcularCobro();
    }

    public void guardar(Vehiculo v, double cobro) {
        repositorio.insertar(v.getPlaca(), cobro);
    }

    public void cerrarMes(Vehiculo v) {
        double cobro = calcularCobro(v);
        guardar(v, cobro);
        servicioNotificacion.enviarRecibo(v, cobro);
    }

    public String generarReporteCSV(List<Vehiculo> vehiculos) {
        return exportadorCSV.exportarCSV(vehiculos, this);
    }
}