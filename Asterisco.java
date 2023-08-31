
import java.util.Scanner;

/**
 * @author Corrales
 */
public class Asterisco {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tamanocuadrado;
        System.out.println("Ingrese el tamaño del cuadrado: ");
        tamanocuadrado = teclado.nextInt();

        for (int i = 1; i <= tamanocuadrado; i++) {

            for (int j = 1; j <= tamanocuadrado; j++) {
                if (i == 1 || i == tamanocuadrado || j == 1 || j == tamanocuadrado) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
       
        teclado.close();
    
    }
}
