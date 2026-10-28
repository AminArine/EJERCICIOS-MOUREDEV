import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        System.out.print("Introduce un numero :");
        numero=sc.nextInt();

	        for (int i=1;i<=numero ;i++ ) {
	        	if(numero%i==0){
	        	System.out.print(i+" - ");
	       			 }
	        }

        sc.close();
    }
}