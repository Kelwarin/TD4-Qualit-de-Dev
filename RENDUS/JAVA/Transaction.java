import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Transaction {
    private String numClient;
    protected ArrayList<Article> articles;

    public String getNumClient() {
        return numClient;
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public Transaction(ArrayList<Article> articles) {
        this.articles = articles;
    }

    public Transaction(String numClient, ArrayList<Article> articles) {
        this.numClient = numClient;
        this.articles = articles;
    }

    public Transaction(Article[] m){
        articles = new ArrayList<>(Arrays.asList(m));
    }
}

