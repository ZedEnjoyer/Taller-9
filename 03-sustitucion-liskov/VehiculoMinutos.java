public class VehiculoMinutos extends Vehiculo implements AcumulaPuntos { 
    public VehiculoMinutos(String placa, String propietario, double tarifaMinuto, int minutos) {
        super(placa, propietario, "MINUTOS", 0, tarifaMinuto, minutos);
    }

    @Override
    public double calcularCobro() {
        return minutos * tarifaMinuto;
    }

    @Override
    public int calcularPuntos() {
        return (int) ((minutos * tarifaMinuto) / 10000);
    }
}