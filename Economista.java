import java.util.Scanner;
public class Economista{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce el importe neto del articulo :");
		int importe=entrada.nextInt();
		System.out.print("Introduce el porcentaje de iva ");
		double iva=entrada.nextInt();
		double cuota=iva*importe*0.01;
		double total=cuota+importe;
		System.out.print("Su cuota de ia es de :"+cuota+"   "
			+"\n Su importe total  es de :"+total);

	}
}