package br.com.bytebank.banco.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Cliente refCliente = new Cliente();
		refCliente.setNome("Paulo");
		refCliente.setProfissao("Dev back");
		refCliente.setCpf("123-564-987");
		
		ContaCorrente cc= new ContaCorrente(223,22);
		cc.setTitular(refCliente);
		cc.deposita(225.5);

////		 GRAVANDO DADOS
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cc.bin"));
		oos.writeObject(cc);
		oos.close();

//		RECUPERANDO DADOS
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cliente.bin"));
//		Cliente cliente = (Cliente) ois.readObject();
//		ois.close();
//		
//		System.out.println(cliente.getNome());

	}

}
