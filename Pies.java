import java.util.Scanner;
public class Pies{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double pies=0;
		System.out.print("Introduce la medida en pies :");
		 pies=entrada.nextDouble();
		double pulgadas=pies*12;
		double cm=pulgadas *2.54;
		double m=cm*0.01;
		double yardas=pies/3;
		System.out.print("En pulgadas es :"+pulgadas +"\n"
		+"En yardas es: "+yardas+"\n"
		+"En cm es :"+cm +"\n"
		+"En metros es : "+m+"\n");



	}
}