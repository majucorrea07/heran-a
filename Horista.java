package superClasse;

public class Horista extends Funcionariio {

	public Horista() {
	}
	public Horista(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	@Override
	public double calcularSalario(double valorHora, double quantidadeHoras) {
		return valorHora * quantidadeHoras;
	}
}
