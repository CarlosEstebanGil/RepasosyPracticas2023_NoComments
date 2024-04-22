import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Jse0001_varios_RepasosyPracticas2023 {

	public static void main(String[] args) {
	
		Jse0001_varios_RepasosyPracticas2023 appJse0001 = new Jse0001_varios_RepasosyPracticas2023();
		
		try {
			
			 //appJse0001.conversionesTiposBasicas(); //(0)
			
			// appJse0001.Arrays();
			
			// appJse0001.operacionesConCadenasCaracteres();
			
			// 	appJse0001.polimorfismo(); // ( y Herencia e Interfaces y default methods en Interfaces , Polimorfismo, etc. )
			
			// 	appJse0001.collections_1_basico(); //(3)
			
			  appJse0001.Generics_Completo_nuevo(); //(3)
			
			// appJse0001.maps(); //(4)
			
			// appJse0001.trycathall(); //(5)
			
			//appJse0001.creandoApiClasesGenericsT(); //(6)
			
		    //appJse0001.collections_2_avanzado(); //(7)
		    
			// appJse0001.collections_3_avanzado(); //(8)
			
			// appJse0001.REGEXs(); //(9)
			
			// appJse0001.FilesJava7Avanzado(); //appJse0001.pruebatmp(); //.FilesJava7Avanzado(); //(10)
			
			// appJse0001.Hilos(); //(11)
			
			// Java 8:
			
			// appJse0001.exprsLambdas();  //(12)
			
			// Metodos por Defecto ( @Default )//(13) 
			
			// Interfaces funcionales ( @FunctionalInterface ) //(14)  
			
			//appJse0001.referencias_a_Metodos(); 

			//appJse0001.Java8NewCollectionMethods(); // (16) 
			
			//appJse0001.Java8_Streams(); // (17) STREAMS
			
			// appJse0001.Java8_Optional(); // (18) OPTIONAL<T>
			
			//appJse0001.Java8_Streams_Paralelos(); // (19) STREAMS ( PARALELOS )
			
			//appJse0001.Java8_MAP_Nueva_Funcionalidad(); // (20) API MAP NUEVA FUNCIONALIDAD  
			
			//appJse0001.Java8_LOCAL_DATE_TIME_NEW_API(); // (21) API NUEVA JAVA 8 PARA FECHAS Y HORAS
			
			//appJse0001.Java8_HIGHT_ORDER_FUNCTIONS(); // (22) HIGH ORDER FUNCTIONS
			
			//appJse0001.RX_2_Java(); // (23) RX JAVA PROGRAMACION ASYNCRONA // PUSH PARADIGMA REACTIVO FUNCIONAL
			
			// appJse0001.Val_Var_Let_y_Auto_InferencedTypes(); 	

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
	public void conversionesTiposBasicas() throws Exception {
		
		int iNum; String strNum; Integer integerNum; float fNum;  Float floatNum; double dNum; Double doubleNum = 1.0; 
		long lNum; Long longNum;
		
		
			strNum= Integer.toString( iNum = 100 );
	
			
			iNum = Integer.parseInt(strNum);			
			
			
			 integerNum = Integer.decode(strNum); 
			 
			strNum = integerNum.toString();
			
			
			iNum = integerNum.intValue(); 
		
			
			integerNum=new Integer(iNum);
		

			lNum = 1234567890L; 
			
			dNum=(double) lNum;

			dNum = Double.valueOf(doubleNum);

			BigDecimal bd = new BigDecimal(11); 
			BigDecimal bd2 = new BigDecimal(12.8f); 
			
			
			BigDecimal bd3 = new BigDecimal("123123.3231231221"); 
			BigDecimal bd4 = new BigDecimal(bd.toString()); 
			
			
			BigDecimal bd5 = new BigDecimal(new BigInteger("100"));
			
			BigDecimal bd6 = new BigDecimal(new char[]{'1', '2', '.', '5'});
			
			BigDecimal bd7 = new BigDecimal("100.2");
			BigDecimal bd8Result = bd7.add(new BigDecimal("0.8"));
			
			double doubleNumber = 24.04;
			BigDecimal bigDecimal = new BigDecimal(String.valueOf(doubleNumber));
			int intValue = bigDecimal.intValue();
			System.out.println("Double Number: " + bigDecimal.toPlainString());
			System.out.println("Integer Part: " + intValue);
			System.out.println("Decimal Part: " + bigDecimal.subtract(
			  new BigDecimal(intValue)).toPlainString());
			
			
			
			byte myByte = 42;
			char myChar = 'A';
			
			
	}
	
	
	
	public void Arrays() throws Exception {
		
		int iarrMyIntsUnidimensionalArrayOrVector01[] = {1,2,3,4,5}; 

		int[] iarrMyIntsUnidimensionalArrayOrVector02 = {1,2,3,4,5};
		
		
		int[] iArr1 = new int[3];  iArr1[0]= 4;iArr1[0]= 5;iArr1[0]=6; 
		int[] iArr2 = new int[] {7,8,9}; 
		
		for (int i=0; i< iArr1.length; i++) System.out.println(i);

		for (int i : iArr2) System.out.println(i); 
		
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		int i=0; 
		while (i<iArr2.length) { 	System.out.print(i+" "); 		i++; 	}
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");
		i=0; do {	System.out.print(i+" "); 		i++;} while (i<=iArr2.length -1); 
		System.out.println("---------------------------------------------------------------------------------------------------------------------------");

		final int COLS=3;																					 
		int[][] iMat = new int[2][COLS]; 
										
		for (int f = 0; f < 2; f++) {
			for (int c=0; c<COLS; c++) {
				iMat[f][c]=  Double.valueOf(Math.random()*100).intValue();			
				System.out.print(iMat[f][c] + " ");
				if (c==COLS-1) System.out.print("\n");
			}
		} 
	}
	

	public void operacionesConCadenasCaracteres() throws Exception {

		
		String saludo = "hola"; 
		String cadena = new String(); 

			String str1 = new String( "cadena");
			char[] arrChar= {'a','b','c'};  String str2 = new String( arrChar ); 
																				
			  String str3; int desplazamiento=1;int cuenta=2;  str3 = new String( arrChar,desplazamiento,cuenta );   ahi si )
			 																			 
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
	
	public void polimorfismo() { 

		
		IMamifero mamifero01;
		IMamifero mamifero02;
		
		IHumano humano01;
		IPerro perro01;
		
		mamifero01 = new Humano();	
		mamifero02 = new Perro();	
		
		mamifero01.saludito();
		mamifero02.saludito();

		ISerVivo servivo01 = new Perro();
		servivo01.respirar(); 
							  
 		
		IHumano humano1 = new Humano();
		IMamifero humano2=new Humano();
	
		IHumano hum2 = ((Humano) humano2); 
		hum2=humano1; 					   
		
		
		Mujer muj = new Mujer();
		
		muj = (Mujer) humano1; 
		
		IHumano ihum = muj;  
	}
	
	
	
	public void collections_1_basico() { 
		
		final int INIT_CAP_LSTR = 10; 
		
		
		
		System.out.println("-----------------Lista de Objetos Custom (c/polimorfismo)---------------"); 
		List<IMamifero> lMamiferos = new ArrayList<>();
		
		
		
		lMamiferos.add(new Humano());
		lMamiferos.add(new Perro());
		lMamiferos.add( new IMamifero() {	@Override							
											public void saludito() {
												System.out.println("saludirijillos..");	
											}
										}
					);
		
		
		for (IMamifero iMamiferoElem : lMamiferos) iMamiferoElem.saludito(); 
		
		for (Iterator<IMamifero> iteratorMamiferos = lMamiferos.iterator(); iteratorMamiferos.hasNext();) {
			IMamifero iMamiferoTmp = (IMamifero) iteratorMamiferos.next();
			iMamiferoTmp.saludito();
		}
		
		
			Map<Integer, IMamifero> mapaMamiferosMap = new HashMap<Integer, IMamifero>();

			mapaMamiferosMap.put(1, new Humano());	
			mapaMamiferosMap.put(2, new Humano());	
			mapaMamiferosMap.put(1, new Perro());
			mapaMamiferosMap.put(1, new Humano());

			System.out.println("Cant de elems de mapaMamiferosMap: " + mapaMamiferosMap.size());
			
			
			System.out.println("----mapaMamiferosMap------keyset------------------mapaMamiferosMap.keySet().forEach:------------------------");
			mapaMamiferosMap.keySet().forEach(System.out::println);
			System.out.println("----mapaMamiferosMap-----entrySet-----------------mapaMamiferosMap.entrySet().forEach:----------------------");
			mapaMamiferosMap.entrySet().forEach(System.out::println);
			System.out.print("mapaMamiferosMap.containsKey(1): ");
			
			System.out.print(mapaMamiferosMap.containsKey(1) + "\n");
			

		System.out.println("-------------------------------------- Otro ejemplito distinto: ------------------------------------------------" );
		    Map<Integer,String> mapa= Map.of(1,"ordenador",2,"Tablet"); 
			
			mapa.forEach((clave, valor) -> System.out.println((clave + ":" + valor))); 
		}				
			
			
			public void Generics_Completo_nuevo() throws Exception {
				
				
			}			
			

			
			
}