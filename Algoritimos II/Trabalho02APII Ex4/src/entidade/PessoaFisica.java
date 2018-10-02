package entidade;


public class PessoaFisica extends Pessoa {

	
	private String cpf;
	private String celular;
	
	
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}

	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Celular: " + this.getCelular());
	}
	
	public void imprimir(PessoaFisica pessoa) {
		super.imprimir();
		System.out.println("CPF: " + pessoa.getCpf());
		System.out.println("Celular: " + pessoa.getCelular());
	}
	
}
