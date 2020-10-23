package Ex6;

import java.util.Scanner;

public class Pessoa {
	protected String nome;
	protected String ender;
	protected int telefone;
	protected int cpf;
	
	
	public Pessoa(String nome, String ender, int telefone, int cpf) {
		super();
		this.nome = nome;
		this.ender = ender;
		this.telefone = telefone;
		this.cpf = cpf;
	}
		

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnder() {
		return ender;
	}
	public void setEnder(String ender) {
		this.ender = ender;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public double tirarCopia() {
	Scanner ent = new Scanner(System.in);
	int custo=0;
	String aluno, professor;
	int user = 1;
	double qtCopia=0;
	double valorRes;
	
	System.out.println("Aluno digite 1, Professor digite 2");
	user= ent.hasNextInt();
	
	
	if(user != 1) {
	System.out.println("Aluno, valor R$0,10");
	valorRes = qtCopia * 0.10;  
	
	}
	
	return custo ;
	}
}
