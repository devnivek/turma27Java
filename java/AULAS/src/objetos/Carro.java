package objetos;

public class Carro {

	public int portas;
	public int ano;
	public String cor;
	public String marca;
	public boolean ligado;
	public int velocidade;

	public String ligaMotor() {
		if (ligado == true) {
			return "O motor est� ligado";
		} else {
			return "O motor est� desligado";
		}
	}

}
