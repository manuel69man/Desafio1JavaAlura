import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nombre ="Tony Stark";
        String tipoDeCuenta = "Corriente";
        double saldoInicial = 1599.00;

        System.out.println("********************");
        System.out.println("\nNombre del Cliente: "+nombre);
        System.out.println("El tipo de cuente es: "+tipoDeCuenta);
        System.out.println("Su saldo Disponible es: "+saldoInicial);
        System.out.println("\n********************");

        String menu = """
                **** Escribe el número de la opción deseada ****
                1 - Consultar Saldo
                2 - Retirar
                3 - Depositar
                9 - Salir
                """;

        int opcion=0;
        double montoDepositoRetiro=0;
        Scanner teclado = new Scanner(System.in);
        while (opcion!=9){
            System.out.println(menu);
            opcion=teclado.nextInt();


            switch (opcion){
                case 1 :
                    System.out.println("Saldo actual de su cuenta "+tipoDeCuenta+" es: "+saldoInicial);
                    break;
                case 2:
                    System.out.println("Introduzca el monto a Retirar: ");
                    montoDepositoRetiro = teclado.nextDouble();
                    if (montoDepositoRetiro>saldoInicial){
                        System.out.println("Saldo Insuficiente");
                    } else {
                        saldoInicial-=montoDepositoRetiro;
                        System.out.println("Saldo actual de su cuenta "+tipoDeCuenta+" es: "+saldoInicial);
                    }
                    break;

                case 3:
                    System.out.println("Introduzca el monto a Depositar: ");
                    montoDepositoRetiro = teclado.nextDouble();
                    saldoInicial+=montoDepositoRetiro;
                    System.out.println("Saldo actual de su cuenta "+tipoDeCuenta+" es: "+saldoInicial);
                    break;
            }

        }
    }
}
