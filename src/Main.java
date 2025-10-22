import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        private static void SolicitarCadenaCaracteres() {}
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

}