import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test_eCommerce {
    public static void main(String[] args) {
        ArrayList<Article> allArticles = new ArrayList<>();
        ArrayList<Motif> allMotifs = new ArrayList<>();
        ArrayList<Transaction> allTransactions = new ArrayList<>();
        String str;
        for (int i = 0; i < 129; i++) {
            Article a = new Article(i);
            allArticles.add(a);
        }
        try {
            String line;
            String car;
            FileInputStream file = new FileInputStream("ecommerceProxyEtud/data/ecommerce.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                Scanner sc = new Scanner(line);
                ArrayList<Article> articlesTransaction = new ArrayList<>();
                while (sc.hasNextLine()) {
                    car = sc.next();
                    articlesTransaction.add(allArticles.get(Integer.parseInt(car)));
                }
                Transaction t = new Transaction(articlesTransaction);
                allTransactions.add(t);
                sc.close();
            }
            scanner.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }

        Dataset dataset = Dataset.getInstance();
        dataset.addTransaction(allTransactions);

        try {
            String line;
            String car;
            FileInputStream file = new FileInputStream("ecommerceProxyEtud/data/motifs1.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                Scanner sc = new Scanner(line);
                ArrayList<Article> articlesMotif = new ArrayList<>();
                while (sc.hasNextLine()) {
                    car = sc.next();
                    articlesMotif.add(allArticles.get(Integer.parseInt(car)));
                }
                Motif m = new Motif(articlesMotif);
                allMotifs.add(m);
                sc.close();
            }
            scanner.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }


        for(Motif m : allMotifs){
            str = "";
            for (Article a: m.getArticles()){
                str += a.getNumArticle() + ", ";
            }
            str = str.substring(0, str.length()-1);
            str = str.substring(0, str.length()-1);
            System.out.println("Fréquence motif {" + str + "} = " + m.freq()*100 + "%");
            System.out.println("Est Fréquent : " + m.isFreq() + "\n");
        }
    }
}
