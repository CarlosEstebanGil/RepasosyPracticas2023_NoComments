import java.util.ArrayList;	 
							 
import java.util.Arrays;	 

import java.util.Collection;
							
import java.util.Collections;
import java.util.Iterator;	
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;		

public class Jse0001_varios_Full_Practicas2023 { 


	public static void main(String[] args) {
		
		Jse0001_varios_Full_Practicas2023 ejsInstance = new Jse0001_varios_Full_Practicas2023();
		
		// Practicas from : https://w3resource.com/java-exercises/

		// A) java-exercises/basic/index1.php :
	
			//A.154)	
				//ejsInstance.vecOfVecsToArray();  // 		( Obs: A.154 es de esta url del punto A el ejercicio nro 154 )  
		
			//A.155)	
				//ejsInstance.rowsByColsSwitchArray();
			
			//A.159
				// ejsInstance.findKGreatestNumbersInArray();	// TODO : Estos metodos deben recibir el array, el k, etc como parametros (en todos los ejs q hice falta)

			//A.162
				// ejsInstance.findNumbersGreaterThanAverageInIntArray();
			//A.167
				// ejsInstance.move0sToRightInArr();
			//A.169
				// ejsInstance.reverseString();
			//A.175
				   //ejsInstance.synglyList();
			//A.185
				   // System.out.println(ejsInstance.areStringsIsomorphic("abca","zbxz")); //TODO : testear con unit test y no por consola
			//A.187 
					System.out.println("posicion del 1er char q no tiene repetidos en la cadena: "+  ejsInstance.firstNonRepeatingCharIndexInStr("google") ); 
	}

	//A.154) 
		
	public void  vecOfVecsToArray() {
		
		boolean[][] bArr = {	{true, false,true },{false,true, false}	}; 


 		char[][] chrVec = new char[2][3];
		char chrNewElem;
		
		boolean[] subArrActual; 
		boolean subArrActualBoolElem;
		for (int i = 0; i < bArr.length; i++) {
			subArrActual = bArr[i];
			for (int j = 0; j < subArrActual.length; j++) {
				subArrActualBoolElem = subArrActual[j];
				chrNewElem = boolToChar(subArrActualBoolElem);
				chrVec[i][j]=chrNewElem;
			}
		}
			
		
		}

	
	public static char boolToChar(boolean b) { 
		return b==true?'t':'f';
	}


	//A.155) 
	
		public void  rowsByColsSwitchArray() { 

			
			int[][] inIMat = {{10,20,30},{40,50,60}};					 
			int[][] outIMat = new int[inIMat[0].length][inIMat.length]; 
																		
																		
			printMat(inIMat);
			for (int i = 0; i < inIMat.length; i++) { 
				for (int j = 0; j < inIMat[0].length; j++) { 
					outIMat[j][i] = inIMat[i][j];
				}
				
			}
			printMat(outIMat);
		}
	
		
		public static void printMat(int[][] iMat ) {
			System.out.println();
			 for (int i = 0; i < iMat.length; i++) {
				for (int j = 0; j < iMat[i].length; j++) {
					System.out.print(iMat[i][j] + " ");
					if (j==iMat[i].length-1) System.out.print("\n");
				}
			}
		}
		
		//A.159) 
		
		public void  findKGreatestNumbersInArray() {	
				int[] iArrIn = {1, 4, 17, 7, 25, 3, 100}; 
			

				printVec(iArrIn);
				
				List<Integer> iList = new ArrayList(iArrIn.length);

				for (int i = 0; i < iArrIn.length; i++) {
					iList.add(iArrIn[i]);
				}
			

				Collections.sort(iList, (x,y)-> (y >= x)?1:-1 ); 
				
				System.out.println("imprimo la lista ordenada: ");
				for (Integer elem : iList) System.out.print(elem + " ");

				final int K=3;
				System.out.println(" Los " + K + " enteros mayores de la lista son: ");
				for (int i = 0; i < K; i++) System.out.print(iList.get(i) + " ");
				
		} 

		// 162) Write a Java program that finds numbers greater than the average of an array.
		
