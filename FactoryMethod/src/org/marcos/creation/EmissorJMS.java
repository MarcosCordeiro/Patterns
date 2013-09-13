package org.marcos.creation;

public class EmissorJMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Mensagem enviada por JMS");
		System.out.println(mensagem);
	}

}
