import java.util.Scanner;
public class Imc{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int altura=0,peso=0,imc=0;
		System.out.print("Introduce tu altura : ");
		altura=entrada.nextInt();
		System.out.print("Introduce tu peso : ");
		peso=entrada.nextInt();
		imc=peso/(altura*altura);
		System.out.println("Su IMC es de : "+imc);

	}
}