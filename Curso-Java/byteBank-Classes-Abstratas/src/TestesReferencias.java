
public class TestesReferencias {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setSalario(5000.0);

		EditorVideo ev = new EditorVideo();

		Designer ds = new Designer();
		ds.setSalario(2000);

		ControleBonificacao controle = new ControleBonificacao();
		controle.registrar(g1);

		controle.registrar(ev);
		controle.registrar(ds);

		System.out.println(controle.getSoma());

	}

}
