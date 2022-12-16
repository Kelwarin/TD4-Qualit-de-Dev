import java.util.ArrayList;
import java.util.Arrays;

public class Dataset {
    private int id;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private static Dataset single_instance = null;

    private Dataset(){
        this.id = 0;
    }

    public static Dataset getInstance(){
        if(single_instance == null){
            single_instance = new Dataset();
        }
        return single_instance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction[] t){
        ArrayList<Transaction> tr = new ArrayList<>(Arrays.asList(t));
        transactions.addAll(tr);
    }

    public void addTransaction(ArrayList<Transaction> tr){
        transactions.addAll(tr);
    }
}
