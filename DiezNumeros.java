
import java.util.Scanner;

/**@author Corrales*/
public class DiezNumeros {
    public static void main(String[] args) {
        //ejercicio 6
         Scanner scanner = new Scanner(System.in); int[] numeros = new int[10];

      System.out.println("Ingrese 10 números:");

      for (int i = 0; i <= 10; i++){ 
          numeros[i] = scanner.nextInt();
         }

      System.out.println("El orden solicitado es:");

      System.out.println("Primer número: " + numeros[0]); 
       
      System.out.println("Último número: " + numeros[numeros.length-1]);

      System.out.println("Segundo número: " + numeros[1]);

      System.out.println("Penúltimo número: " + numeros[numeros.length - 2]);

      System.out.println("Tercer número: " + numeros [2]); 
    }  
}
