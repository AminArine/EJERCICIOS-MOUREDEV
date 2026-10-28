import java.util.Scanner;

public class NumImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero=0;
        
        System.out.println("Introduce un numero  :");
         numero=sc.nextInt();
      
      //Esta es la forma de controlar las iteraciones
        	for (int i=1;i<=numero ;i+=2) {
        		
        		System.out.print(i +" ");
        		//numero-=2;
        	}
       
        

        sc.close();
    }
}