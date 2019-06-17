import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    Commit commit;

    @Before
    public void before(){
        commit = new Commit("Added button to the front page");
    }

    @Test
    public void commitHasADescription(){
        assertEquals("Added button to the front page", commit.returnDescription());
    }

    @Test
    public void returnTheCommitDate(){
        assertEquals(new SimpleDateFormat("yyyy-MM-dd"), commit.returnDate());
    }

    @Test
    public void returnTheCommitID(){
        assertEquals(1, commit.returnID());
    }

}