		public void findNumbersGreaterThanAverageInIntArray() {
				int[] iArrIn = {1, 4, 17, 7, 25, 3, 100};
					
																						printVec(iArrIn);
				double promedio = 	Arrays.stream(iArrIn).average().orElse(0); 			System.out.println("Promedio: " + promedio);
																						System.out.println("ints > a " + promedio + ":" );
				Arrays.stream(iArrIn).filter(x-> x>promedio).forEach(System.out::println);
				
			
		}
		
		
		// 167)	Write a Java program to move every zero to the right side of a given array of integers.

		
		public void move0sToRightInArr() {	 
		
			
					int[] iArrInt = {3, 4, 1, 2, 5, 0, 0, 0};

					
					for (int i = 0; i < iArrInt.length; i++) {
						if ( (iArrInt[i]==0) && (i!=iArrInt.length -1) ) {	 .. 
							
							int posSigTmp = tomarSigPosElemNoCero(i+1, iArrInt) ;
							if ( posSigTmp != -1 ){	
								swapValuesInArr(i, posSigTmp, iArrInt);
							}
									
						}
					}
						

					printVec(iArrInt);
		}

		// 169)	Write a Java program to reverse a sentence (assume a single space between two words) without reverse every word.

		

		public void reverseString() {	//TODO parametrizar + darle robustez + test de unidad con junit 
				
				String strIn = "The quick brown fox jumps over the lazy dog";	
				
				System.out.println("String original a ser revertido:" + strIn);
				
			
				char[] chrArr= strIn.toCharArray();
				

				int iPosI = 0; int iPosF = strIn.length() -1; 
				
				while ( iPosI < iPosF) {
					swapValuesInArr(iPosI, iPosF, chrArr);
					++iPosI; --iPosF; 
				}
				
				String strOut=String.valueOf(chrArr);
				
				
				System.out.println("Reversed String Imperative way (a mano) -> " + strOut);
		}
		
		
		public void synglyList() { 
			  head = new ListNode(10);
			  head.next = new ListNode(20); 
			  head.next.next = new ListNode(30);
			  head.next.next.next = new ListNode(40);
			  head.next.next.next.next = new ListNode(50);
			  ListNode p = head;
			  System.out.println("Original Linked list:");
			  printList(p);
			  System.out.println("\nAfter deleting the fourth node, Linked list becomes:");
			  deleteNode(head.next.next.next);
			  p = head;
			  printList(p);


		}
					

		 class ListNode {
			 int val;
			 ListNode next;

			 ListNode(int val) {
			  this.val = val;
			  this.next = null; 
			  }
		}
		public static ListNode head; 						
		
		 static void printList(ListNode p) {

			  while (p != null) {
			   System.out.print(p.val);
			   if (p.next != null) System.out.print("->"); 
			   p = p.next;
			  }
			 }
			
	 public static void deleteNode(ListNode node) {
		  if (node.next != null) {
		   int temp = node.val;
		   node.val = node.next.val;
		   node.next.val = temp;

		   node.next = node.next.next;
		  } else {
		   ListNode p = head;
		   while (p.next.val != node.val) {
		    p = p.next;
		   }
		   p.next = null;
		  }
		 }
		
	//--------------------------------------------------------------------------------------- 
	//176.Write a Java program that partitions an array of integers into even and odd numbers 
	//		( con singly (q significa individualmente enlazada, me indica q utilice ListNode (<>s instancias de nodos eblazados con next a mano x mi )


	public void evenThenOddsArr() { 
		
		int[] iArrIn = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};

		
		int[] iArrOut = new int[iArrIn.length]; 
		
		int tamañoArray = iArrIn.length;
		int lastPosArrIN = tamañoArray -1; 
		
		int iPosActualIN=0; int iPosParejaIN=lastPosArrIN;  int iElemPareja=0; int iCantImpares=0; 
		int iElemActualTmp=0;
		int iPosActualOUT=iPosActualIN; 
		
		if (tamañoArray  >=1) {	
				
			iPosParejaIN = iArrIn.length-1; 
			 
			while ( iPosActualIN	<=	iPosParejaIN ) { 
				
				if (iPosActualIN == iPosActualIN) { 
					iElemActualTmp = iArrIn[iPosActualIN];	 
					iArrOut[(tamañoArray-1)/2] = iElemActualTmp;
					iPosActualIN++;	
					iPosParejaIN= lastPosArrIN - iPosActualIN; 
				} else { 
				
					iElemActualTmp = iArrIn[iPosActualIN];	
					if (isPar(iElemActualTmp)) {				
						insertParInOut(iArrOut,iPosActualOUT,iElemActualTmp); 
						iPosActualOUT++;									
					}else { 
						insertImparInOut(iArrOut,iPosActualOUT,iElemActualTmp);
					}
																	
					iPosParejaIN = lastPosArrIN - iPosActualIN; 	
					iElemActualTmp = iArrIn[iPosParejaIN]; 
					if ( isPar(iElemActualTmp)) {	
						insertParInOut(iArrOut,iPosActualOUT,iElemActualTmp); 					
						iPosActualOUT++;									
					}else { 
						insertImparInOut(iArrOut,iPosActualOUT,iElemActualTmp);
					}
					
					iPosActualIN++;
				}	
			}
		}
		
