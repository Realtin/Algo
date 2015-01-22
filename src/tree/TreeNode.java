package tree;

/**
 * Created by Brunhilde on 27.11.14.
 */

public class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private KeyAble content;


    public TreeNode(KeyAble value) {
        left = null;
        right = null;
        content = value;
    }

    public TreeNode getLeft() {
        return left;
    }


    public TreeNode getRight() {
        return right;
    }

    public KeyAble getContent() {
        return content;
    }


    /**
     * Diese Methode fügt den Wert v in einem neuen Knoten
     * unter diesem Knoten ein. Dabei wird die Methode
     * {@link KeyAble#getKey()} von v befragt um herauszufinden
     * wo im Baum unter diesem Knoten der neue Knoten eingefügt
     * werden soll.
     * <p/>
     * Der Baum soll dabei nach der Größe der der entsprechenden
     * Schlüssel sortiert sein.
     *
     * @param v Der einzufügende Wert.
     */
    public void insertBelow(KeyAble v) {
        if (v.getKey() < this.getContent().getKey()) {
            if (this.getLeft() == null) {
                left = new TreeNode(v);
            } else {
                left.insertBelow(v);
            }
        } else if (v.getKey() > this.getContent().getKey()) {
            if (this.getRight() == null) {
                right = new TreeNode(v);
            } else {
                right.insertBelow(v);
            }
        }
    }


    /**
     * @return Den Wert mit dem größten Schlüssel im Baum unter
     * diesem Knoten.
     */
    public KeyAble getMaximum() {
        TreeNode x = this;
        while (x.getRight() != null) {
            x = x.getRight();
        }
        return x.getContent();
    }

    /**
     * @return Den Wert mit dem kleinsten Schlüssel im Baum unter
     * diesem Knoten.
     */
    public KeyAble getMinimum() {
        TreeNode x = this;
        while (x.getLeft() != null) {
            x = x.getLeft();
        }
        return x.getContent();
    }


    /**
     * @param x Ein Objekt, das möglicherweise im Baum unter diesem
     *          Knoten zu finden ist.
     * @return Falls x im Teilbaum unter diesem Baum zu finden ist, liefert
     * die Methode das Element des Baums zurück, das den nächstgrößeren
     * Schlüssel besitzt.
     * Ist x nicht im Teilbaum unter diesem Baum oder besitzt x
     * keinen Nachfolger im Baum, so wird null zurückgegeben.
     */
    public KeyAble getNachfolgerVon(KeyAble x) {
        TreeNode node = this;

        while (node.getContent().getKey() != x.getKey()) {
            if (x.getKey() < node.getContent().getKey()) {
                node = node.getLeft();
            } else {
                node = node.getRight();
            }
            if (node == null) {
                return null;
            }
        }
        return node.getMaximum();
    }


    /**
     * @param x Ein Objekt, das möglicherweise im Baum unter diesem
     *          Knoten zu finden ist.
     * @return Falls x im Teilbaum unter diesem Baum zu finden ist, liefert
     * die Methode das Element des Baums zurück, das den nächstkleineren
     * Schlüssel besitzt.
     * Ist x nicht im Teilbaum unter diesem Baum oder besitzt x
     * keinen Vorgaenger im Baum, so wird null zurückgegeben.
     */
    public KeyAble getVorgaengerVon(KeyAble x) {
        TreeNode node = this;

        while (node.getContent().getKey() != x.getKey()) {
            if (x.getKey() < node.getContent().getKey()) {
                node = node.getLeft();
            } else {
                node = node.getRight();
            }
            if (node == null) {
                return null;
            }
        }
        return node.getMinimum();
    }


    /**
     * @param x Ein Objekt, nach dem in dem Baum unter diesem Knoten gesucht
     *          werden soll.
     * @return True genau dann, wenn sich x im Baum unter diesem Knoten befindet.
     */
    public boolean contains(KeyAble x) {
        TreeNode node = this;
        while (node.getContent().getKey() != x.getKey()) {
            if (x.getKey() < node.getContent().getKey()) {
                node = node.getLeft();
            } else {
                node = node.getRight();
            }
            if (node == null) {
                return false;
            }
        }
        return true;
    }


    /**
     * Liefert eine String-Codierung des Baums unter diesem Knoten. Ein Baum
     * soll dabei wie in der Vorlesung codiert werden:
     * <p/>
     * Einem Knoten ohne Kinder würde also z.B. von dieser Methode der String
     * (c: null, null) zugewiesen, wobei c aber der content des Knotens ist.
     * <p/>
     * Beispielsweise wäre (a: (b: null, null), (c: null, null)) die String-Repräsentation
     * eines Baums mit dem Wurzelknoten a, der die beiden Knoten b und c als Kinder
     * besitzt. b und c hätten in diesem Beispiel keine Kinder.
     */
    public String toString() {
        String right = "null";
        String left = "null";
        if (this.getRight() != null) {
            right = this.getRight().toString();
        }
        if (this.getLeft() != null) {
            left = this.getLeft().toString();
        }

        return "(" + this.getContent() + ": " + String.valueOf(left) + " " + String.valueOf(right) + " )";
    }

}