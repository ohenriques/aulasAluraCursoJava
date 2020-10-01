import java.util.Calendar;
import java.util.GregorianCalendar;

public class Principal {

	
	public static void main(String[] args) {
		
		
		Calendar dataNascimento = new GregorianCalendar(1997, 06, 19);
		Funcionario funcionario = new Funcionario("jose", 1234, dataNascimento);
		
		System.out.println(funcionario);
		
	}
	
}
