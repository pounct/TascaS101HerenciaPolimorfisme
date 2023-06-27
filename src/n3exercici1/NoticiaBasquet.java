package n3exercici1;

public class NoticiaBasquet extends Noticia {

	// (competicio,club)
	private String competicio;
	private String club;

	private static int preuInitial = 250;
	private static int puntsInitial = 4;

	public NoticiaBasquet(String titular) {
		super(titular);
		// TODO Auto-generated constructor stub
	}

	// notícies de bàsquet s’ha d’indicar a quina competició fa referència(String) i
	// a quin club(String).
	public NoticiaBasquet(String titular, String competicio, String club) {
		super(titular);
		this.setCompeticio(competicio);
		this.setClub(club);
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

	// Notícies de bàsquet:

	// puntsInitial = 4 punts
	// competicio == Eurolliga: 3 punts
	// ACB: 2 punts
	// club == Barça o Madrid: 1 punt

	@Override
	int calcularPuntuacio() {

		int puntsCompeticio = (competicio == "Eurolliga") ? 3 : 2;
		int puntsClub = (club == "Barça" || club == "Madrid") ? 1 : 0;
		return puntsInitial + puntsCompeticio + puntsClub;
	}

	// Notícies de bàsquet: (competicio,club)

	// Preu inicial: 250 €
	// Eurolliga: 75 €
	// Barça o Madrid: 75 €

	@Override
	int calcularPreu() {

		int preuCompeticio = (competicio == "Eurolliga") ? 75 : 0;
		int preuClub = (club == "Barça" || club == "Madrid") ? 75 : 0;
		return preuInitial + preuCompeticio + preuClub;
	}

	@Override
	public String toString() {
		return "NoticiaBasquet " + getTitular() + " [competicio=" + competicio + ", club=" + club
				+ ", calcularPuntuacio()=" + calcularPuntuacio() + ", calcularPreu()=" + calcularPreu() + "]";
	}

}
