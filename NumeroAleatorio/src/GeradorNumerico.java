import java.util.Random;

public class GeradorNumerico {

	public int gerador() {
		Random numAleatorio = new Random();
		int num = 11;
		int numRandom = numAleatorio.nextInt(num);
		return numRandom;
	}
}
