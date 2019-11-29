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
	public void criaMatrizID() {
		int x = 0;
		for (int i = 0; i < this.linhas; i++) {
			for (int j = 0; j < this.colunas; j++) {
				if((x == 0) || (x == colunas)) {
					this.valores[i][j] = 1;	
				}else {
					this.valores[i][j] = 0;
				}
				x++;
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

	public void multiplicacao(Matriz matriz, Matriz matriz2, int linhas, int colunas) {//multiplica as matrizes
		int c[][]=new int[linhas][colunas];
		for(int i=0;i<c.length;i++){    
			for(int j=0;j<c.length;j++){    
				c[i][j]=0;      
				for(int k=0;k<c.length;k++){      
					c[i][j]+=matriz.valores[i][k]*matriz2.valores[k][j];      
				}//fim k
				System.out.println(i+1+"° coluna " + c[i][j]+" ");   
			}//fim j 
			System.out.println();    
		} 
	}
}
