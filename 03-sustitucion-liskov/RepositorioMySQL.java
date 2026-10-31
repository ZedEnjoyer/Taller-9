public class Casillero implements ServicioParqueadero {
    private String codigo;
    private String usuario;
    private double tarifaMinuto;
    private int minutos;

    public Casillero(String codigo, String usuario, double tarifaMinuto) {
        this.codigo = codigo;
        this.usuario = usuario;
        this.tarifaMinuto = tarifaMinuto;
    }

    public void registrarMinutos(int minutos) { this.minutos += minutos; }

    public double calcularSeguro() {
        return 0;

    public void solicitarLavados(int cantidad) {
    }

    public double valorAlquiler() { return minutos * tarifaMinuto; }
}
