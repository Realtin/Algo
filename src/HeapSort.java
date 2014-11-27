import de.beuth.algorithmen.storage.Storage;

/**
 * Created by Brunhilde on 06.11.14.
 */
public class HeapSort {

    public void sort(Storage storage) {

        int i = 0;
        while (i < storage.length()) {
//            int links = storage.get(2*i);
//            int rechts = storage.get(2*i + 1);
            int links = 2 * i;
            int rechts = 2 * i + 1;
            heapify(storage, links, rechts);
            i++;
        }
    }

    public void heapify(Storage storage, int links, int rechts) {
        int k = 2 * links;
        int zw;

        //prüfen ob schon eine Heap-Form besteht
        if (storage.get(k) <= storage.get(rechts)) {
            //nur einer der beiden Nachfolger ist innherlab des Teilbereichs
            if (storage.get(k + 1) > storage.get(rechts)) {
                //tausche aus
                if (storage.get(k) < storage.get(links)) {
                    zw = storage.get(k);
                    storage.set(k, storage.get(links));
                    storage.set(links, zw);
                }
            } else if (storage.get(k) > storage.get(k + 1)) {
                k++;
            } else if (storage.get(links) > storage.get(k)) {
                zw = storage.get(k);
                storage.set(k, storage.get(links));
                storage.set(links, zw);
                heapify(storage, k, rechts);
            }

        }

    }
}
