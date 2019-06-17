import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccountTest {

    Account account;
    Repo repo1;
    Repo repo2;


    @Before
    public void before(){
        repo1 = new Repo("making git hub");
        repo2 = new Repo("building stock app");
        account = new Account("brad90", "Stephen","free" );
    }


    @Test
    public void doesAccountHaveUsername(){
        assertEquals("brad90", account.doesAccountHaveUserName() );
    }

    @Test
    public void doesAccountHaveName(){
        assertEquals("Stephen", account.doesAccountHaveName());
    }

    @Test
    public void whatIsTheAccountsType(){
        assertEquals("free", account.whatIsTheAccountType());
    }

    @Test
    public void doesAccountHaveAnyRepos(){
        assertEquals(0, account.howManyReposInAccount() );
    }

    @Test
    public void addRepoToAccount(){
        account.addRepoToAccount(repo1);
        assertEquals(1, account.howManyReposInAccount());
    }

    @Test
    public void addRepoToAccountTwoINstances(){
        account.addRepoToAccount(repo1);
        account.addRepoToAccount(repo2);
        assertEquals(2, account.howManyReposInAccount());
    }

    @Test
    public void accountShouldUpgrade(){
        account.upgradeAccount();
        assertEquals("Paid", account.whatIsTheAccountType());
    }



}
