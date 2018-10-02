package entidade;

public class PessoaJuridica extends Pessoa {

	
	private String cnpj;
	private String inscricaoEstadual;
	private String telefoneFixo;
	
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getTelefoneFixo() {
		return telefoneFixo;
	}
	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}
	
	@Override
	public void imprimir() {
		super.imprimir();
		System.out.println("CNPJ: " + this.getCnpj());
		System.out.println("Inscrição Estadual: " + this.getInscricaoEstadual());
		System.out.println("Telefone Fixo: " + this.getTelefoneFixo());
	}
	
	public void imprimir(PessoaJuridica pessoa) {
		super.imprimir();
		System.out.println("CNPJ: " + pessoa.getCnpj());
		System.out.println("Inscrição Estadual: " + pessoa.getInscricaoEstadual());
		System.out.println("Telefone Fixo: " + pessoa.getTelefoneFixo());
	}
	
	
}
