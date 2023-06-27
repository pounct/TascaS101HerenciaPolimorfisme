package n1exercici2;

public class Cotxe {

	// marca, model i potència
	// La marca ha de ser estàtic final
	// el model estàtic
	// la potència final

	// Todos los coches instanciados de Cotxe tiene este propiedad fija initialisada
	// y que no se cambia
	// ni en el constructor ni en otro lado dentro la clase o fuera
	private static final String marca = "SEAT";
	private static String model;
	private final int potencia;

	public Cotxe(/* String model, */int potencia) {
		super();
		this.potencia = potencia;
		// marca = "FIAT"; mensaje de eror "The final field Cotxe.marca cannot be
		// assigned"
		this.model = "IBIZA"; // o =model// se cambia el modelo para todos los objetos coches
	}

	public void setModel(String model) {
		this.model = model; //
	}

	public static void frenar() {
		System.out.println("El vehicle està frenant");

	}

	public void accelerar() {
		System.out.println("El vehicle està accelerant");

	}

	public static void testMarca() {
		// marca = "FIAT"; mensaje de eror "The final field Cotxe.marca cannot be
		// assigned"
		model = "LEON";
	}

}
