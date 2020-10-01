
public class TesteFuncionario {

	public static void main(String[] args) {

		Gerente f1 = new Gerente();
		f1.setNome("Paulo");
		f1.setCpf("216546-8");
		f1.setSalario(3000);

		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());

	}

}
