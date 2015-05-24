import java.io.Serializable;

public class Pessoa implements Serializable {
	private String nome;
	private String rg;
	private String cpf;
	private String email;
	
	public Pessoa(String nome, String cpf, String rg, String email) {
		this.setCpf(cpf);
		this.setEmail(email);
		this.setNome(nome);
		this.setRg(rg);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString(){
		return "Nome: " + this.nome + "\nCPF: " + this.cpf + "\nRG: " + this.rg + "\nE-mail: " + this.email;
	}
}
