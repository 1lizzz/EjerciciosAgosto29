
import java.util.Scanner;


/*@author Corrales*/
public class Suma10 {
    public static void main(String[] args) {
      //ejerc 2
      Scanner teclado = new Scanner(System.in);
      
      int numero, suma = 0;
      
    for (int i=1;i<=10;i++) {
        System.out.println("ingrese un numero");
          numero = teclado.nextInt();

          suma = suma + numero;
    }
     System.out.println("La suma de los 10 numeros es: "+suma);

    }
    
}
