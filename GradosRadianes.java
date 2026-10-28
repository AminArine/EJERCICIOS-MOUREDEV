import java.util.Scanner;
public class GradosRadianes{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double grados=0;

		System.out.print("Introduce un angulo en grados : " );
		grados =entrada.nextDouble();
		double radianes=(grados *Math.PI)/180;
		System.out.print("La conersion a radianes es de :"+radianes+" radianes ");
	}
}