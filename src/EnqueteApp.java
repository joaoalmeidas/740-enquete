import java.util.Scanner;

public class EnqueteApp {

	public static void main(String[] args) {
		
		String [] perguntas = {"A sua preocupação com o meio ambiente.",
							   "As suas ações para preservar o meio\nambiente.\t\t\t",
							   "As ações do seu município para a\npreservação do meio ambiente.\t",
							   "O quanto a degradação do meio ambiente\njá o afetou.\t\t\t",
							   "Em quanto você acredita nas notícias\nsobre a degradação do meio ambiente."};
		
		Scanner input = new Scanner(System.in);
		
		int[][] respostas = new int[5][10];
		int resposta = 0;
		
		
		Enquete[] pesquisa = {new Enquete(perguntas, respostas),
								 new Enquete(perguntas, respostas),
								 new Enquete(perguntas, respostas),
								 new Enquete(perguntas, respostas),
								 new Enquete(perguntas, respostas)};
		
		
		System.out.println("Pesquisa sobre o meio ambiente:");
		
		//exibeRelatorio(pesquisa);
		
		for(int i = 0; i < pesquisa.length; i++) {
			
			System.out.printf("Entrevistado %d\nClassifique as seguintes questões com um valor entre 1 e 10.\n", i+1);
			
			//mostra as perguntas
			for(int j = 0; j < pesquisa[i].getPerguntas().length; j++) {
				
				System.out.println(perguntas[j]);
				resposta = input.nextInt();
				
				pesquisa[i].getRespostas()[j][resposta-1]++;
				
			}
			
			
		}
		
		exibeRelatorio(pesquisa);
		
	}
	
	public static void exibeRelatorio(Enquete[] pesquisa) {
		
		double media = 0 ;
		
		//imprime cabeçalho das colunas
		System.out.printf("\t\t\t\t\t");
		for(int i = 1; i <= pesquisa[0].getRespostas()[0].length; i++) {
			
			System.out.printf("%d\t", i);
			
		}
		System.out.println("Média\n");
		
		//imprime linhas
		for(int i = 0; i < pesquisa[0].getRespostas().length; i++) {
			
			System.out.printf(pesquisa[0].getPerguntas()[i]+"\t");
			
			for(int j = 0; j < pesquisa[0].getRespostas()[0].length ; j++) {
				
				System.out.printf("%d\t", pesquisa[0].getRespostas()[i][j]);
				
			}
			
			//media
			
			media = 0;
			
			for(int k = 0; k < pesquisa[0].getRespostas()[0].length; k++) {
				
				if(pesquisa[0].getRespostas()[i][k] != 0) {
					
					media += (k+1) * pesquisa[0].getRespostas()[i][k];
					
				}
				
				
			}
			
			System.out.println(media/5);
				
		}
		
	}

}
