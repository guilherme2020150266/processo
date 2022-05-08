package priv;

import org.junit.Assert;
import org.junit.Test;
import priv.exception.SaldoInsuficienteException;
import user.Conta;

public class TransferenciaTest {

    @Test
    public void esperaTrueParaTtransferenciaTest() throws SaldoInsuficienteException {
        Conta origem = new Conta();
        origem.depositoEmConta(100.0);
        Conta destino = new Conta();
        Transferencia transferencia = new Transferencia();
        double saldoInicial = origem.getSaldo();
        double valor = 50.0;

        transferencia.realizarTransferencia(origem, destino, valor);
        double saldoFinal = saldoInicial - valor;

        Assert.assertEquals(saldoInicial - valor, origem.getSaldo(), 0.0);

    }

    @Test(expected = SaldoInsuficienteException.class)
    public void esperaFalseParaTransferenciaTest() throws SaldoInsuficienteException {
        Conta origem = new Conta();
        origem.depositoEmConta(100.0);
        Conta destino = new Conta();
        Transferencia transferencia = new Transferencia();
        double saldoInicial = origem.getSaldo();
        double valor = 150.0;

        transferencia.realizarTransferencia(origem, destino, valor);
        double saldoFinal = saldoInicial - valor;

        Assert.assertEquals(saldoInicial , origem.getSaldo(), 0.0);

    }
}
