package process;

import java.util.Scanner;

public class Metodos {

    private static final Scanner lectura = new Scanner(System.in);
    private static final ConsultaMoneda consulta = new ConsultaMoneda();

    public static void conversor(){

        int opcion = 0;

        do {
            System.out.println("********************************************\n" +
                    "Conversor de monedas:\n" +
                    "\n" +
                    "1) Dolar => Peso argentino\n" +
                    "2) Peso Argentino => Dolar\n" +
                    "3) Dolar => Real brasileno\n" +
                    "4) Real Brasileno => Dolar\n" +
                    "5) Dolar => Peso Colombiano\n" +
                    "6) Peso Colombiano => Dolar\n" +
                    "7) Salir\n" +
                    "\n" +
                    "Elija una opción valida:\n" +
                    "********************************************");

            opcion = lectura.nextInt();

            switch (opcion){
                case 1:
                    conversion("USD", "ARS");
                    break;
                case 2:
                    conversion("ARS", "USD");
                    break;
                case 3:
                    conversion("USD", "BRL");
                    break;
                case 4:
                    conversion("BRL", "USD");
                    break;
                case 5:
                    conversion("USD", "COP");
                    break;
                case 6:
                    conversion("COP", "USD");
                    break;
                case 7:
                    System.out.println("Gracias por utilizar el conversor de monedas.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }while (opcion != 7);
    }

    public static void conversion(String monedaOrigen, String monedaDestino) {
        try {
            System.out.printf("Ingrese la cantidad de %s a convertir: ", monedaOrigen);
            double cantidad = obtenerCantidad();

            MonedaAPI monedaApi = consulta.buscaMoneda(monedaOrigen, monedaDestino, cantidad);

            // Crear un objeto Moneda a partir del objeto MonedaAPI
            Money moneda = new Money(monedaApi);

            // Imprimir el resultado de la conversión
            System.out.printf("%.2f %s corresponde a %.2f %s%n",
                    cantidad,
                    monedaOrigen,
                    moneda.getResultadoConversion(),
                    monedaDestino
            );

        } catch (Exception e) {
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }
    }

    public static double obtenerCantidad(){
        double cantidad = lectura.nextDouble();
        if (cantidad < 0){
            System.out.println("Por favor, ingrese un valor positivo.");
        }
        return cantidad;
    }



}