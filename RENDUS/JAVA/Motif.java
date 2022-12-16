import java.util.*;

public class Motif extends Transaction implements IMotif{

    public Motif(ArrayList<Article> articles) {
        super(articles);
    }

    public Motif(Article[] m){
        super(m);
    }
    public float freq() {
        float nbTransaction = 0;
        for (Transaction transaction : Dataset.getInstance().getTransactions()) {
            if(transaction.getArticles().containsAll(this.articles)) {
                nbTransaction++;
            }
        }
        return nbTransaction / Dataset.getInstance().getTransactions().size();
    }

    public boolean isFreq(){
        return this.freq() >= 0.5;
    }
}