import java.util.Scanner;
public class CosteFinca{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		//Inicializamos las variables 
			 float ancho=0f,largo=0f,perimetro=0f,area=0f;
			double  hermanos=0,aportacion=0,costovalla=0,precio=0,total=0;
			 final double COSTEDEVALLA=10.5, METROCUADRADO=965;
		//Recibimos informacion desde el teclado
							System.out.println("Introduce el ancho de la finca :_ ");
								ancho=entrada.nextFloat();
								
							System.out.println("Introduce el alto de la finca :");
								largo=entrada.nextFloat();
							System.out.print("¿Cuantos hermanos sois?");
								hermanos=entrada.nextInt();

		// Calculos del programa 
			// En primera instancia sacamos el perimetro y el area 
					perimetro=2*(largo + ancho);
					area=largo*ancho;
				//En segundo lugar calculamos lo importante del programa             ++++                                 
						costovalla=COSTEDEVALLA*perimetro;
						precio=METROCUADRADO*area;
						total=precio+costovalla;
						aportacion=total/hermanos;
			
						/*System.out.println("Su perimetro es de :" +perimetro+"m  ");
						System.out.println("Su area es de :"+area + "m²");
						System.out.println("El precio de vallar la Finca  :"+area );
						System.out.println("El precio de comprar la Finca  :"+area );
						System.out.println("El total de ambos conceptos  :"+area );
						System.out.println("El valor a aportar cada hermano es  :"+area );
						*/

			//Mensaje que sale por pantalla
			System.out.println("La valla de fuera  mide "+perimetro+" y cuesta  "+costovalla+"$");
			System.out.println("El terreno mide "+area+" metros cuadrados"+ " y cuesta "+precio +"$");
			System.out.println("El total de todo es :"+total+" $");
			System.out.println("Cada hermano debe poner "+aportacion+"$");
		;
	}
}