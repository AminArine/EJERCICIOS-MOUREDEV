import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        System.out.print("Introduce el lado del cuadrado :");
        numero=sc.nextInt();
        for (int i=0;i<numero ;i++ ) {
        	for (int j=0;j<numero ;j++ ) {
        		System.out.print("*");
        	}
        	System.out.println("");
        }

        sc.close();
    }
}