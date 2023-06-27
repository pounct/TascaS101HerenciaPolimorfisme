package n1exercici2;

public class N1Exercici2 {

	public static void main(String[] args) {


		Cotxe coche1 = new Cotxe(250);
		
		// com invocar el mètode estàtic frenar()
		coche1.frenar(); //se invoca con instancia
		Cotxe.frenar(); //se invoca sin instancia
		
		//  i el no estàtic solo se invoca con instancia
		coche1.accelerar();

	}

}
