package org.marcos.creation;

public class TestaEmissores {
	public static void main(String args[]){
		EmissorCreator creator = new EmissorCreator();
		Emissor emissorSMS = creator.create(EmissorCreator.SMS);
		Emissor emissorEmail = creator.create(EmissorCreator.EMAIL);
		Emissor emissorJMS = creator.create(EmissorCreator.JMS);
		
		emissorSMS.envia("Teste de envio de SMS");
		emissorEmail.envia("Teste de envio de Email");
		emissorJMS.envia("Teste de envio por JMS");
	}
}
