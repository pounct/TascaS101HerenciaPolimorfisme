package n1exercici1;

public class InstrumentCorda extends Instrument{

	public InstrumentCorda(String nom, float preu) {
		super(nom, preu);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "InstrumentCorda [getNom()=" + getNom() + ", getPreu()=" + getPreu() + "]";
	}

	
	public void tocar() {
		System.out.println("Està sonant un instrument de corda");
		
	}

}
