package u2;

import de.beuth.algorithmen.storage.Storage;

/**
 * Created by Brunhilde on 06.11.14.
 */
public class InsertionSort {
    public void sort(Storage storage) {

        // array length
        int a = storage.length();
        // smallest value
        int b;
        for (int i = 0; i < a; i++) {
            b = storage.get(i);
            for (int j = 0; j < a; j++) {
                if (Storage.inRelation(b, storage.get(j))) {
                    b = storage.get(j);
                    // schiebe a[j] - a[i-1] eins nach rechts
                    for (int k = j; k > i; k--) {
                        storage.set(j, storage.get(j - 1));
                    }
                    //setze a[i] = b
                    storage.set(i, b);
                }

            }
        }
    }
}
