import java.util.Scanner;

public class Persona {
    
    private String nombre;
    private String correo;
    private int cedula;
    private int telefono;
    
    // Constructor
    public Persona(String nombre, String correo, int cedula, int telefono) {
        this.nombre = nombre;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this .nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    // Método para imprimir los datos de la persona
    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Cédula: " + cedula);
        System.out.println("Teléfono: " + telefono);
    }

    // Método para capturar los datos desde el teclado
    public static Persona crearDesdeTeclado() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Digite el correo: ");
            String correo = scanner.nextLine();

            System.out.print("Digite la cédula: ");
            int cedula = scanner.nextInt();

            System.out.print("Digite el teléfono: ");
            int telefono = scanner.nextInt();

            return new Persona(nombre, correo, cedula, telefono);
        }
    }
    
    // Método principal
    public static void main(String[] args) {
        Persona persona = Persona.crearDesdeTeclado();
        persona.imprimirDatos();
    }
    
    
}