package exercicioAula4;

public class Aluno {
	private String nome;
	private int matricula;
	private int idade;
	private double altura;
	
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public void imprimirDadosAluno() {
		System.out.println("Nome do aluno: "+this.nome+"\nMatrícula: "+this.matricula+"\nIdade: "+this.idade+"\nAltura: "+this.altura);
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
}
