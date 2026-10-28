import java.util.Scanner;

public class MaterialEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Short lotes=0,clases=0;
        final short CUADERNOS=15;
        System.out.print("Introduce cuántos lotes han llegado :");
        lotes=sc.nextShort();
        System.out.print("Introduce cuántos clases hay en el centro :");
        clases=sc.nextShort();


        System.out.println("Total de Cuadernos : "+(CUADERNOS*lotes) +
    	"\n Por clase : "+((CUADERNOS*lotes)/clases) +
    	"\n Sobran :"+((CUADERNOS*lotes)%clases)+"\n" );



        sc.close();
    }
}