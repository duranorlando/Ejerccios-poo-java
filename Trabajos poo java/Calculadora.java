import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

    
        System.out.println("Seleccione una operación:");
        System.out.println("1: Sumar");
        System.out.println("2: Restar");
        System.out.println("3: Multiplicar");
        System.out.println("4: Dividir");
        int operacion = scanner.nextInt(); 
        double resultado = 0;
        boolean operacionValida = true;

        
        if (operacion == 1) {
            resultado = calculadora.sumar(num1, num2);
        } else if (operacion == 2) {
            resultado = calculadora.restar(num1, num2);
        } else if (operacion == 3) {
            resultado = calculadora.multiplicar(num1, num2);
        } else if (operacion == 4) {
        
            if (num2 == 0) {
                System.out.println("Error: No se puede dividir por cero.");
                operacionValida = false;
            } else {
                resultado = calculadora.dividir(num1, num2);
            }
        } else {
            System.out.println("Operación no válida. Por favor, seleccione una operación válida.");
            operacionValida = false;
        }

        
        if (operacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        scanner.close();
    }
}
