import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    static String cadena ="";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            try {
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("                            ----MENU----                                     ");
                System.out.println("1. Solicitar una cadena de caracteres");
                System.out.println("2. Visualizar el caracter de la posicion x de una cadena de caracteres");
                System.out.println("3. Convertir la cadena de caracteres en un numero entero");
                System.out.println("4. Convertir la cadena de caracteres en una fecha");
                System.out.println("5. Finalizar");
                System.out.println("-----------------------------------------------------------------------------");

                System.out.println("introduce una opcion: ");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        SolicitarCadenaCaracteres();
                        break;
                    case 2:
                        VisualizarCaracter();
                        break;
                    case 3:
                        ConvertirNumeroEntero();
                        break;
                    case 4:
                        ConvertirFecha();
                        break;
                    case 5:
                        System.out.println("programa finalizado");
                        break;
                    default:
                        System.out.println("Opcion no permitida, introduzca una de las siguientes opciones");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion no permitida,introduzca una de las siguientes opciones");
                sc.nextLine();//paqra limpiar y te salgaq lño siguiente bien
            }
        }while(opcion !=5);
    }




    private static void SolicitarCadenaCaracteres() {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una cadena de caracteres:  ");
        cadena = sc.nextLine();

        if(cadena.isEmpty()){//por si pones la cadena vacia, q te diga q esta mal y te lo vuelva a pedir , hasta q este llena
            System.out.println("introduce una cadena de caracteres:  ");
            cadena = sc.nextLine();
        }else{
            System.out.println("cadena de caracteres q tienes es "+cadena);
        }

    }

    private static void VisualizarCaracter() {
        Scanner sc = new Scanner(System.in);

        int posicion;
        System.out.println("La cadena de caracteres que tienes es: " + cadena);

        if (cadena.isEmpty()) {// quiere decir q si la cadena esta vacia(empty) me salga ese mensaje y con el return me vuelva a la clase genereal
            System.out.println("Primero debes ingresar una cadena en la opcion 1");
            return;
        }else{
            System.out.println("introduce la posicion que quieres: ");
            posicion = sc.nextInt();


            if (posicion >= 0 && posicion < cadena.length()) {
                char caracter = cadena.charAt(posicion); //.charAt(x) para contar para la posicion
                System.out.println("El carácter es: " + caracter);
            } else {
                System.out.println("posicion elegida no es valida");
            }
        }

    }
