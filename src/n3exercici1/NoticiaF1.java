package n3exercici1;

public class NoticiaF1 extends Noticia {

	private String escuderia;

	private static int preuInitial = 100;
	private static int puntsInitial = 4;

	public NoticiaF1(String titular) {
		super(titular);
	}

	// notícies d'F1 hem de saber a quina escuderia(String) fan referència.
	public NoticiaF1(String titular, String escuderia) {
		super(titular);
		this.escuderia = escuderia;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	// Notícies F1:

	// 4 punts
	// Ferrari o Mercedes: 2 punts

	@Override
	int calcularPuntuacio() {
		int puntsEscuderia = (escuderia == "Ferrari" || escuderia == "Mercedes") ? 3 : 0;
		return puntsInitial + puntsEscuderia;
	}

	// Notícies d'F1: (escuderia)

	// Preu inicial: 100 €
	// Ferrari o Mercedes: 50 €
	@Override
	int calcularPreu() {
		int preuEscuderia = (escuderia == "Ferrari" || escuderia == "Mercedes") ? 50 : 0;
		return preuInitial + preuEscuderia;
	}

	@Override
	public String toString() {
		return "NoticiaF1 " + getTitular() + " [escuderia=" + escuderia + ", calcularPuntuacio()=" + calcularPuntuacio()
				+ ", calcularPreu()=" + calcularPreu() + "]";
	}

}
