import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final byte NUM=10;
        int entrada,positivo=0,negativo=0;

        for (int i=0;i<NUM ;i++) {
        	System.out.println("Introduce el numero "+i+" : ");
        	entrada=sc.nextInt();
        	if(entrada>=0){
        		positivo++;
        	}else{
        		negativo++;
        	}
        }

        System.out.println("Hay "+positivo+" numeros positivos .");
        System.out.println("Hay "+negativo+" numeros negaivos .");
        sc.close();
    }
}