
public class Principal {

	public static void main(String[] args) {
		AlunoEnsinoMedio alunoEnsinoMedio = new AlunoEnsinoMedio();
		AlunoEnsinoSuperior alunoEnsinoSuperior = new AlunoEnsinoSuperior();
		Professor professor = new Professor();
		
		alunoEnsinoMedio.setNome("Matheus");
		alunoEnsinoMedio.setTeste(7); 
		alunoEnsinoMedio.setProva(8.5);
		
		System.out.println("Aluno do Ensino Médio:");
		System.out.println(alunoEnsinoMedio.getNome());
		System.out.println(alunoEnsinoMedio.getMedia());
		
		alunoEnsinoSuperior.setNome("Cainã");
		alunoEnsinoSuperior.setTeste(7); 
		alunoEnsinoSuperior.setProva(8.5);
		
		System.out.println("Aluno do Ensino Superior:");
		System.out.println(alunoEnsinoSuperior.getNome());
		System.out.println(alunoEnsinoSuperior.getMedia());
		
		
		professor.setNome("Maurão");
		professor.setSalario(10000);
		
		System.out.println(professor.getNome());
		System.out.println(professor.getInss());
		System.out.println(professor.getSalarioLiquido());
	}

}
