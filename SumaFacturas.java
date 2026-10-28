import java.util.Scanner;

public class SumaFacturas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total=0,factura=-1;
        
        do{
        	System.out.println("Dime valor de la factura (0 para terminar ):");
        	factura=sc.nextDouble();
        	total=total+factura;
        }while(factura !=0);
        System.out.println("Tienes un total de " +total+" $");
        sc.close();
    }
}