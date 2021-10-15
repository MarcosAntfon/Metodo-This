package DominioMetodoThis;

public class Estudante {

	public String nome;
	public int idade;
	public char sexo;
		
	// USANDO O THIS
		
	public void imprime(){
			
	System.out.println("-----------------------");
	System.out.println(this.nome);
	System.out.println(this.idade);
	System.out.println(this.sexo);
	
	}
}
