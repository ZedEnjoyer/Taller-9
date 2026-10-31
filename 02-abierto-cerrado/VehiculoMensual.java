public class VehiculoMensual extends Vehiculo { // Paso
    public VehiculoMensual(String placa, String propietario, double valorMensualidad) { // Paso
        super(placa, propietario, "MENSUAL", valorMensualidad, 0, 0); // Paso
    } // Paso

    @Override // Paso
    public double calcularCobro() { // Paso
        return valorMensualidad; // Paso
    } // Paso
} // Paso