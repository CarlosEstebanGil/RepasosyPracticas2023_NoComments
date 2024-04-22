
public interface IMamifero extends ISerVivo{

		@Override
		default void respirar() {
		 System.out.println("Mamifero Respirando");
		
		}
		
		//public void caminar(int metros);
		default void caminar(int metros) {
			System.out.println("caminando..");
		}
		
		default void correr(int metros, int velocidad) { 	System.out.println("Corriendo..");	}
		
		public void saludito();
}
