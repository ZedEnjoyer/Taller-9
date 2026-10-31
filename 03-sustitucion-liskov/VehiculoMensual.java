public class VehiculoMensual extends Vehiculo implements AcumulaPuntos { // Paso
    public VehiculoMensual(String placa, String propietario, double valorMensualidad) {
        super(placa, propietario, "MENSUAL", valorMensualidad, 0, 0);
    }

    @Override
    public double calcularCobro() {
        return valorMensualidad;
    }

    @Override // Paso
    public int calcularPuntos() { // Paso
        return (int) (valorMensualidad / 10000); // Paso
    } // Paso
}