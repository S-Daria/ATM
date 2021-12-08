import ATM.ATM;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class testATM {
    ATM atm;

    @Before
    public void init() {
        atm = new ATM();
    }

    @Test
    public void builderTest() {
        Assert.assertEquals(atm.process(120), 6);
    }
}
