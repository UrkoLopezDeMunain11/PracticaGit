import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
    }
}