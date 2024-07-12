import java.util.Scanner;

public class PrincipalConversordeMonedas {
    public static void main(String[] args) throws Exception {

        ConsultaMonedasAPI consulta = new ConsultaMonedasAPI();
        ConsultaMonedasAPI conversion = new ConsultaMonedasAPI();
        Scanner sc = new Scanner(System.in);
        Scanner scAmount = new Scanner(System.in);
        double amount;
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("""
                    *********************************
                    Sea bienvenido/a al convertidor de moneda
                    
                    1 - Dolar => Peso argentino
                    2 - Peso argentino => Dolar
                    3 - Dolar => Real brasileno
                    4 - Real brasileno => Dolar
                    5 - Dolar => Peso colombiano
                    6 - Peso colombiano => Dolar
                    7 - Salir
                    Elija una opcion valida:
                    *********************************
                    """);
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    Moneda moneda = conversion.buscaMoneda("USD", "ARS", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() +
                            " en " + moneda.target_code()+ "\n");
                    break;

                case 2:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscaMoneda("ARS", "USD", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

                case 3:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscaMoneda("USD", "BRL", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

                case 4:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscaMoneda("BRL", "USD", amount);
                    System.out.println("El valor " + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

                case 5:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscaMoneda("USD", "COP", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

                case 6:
                    System.out.println("Ingrese el valor que desea convertir");
                    amount = scAmount.nextDouble();
                    moneda = conversion.buscaMoneda("COP", "USD", amount);
                    System.out.println("El valor" + amount + " " + moneda.base_code() + " corresponde al valor final de: " + moneda.conversion_result() + " en " + moneda.target_code());
                    break;

            }
        }
    }
}
