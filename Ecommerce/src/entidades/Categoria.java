package entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="categorias")
public class Categoria {

	private int int;
	private String descricao;
	public void manterCategoria() {

	}

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
