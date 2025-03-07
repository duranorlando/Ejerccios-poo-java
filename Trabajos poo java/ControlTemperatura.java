import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ControlTemperatura {

    private static final Random datoRandom = new Random();

    public static void main(String[] args) {
        while (true) {
            
            double temperatura = leerSensor();
            System.out.printf("Temperatura actual: %.2f°C%n", temperatura);  

            
            String estado;
            if (temperatura < 10) {
                estado = "Calefactor activado";
            } else if (temperatura <= 25) {
                estado = "Sistema inactivo";
            } else {
                estado = "Ventilador activado";
            }

            System.out.println("Estado del sistema: " + estado + "\n");

            
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    private static double leerSensor() {
        
        return 0 + (35 - 0) * datoRandom.nextDouble();  
    }
}
