public class VehiculoPorDia extends Vehiculo {
    private int dias;
    private double tarifaDia;

    public VehiculoPorDia(String placa, String propietario, double tarifaDia, int dias) {
        super(placa, propietario, "DIA", 0, 0, 0); 
        this.tarifaDia = tarifaDia; 
        this.dias = dias; 
    } 

    @Override 
    public double calcularCobro() { 
        return dias * tarifaDia; 
    } 
} 