

import java.util.Scanner;

public class JuegoFizzBuzz {

    
    public static class FizzBuzz {
        public String calcular(int numero) {
            if (numero % 3 == 0 && numero % 5 == 0) {
                return "FizzBuzz";
            } else if (numero % 3 == 0) {
                return "Fizz";
            } else if (numero % 5 == 0) {
                return "Buzz";
            } else {
                return Integer.toString(numero);
            }
        }
    }

    
    public static class Usuario {
        private int numero;

        
        public void ingresarNumero() {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Ingrese un número: ");
                this.numero = scanner.nextInt();
            }
        }

        
        public int getNumero() {
            return this.numero;
        }
    }

    public static class Principal {
        public static void main(String[] args) {
            FizzBuzz fizzBuzz = new FizzBuzz();
            Usuario usuario = new Usuario();
            usuario.ingresarNumero();

            System.out.println("Calculando FizzBuzz para el número ingresado...");
            int numeroUsuario = usuario.getNumero();

            
            System.out.println("Resultado para el número " + numeroUsuario + ": " + fizzBuzz.calcular(numeroUsuario));

        
            System.out.println("\nResultados para los números del 1 al 100:");
            for (int i = 1; i <= 100; i++) {
                System.out.println(fizzBuzz.calcular(i));
            }
        }
    }
}
