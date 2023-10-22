package exercicio02;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Produto<T> {
    private T id;
    private float valor;
    private LocalDateTime dataFabricacao;
    private LocalDate dataVencimento;


    public Produto() {
    }



    public Produto(T id, float valor, LocalDateTime dataFabricacao, LocalDate dataVencimento) {
        this.id = id;
        this.valor = valor;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDateTime dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("id=").append(id);
        sb.append(", valor=").append(valor);
        sb.append(", dataFabricacao=").append(dataFabricacao);
        sb.append(", dataVencimento=").append(dataVencimento);
        sb.append('}');
        return sb.toString();
    }
}
