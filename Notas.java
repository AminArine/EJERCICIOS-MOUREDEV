import java.util.Scanner;
public class Notas{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
			System.out.print("Introduzca la nota de teoria :");
			float nota=entrada.nextFloat();
			System.out.print("Introduzco la nota de practica :");
			float nota1=entrada.nextFloat();
			float notas=nota*0.70f+nota1*0.30f;
			System.out.println("Su nota final es de "+notas);
	}
}