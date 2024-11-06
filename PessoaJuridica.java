package superClasse;

public class PessoaJuridica extends Funcionariio{
	public PessoaJuridica() {
	}
	public PessoaJuridica(long id, String nome, String telefone, int matricula, String endereco) {
		super(id, nome, telefone, matricula, endereco);
	}
	@Override
	public double calcularSalario(double valorBruto, double imposto) {
		return valorBruto - imposto;
	}
}

