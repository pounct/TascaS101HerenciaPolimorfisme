package n3exercici1;

import java.util.ArrayList;
import java.util.Scanner;

public class N3Exercici1 {

	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		// tenen les notícies classificades per esports: futbol, bàsquet, tenis, F1 i
		// motociclisme.

		// La redacció pot tenir més d’un redactor/a ( nom, el DNI(final) i el sou )
		// Cada redactor/a pot treballar en més d’una notícia ( titular, un text, una
		// puntuació i un preu )
		// En el moment de crear-se, el text=""; ha d’estar buit.

		// implementar un mètode que es diu calcularPreuNoticia(). Per saber el preu de
		// cada notícia

		//////////////////////////////////////////////////////////////////////////

		ArrayList<Redactor> redactors = new ArrayList<Redactor>();
		
		Redactor redactor1 = new Redactor("9999999R", "redactor1");
		Redactor redactor2 = new Redactor("9999999S", "redactor2");
		Redactor redactor3 = new Redactor("9999999T", "redactor3");
		
		redactors.add(redactor1);
		redactors.add(redactor2);
		redactors.add(redactor3);
		
		System.out.println(redactors);

		ArrayList<Noticia> noticias = new ArrayList<Noticia>();
		
		Noticia noticia1 = new NoticiaFutbul("titular1");
		Noticia noticia2 = new NoticiaBasquet("titular2");
		Noticia noticia3 = new NoticiaTenis("titular3");
		Noticia noticia4 = new NoticiaF1("titular4");
		Noticia noticia5 = new NoticiaMotociclisme("titular5");
		
		noticias.add(noticia1);
		noticias.add(noticia2);
		noticias.add(noticia3);
		noticias.add(noticia4);
		noticias.add(noticia5);
		
		System.out.println(noticias);

