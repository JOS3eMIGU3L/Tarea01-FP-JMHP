import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        //2.19
       //definir variables
       double L, Pi=3.1415, R;
        //datos de entrada
       Scanner sc = new Scanner(System.in);
       System.out.println("ingrese el valor radio: ");
       
    
       R=sc.nextDouble();
        
       //proceso

       L=Pi*Math.pow(R, 2);
       //datos de salida
       System.out.println("La longitud es: " +L);
    
    }



}
