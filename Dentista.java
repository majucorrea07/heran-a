package superClasse;

public class Dentista extends ProfissionalSaude {
	protected String cro;
	public Dentista(String nome, String especialidade, int valorConsulta, String cro) {
	super(nome, especialidade, valorConsulta);
	this.cro = cro;
	}
	@Override
	public void agendarConsulta() {
		System.out.println("Agendar consulta no dentista");
	}
	}

