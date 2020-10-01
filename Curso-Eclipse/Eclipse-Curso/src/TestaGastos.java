import java.util.Calendar;
import java.util.GregorianCalendar;

public class TestaGastos {

	public static void main(String[] args) {
		Calendar dataNascimento = new GregorianCalendar(1997, 6, 11);
		Funcionario funcionario = new Funcionario("Paulo", 1234, dataNascimento);

		Calendar data = Calendar.getInstance();
		
		Gastos gastos1 = new Gastos(10, "Gerente", funcionario, data);
		Gastos gastos2= new Gastos(10, "Gerente", funcionario, data);
		Gastos gastos3 = new Gastos(10, "Gerente", funcionario, data);

		System.out.println(gastos1);
		System.out.println(gastos2);
		System.out.println(gastos3);
	}

}
