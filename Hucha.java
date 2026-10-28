import java.util.Scanner;

public class Hucha{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla ,tajada=0,hucha=0,i=0;
        System.out.println("¿Cuantos euros quieres ahorrar ?");
        tabla=sc.nextInt();
        while(hucha<tabla){

        	System.out.println("¿Cuantos euros quiere meter en la hucha  ?");
            tajada=sc.nextInt();
            hucha+=tajada;

        	
        }
        System.out.println("¡Objetivo conseguido ! Ha ahorrado usted "+hucha+" $");

        sc.close();
    }
}                                                             