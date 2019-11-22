package Matrizes;

public class Matriz {
	int linhas, colunas;
	double valores[][] = null;
	boolean quadrada = false;

	public Matriz(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		this.valores = new double[this.linhas][this.colunas];
	}

	public void criaMatriz() {// adiciona os valores em uma matriz
		for (int i = 0; i < this.linhas; i++) {
			for (int j = 0; j < this.colunas; j++) {
				int randomNumber = (int) Math.round(Math.random() * 10);
				this.valores[i][j] = randomNumber;
			}
		}
	}

	public void printMatriz() {// printa matriz na tela
		for (int i = 0; i < this.linhas; i++) {
			for (int j = 0; j < this.colunas; j++) {
				System.out.print(valores[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public void verificaMatriz() {
		if (this.linhas == this.colunas) {
			this.quadrada  = true;
		}
	}	

	public void multiplicacao(Matriz matriz, Matriz matriz2) {//multiplica as matrizes
		
		double[][] matriz3 = null;
		for (int i = 0; i < matriz.valores.length-1; i++) {
			for (int j = 0; i < matriz.valores.length-1; j++) {
				matriz3[i][j] = (matriz.valores[i][j]) * (matriz2.valores[i][j]);
			}
		}
		for (int i = 0; i < matriz.valores.length-1; i++) {
			for (int j = 0; i < matriz.valores.length-1; j++) {
				this.valores[i][j] = matriz3[i][j];
			}
		}
	}
}
