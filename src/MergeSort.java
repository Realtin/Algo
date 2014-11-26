import de.beuth.algorithmen.storage.Storage;

/**
 * Created by Brunhilde on 06.11.14.
 */
public class MergeSort {

    public void sort(Storage storage) {

        //split in half
        Storage leftStorage = new Storage((storage.length() / 2));
        Storage rightStorage = new Storage((storage.length() / 2));

        // sort both halfs
        leftStorage = bubbleSort(leftStorage);
        rightStorage = bubbleSort(rightStorage);

        int ls = 0;
        int rs = 0;

        //merge both halfs together
        while (ls < leftStorage.length() || rs < rightStorage.length()) {
            if (leftStorage.get(ls) <= rightStorage.get(rs)) {
                storage.set((ls + rs), leftStorage.get(ls));
                ls++;
            } else {
                storage.set((ls + rs), leftStorage.get(rs));
                rs++;
            }
        }

    }

    public Storage bubbleSort(Storage storage) {
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
        return storage;
    }
}
