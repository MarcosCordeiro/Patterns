package org.marcos.creation;

public class EmissorEmail implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Enviado por Email");
		System.out.println(mensagem);
	}

}
