package Matrizes;

public class Principal {

	public static void main(String[] args) {
		Matriz matriz = new Matriz(3, 3);
		Matriz matriz2 = new Matriz(3,    3);
		matriz.criaMatriz();
		matriz.printMatriz();
		System.out.println(
				"___________________________________________________________________________________________________________");

		// matriz.fazMatrizNula();
		// matriz.printMatriz();
		// System.out.println("___________________________________________________________________________________________________________");

		// matriz.fazMatrizIdentidade();
		// matriz.printMatriz();
		// System.out.println("___________________________________________________________________________________________________________");
		
		matriz2.printMatriz();
		matriz.multiplicacao(matriz, matriz2);
	}

}
