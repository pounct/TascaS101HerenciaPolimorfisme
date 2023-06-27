package n1exercici1;

public class InstrumentPercussio extends Instrument {

	public InstrumentPercussio(String nom, float preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InstrumentPercussio [getNom()=" + getNom() + ", getPreu()=" + getPreu() + "]";
	}

	@Override
	public void tocar() {
		System.out.println("Està sonant un instrument de percussio");

	}

}
