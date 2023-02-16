import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		double media;
		Scanner nota1 = new Scanner(System.in);
		Scanner nota2 = new Scanner(System.in);
		double valor1;
		double valor2;

		System.out.println("Digite a primeira nota: " );
		valor1 = nota1.nextDouble();
		
		System.out.println("Digite a segunda nota: " );
		valor2 = nota2.nextDouble();
		
		media = (valor1 + valor2) / 2;
		
		
		System.out.println("Sua média é " +media);
		
		
	}

}
