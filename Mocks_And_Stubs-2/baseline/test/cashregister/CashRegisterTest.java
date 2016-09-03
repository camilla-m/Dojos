package cashregister;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CashRegisterTest {

    @Mock
    private Printer printer;

    @Mock
    private Purchase purchase;

    @InjectMocks
    private CashRegister cashRegister;


    @Test
    public void shouldNotPrintWhenNothingPurchase() throws Exception {
        when(purchase.asString()).thenReturn("");
        cashRegister.process(purchase);
        verify(printer).print("");
    }

    @Test
    public void shouldPrintOneItemInformationWhenPurchaseOneItems() throws Exception {
        when(purchase.asString()).thenReturn("OneItem");
        cashRegister.process(purchase);

        verify(printer).print("OneItem");
    }
}