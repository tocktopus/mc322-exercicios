package exercicioAula4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno("Cocada");
		
		a1.setNome("Nina");
		a1.setIdade(15);
		a1.setAltura(1.60);
		a1.setMatricula(1);
		
		a2.setIdade(18);
		a2.setAltura(1.70);
		a2.setMatricula(2);
		
		System.out.println("Olá!\n");
		a1.imprimirDadosAluno();
		System.out.println("\n");
		a2.imprimirDadosAluno();
	}

}
