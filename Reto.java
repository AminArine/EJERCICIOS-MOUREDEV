import java.util.Scanner;

public class Reto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota del primer trimestre :");
       	int nota1=sc.nextInt();
        System.out.print("Introduce la nota del primer trimestre :");
        int nota2=sc.nextInt();
        System.out.print("Introduce la nota del primer trimestre :");
        int nota3=sc.nextInt();
        int  medecimal=(nota1+nota2+nota3)/3;
		System.out.println("Su nota media con decimales es :"+medecimal);
		
		/*TEN ENCUENTA QUE EL DOUBLE CABEN EN 
		EL TODOS LOS ANTERIORES PQ DOUBLE>INT
		ENTONCES ES UN SIMPLE ASIGNACION */
		double  n1,n2,n3,mediaexpediente;
		n1=nota1;
		n2=nota2;
		n3=nota3;
		mediaexpediente=(n1+n2+n3)/3;
		/* Otro modo de hacerlo puede ser el siguiente ""CASTING"" :
			mediaexpediente=(double)(nota1+nota2+nota3)/3;
			FIJATE MI BRO
			-->Otro modo seria el siguiente enganar al doble 
			int nota1,nota2,nota3;
			mediaexpediente=(double)(nota1+nota2+nota3)/""3.0"";
		*/
		System.out.println("Su nota media  es :"+mediaexpediente);

        sc.close();
    }
}