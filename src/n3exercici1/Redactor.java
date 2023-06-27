package n3exercici1;

import java.util.ArrayList;

public class Redactor {

	//// La redacció pot tenir més d’un redactor/a ( nom, el DNI(final) i el sou )
	private final String DNI;
	private String nom;
	// Tots els redactors/es tenen el mateix sou (static) = 1500
	private static int sou = 1500;

	private ArrayList<Noticia> noticias = new ArrayList<>();

	public Redactor(String dNI, String nom) {
		super();
		DNI = dNI;
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getSou() {
		return sou;
	}

	public ArrayList<Noticia> getNoticias() {
		return noticias;
	}

	public String getDNI() {
		return DNI;
	}

	public void addNoticia(Noticia noticia) {
		noticias.add(noticia);

	}

	public void eliminarNoticia(Noticia noticia) {
		noticias.remove(noticia);

	}

	@Override
	public String toString() {
		return "Redactor con DNI: " + DNI + ", nom: " + nom + " y con sou: " + getSou();
	}

}
