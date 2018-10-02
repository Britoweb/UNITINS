package entidade;

public class Pessoa {
	
	private Integer id;
	private String nome;
	private String email;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void imprimir() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Identificação: " + this.getId());
		System.out.println("Email: " + this.getEmail());
	}
	
	public void imprimir(Pessoa pessoa) {
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Identificação: " + pessoa.getId());
		System.out.println("Email: " + pessoa.getEmail());
	}
}
