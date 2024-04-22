
public class Perro implements IPerro , ISerVivo{

	@Override
	public void respirar() {
		System.out.println("Perro respirando"); 
	}
	
	@Override
	public void saludito() {
		System.out.println("saludando.. guau");
	}

	@Override
	public void gruñir() {
		System.out.println("gruniendo..");

	}

	/* @Override
	public void aullar() {
	} */

	@Override
	public void ladrar() {
		System.out.println("ladranding.. Guau guau");
	}

}
