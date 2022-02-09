import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		boolean flag = true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Entrar com um número:...");
		int num = scan.nextInt();
		int aleatorio = gerador();
		
		while(flag == true) {
			if(num == aleatorio) {
				System.out.println("Acertou!");
				flag = false;
			} else {
				System.out.println("Tente novamente.");
			}
		}
		
		
	}

}
