
public class Enquete {
	
	private String[] perguntas = new String[5];
	private int[][] respostas = new int[5][10];
	
	public Enquete(String[] perguntas, int[][] respostas) {
		super();
		this.perguntas = perguntas;
		this.respostas = respostas;
	}

	public String[] getPerguntas() {
		return perguntas;
	}

	public void setPerguntas(String[] perguntas) {
		this.perguntas = perguntas;
	}

	public int[][] getRespostas() {
		return respostas;
	}

	public void setRespostas(int[][] respostas) {
		this.respostas = respostas;
	}
	
}
