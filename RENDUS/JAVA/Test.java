import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Article A = new Article(1);
        Article B = new Article(2);
        Article C = new Article(3);
        Article D = new Article(4);
        Article E = new Article(5);

        Article[] l1 = {A, B, C, D};
        ArrayList<Article> tr1 = new ArrayList<>(Arrays.asList(l1));
        Transaction t1 = new Transaction("t1", tr1);

        Article[] l2 = {B, C, E};
        ArrayList<Article> tr2 = new ArrayList<>(Arrays.asList(l2));
        Transaction t2 = new Transaction("t2", tr2);

        Article[] l3 = {A, B, C, E};
        ArrayList<Article> tr3 = new ArrayList<>(Arrays.asList(l3));
        Transaction t3 = new Transaction("t3", tr3);

        Article[] l4 = {B, E};
        ArrayList<Article> tr4 = new ArrayList<>(Arrays.asList(l4));
        Transaction t4 = new Transaction("t4", tr4);

        Dataset dataset = Dataset.getInstance();
        Transaction[] t = {t1, t2, t3, t4};
        dataset.addTransaction(t);

        Article[] m1 = {B,E};
        Article[] m2 = {B};
        Article[] m3 = {E};
        Article[] m4 = {A, B, C};
        Article[] m5 = {A, B};
        Article[] m6 = {A, B, C};
        Article[] m7 = {A, C};
        Article[] m8 = {B, C};
        Article[] m9 = {A};
        Article[] m10 = {C};
        Article[] m11 = {D};
        Article[] m12 = {A, D};
        Article[] m13 = {B, D};
        Article[] m14 = {C, D};
        Article[] m15 = {B, C, D};
        Article[] m16 = {A, C, D};
        Article[] m17 = {A, B, C, D};

        ArrayList<Motif> motifs = new ArrayList<>();

        Motif motif1 = new Motif(m1);
        motifs.add(motif1);
        Motif motif2 = new Motif(m2);
        motifs.add(motif2);
        Motif motif3 = new Motif(m3);
        motifs.add(motif3);
        Motif motif4 = new Motif(m4);
        motifs.add(motif4);
        Motif motif5 = new Motif(m5);
        motifs.add(motif5);
        Motif motif6 = new Motif(m6);
        motifs.add(motif6);
        Motif motif7 = new Motif(m7);
        motifs.add(motif7);
        Motif motif8 = new Motif(m8);
        motifs.add(motif8);
        Motif motif9 = new Motif(m9);
        motifs.add(motif9);
        Motif motif10 = new Motif(m10);
        motifs.add(motif10);
        Motif motif11 = new Motif(m11);
        motifs.add(motif11);
        Motif motif12 = new Motif(m12);
        motifs.add(motif12);
        Motif motif13 = new Motif(m13);
        motifs.add(motif13);
        Motif motif14 = new Motif(m14);
        motifs.add(motif14);
        Motif motif15 = new Motif(m15);
        motifs.add(motif15);
        Motif motif16 = new Motif(m16);
        motifs.add(motif16);
        Motif motif17 = new Motif(m17);
        motifs.add(motif17);

        int nbM = 1;
        for(Motif m: motifs){
            char[] lettre = {'A', 'B', 'C', 'D', 'E'};
            String str = "";
            for (Article a: m.getArticles()){
                str += lettre[a.getNumArticle()-1];
            }
            nbM++;
            System.out.println("Fréquence motif {" + str + "} = " + m.freq()*100 + "%");
            System.out.println("Est Fréquent : " + m.isFreq() + "\n");
        }
    }
}