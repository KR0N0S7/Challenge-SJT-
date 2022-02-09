import java.util.List;
import java.util.Random;

public class Mago extends Personagens {

	private List<String> magia;
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getMagia() {
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}

	public void lvUp() {
		
		this.setMana(getMana() + 4);
		this.setInteligencia(getInteligencia() + 5);
		this.setVida(getVida() + 7);
		this.setForca(getForca() + 2);
	}
	
	public int attack() {
		Random numAleatorio = new Random();
		int num = 180;
		int numRandom = (getInteligencia()/2 * getLevel()) + numAleatorio.nextInt(num);
		return numRandom;

	}
	
	public void aprendeMagia(String magia) {
		getMagia().add(magia);
	}
}
