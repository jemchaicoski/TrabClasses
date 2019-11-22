
public class Quadrado {
	Ponto p1, p2, p3, p4 ;
	Double lado;
	
	public Quadrado(Ponto p1, Double lado) {
		this.p1 = p1;
		this.lado = lado;
		p2 = new Ponto(p1.getX() + lado, p1.getY());
		p3 = new Ponto(p1.getX(), p1.getY() + lado);
		p4 = new Ponto(p1.getX() + lado, p1.getY() + lado);
	}
	
	
	

}
