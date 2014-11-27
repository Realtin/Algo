package u2;

import de.beuth.algorithmen.storage.Storage;

/**
 * Created by Brunhilde on 06.11.14.
 */
public class QuickSort {
    public void sort(Storage storage) {
        int a = 0;

        while (a < storage.length()) {
            int pivot = storage.get(a);
            int num_smaller_than_pivot = 0;
            for (int i = 0; i < storage.length(); i++) {
                if ((Storage.inRelation(storage.get(i), pivot))) {
                    num_smaller_than_pivot += 1;
                }
            }
            int pivot_pos = num_smaller_than_pivot;
            int zwischenspeicher = storage.get(pivot_pos);
            storage.set(pivot_pos, pivot);
            pivot = zwischenspeicher;

            //alle num kleiner pivot, auf die linke seite
            for (int i = 0; i < pivot_pos; i++) {
                if (storage.get(i) > pivot) {
                    int bigger_than_pivot = storage.get(i);
                    for (int j = pivot_pos + 1; j < storage.length(); j++) {
                        if (storage.get(j) < pivot) {
                            int smaller_than_pivot = storage.get(j);
                            storage.set(j, bigger_than_pivot);
                            storage.set(i, smaller_than_pivot);
                            break;
                        }

                    }
                }
            }


            a++;
        }


    }

}
