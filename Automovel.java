package superClasse;

public class Automovel extends Veiculo{
protected int numportas;
protected String motor;

public Automovel(String marca, String modelo, int ano, String cor, int numportas, String motor) {
	super(marca, modelo, ano, cor);
	this.numportas = numportas;
	this.motor = motor;
}
@Override
public void exibirInfo() {
	System.out.println("Numero de Portas: " + numportas);
    System.out.println("Motor: " + motor);
}
}


