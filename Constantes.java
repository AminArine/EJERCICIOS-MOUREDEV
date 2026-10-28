public class Constantes  {
	 public static void main(String[] args) {
	 	//Las constantes se ponen en mayuscula .ES MUY IMPORTANTE PARA LA DOCUMENTACION DEL CODIGO 
			double  TIPOIVA=21.5;
			System.out.println("El IVA en tierras andaluzas es de "+TIPOIVA);
			double ValorSinIva=300;
			
			/*para definir varias variables del mismo tipo 
			,puedo meterlas todas en la misma linea como el siguiente
			ejemplo*/
			double a,b,c; 
			System.out.println("Calculoc con IVA");
			double ValorConIva=((TIPOIVA*0.01)+1)*ValorSinIva;
			System.out.println(ValorConIva);

	 }
}