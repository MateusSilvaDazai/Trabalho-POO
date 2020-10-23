package Ex6;

import java.util.Scanner;

public class Professor extends Pessoa{

		public Professor(String nome, String ender, int telefone, int cpf) {
		super(nome, ender, telefone, cpf);
		// TODO Auto-generated constructor stub
	}
		private String curso;
		private double salario;
		private double salarioBruto;
		private double inss;
		private double ir;
		private double salarioLiquido;
		
		
		public String getCurso() {
			return curso;
		}
		public void setCurso(String curso) {
			this.curso = curso;
		}
		public double getSalario() {
			return salario;
		}
		public void setSalario(double salario) {
			this.salario = salario;
		}
		
		
		public double calculaSalarioLiquido() {
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Salário Bruto: " );
		 salarioBruto = ent.nextInt();
			
		if (salarioBruto <= 1000) //Início INSS
	     {
	         inss = salarioBruto/100 * 8.5;
	     }
	     else if (salarioBruto > 1000)
	     {
	    	 inss = salarioBruto/100 * 9;
	     }         //Fim INSS

	     if (salarioBruto <= 500) //Início IR
	     {
	         ir = 0;
	     }
	     else if ((salarioBruto > 500) || (salarioBruto < 1000))
	     {
	         ir = salarioBruto/100 * 5;
	     }
	     else if (salarioBruto > 1000)
	     {
	         ir = salarioBruto/100 * 7;
	     }
	     
	     
		 
		 
		 salarioLiquido = (salarioBruto - inss - ir);
		 
		 System.out.println(salarioLiquido);
		 
		 return salarioLiquido;
		}
	
}

	

