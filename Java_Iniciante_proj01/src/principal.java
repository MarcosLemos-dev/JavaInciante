import java.util.Scanner; // importando a classe scanner

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b; // variaveis do tipo inteiro
		double resultado; //variaveis do tipo double
		
		Scanner ler = new Scanner(System.in); //instanciando e criando um objeto Scanner
		
		System.out.println("digite o numero a: ");
		a = ler.nextInt();
		System.out.println("digite o numero b: ");
		b = ler.nextInt();

		resultado  = a + b;
		System.out.println("o resultado da soma foi: " + resultado);

	}

}
