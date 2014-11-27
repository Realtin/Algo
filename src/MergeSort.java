import de.beuth.algorithmen.storage.Storage;

/**
 * Created by Brunhilde on 06.11.14.
 */
public class MergeSort {

    public void sort(Storage storage) {
        merge(storage);
    }

    public Storage merge(Storage storage) {
        //split in half
        Storage leftStorage = new Storage((storage.length() / 2));
        Storage rightStorage = new Storage((storage.length() / 2));

        // sort both halfs
        leftStorage = merge(leftStorage);
        rightStorage = merge(rightStorage);

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
        return storage;
    }
}