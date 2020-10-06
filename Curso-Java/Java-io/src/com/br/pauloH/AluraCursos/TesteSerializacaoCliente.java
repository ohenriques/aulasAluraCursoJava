package com.br.pauloH.AluraCursos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacaoCliente {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

//		
//		 Cliente cliente = new Cliente();
//		 cliente.setNome("Paulo");
//		 cliente.setProfissao("Dev back");
//		 cliente.setCpf("123-564-987");
//		 
////		 GRAVANDO DADOS
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Cliente.bin"));		
//		oos.writeObject(cliente);
//		oos.close();

		
//		RECUPERANDO DADOS
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		ois.close();
		
		System.out.println(cliente.getNome());
		
		
		}

}
