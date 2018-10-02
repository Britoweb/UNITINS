package aplicacao;

import entidade.Pessoa;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class Principal {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		Pessoa p2 = new Pessoa();
		p2.setNome("Rafael");
		p2.setId(1);
		p2.setEmail("A@b.com");
		
		
		pf.setNome("Rafael");
		pf.setId(1);
		pf.setEmail("A@b.com");
		pf.setCpf("000.000.000-00");
		pf.setCelular("123456789");
		
		pj.setNome("Rafael");
		pj.setId(1);
		pj.setEmail("A@b.com");
		pj.setCnpj("123456578");
		pj.setInscricaoEstadual("123456777");
		pj.setTelefoneFixo("12345679");
		
//		pj.imprimir();
//		pf.imprimir();
		
		imprimir(p2);
	}
	
	public static void imprimir(Object p) {
		if (p instanceof PessoaFisica) {
			((PessoaFisica) p).imprimir(((PessoaFisica) p));
		} else if (p instanceof PessoaJuridica) {
			((PessoaJuridica) p).imprimir(((PessoaJuridica) p));
		} else if (p instanceof Pessoa) {
			((Pessoa) p).imprimir(((Pessoa) p));
	
		} else {
			return ;
		}
	}

}
