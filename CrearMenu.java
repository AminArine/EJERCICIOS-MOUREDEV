import java.util.Scanner;

public class CrearMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte opcion =-1;
        double total=0,factura=-1;
          int tabla ,i=0;
        System.out.println("-----------Menú-----------"
    	+"\n 1) Tabla de multiplicar.. "	
    	+"\n 2) Factura hasta 0 .."
    	+"\n 3) Salir  "
    	
    );
        do{
        	System.out.println("\n");
	        System.out.println("Introduce un opcion :");
	        opcion=sc.nextByte();
	        switch (opcion) {
	            case 1:
	            	 System.out.println("Dime tabla de multiplicar :");
			        tabla=sc.nextInt();
			        while(i<=10){
			        	System.out.println(tabla +" *"+i+"="+(tabla*i));
			        	i++;
			       	 }
        
	                break;
	            case 2:
	                 do{
			        	System.out.println("Dime valor de la factura (0 para terminar ):");
			        	factura=sc.nextDouble();
			        	total=total+factura;
			        }while(factura !=0);
			        System.out.println("Tienes un total de " +total+" $");

	                break;
	            case 0:
	            	System.out.println("Nos vemos en el infierno ...");
	            	break;
	            default:
	                System.err.print("OPCION INCORRECTA MI ARMA ");
	                break;
	        }
    	}while(opcion!=0);
        sc.close();
    }
}