import java.util.Scanner;

public class Dni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dni=0;
        int cociente,resto;
        final byte MODULO=23;
        String alfa="TRWAGMYFPDXBNJZSQVHLCKE";
        System.out.print("Introduce tu DNI :");
        dni=sc.nextInt();
     
        resto=dni%MODULO;
        System.out.print("la letra es :"+alfa.charAt(resto));
       
          // do{
       // cociente=dni/MODULO;
       // resto=dni%MODULO;
        // dni=cociente;
   		// }while(cociente<MODULO);
   		 	
   		 
       /* System.out.println("El cociente es :"+cociente);

        System.out.println("El resto es :"+resto);
		*/
        sc.close();
    }
}