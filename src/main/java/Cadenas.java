public class Cadenas {
	public void operacionesConCadenasCaracteres() throws Exception {

		
		String saludo = "hola"; 
		String cadena = new String(); 

			String str1 = new String( "cadena");
			char[] arrChar= {'a','b','c'};  String str2 = new String( arrChar ); 
			  String str3; int desplazamiento=1;int cuenta=2;  str3 = new String( arrChar,desplazamiento,cuenta ); 
			System.out.println(str3);
			System.out.println(str2.length());	
			
			
			String s = new Integer(3).toString(); 
			
			int k = Integer.parseInt("4"); 
			
			
			
			System.out.println("-----------------------Ejercicios String Builder: ------------------------------------------------------");
					
			StringBuilder sb1= new StringBuilder("Hola Caracola");
			System.out.println(sb1.toString() + " capacidad inicial: " + sb1.capacity() + " longitud inicial: " + sb1.length() );
			
			
			System.out.println("--------------------------------------------------------------------------------------------");
			
			
			sb1.replace(1, 2, "ay"); sb1.deleteCharAt(3); sb1.deleteCharAt(3); sb1.append("s"); System.out.print(sb1.toString() );
			
			
			System.out.print(" --- otra forma -> igual rtado: ");
			sb1 = new StringBuilder("Hola Caracola");
			sb1.replace(1, 2, "a");		
			sb1.replace(2, 3, "y");		
			sb1.deleteCharAt(3); 
			sb1.append("s");
			System.out.print(sb1.toString() +"\n");
			
			
			System.out.println("------------------------------------Hay 5000 caracolas-------------------------------------------");
			
			int iNumero = 5000; int iNumeroLength =4; 
			sb1.replace(3, 3+1, " " + new Integer(iNumero).toString() + " ");  
			
			System.out.println(sb1.toString());
			
			System.out.println("-------------------------------------olas --------------------------------------");

			
			int posFinSb = sb1.length();  
			int cantChars=4; 
			int posInit= posFinSb - cantChars; 
			
			String strTmp = new String(sb1.substring(posInit, posFinSb)); 
			
			System.out.println(strTmp);
			
			
			System.out.println("--------------------------------------------------------------------------------------------");
			
			System.out.println("sb1 capacidad resultante final: " +  sb1.capacity() );
			System.out.println("sb1 longitud resultante final: " +  sb1.length() );
		
	}
}
