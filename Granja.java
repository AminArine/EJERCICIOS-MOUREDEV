import java.util.Scanner;

public class Granja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int comidaDiaria,numAnimales,kilosPorAnimal,resto,raciones;
        System.out.print("Introduce la camidaDiaria :");
        comidaDiaria=sc.nextInt();
        System.out.print("Introduce la numAnimales :");
        numAnimales=sc.nextInt();
        System.out.print("Introduce la kilosPorAnimal :");
        kilosPorAnimal=sc.nextInt();
        int consumo=numAnimales*kilosPorAnimal;
        if(comidaDiaria>=consumo){
        	resto=comidaDiaria-consumo;
        	System.out.print("Tengo suficiente para cada animal \n "+
       		"Sobran los siguientes animales :"+resto);	
        }else{
        	raciones=comidaDiaria/numAnimales;
        	System.out.print("NO HAY SUFICIENTE Y HAY QUE COMPRAR MAS "+
        		"TOCA PARA CADA ANIMAL LO SIGUIENTE :"+raciones);
        }
        

        sc.close();
    }
}