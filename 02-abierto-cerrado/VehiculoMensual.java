public class VehiculoMensual extends Vehiculo {
    public VehiculoMensual(String placa, String propietario, double valorMensualidad) {
        super(placa, propietario, "MENSUAL", valorMensualidad, 0, 0);
    }

    @Override
    public double calcularCobro() { 
        return valorMensualidad; 
    }
}