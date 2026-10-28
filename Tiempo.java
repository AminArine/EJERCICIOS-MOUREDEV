import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seg=0;
        final int MODULOTIEMPO=60;
       	System.out.print("Introduce el tiempo en segundos  :");
       	seg=sc.nextInt();
        int cociente=seg/MODULOTIEMPO;
       	int min=cociente%MODULOTIEMPO;
       	int horas=cociente/MODULOTIEMPO;
        int segundos=seg%MODULOTIEMPO;
       
       	System.out.println("El tiempo en horas es  :"+horas
       		+"\n El tiempo en minutos es  :"+min
            +"\n El tiempo en segundos es : "+segundos);
       	
        sc.close();
    }
}