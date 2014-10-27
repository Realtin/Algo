import de.beuth.algorithmen.storage.SortingAlgorithm;
import de.beuth.algorithmen.storage.Sortrunner;
import de.beuth.algorithmen.storage.Storage;

/**
 * Created by Brunhilde on 23.10.14.
 */
public class BubbleSort implements SortingAlgorithm {

    public void sort(Storage storage) {
        int m = (storage.length() - 1);
        while (m > 0) {
            for (int i = 0; i < m; i++) {
                if (Storage.inRelation(storage.get(i), storage.get(i + 1))) {
                    int zwspeicher = storage.get(i);
                    //tauschen
                    storage.set(i, storage.get(i + 1));
                    storage.set(i + 1, zwspeicher);
                }

            }
            m = m - 1;
        }
    }
}


