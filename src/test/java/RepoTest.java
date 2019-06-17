import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepoTest {

    Repo repo;
    Commit commit1;
    Commit commit2;


    @Before
    public void before(){
        repo = new Repo("Making git hub");
    }

    @Test
    public void repoHasName(){
        assertEquals("Making git hub", repo.returnRepoName());
    }

    @Test
    public void repoHas0Commits(){
        assertEquals(0, repo.countNumberOfCommits());
    }

    @Test
    public void repoHas1Commit(){
        commit1 = new Commit("updated the front end");
        repo.addCommitToRepo(commit1);
        assertEquals(1, repo.countNumberOfCommits());
    }

    @Test
    public void reposHas2Commits(){
        commit1 = new Commit("updated the front end");
        repo.addCommitToRepo(commit1);
        commit2 = new Commit("updated the front end");
        repo.addCommitToRepo(commit2);
        assertEquals(2, repo.countNumberOfCommits());

    }

    @Test
    public void findCommitByID(){
        commit1 = new Commit("updated the front end");
        repo.addCommitToRepo(commit1);
        commit2 = new Commit("updated the front end");
        repo.addCommitToRepo(commit2);
        assertEquals(2, repo.returnCommitSearch(2));
    }



}
