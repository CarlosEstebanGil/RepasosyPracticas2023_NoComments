
public interface IPerro extends IMamifero{

		public void gruñir();
		default public void ladrar(){ System.out.println("ladrando default.. guau guau guau guau"); }
		default public void aullar() { System.out.println("aullando default.. auuuuuuuu"); }
}
