import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura,base,area;
        do{
        System.out.print("introduce la altura del Triangulo :");
        altura=sc.nextDouble();
        System.out.print("introduce la base del Triangulo :");
        base=sc.nextDouble();
         area=(base*altura)/2;
        System.out.println("El area del triangulo es :"+area +" m²");

        }while(altura<0 || base<0);
        sc.close();
    }
}