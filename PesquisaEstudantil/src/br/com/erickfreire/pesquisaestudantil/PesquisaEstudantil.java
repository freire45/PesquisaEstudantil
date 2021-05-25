package br.com.erickfreire.pesquisaestudantil;

/**
 * Programa em Java que organiza dados de uma pesquisa estudantil sobre o refeitório da faculdade
 * @author Erick Freire
 * @version 1 - Criado em 25-05-2021 as 14:45
 */

public class PesquisaEstudantil {

	public static void main(String[] args) {
		
		int[] respostas = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};
		int[] frequencia = new int[6];
		
		for(int resposta = 0; resposta < respostas.length; resposta++ ) {
			try {
				++frequencia[respostas[resposta]];
			}
			
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				System.out.printf("		respostas[%d] = %d%n%n", resposta, respostas[resposta]);
				
			}
			
		}
		
		System.out.printf("%s%10s%n", "Classificação", "Frequencia");
		
		for(int classificacao = 1; classificacao < frequencia.length; classificacao++)
			System.out.printf("%6d%10d%n", classificacao, frequencia[classificacao]);

	}

}
