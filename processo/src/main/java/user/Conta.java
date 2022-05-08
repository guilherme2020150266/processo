package user;

public class Conta {
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }


    public void depositoEmConta(double valorDeposito) {
          this.saldo += valorDeposito;

    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean debitoEmConta(double valordebito) {
        if (this.saldo >= valordebito) {
            this.saldo -= valordebito;
            return true;
        }
        return false;
    }
}
