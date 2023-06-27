package n1exercici1;

public class InstrumentVent extends Instrument {

	public InstrumentVent(String nom, float preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "InstrumentVent [getNom()=" + getNom() + ", getPreu()=" + getPreu() + "]";
	}

	
	public void tocar() {
		System.out.println("Està sonant un instrument de vent");

	}

}
