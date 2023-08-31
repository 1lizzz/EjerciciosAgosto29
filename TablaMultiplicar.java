
import java.util.Scanner;

/**@author Corrales*/
public class TablaMultiplicar {
    public static void main(String[] args) {
    //ejerc 3
    Scanner teclado = new Scanner(System.in);
           
     System.out.println("Ingrese un numero ");
        int numero = teclado.nextInt();
    
    for (int i = 1; i <= 10; i++){
        
        int mult = numero * i;
        
        System.out.println(numero + "*" + i + "=" + mult);
     
        
    }
          
    }
}
