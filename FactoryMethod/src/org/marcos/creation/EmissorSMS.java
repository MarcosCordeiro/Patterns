package org.marcos.creation;

public class EmissorSMS implements Emissor {

	@Override
	public void envia(String mensagem) {
		// TODO Auto-generated method stub
		System.out.println("Mensagem enviada por SMS");
		System.out.println(mensagem);
	}

}
