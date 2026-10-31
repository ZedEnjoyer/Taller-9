public class VehiculoPorDia extends Vehiculo { // Paso
    private int dias; // Paso
    private double tarifaDia; // Paso

    public VehiculoPorDia(String placa, String propietario, double tarifaDia, int dias) { // Paso
        super(placa, propietario, "DIA", 0, 0, 0); // Paso
        this.tarifaDia = tarifaDia; // Paso
        this.dias = dias; // Paso
    } // Paso

    @Override // Paso
    public double calcularCobro() { // Paso
        return dias * tarifaDia; // Paso
    } // Paso
} // Paso