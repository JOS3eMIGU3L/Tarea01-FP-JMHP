import java.util.Scanner;

public class ejerciciosjava {
    public static void main(String[] args) {
        //2.15
        //definir variables
        double P, R=4, I;
        //datos de entrada
        Scanner lt = new Scanner(System.in);
        System.out.println("ingrese el valor de la intensidad: ");
        
        
        I=lt.nextDouble();
        
        //proceso
        P=R*Math.pow(I, 2);

        //datps de salida
        System.out.println("La potencia es: " +P);

    }
}
