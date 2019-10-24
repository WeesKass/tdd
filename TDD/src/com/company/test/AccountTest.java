import com.company.main.Account;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTest {


    Account account = new Account(1213, 0.0413);

    @Test
    public void getBalanceTest(){
        assertEquals(0.0413, account.getBalance(), 0.2);
    }


    @Test
    public void getAccountNumberTest(){
        assertEquals(1213, account.getAccountNumber(), 0);
    }

    @Test
    public void setBalanceTest(){
        account.setBalance(0.12313);
        assertEquals(0.12313, account.getBalance(), 0.2);
    }

    @Test
    public void setAccountNumberTest(){
        account.setAccountNumber(12313);
        assertEquals(12313, account.getAccountNumber(), 0);
    }

    @Test
    public void creditsTest(){
        account.setBalance(123.22);
        account.credits(1231.32);
        assertEquals(1354.54, account.getBalance(), 0.2 );
    }

    @Test
    public void packageNameTest(){
        assertEquals("com.company.main", account.getClass().getPackageName());
    }

    @Test
    public void debitTest(){
        account.setBalance(122.0);
        account.debit(1.2);
        assertEquals(120.8, account.getBalance(),0.2 );
    }

    @Test
    public void printTest(){
        account.setBalance(123.22);
        account.setAccountNumber(1);
        assertEquals("AccountNumber: 1, Balance: 123.22", account.print());
    }
}