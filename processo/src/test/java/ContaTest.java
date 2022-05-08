import org.junit.Assert;
import org.junit.Test;
import user.Conta;



public class ContaTest {

    @Test
    public void depositoEmContaTest(){
        Conta conta = new Conta();
        conta.depositoEmConta(60.0);
        Assert.assertEquals(60.0, conta.getSaldo(), 0.0);
    }

    @Test
    public void debitoEmContaTest(){
        Conta conta = new Conta();
        conta.depositoEmConta(50.0);
        Assert.assertTrue(conta.debitoEmConta(50.0));

    }


}
