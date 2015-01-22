package u2;

import de.beuth.algorithmen.sortierung.HeapSort;
import de.beuth.algorithmen.storage.Sortrunner;
import de.beuth.algorithmen.storage.Storage;

/**
 * Created by Brunhilde on 23.10.14.
 */
public class Test {
    public static void main(String[] args) {
        Storage.setDelay(20);
        Sortrunner.runSorting(new HeapSort(), 64, 5);
    }
}
