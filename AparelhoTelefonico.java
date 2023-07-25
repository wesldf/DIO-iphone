package dioiphone;

public class AparelhoTelefonico {
	
private int numeroTelefone;

public  void ligar(int numeroTelefone){
	this.numeroTelefone = numeroTelefone;
	System.out.println("Ligando para "+ numeroTelefone);
	System.out.println("Chamando");}

public  void atender(){
	System.out.println("Exibir numero de telefone na tela e tocar");
	System.out.println("Clique verde para atender e vermelho para recusar");}

public  void iniciarCorreioVoz(int numeroTelefone){
	this.numeroTelefone = numeroTelefone;
	System.out.println("tocar correio de voz do numero: " + numeroTelefone);
	System.out.println("excluir correio de voz do numero: " + numeroTelefone);}

public int getNumeroTelefone() {
	return numeroTelefone;
}

public void setNumeroTelefone(int numeroTelefone) {
	this.numeroTelefone = numeroTelefone;
}

public AparelhoTelefonico() {
	super();
}


}





