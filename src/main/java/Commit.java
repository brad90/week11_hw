import java.text.SimpleDateFormat;

public class Commit {


    private String description;
    private SimpleDateFormat date;
    private int id;


    public Commit(String description) {
        this.description = description;
        this.date = new SimpleDateFormat("yyyy-MM-dd");
        this.id = 1;
    }


    public String returnDescription(){
        return this.description;
    }


    public SimpleDateFormat returnDate() {
        return this.date;
    }

    public int returnID(){
        return this.id;
    }

    public void giveCommitID() {
        this.id += 1;
    }
}