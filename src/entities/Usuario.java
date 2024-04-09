package entities;

public class Usuario {

	private String nome;
	private String sobrenome;
	private String cpf;
	private SituacaoBancaria situacao;

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
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public SituacaoBancaria getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoBancaria situacao) {
		this.situacao = situacao;
	}
	
}
