package bancoDados;

import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Digite seu nome: ");
			String nomeDig = input.nextLine();
			
			System.out.println("Digite sua idade: ");
			int idadeDig = input.nextInt();
			
			Pessoa natalino = new Pessoa(nomeDig, idadeDig);
			
			PessoaDAO natalinoDAO = new PessoaDAO();
			natalinoDAO.inserir(natalino);
			
		}catch(Exception e) {
			System.out.println("Erro no Banco de Dados: " + e.getMessage());
		}
	}

}