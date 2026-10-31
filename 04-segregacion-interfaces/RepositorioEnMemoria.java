import java.util.HashMap;
import java.util.Map;

public class RepositorioEnMemoria implements RepositorioParqueadero {
    private Map<String, Double> cobros = new HashMap<>();
    
    @Override
    public void insertar(String placa, double cobro) {
        cobros.put(placa, cobro);
        System.out.println("[EnMemoria] Guardado temporal: " + placa + " -> $" + cobro); 
    } 

    public Map<String, Double> getCobros() { return cobros; }
} 