import java.util.Scanner;
public class Biologo{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int hormigas=0,spider=0,cochinillas=0;
		final int HORMIGAS=6;
		final int SPIDER=8;
		final int COCHINILLAS=14;
		System.out.print("Introduce el total de Hormigas :");
		hormigas=entrada.nextInt();
		System.out.print("Introduce el total de Spider :");
		spider=entrada.nextInt();
		System.out.print("Introduce el total de cochinillas :");
		cochinillas=entrada.nextInt();
		int total=HORMIGAS*hormigas+SPIDER*spider+cochinillas*14;
		System.out.print("El  total de patas es el siguiente :"+total);

	}
}