package entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="comentarios")
public class Comentario {

	private int id;
	private String comentario;
	private boolean permitirComentario;
	public void manterComentario() {

	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public boolean isPermitirComentario() {
        return permitirComentario;
    }

    public void setPermitirComentario(boolean permitirComentario) {
        this.permitirComentario = permitirComentario;
    }

}
