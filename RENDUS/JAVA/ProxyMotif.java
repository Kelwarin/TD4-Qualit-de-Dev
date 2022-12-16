import java.util.HashMap;
import java.util.Map;

public class ProxyMotif implements IMotif{
    private static Map<Motif, Boolean> cache = new HashMap<>();
    private Motif motif;

    public ProxyMotif(Motif motif){
        this.motif = motif;
    }

    public boolean isFreq() {
        for (Motif m : cache.keySet()) {
            if (m.articles.containsAll(motif.articles)) {
                if (cache.get(m)) {
                    return true;
                }
            } else if (motif.articles.containsAll(m.articles)) {
                if (!cache.get(m)) {
                    return false;
                }
            }
        }
        cache.put(motif, motif.isFreq());
        return cache.get(motif);
    }
}
