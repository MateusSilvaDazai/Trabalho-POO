package Ex6;

public class App {
	public static void main(String[] args) {
	
		Professor prof =  new Professor ("Pedro","Nonoai", 987654321, 123456789);
		Aluno alu = new Aluno ("Beto", "Cristal", 123456789, 6003871);
		
		prof.calculaSalarioLiquido();
		alu.calcularMedia();
		
		
		
	}
}
