import java.util.Scanner;

public class Primo  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero=0,numDivisores=0;
        System.out.print("Introduce un numero :");
        numero=sc.nextInt();

	        for (int i=1;i<=numero ;i++ ) {
	        	if(numero%i==0){
	        	//esto que hay debajo lo podemos entender como un contador de iteraciones ,que cumplan la propiedad que nos interesa.
	        	numDivisores++;
	       			 }
	        }

	        if(numDivisores<=2){
	        	System.out.println("El numero "+numero +" es primo ");
	        }else{
	        	System.out.println("El numero "+numero +" no es primo ");
	        }

        sc.close();
    }
}