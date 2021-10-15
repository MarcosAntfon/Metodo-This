package TestMetodoThis;

import DominioMetodoThis.Estudante;

public class EstudanteTest {

	public static void main(String[] args) {

			Estudante estudante01 = new Estudante();
			Estudante estudante02 = new Estudante();
			
			estudante01.nome = "Luciene";
			estudante01.idade = 30;
			estudante01.sexo = 'F';

			estudante02.nome = "Marcos Antonio";
			estudante02.idade = 29;
			estudante02.sexo = 'M';
			
			estudante01.imprime();
			
			estudante02.imprime();
	}

}
