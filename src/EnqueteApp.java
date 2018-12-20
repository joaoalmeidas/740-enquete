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
		
		
		for(int i = 0; i < pesquisa.length; i++) {
			
			System.out.printf("Entrevistado %d\nClassifique as seguintes questões com um valor entre 1 e 10.", i);
			
			//mostra as perguntas
			for(int j = 0; j < pesquisa[i].getPerguntas().length; j++) {
				
				System.out.println(perguntas[j]);
				resposta = input.nextInt();
				
				pesquisa[i].getRespostas()[j][resposta-1]++;
				
			}
			
			
			
		}
		
		//exibeRelatorio(pesquisa);
		
		
		
		
	}
	
	

}
