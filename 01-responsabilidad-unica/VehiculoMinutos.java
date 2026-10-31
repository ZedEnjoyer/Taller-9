public class VehiculoMinutos extends Vehiculo { // Paso
    public VehiculoMinutos(String placa, String propietario, double tarifaMinuto, int minutos) { // Paso
        super(placa, propietario, "MINUTOS", 0, tarifaMinuto, minutos); // Paso
    } // Paso

    @Override // Paso
    public double calcularCobro() { // Paso
        return minutos * tarifaMinuto; // Paso
    } // Paso
} // Paso