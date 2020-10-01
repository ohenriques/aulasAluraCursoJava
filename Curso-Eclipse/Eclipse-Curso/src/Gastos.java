
import java.util.Calendar;

public class Gastos {

	private double valor;
	private String tipo;
	private Funcionario funcionario;
	private Calendar data;

	@Override
	public String toString() {
	
		return tipo + " do " + funcionario;
	}

	public Gastos(double valor, String tipo, Funcionario funcionario, Calendar calendario) {
		super();
		this.valor = valor;
		this.tipo = tipo;
		this.funcionario = funcionario;
		this.data = calendario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Calendar getCalendario() {
		return data;
	}

	public void setCalendario(Calendar calendario) {
		this.data = calendario;
	}

}
