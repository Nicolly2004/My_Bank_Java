public class Conta {

    //encapsulamento - transforma os aributos de uma classe em privado, e são vistos ou alterados atravéz de getter e setter.
    //atributos do tipo protected podem acessar a si
   //polimorfismo(muitas formas ) sobrecarregar um método

    protected double saldo;
    protected int conta;
    protected int agencia;


















    public Conta(int conta, int agencia){
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = 0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getConta(){
        return conta;
    }
    public void setConta(int conta){
        this.conta = conta;
    }

    public int getAgencia(){
        return agencia;
    }
    public void setAgencia(int agencia){
        this.agencia = agencia;
    }
    public void sacarValor (double valorSaque){
        if(valorSaque > this.saldo){
            return;
        }
        this.saldo = this.saldo - valorSaque;

    }

    public void depositar(double valorDeposito){
        this.saldo = this.saldo + valorDeposito;

    }

    @Override
    public String toString(){
        return "Conta{"+"Saldo" + " = " + saldo + ", conta = " + conta + ", agencia = " + agencia + "}";


    }
}