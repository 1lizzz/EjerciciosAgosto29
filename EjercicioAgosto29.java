/**@author Corrales*/
public class EjercicioAgosto29 {
     public static void main(String[] args) {
    //imptimir numeros pares del 1 al 20
    int cero = 0;
    int positivo = 0;
    int negativo = 0;
    
    for (int i = 0; i <= 20; i++) {
        
        if(i % 2 == 0){
            positivo++;
        }
        if(i < 0){
            negativo++;
        }
        if (i == 0){
            cero++;
        }
    }
    System.out.println("numeros positivos: "+positivo);
    System.out.println("numeros negativos: "+negativo);
    System.out.println("numeros ceros: "+cero);
}
}
