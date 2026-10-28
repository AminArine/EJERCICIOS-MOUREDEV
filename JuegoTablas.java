import java.util.Scanner;

public class JuegoTablas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota=0,respuesta=0;
        System.out.println("Que tabla te pregunto ? :");
        int numero=sc.nextInt();
          for(int i=1;i<=10;i++){
          	System.out.println("Tabla del :"+numero);
          	System.out.print("Introduce "+numero +"*"+i+" = ");
          	respuesta=sc.nextInt();
          	if(numero*i==respuesta){
          		System.out.println("Es correcto ");
          		nota +=1;
          	}else {
          		System.out.println("Mamahuevo!!!" +"La respuesta es :"+(numero*i));
          	}
          }
		          if (nota < 5) {
		    System.out.println("Insuficiente");
		} else if (nota < 6) {
		    System.out.println("Suficiente");
		} else if (nota < 7) {
		    System.out.println("Bien");
		} else if (nota < 9) {
		    System.out.println("Notable");
		} else {
		    System.out.println("Excelente");
		}
        

        sc.close();
    }
}