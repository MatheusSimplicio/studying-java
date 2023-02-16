import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner numeroInserido = new Scanner(System.in);
		int opcao;
		
		do {
			System.out.println("-------------");
			System.out.println("Menu Principal");
			System.out.println("-------------");
			System.out.println("Selecione uma das opções abaixo");
			System.out.println("1 - Aluno");
			System.out.println("2 - Professor");
			System.out.println("3 - Coordenador");
			System.out.println("0 - Sair");
			
			System.out.println("Qual opção deseja?");
			opcao = numeroInserido.nextInt();
			
			if (opcao ==0) {
				break;
			}
			
			switch(opcao) {
			case 1:
				System.out.println("VocÊ selecionou a opção de Aluno!");
				break;
			case 2:
				System.out.println("VocÊ selecionou a opção de Professor!");
				break;
			case 3:
				System.out.println("VocÊ selecionou a opção de Coordenador!");
				break;
			default:
				System.out.println("VocÊ selecionou a opção de Sair!");
			}
			
		}while(true);{
			System.out.println("Fim.");
		
		}

	}
}