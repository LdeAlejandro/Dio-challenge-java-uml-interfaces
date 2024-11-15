package iphone.models;
import iphone.interfaces.*;


public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
	
	private boolean musicPlaying = false;
	private boolean ligacaoEntrante = true;

	public boolean isLigacaoEntrante() {
		return ligacaoEntrante;
	}

	@Override
	public void tocar() {
		if(!musicPlaying) {
			System.out.println("Tocar música");
			musicPlaying = true;
		}else {
			System.out.println("Música ja esta tocando");
		}
	}

	@Override
	public void pausar() {
		if(musicPlaying) {
			System.out.println("Pausar música");
			musicPlaying = false;
		}else {
			System.out.println("Não tem nehuma música tocando");
		}
	}

	@Override
	public void selecionarMusica(String musica) {
		System.out.println("Selecionando Musica: " + musica);
		
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibir Pagina: "+ url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba do navegador");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando pagina");
		
	}

	@Override
	public void ligar(String numero) {
		System.out.println("Ligar para número: "+ numero);
		
	}
	
	@Override
	public void desligar() {
		System.out.println("Desligar");
		
	}


	@Override
	public void atender() {
		System.out.println("Atender ligação");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar correio de voz");
		
	}

}
