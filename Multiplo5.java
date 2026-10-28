import java.util.Scanner;

public class Multiplo5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        
        System.out.println("Introduce un numero  :");
         numero=sc.nextInt();
      
      //Esta es la forma de controlar las iteraciones
        	for (int i=5;i<=numero ;i+=5) {
        		
        		System.out.print(i +" ");
        		
        	}
       
        
        

        sc.close();
    }
}