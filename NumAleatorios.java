import java.util.Scanner;

public class NumAleatorios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int miNumero ,aleatorio ,intentos ,minumero,M,N;
        System.out.print("Introduce el valor maximo :");
        N=sc.nextInt();
         System.out.print("Introduce el valor minimo :");
        M=sc.nextInt();
        /*
        for(int i=0;i<M;i++){
	        aleatorio=(int) (Math.random() * (N - M + 1)) + M;
	        System.out.println(aleatorio);
    	} */
    	aleatorio=(int) (Math.random() * (N - M + 1)) + M;
    	do{
	    	System.out.println("Adivina mi numero :");
	    	minumero=sc.nextInt(); 
	    	intentos++;
	    	if(aleatorio>minumero){
	    		System.out.println("Mi numero es mayor.......");
	    	}else{
	    		System.out.println("Mi numero es menor.......");
	    	}

    	}while(minumero!=aleatorio);
    	System.out.println("Enhoranuena !!!");
    	if (aleatorio==miNumero){
			System.out.println("Enhorabuena!!!!");
			System.out.println("Has necesitado "+intentos+" intentos....");
		}else{
			System.out.println("Has superado el numero maximo de intentos PAQUETE!!!");
		}

        sc.close();
    }
}