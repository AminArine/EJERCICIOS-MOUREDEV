import java.util.Scanner;
public class Carpintero{
	public static void main(String[] args) {
		double cm=0,mm=0,m=0;
		Scanner entrada=new Scanner(System.in);
		System.out.print("Introduce la medida en milimetros :");
		mm=entrada.nextInt();
		System.out.print("Introduce la medida en centimetros :");
		cm=entrada.nextInt();
		System.out.print("Introduce la medida en metros :");
		m=entrada.nextInt();

		double  calculo=m + mm*0.001+cm*0.01 ;
		calculo*=100;
		System.out.print("Su suma total en centimetros es de :"+calculo);

	}
}