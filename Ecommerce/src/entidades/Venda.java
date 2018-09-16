package entidades;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="estados")
public class Venda {

	private int int;
	private int parcelas;
	private String numeroCartao;
	private String agenciaBancaria;
	private char tipoPagamento;
	private String observacoes;

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getAgenciaBancaria() {
        return agenciaBancaria;
    }

    public void setAgenciaBancaria(String agenciaBancaria) {
        this.agenciaBancaria = agenciaBancaria;
    }

    public char getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(char tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
	private Date dataVenda;
	private Date dataEntrega;
	public void manterVenda() {

	}

}
