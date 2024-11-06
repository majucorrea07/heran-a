package superClasse;

public class Jornada extends Funcionariio {
	public Jornada() {
	}
	public Jornada(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	@Override
	public double calcularSalario(double salarioHora, double horasTrabalhadas) {
		return salarioHora * horasTrabalhadas;
	}
}
