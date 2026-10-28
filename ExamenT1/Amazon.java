import java.util.Scanner;

public class Amazon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Inicializamos  todas la variables 
        	//Utilizo las variables short para mayor eficiencia en cuanto a tiempos de ejecucion del programa.
	       	short furgo=0,city=0;
	       	int totalPaquetes=0;
	       	final byte PAQUETES=20;
       	//Introducimos datos por teclado
	        System.out.println("Cuantas furgonetas han llegaron hoy?");
	        	furgo=sc.nextShort();
	        System.out.println("Entre cuantas ciudades repartimos?");
	        	city=sc.nextShort();
	    //Calculamos y sacamos por pantalla
	        totalPaquetes=furgo*PAQUETES;
	        System.out.println("Hoy se reparten por tanto "+(totalPaquetes)+" paquetes.");
	        System.out.println("Y cada ciudad recibe "+(totalPaquetes/city)+" paquetes");
			System.out.println("En el centro se quedan sin asignar "+(totalPaquetes%city)+" paquetes");
			



        sc.close();
    }
}