import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consulta = new ConsultaMoneda();

        int opcion = 0;
        while (opcion != 7) {
            mostrarMenu(); // <-- Llamamos al metodo que muestra el menú

            try {
                opcion = lectura.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Ingrese solo números.");
                lectura.next(); 
                continue;
            }

            if (opcion == 7) {
                System.out.println("Saliendo del programa, gracias por utilizar nuestros servicios");
                break;
            }

            String base = "";
            String target = "";

            switch (opcion) {
                case 1: base = "USD"; target = "ARS"; break;
                case 2: base = "ARS"; target = "USD"; break;
                case 3: base = "USD"; target = "BRL"; break;
                case 4: base = "BRL"; target = "USD"; break;
                case 5: base = "USD"; target = "COP"; break;
                case 6: base = "COP"; target = "USD"; break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
                    continue;
            }

            realizarConversion(lectura, consulta, base, target);
        }
    }

    // Este metodo tiene la única responsabilidad de convertir
    public static void realizarConversion(Scanner lectura, ConsultaMoneda consulta, String base, String target) {
        try {
            System.out.println("Ingrese el valor que deseas convertir:");
            double valor = lectura.nextDouble();

            Moneda moneda = consulta.buscarMoneda(base, target);
            double resultado = valor * moneda.conversion_rate();

            System.out.printf("El valor %.2f [%s] corresponde al valor final de =>>> %.2f [%s]%n", valor, base, resultado, target);

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n*************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
        System.out.println("");
        System.out.println("1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.println("Elija una opción válida:");
        System.out.println("*************************************************");
    }
}

