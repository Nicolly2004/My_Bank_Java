public class ContaCorrente extends Conta {

 //herança - (extends) herdar caracteristicas da classe Conta
 //método super reconhce todas as assinaturas disponíveis para a classe pai
    protected String tipo;

    public ContaCorrente(int agencia, int conta){
         super(conta,agencia);
         this.tipo = "Conta-Corrente";
         this.saldo = 0.1;
    }

    public void sacarValor(double valorSaque){
        super.sacarValor(valorSaque);
        this.saldo = this.saldo - 8.90;
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "tipo='" + tipo + '\'' +
                ", saldo=" + saldo +
                ", conta=" + conta +
                ", agencia=" + agencia +
                '}';
    }
}
