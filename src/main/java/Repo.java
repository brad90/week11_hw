import java.util.ArrayList;

public class Repo {

    private String repoName;
    private ArrayList<Commit> commits;


    public Repo(String repoName) {

        this.repoName = repoName;
        this.commits = new ArrayList<Commit>();
    }

    public String returnRepoName() {
        return this.repoName;
    }

    public int countNumberOfCommits() {
        return this.commits.size();
    }

    public void addCommitToRepo(Commit commit) {
        commit.giveCommitID();
        this.commits.add(commit);
    }

    public int returnCommitSearch(int searchNumber) {
        int found = 0;
        for (Commit commit : commits) {
            if (commit.returnID() == searchNumber) {
                found = commit.returnID();
                break;
            }
        }
        return found;

    }
}
