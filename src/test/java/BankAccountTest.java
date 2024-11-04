import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    public void testCreateBankAccountWithInitialBalanceAndTitular() {
        // Arrange
        String titular = "Peter";
        double initialBalance = 0;

        // Act
        BankAccount account = new BankAccount(titular, initialBalance);

        // Assert
        assertEquals(titular, account.getTitular(), "The account holder name should be correct");
        assertEquals(initialBalance, account.getBalance(), "The initial balance should be set correctly");
        System.out.println("TestCreateBankAccount is Ok!");
    }
}