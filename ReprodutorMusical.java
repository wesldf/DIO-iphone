package dioiphone;

	public class ReprodutorMusical {
		private String musica;

		public String tocar(String music){
			this.musica = music;
			System.out.println("Tocando " + musica);
			return musica;
		}
		public  void pausar(){
			System.out.println("Execucao pausada");
		}
		public  void selecionarMusica(String music){
			this.musica = music;
			System.out.println(musica + " selecionada");
		}
		
		public String getMusica() {
			return musica;
		}

		public void setMusica(String musica) {
			this.musica = musica;
		}
		public ReprodutorMusical() {
			super();
		}

		
	}

