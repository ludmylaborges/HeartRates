package br.com.cap.heartrates;


public class HeartRates {

		private String nome;
		private String sobrenome;
		private int diaNascimento;
		private int mesNascimento;
		private int anoNascimento;
		
		
		
		public HeartRates(String nome, String sobrenome, int diaNascimento, int mesNascimento, int anoNascimento) {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.diaNascimento = diaNascimento;
			this.mesNascimento = mesNascimento;
			this.anoNascimento = anoNascimento;
		}

		public HeartRates() {
			this.nome = "";
			this.sobrenome = "";
			this.diaNascimento = 0;
			this.mesNascimento =0;
			this.anoNascimento = 0;
		}
		
		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getSobrenome() {
			return sobrenome;
		}

		public void setSobrenome(String sobrenome) {
			this.sobrenome = sobrenome;
		}

		public int getDiaNascimento() {
			return diaNascimento;
		}

		public void setDiaNascimento(int diaNascimento) {
			this.diaNascimento = diaNascimento;
		}

		public int getMesNascimento() {
			return mesNascimento;
		}

		public void setMesNascimento(int mesNascimento) {
			this.mesNascimento = mesNascimento;
		}

		public int getAnoNascimento() {
			return anoNascimento;
		}

		public void setAnoNascimento(int anoNascimento) {
			this.anoNascimento = anoNascimento;
		}

		public void add(HeartRates heartrates) {
			
		}
		 
		public int calcularIdade(int anoAtual){
			int idade;
			idade = anoAtual - anoNascimento;
			return idade;
		} 
		
		public int calculaFrequenciaCardiaca(int idade) {
			return 220 - idade;
		}
		
		
		public String retornaFrequenciaAlvo(int idade) {
			float fMin = (float) (calculaFrequenciaCardiaca(idade) * 0.5); 
			float fMax = (float) (calculaFrequenciaCardiaca(idade) * 0.85); 
			return "Sua frequência alvo está entre " + fMin + " e " + fMax;
		}
		
		
		public void inserir(HeartRates heartrates){
				heartrates.inserir(heartrates); 
			}
			
		
		/*public Contato buscarPorTelefone(String telefone){
			
			for(Contato contato: contatos){
				if(contato.getTelefone().equals(telefone)) {
					return contato;
				} 
			}	
			return null;	
		}
		
		
		public 	
			
			
			Inserir
			Buscar todos
			Buscar por chave*/
		
		
		
		
	}





	
	

