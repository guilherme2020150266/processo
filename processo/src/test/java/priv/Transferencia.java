package priv;

import priv.exception.SaldoInsuficienteException;
import user.Conta;

public class Transferencia {


    public void realizarTransferencia(Conta origem, Conta destino, double valor) throws SaldoInsuficienteException {
       if(origem.debitoEmConta(valor)){
          destino.depositoEmConta(valor);
       }else{
           throw new SaldoInsuficienteException("Saldo Insuficiente");
       }
    }
}
