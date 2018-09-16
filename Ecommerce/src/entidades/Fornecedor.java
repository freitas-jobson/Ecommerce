package entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="fornecedores")
public class Fornecedor {

	private int id;
	private String nomeFantasia;
	private String cnpj;
	private String inscricaoEstadual;
	private String razaoSocial;
	private String email;
	private String telefone;
	private int observacoes;
	public void manterFornecedor() {

	}

}
