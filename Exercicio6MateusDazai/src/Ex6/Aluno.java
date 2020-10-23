package Ex6;

import java.util.Scanner;

public class Aluno extends Pessoa {
	
	private String curso;
	private int nota1;
	private int nota2;
	private int nota3;
	
	public Aluno(String nome, String ender, int telefone, int cpf) {
		super(nome, ender, telefone, cpf);
		// TODO Auto-generated constructor stub
	}	
	
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	
	public float calcularMedia() {
		Scanner ent = new Scanner(System.in);
        int nota1, nota2, nota3;
        int media, i, contAluno = 0;

            // recebe a 1º nota
            System.out.println("Aluno " + contAluno + ", digite sua 1ª nota");
            nota1 = ent.nextInt();

            // recebe a 2º nota
            System.out.println("Aluno " + contAluno + ", digite sua 2ª nota");
            nota2 = ent.nextInt();

            // recebe a 3º nota
            System.out.println("Aluno " + contAluno + ", digite sua 3ª nota");
            nota3 = ent.nextInt();

            // calcula a média
            media = (nota1 + nota2 + nota3) / 3;
            System.out.println("A média do aluno " + contAluno + " é " + media);

            // mostra a nota do aluno
            if( (media >= 0) && (media >=7) ){
                System.out.println("Aprovado");
            } else if(media <= 6){
                System.out.println("Reprovado");
            }
        return contAluno;
	    }

}
