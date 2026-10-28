import java.util.Scanner;
public class AreaTriangulo {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double  base=0;
		double  altura=0;
		System.out.print("Introduce el tamaño de la base :");
		base=entrada.nextDouble();
		System.out.print("Introduce el tamaño de la Altura :");
		altura=entrada.nextDouble();
		double  area=(base*altura)/2;
		System.out.print("El área del triangulo es de :"+area +"m^2");
	}
}