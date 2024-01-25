public class ContaInvestimento extends Conta implements ContaInvestimentoInterface{
 // a classe primeiro extende e depois implementa
    protected TipoContas tipo;
    protected int valorAplicado;

    public ContaInvestimento(int agencia, int conta){
        super(conta, agencia);
        this.tipo = TipoContas.CONTA_INVESTIMENTO;
    }

    public void depositar(int valorDeposito){
        this.valorAplicado = valorDeposito;
    }

    @Override
    public String toString() {
        return "ContaInvestimo{" +
                "tipo = '" + tipo + '\'' +
                ", valorAplicado = " + valorAplicado +
                ", saldo = " + saldo +
                ", conta = " + conta +
                ", agencia = " + agencia +
                '}';
    }


}
