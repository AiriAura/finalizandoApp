import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombreUsuario = "Robert Pattinson";
        String tipoDeCuenta = "Vista";
        double saldo = 990.000;
        int opcion = 0;

        System.out.println("*********************************");
        System.out.println("\n Nombre del cliente: " + nombreUsuario);
        System.out.println("Tipo de cuenta: " +tipoDeCuenta);
        System.out.println("Su saldo disponible es: " +saldo + "$");
        System.out.println("\n*********************************");

        String menu = """
                *** Escriba el número de la acción que desea realizar***
                1- Consultar saldo
                2- Realizar giro
                3- Depositar
                9- Salir
                """;
        Scanner teclado = new Scanner(System.in);
        while(opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("El saldo actualizado es: " + saldo + "$");
                    break;
                case 2:
                    System.out.println("¿Cuál es el valor que desea retirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (valorARetirar > saldo){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo -= valorARetirar;
                        System.out.println("Su saldo actual es: " + saldo + "$");
                    }
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea depositar: ");
                    double valorADepositar = teclado.nextDouble();
                    saldo += valorADepositar;
                    System.out.println("Su saldo actual es: " + saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestro servicio.");
                    break;
                default:
                    System.out.println("Ingrese una opción válida");

            }
        }

    }
}