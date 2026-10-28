import java.util.Scanner;

public class Reparto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Inicializamos  todas la variables 
        	//Utilizo las variables byte y float para mayor eficiencia en cuanto a tiempos de ejecucion del programa.
	        final byte UNIDADES=2;
	        final byte AMIGOS=3;
	        float fanta=0f,cocacola=0f,patatas=0f,frutos=0f,vasos,hielo=0f,total=0f,tajada=0f,cuenta1=0f,cuenta2=0f,cuenta3=0f;
        //Recogemos datos por teclado 
	        System.out.println("Amigo 1. Cuanto cuesta 1 botella de fanta?");
	        	fanta=sc.nextFloat();
	        System.out.println("Amigo 1. Cuanto cuesta 1 botella de cocacola?");
	       		cocacola=sc.nextFloat();
	        System.out.println("Amigo 2. Cuanto cuesta 1 bolsa de patatas?");
	       		patatas=sc.nextFloat();
	        System.out.println("Amigo 2. Cuanto cuesta 1 bolsa de frutos secos?");
	        	frutos=sc.nextFloat();
	        System.out.println("Amigo 3. Cuanto cuesta 1 bolsa de vasos?");
	        	vasos=sc.nextFloat();
	        System.out.println("Amigo 3. Cuanto cuesta 1 bolsa de Hielo?");
	        	hielo=sc.nextFloat();
	    // Calculos del ejercicio
	        cuenta1=2*fanta+2*cocacola ;
	        cuenta2=2*patatas+2*frutos;
	        cuenta3=2*vasos+2*hielo;
	        total=cuenta1+cuenta2+cuenta3;
	        tajada=total/AMIGOS;
	    //Devolucion del programa
	        System.out.println("La fiesta cuesta en total "+total+"? y cada uno deberia poner "+tajada);
	        System.out.println("El Amigo 1 pagó "+cuenta1+"?"+"  ( "+(cuenta1-tajada)+" )  ");
	        System.out.println("El Amigo 1 pagó "+cuenta2+"?"+"  ( "+(cuenta2-tajada)+" )  ");
	        System.out.println("El Amigo 1 pagó "+cuenta3+"?"+"  ( "+(cuenta3-tajada)+" )  ");
        

        sc.close();
    }
}