package superClasse;

public class PrincipalAut {

	public static void main(String[] args) {
		Automovel carro1 = new Automovel ("Chevrolet", "Camaro", 2022, "Preto", 4, "V8");
        Moto moto1 = new Moto("Honda", "Cg", "Vermelha",2020, 150);
				
        carro1.exibirInfo();
		System.out.println();
		moto1.exibirInfo();
	}

}
