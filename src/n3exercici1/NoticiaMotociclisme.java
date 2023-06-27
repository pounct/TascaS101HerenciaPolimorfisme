package n3exercici1;

public class NoticiaMotociclisme extends Noticia {
	private String equip;

	private static int preuInitial = 100;
	private static int puntsInitial = 3;

	public NoticiaMotociclisme(String titular) {

		super(titular);
	}

	// notícies de motociclisme s’ha d’indicar de quin equip(String) són.
	public NoticiaMotociclisme(String titular, String equip) {

		super(titular);
		this.equip = equip;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	// Notícies de Motociclisme:
	// 3 punts
	// Honda o Yamaha: 3 punts

	@Override
	int calcularPuntuacio() {
		int puntsEquip = (equip == "Honda" || equip == "Yamaha") ? 3 : 0;
		return puntsInitial + puntsEquip;
	}

	// Notícies de motociclisme:
	// Preu inicial: 100 €
	// Honda o Yamaha: 50 €

	@Override
	int calcularPreu() {
		int preuEquip = (equip == "Honda" || equip == "Yamaha") ? 50 : 0;
		return preuInitial + preuEquip;
	}

	@Override
	public String toString() {
		return "NoticiaMotociclisme " + getTitular() + " [equip=" + equip + ", calcularPuntuacio()="
				+ calcularPuntuacio() + ", calcularPreu()=" + calcularPreu() + "]";
	}

}
