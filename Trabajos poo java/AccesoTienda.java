

import static java.lang.System.out;

import java.time.LocalTime;  
import java.util.Scanner;   

public class AccesoTienda {

    // Clase Usuario
    public static class Usuario {
        private boolean tieneMembresia;
        private boolean esEmpleado;

        public Usuario(boolean tieneMembresia, boolean esEmpleado) {
            this.tieneMembresia = tieneMembresia;
            this.esEmpleado = esEmpleado;
        }

        public boolean tieneMembresia() {
            return tieneMembresia;
        }

        public boolean esEmpleado() {
            return esEmpleado;
        }

        
        public static boolean ingresarMembresia() {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("¿Tiene membresía? (true/false): ");
                return scanner.nextBoolean();  
            }
        }

        
        public static boolean ingresarEmpleado() {
            try (Scanner scanner = new Scanner(System.in)) {
                out.print("¿Es empleado? (true/false): ");
                return scanner.nextBoolean();  
            }
        }
    }

    
    public static class Tienda {
        private LocalTime horaApertura;
        private LocalTime horaCierre;

        public Tienda(LocalTime horaApertura, LocalTime horaCierre) {
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }

        public boolean estaAbierta() {
            LocalTime ahora = LocalTime.now();  
            return !ahora.isBefore(horaApertura) && !ahora.isAfter(horaCierre);  
        }

        public boolean permitirAcceso(Usuario usuario) {
            if (usuario.esEmpleado()) {
                return true;  
            } else if (usuario.tieneMembresia() && estaAbierta()) {
                return true;  
            } else {
                return false;  
            }
        }
    }

    // Clase principal de ControlAcceso
    public static void main(String[] args) {
        Tienda tienda = new Tienda(LocalTime.of(9, 0), LocalTime.of(18, 0));  // Definimos las horas de apertura y cierre de la tienda

        // Ingreso de datos de usuarios
        boolean tieneMembresiaCliente = Usuario.ingresarMembresia();  // Consultamos si el cliente tiene membresía
        boolean esEmpleadoCliente = Usuario.ingresarEmpleado();  // Consultamos si el cliente es empleado

        Usuario cliente = new Usuario(tieneMembresiaCliente, esEmpleadoCliente);  // Creamos el objeto cliente
        Usuario empleado = new Usuario(true, true);  // El empleado tiene acceso siempre

        // Prueba de acceso
        System.out.println("Permitir acceso al cliente: " + tienda.permitirAcceso(cliente));  // Verificamos si el cliente puede acceder
        System.out.println("Permitir acceso al empleado: " + tienda.permitirAcceso(empleado));  // Verificamos si el empleado puede acceder
    }

    @Override
    public String toString() {
        return "AccesoTienda []";
    }
}