		if (tamañoArray!=0) {
			printVec(iArrOut); 
		}
			
		
			

	}
	 
	//A.176_RE-HECHO: 
	
	//Write a Java program that partitions an array of integers into even and odd numbers 
	//		( con singly (q significa individualmente enlazada, me indica q utilice ListNode (<>s instancias de nodos eblazados con next a mano x mi )

	
	public void methodNameHere() {
	
	}
	
	
	//185)  Write a Java program to check if two strings are isomorphic or not.  ( Obs: Lo hago +qnada xretomar estudio y reactivacion tecnicas mecanismos y cerebro )

	// 		Precond: Saber: Wiki:  String isomorfos: 
		
	//			2 strings, X y Y , se denominan isomorfos si todas las apariciones de cada carácter en X se puede reemplazar con otro carácter para obtener Y y viceversa. 
	//				-> ejemplo, considere strings ACAB y XCXY . Son isomorfos como podemos mapear 'A' —> 'X' , 'B' —> 'Y' y 'C' —> 'C' .

	//		Expected Output:

	//		Is abca and zbxz are Isomorphic? true 

	//	------------------------------------------------------------------
	
	
	public boolean areStringsIsomorphic(String str1, String str2) { 
			
				
		boolean r= false;											
		for (int i=0;i<str2.length();i++) {							
																	
			char c2 = str2.charAt(i);	
			char c1 = str1.charAt(i); 	 ---------------------------------------------------------------------------------------------------------------
			
			str1 = str1.replaceAll(String.valueOf(c1), String.valueOf(c2));		
			
		}	
		if(str2.equalsIgnoreCase(str1)) r=true; 
		
		return r;
	}
	
	//187)  Write a Java program to find the index of the first non-repeating character in a given string.
	
	//			( tmb Lo hago +qnada xretomar estudio y reactivacion tecnicas mecanismos y cerebro)

	// Expected Output:

	//	Ex: Index of first non-repeating character in 'google' is: 4  -> Osea ( la pos o index de la "l" ( 0,1,2,3,4=l) ) -> Osea index 4
	
	
	public int firstNonRepeatingCharIndexInStr(String strParam) {
		
	
		int pos=-1;
		
	
		return pos;
	}
	
	
	
	public void insertParInOut(int[] outArrRef , int posOut, int value) {
		
		outArrRef[posOut]= value; 
	}
	
	
	public void insertImparInOut(int[] outArrRef , int posOut, int value) { 
		outArrRef[outArrRef.length -1 - posOut] = value; 
	}
	
	public boolean isPar(int i) {
		if ( i % 2 == 0 )
			return true;
		return false;
	}

		private int tomarSigPosElemNoCero(int posInit, int[] iArr) {
			int r= -1;
			for (int i = posInit; i<iArr.length; i++) {
				if ( iArr[i] != 0 ) {
					r=i;
					break;
				} 
			}
			return r;
		}
		
		
		public void swapValuesInArr(int iPos1, int iPos2, int[] iArr) {
			int iValueTmp = iArr[iPos2];
			iArr[iPos2]=iArr[iPos1];  
			iArr[iPos1]=iValueTmp;
		}

		public void swapValuesInArr(int iPos1, int iPos2, char[] cArr) {
			char chrValueTmp = cArr[iPos2];
			cArr[iPos2]=cArr[iPos1]; 
			cArr[iPos1]=chrValueTmp;
		}

		
		public static void printVec(int[] iVec) {
			System.out.println();
			for (int i = 0; i < iVec.length; i++) {
				System.out.print(iVec[i] + " ");
			if ( i == ( iVec.length -1) ) System.out.print("\n");
			}
		}
		
	private void name() {
		
	}
	
	}
