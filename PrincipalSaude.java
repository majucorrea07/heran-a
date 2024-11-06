package superClasse;

public class PrincipalSaude {

	public static void main(String[] args) {
		Medico medico = new Medico ("Vitor", "Clínico geral", 1000, "XXXX");
		medico.agendarConsulta();
		
		Fisioterapeuta fisioterapeuta = new Fisioterapeuta ("Camila", "Fisio geral",1000, "1234");
		fisioterapeuta.agendarConsulta();
		
		Dentista dentista = new Dentista ("Fernanda", "Dentista geral", 1000, "XXXX");
		dentista.agendarConsulta();
	}

}
