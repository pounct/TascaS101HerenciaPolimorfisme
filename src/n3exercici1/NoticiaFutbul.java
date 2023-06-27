package n3exercici1;

public class NoticiaFutbul extends Noticia {

	// (competicio,club,jugador)
	private String competicio;
	private String club;
	private String jugador;

	private static int preuInitial = 300;
	private static int puntsInitial = 5;

	public NoticiaFutbul(String titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	// notícies de futbol s’ha de saber a quina competició fa referència(String), a
	// quin club(String) i a quin jugador(String).
	public NoticiaFutbul(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public static int getPreuInitial() {
		return preuInitial;
	}

	public static void setPreuInitial(int preuInitial) {
		NoticiaFutbul.preuInitial = preuInitial;
	}

	public static int getPuntsInitial() {
		return puntsInitial;
	}

	public static void setPuntsInitial(int puntsInitial) {
		NoticiaFutbul.puntsInitial = puntsInitial;
	}

	// Notícies de futbol:

	// puntsInitial = 5 Punts+
	// competicio == Lliga de Campions: 3 punts // == Lliga: 2 punts
	// club Barça o Madrid: 1 punt
	// jugador == Ferran Torres o Benzema: 1 punt
	// Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga
	// de Campions, té una puntuació de 10 punts.

	@Override
	int calcularPuntuacio() {

		int puntsCompeticio = (competicio == "Lliga de Campions") ? 3 : 2;
		int puntsClub = (club == "Barça" || club == "Madrid") ? 1 : 0;
		int puntsJugador = (jugador == "Ferran Torres" || jugador == "Benzema") ? 1 : 0;
		return puntsInitial + puntsCompeticio + puntsClub + puntsJugador;

	}

	// Notícies de futbol: (competicio,club,jugador)
	//
	// = preuInitial +
	// + "competicio == "Lliga de Campion")? 100:0;
	// + (club == "Barca" || "madrid")?100:0;
	// + (jugador==("Ferran Torres" || "Benzema")?50
	// Exemple: Una notícia que parla d’un gol de Ferran Torres del Barça a la Lliga
	// de Campions, té un preu de 550 €.
	// Preu inicial: 300 €
	// Lliga de Campions: 100 €
	// Barça o Madrid: 100 €
	// Ferran Torres o Benzema: 50 €

	@Override
	int calcularPreu() {

		int preuCompeticio = (competicio == "Lliga de Campions") ? 100 : 0;
		int preuClub = (club == "Barça" || club == "Madrid") ? 100 : 0;
		int preuJugador = (jugador == "Ferran Torres" || jugador == "Benzema") ? 50 : 0;
		return preuInitial + preuCompeticio + preuClub + preuJugador;
	}

	@Override
	public String toString() {
		return "NoticiaFutbul " + getTitular()
				+ " competicio: " + competicio + ", club: " + club + ", jugador: " + jugador + ", Puntuacio: "
				+ calcularPuntuacio() + ", Preu: " + calcularPreu() + "]";
	}

}
