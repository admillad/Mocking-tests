package caw.atm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.function.Executable;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BankomatTest {

    IBank bankMock;
    Bankomat bankomat;
    User currentUser;

    public BankomatTest() {
    }

    @BeforeEach
    public void setUp() {
        bankMock = mock(IBank.class);
        bankomat = new Bankomat(bankMock);

        List<User> bankUsers = new LinkedList<>();
        List<Account> user1Accounts = new ArrayList<>();
        user1Accounts.add(new Account("123456", 11));
        user1Accounts.add(new Account("987654", 12));
        User user1 = new User("SuneMotorbåt", "Password", user1Accounts);
        bankUsers.add(user1);
        List<Account> user2Accounts = new ArrayList<>();
        user2Accounts.add(new Account("45753", 101));
        user2Accounts.add(new Account("455543", 102));
        User user2 = new User("KalleSvensson", "Password", user2Accounts);
        bankUsers.add(user2);

        when(bankMock.getUsers()).thenReturn(bankUsers);

    }

    
    
}
