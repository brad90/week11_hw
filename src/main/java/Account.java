import java.util.ArrayList;

public class Account {


    private String username;
    private String name;
    private ArrayList<Repo> accountRepo;
    private String accountType;



    public Account(String username, String name, String accountType){
        this.username = username;
        this.name = name;
        this.accountRepo = new ArrayList<Repo>();
        this.accountType = accountType;
    }


    public String doesAccountHaveName() {
        return this.name;
    }

    public String doesAccountHaveUserName() {
        return this.username;
    }

    public String whatIsTheAccountType() {
        return this.accountType;
    }

    public int howManyReposInAccount() {
        return this.accountRepo.size();
    }

    public void upgradeAccount() {
        this.accountType = "Paid";
    }

    public void addRepoToAccount(Repo repo) {
        this.accountRepo.add(repo);
    }


}
