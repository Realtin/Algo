import de.beuth.algorithmen.sortierung.InsertionSort;
import de.beuth.algorithmen.storage.Sortrunner;

/**
 * Created by Brunhilde on 23.10.14.
 */
public class Test {
    public static void main(String[] args){
        Sortrunner.runSorting(new InsertionSort(), 10000, 0);
    }
}