		menu(redactors, noticias);

	}

	public static void menu(ArrayList<Redactor> redactors, ArrayList<Noticia> noticias) {
		boolean programaOn = true;
		while (programaOn) {
			// A la classe principal s’ha de fer un menú amb les següents opcions:
			System.out.println("1.- Introduir redactor/a.");
			System.out.println("2.- Eliminar redactor/a.");
			System.out.println("3.- Introduir notícia a un redactor/a.");
			System.out.println("4.- Eliminar notícia");
			System.out.println("5.- Mostrar totes les notícies per redactor/a.");
			System.out.println("6.- Calcular puntuació de la notícia.");
			System.out.println("6.- Calcular puntuació de la notícia.");
			System.out.println("7.- Calcular preu-notícia.");
			System.out.println("0.- Salir del programa.");
			int opcion = entradaInt();
			switch (opcion) {
			case 0: {
				programaOn = false;
				break;
			}
			case 1: {
				// 1.- Introduir redactor/a.
				introduirRedactor(redactors);
				break;

			}
			case 2: {
				// 2.- Eliminar redactor/a.
				eliminarRedactor(redactors);
				break;

			}
			case 3: {
				// 3.- Introduir notícia a un redactor/a.
				introduirNoticiaRedactor(redactors, noticias);
				break;

			}
			case 4: {
				// 4.- Eliminar notícia (ha de demanar redactor/a i titular de la notícia).
				eliminarNoticiaRedactor(redactors);
				break;

			}
			case 5: {
				// 5.- Mostrar totes les notícies per redactor/a.
				mostrarNotíciesPerRedactor(redactors);
				break;

			}
			case 6: {
				// 6.- Calcular puntuació de la notícia.
				calcularPuntuacioNoticia(noticias);
				break;

			}
			case 7: {
				// 7.- Calcular preu-notícia.
				calcularPreuNoticia(noticias);
				break;

			}
			default: {
				System.out.println("opcion de menu incorrecta.");
			}
			}
		}

	}

	public static void introduirRedactor(ArrayList<Redactor> redactors) {

		System.out.println(" introduir DNI: ");
		String dNI = entradaText();
		Redactor redactor = buscarDNI(dNI, redactors);
		if (redactor == null) {
			System.out.println(" introduir nom : ");
			String nom = entradaText();
			redactors.add(new Redactor(dNI, nom));

		} else {
			System.out.println("redactor ya existe !!!");
		}
	}

	public static void eliminarRedactor(ArrayList<Redactor> redactors) {

		System.out.println(" introduir DNI: ");
		String dNI = entradaText();
		Redactor redactor = buscarDNI(dNI, redactors);
		if (redactor == null) {
			System.out.println("redactor nooo existe !!!");
		} else {
			for (Noticia n : redactor.getNoticias()) {
				n.setRedactor(null);
			}
			redactors.remove(redactor);
		}
	}

	public static void introduirNoticiaRedactor(ArrayList<Redactor> redactors, ArrayList<Noticia> noticias) {

		System.out.println(" introduir DNI: ");
		String dNI = entradaText();
		Redactor redactor = buscarDNI(dNI, redactors);

		if (redactor == null) {

			System.out.println(" redactor no encontrado!! ");
		} else {

			System.out.println(" introduir el titular de la noticia: ");
			String titular = entradaText();
			Noticia noticia = buscarNoticia(titular, redactor.getNoticias());

			if (noticia == null) {

				Noticia noticiaNoticias = buscarNoticia(titular, noticias);
				if (noticiaNoticias != null) {

					if (noticiaNoticias.getRedactor() == null) {

						redactor.addNoticia(noticiaNoticias);
						noticiaNoticias.setRedactor(redactor);
					} else {

						System.out.println(" noticia ya existe con otro redactor!! ");
						System.out
								.println(" tienes que eliminar la del redactor DNI: " + noticiaNoticias.getRedactor().getDNI());
					}
				} else {

					System.out.println(" noticia no encontrada en la app ");
				}

			} else {
				System.out.println(" noticia ya existe con este redactor!! ");

			}
		}
	}

	public static void eliminarNoticiaRedactor(ArrayList<Redactor> redactors) {

		System.out.println(" introduir DNI: ");
		String dNI = entradaText();
		Redactor redactor = buscarDNI(dNI, redactors);
		if (redactor == null) {
			System.out.println(" redactor no encontrado!! ");
		} else {

			System.out.println(" introduir el titular : ");
			String titular = entradaText();
			Noticia noticia = buscarNoticia(titular, redactor.getNoticias());
			if (noticia == null) {
				System.out.println(" noticia no encontrada!! ");
			} else {
				noticia.setRedactor(null);
				redactor.getNoticias().remove(noticia);
			}

		}

	}

	

	private static void mostrarNotíciesPerRedactor(ArrayList<Redactor> redactors) {

		for (Redactor redactor : redactors) {

			System.out.println(redactor);
			System.out.println(" Noticies: ");
			System.out.println(redactor.getNoticias());
			for (Noticia noticia : redactor.getNoticias()) {

				System.out.println(noticia);
			}
		}
	}
	
	private static void calcularPreuNoticia(ArrayList<Noticia> noticias) {

		System.out.println(" introduir el titular de la noticia: ");
		String titular = entradaText();
		Noticia noticia = buscarNoticia(titular, noticias);
		if (noticia == null) {
			System.out.println(" noticia no encontrada!! ");
		} else {
			
			System.out.println(" calcular preu: ");
			System.out.println(noticia);
		}

	}

	private static void calcularPuntuacioNoticia(ArrayList<Noticia> noticias) {
		
		System.out.println(" introduir el titular de la noticia: ");
		String titular = entradaText();
		Noticia noticia = buscarNoticia(titular, noticias);
		if (noticia == null) {
			System.out.println(" noticia no encontrada!! ");
		} else {
			
			System.out.println(" calcular Puntuacio: ");
			System.out.println(noticia);
		}

	}

	public static Redactor buscarDNI(String dNI, ArrayList<Redactor> redactors) {
		Redactor resultadoRedactor = null;
		int index = 0;
		while (resultadoRedactor == null && index < redactors.size()) {
			if (redactors.get(index).getDNI().equalsIgnoreCase(dNI)) {
				resultadoRedactor = redactors.get(index);
			} else {
				index += 1;
			}
		}
		return resultadoRedactor;
	}

	private static Noticia buscarNoticia(String titular, ArrayList<Noticia> noticias) {
		Noticia resultadoNoticia = null;
		int index = 0;
		while (resultadoNoticia == null && index < noticias.size()) {
			if (noticias.get(index).getTitular().equalsIgnoreCase(titular)) {
				resultadoNoticia = noticias.get(index);
			} else {
				index += 1;
			}
		}
		return resultadoNoticia;
	}

	public static String entradaText() {

		return entrada.nextLine();
	}

	public static int entradaInt() {

		int intro = entrada.nextInt();
		entrada.nextLine();
		return intro;
	}

}
