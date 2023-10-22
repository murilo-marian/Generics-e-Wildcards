package exercicio03;

import java.time.LocalDate;

public class Arroz extends ProdutoX{
    private LocalDate vencimento;

    public LocalDate getVencimento() {
        return vencimento;
    }

    public void setVencimento(LocalDate vencimento) {
        this.vencimento = vencimento;
    }
}
