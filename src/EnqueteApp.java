import java.util.Scanner;

public class EnqueteApp {

	public static void main(String[] args) {
		
		String [] perguntas = {"A sua preocupa��o com o meio ambiente.",
							   "As suas a��es para preservar o meio\nambiente.\t\t\t",
							   "As a��es do seu munic�pio para a\npreserva��o do meio ambiente.\t",
							   "O quanto a degrada��o do meio ambiente\nj� o afetou.\t\t\t",
							   "Em quanto voc� acredita nas not�cias\nsobre a degrada��o do meio ambiente."};
		
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
			
			System.out.printf("Entrevistado %d\nClassifique as seguintes quest�es com um valor entre 1 e 10.", i);
			
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
