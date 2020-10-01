
public class Teste01 {

	public static void main(String[] args) {

		Carro gol = new Carro();
		Motor v2 = new Motor();

		gol.valor = 10;

		gol.tipoDoMotor = v2;
		System.out.println(gol.tipoDoMotor.marca);

	}

}
