public class VehiculoMensual extends Vehiculo implements AcumulaPuntos {
    public VehiculoMensual(String placa, String propietario, double valorMensualidad) {
        super(placa, propietario, "MENSUAL", valorMensualidad, 0, 0);
    }

    @Override
    public double calcularCobro() {
        return valorMensualidad;
    }

    @Override
    public int calcularPuntos() {
        return (int) (valorMensualidad / 10000);
    }
}