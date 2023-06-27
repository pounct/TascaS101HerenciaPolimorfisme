package n2exercici1;

public class Phone {
	
	private String marca;
	private String model;
	
	public Phone(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	public static void trucar(int numero) {
		System.out.println("està trucant al número rebut "+numero);
	}

}
