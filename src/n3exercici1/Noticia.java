package n3exercici1;

public abstract class Noticia {

	private String titular;
	private String text = "";
	private Redactor redactor;

	public Noticia(String titular) {
		super();
		this.setTitular(titular);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Redactor getRedactor() {
		return redactor;
	}

	public void setRedactor(Redactor redactor) {
		this.redactor = redactor;
	}

	abstract int calcularPuntuacio();

	abstract int calcularPreu();

}
