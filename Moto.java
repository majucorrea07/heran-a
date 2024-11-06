package superClasse;

public class Moto extends Veiculo {
protected int cilindrada;

public Moto(String marca, String modelo, String cor, int ano, int cilindrada) {
super(marca, modelo, ano, cor);
this.cilindrada = cilindrada;
}
public void exibirInfo() {
	System.out.println("Cilindrada: " + cilindrada);
}
}
