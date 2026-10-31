public class VehiculoMinutos extends Vehiculo {
    public VehiculoMinutos(String placa, String propietario, double tarifaMinuto, int minutos) {
        super(placa, propietario, "MINUTOS", 0, tarifaMinuto, minutos); 
    } 

    @Override 
    public double calcularCobro() { 
        return minutos * tarifaMinuto; 
    } 
} 