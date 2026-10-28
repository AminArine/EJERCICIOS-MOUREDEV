import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
    	//Decaracion e inicializacion de variables;
    	double nota1=0,nota2=0,nota3=0,mediaExp=0;
    	int mediaBole=0;
        Scanner sc = new Scanner(System.in);
        //Pedimos datos al usuario
        System.out.print("Introduce la nota 1:");
        nota1=sc.nextDouble();
        System.out.print("Introduce la nota 2:");
        nota2=sc.nextDouble();
        System.out.print("Introduce la nota 3:");
        nota3=sc.nextDouble();

        //Calculos 
        mediaExp=(nota1+nota2+nota2)/3;
        mediaBole=(int)mediaExp;
        //Lo que he hecho en la linea anterior se llama hacer un casting

        //
        System.out.println("La media del expediente :"+mediaExp);
        System.out.println("La media del Boleto :"+mediaBole);

        

        sc.close();
    }
}