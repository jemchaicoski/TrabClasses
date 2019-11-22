
public class Retangulo {
	Ponto p1, p2, p3, p4;
	Double largura, altura;
	
	public Retangulo(Ponto p1, Ponto p4, Double largura, Double altura) {
		this.p1 = p1;
		this.p4 = p4;
		this.largura = largura;
		this.altura = altura;
		p2 = new Ponto(p4.getX() , 0.0);
		p3 = new Ponto(0.0 , p4.getY());
	}

}
