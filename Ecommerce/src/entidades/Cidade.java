package entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cidades")
public class Cidade {

	private int id;
	private String descricao;
	public void manterCidade() {

	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
