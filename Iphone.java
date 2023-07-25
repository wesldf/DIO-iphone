package dioiphone;


public class Iphone {

	public static void main(String[] args) {
		// Testando a classe ReprodutorMusical
		ReprodutorMusical playerIphone = new ReprodutorMusical();
		
		playerIphone.selecionarMusica("Unforgiven");
		playerIphone.tocar("Unforgiven");
		playerIphone.selecionarMusica("Master of puppets");
		playerIphone.tocar("Master of puppets");
		playerIphone.selecionarMusica("The tropper");
		playerIphone.tocar("The tropper");
		playerIphone.pausar();
		
		// testando a classe AparelhoTelefonico
		
		AparelhoTelefonico telIphone = new AparelhoTelefonico();
		
		telIphone.ligar(9123456);
		telIphone.atender();
		telIphone.iniciarCorreioVoz(9123456);
		
		// testando a classe NavegadorInternet
		
		NavegadorInternet browserIphone = new NavegadorInternet();
		
		browserIphone.exibirPagina("www.google.com");
		browserIphone.adicionarNovaAba("www.github.com");
		browserIphone.atualizarPagina();
		
}}
