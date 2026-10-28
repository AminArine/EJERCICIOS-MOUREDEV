import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada=0,anyosFaltan=0;
        System.out.print("Introduce el dia de la semana : ");
        int  numeroDia=sc.nextInt();
       /* final int EDADJUNIL=67;
        int edad=entrada; */
        	/*System.out.println(6<4);
        	System.out.println(6>4);
        	System.out.println(6==4);
        	System.out.println(6<=04);
        	System.out.println(6>=4);
        	System.out.println(6!=4);

        	System.out.println(true&&true);
        	System.out.println(false&&true);
        	System.out.println(true&&false);
        	System.out.println(false&&false);

        	System.out.println(true||true);
        	System.out.println(false||true);
        	System.out.println(true||false);
        	System.out.println(false||false); */
        		/*
        	if(edad>=18){
        		System.out.println("Eres mayor de Edad !! ");
        	}else{
        		System.out.println("Eres menor !!! ");
        	}

        	if(edad >=18 && edad<=EDADJUNIL){
        			System.out.print("Estas en edad de trabajar ");
        			System.out.println("Te faltan para jubilarte "+(EDADJUNIL-edad)+" años ");
        	}else{
        		System.out.println("No puedes trabajar");
        		

        	}  */
        	  switch (numeroDia){ 
            case 1: 
                System.out.println("Lunes"); 
            break; 
            case 2: 
                System.out.println("Martes"); 
            break; 
            case 3: 
                System.out.println("Miercoles"); 
            break; 
            case 4: 
                System.out.println("Jueves"); 
            break;                     //prueba a comentar este break ¿que ocurre? 
            case 5: 
                System.out.println("Viernes"); 
            break; 
            case 6: case 7: 
                System.out.println("Finde !!!"); 
            break; 
            
            default: 
                System.out.println("Día erroneo"); 
            break; 
        } 

        

        sc.close();
    }
}