package dioiphone;

public class NavegadorInternet {
	private String enderecoHttp;
	
	public  void exibirPagina(String enderecoHttp){
		this.enderecoHttp =enderecoHttp;
		System.out.println("Acessando a pagina " + enderecoHttp);}
		
	public  void adicionarNovaAba(String enderecoHttp){
		this.enderecoHttp =enderecoHttp;
		System.out.println("Abrindo a pagina " + enderecoHttp);}
	
	public  void atualizarPagina(){
		System.out.println("Clique em F5 ou o botao atualizar \n pagina atualizada");}


	public NavegadorInternet() {
		super();
	}

	public String getEnderecoHttp() {
		return enderecoHttp;
	}

	public void setEnderecoHttp(String enderecoHttp) {
		this.enderecoHttp = enderecoHttp;
	}
		
		

}
