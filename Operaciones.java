import java.util.Scanner;
public class Operaciones{
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int  num1,num2,sum,resta,multi,resto;
		System.out.println(" Introduce el primer valor :");
			num1=entrada.nextInt();
			
		System.out.println(" Introduce el segundo valor :");
		    num2=entrada.nextInt();
		sum=num1+num2;
		resta=num1-num2;
		multi=num1*num2;
			

		System.out.println("RESULTADOS\n"+"\t Suma :"+sum+"\n"
			+"\t Resta :"+resta +"\n"
			+"\t Multiplicacion : "+multi+"\n"
			+"\t Resto : "+resto+ "\n ");
			
		//otros operadores 
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		--num1;
		System.out.print(num1);
		num+=1;
		System.out.print(num1);
		num-=1;
		System.out.print(num1);
		/*
		--Para ahorrarme el escribir todo lo del System puedo utilizar la siguienet combinacion P + TAB
		System.out.print();
		
		--Tambien se puede hacer del siguiente modo :
		num +=1;
	    */
		
}}