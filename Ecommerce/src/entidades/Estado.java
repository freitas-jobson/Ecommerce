package entidades;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estados")
public class Estado {

	private int id;
	private String descricao;
	private char sigla;
	private String pais;
    @Id
    @GeneratedValue
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

    public char getSigla() {
        return sigla;
    }

    public void setSigla(char sigla) {
        this.sigla = sigla;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    
	public void manterEstado() {

	}

}
