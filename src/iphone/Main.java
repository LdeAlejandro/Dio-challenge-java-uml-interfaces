package iphone;

import iphone.models.Iphone;

public class Main {
	
	public static void main(String [] args) {
			
		Iphone device = new Iphone();
		
		//reprodutor de Música
		device.selecionarMusica("Enemy - Imagine Dragons");
		device.tocar();
		device.pausar();
		
		System.out.println("*********************");
		
		//Aparelho Telefonico
		if(device.isLigacaoEntrante()) {
			System.out.println("Ligação entrante");
			device.atender();
		}
		
		device.desligar();
		
		device.ligar("+55 43245234");
		device.iniciarCorreioVoz();
		
		System.out.println("*********************");
		//Navegador
		device.adicionarNovaAba();
		device.exibirPagina("example.com");
		device.atualizarPagina();

		
	}

}
