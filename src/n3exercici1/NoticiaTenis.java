package n3exercici1;

public class NoticiaTenis extends Noticia {

	// (competicio,club,jugador)
	private String competicio;
	private String jugador;

	private static int preuInitial = 150;
	private static int puntsInitial = 4;

	public NoticiaTenis(String titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	// tenis s’ha de saber de quina competició(String) parlen i de quins
	// tenistes(String).
	public NoticiaTenis(String titular, String competicio, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.jugador = jugador;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	// Notícies de Tenis:

	// puntsInitial = 4 punts
	// Federer, Nadal o Djokovic: 3 punts

	@Override
	int calcularPuntuacio() {

		int puntsJugador = (jugador == "Federer" || jugador == "Nadal" || jugador == "Djokovic") ? 3 : 0;
		return puntsInitial + puntsJugador;
	}

	// Notícies de tenis: ((competicio,jugador)

	// Preu inicial: 150 €
	// Federer, Nadal o Djokovic: 100 €

	@Override
	int calcularPreu() {

		int preuJugador = (jugador == "Federer" || jugador == "Nadal" || jugador == "Djokovic") ? 100 : 0;
		return preuInitial + preuJugador;
	}

	@Override
	public String toString() {
		return "NoticiaTenis " + getTitular() + " [competicio=" + competicio + ", jugador=" + jugador
				+ ", calcularPuntuacio()=" + calcularPuntuacio() + ", calcularPreu()=" + calcularPreu() + "]";
	}

}
