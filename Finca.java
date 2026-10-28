import java.util.Scanner;
public class Finca{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		 var ancho=0f,largo=0f,perimetro=0f,area=0f;
		System.out.println("Introduce el ancho de la finca :_ ");
			ancho=entrada.nextFloat();
			
		System.out.println("Introduce el alto de la finca :");
			largo=entrada.nextFloat();
			//
			perimetro=2*(largo + ancho);
			area=largo*ancho;
			System.out.println("Su perimetro es de :" +perimetro+"m  ");

			System.out.println("Su area es de :"+area + "m²");
		;
	}
}