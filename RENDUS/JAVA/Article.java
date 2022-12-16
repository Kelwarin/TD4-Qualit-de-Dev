import java.util.Objects;

public class Article {
    private int numArticle;
    private String description;
    private double prix;

    public int getNumArticle() {
        return numArticle;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public Article(int numArticle) {
        this.numArticle = numArticle;
    }

    public Article(int numArticle, String description, double prix) {
        this.numArticle = numArticle;
        this.description = description;
        this.prix = prix;
    }
}
