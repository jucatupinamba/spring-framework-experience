package app.servicos;

public class ServicoPagamento {

    private TaxaDeServico taxaDeServico;

    private ServicoEntrega servicoEntrega;

    public ServicoPagamento(TaxaDeServico taxaDeServico, ServicoEntrega servicoEntrega){
        this.taxaDeServico = taxaDeServico;             //injeção de dependencia por meio  do construtor
        this.servicoEntrega = servicoEntrega;
    }

    public double precoFinal(double custo, String estado){
        return custo + servicoEntrega.entrega(estado) + taxaDeServico.taxa(custo);
    }
}
