package tree;

/**
 * Created by Brunhilde on 22.01.15.
 */
public class TreeTest {

    public static void main(String[] args) {
        TreeNode test = new TreeNode(new StringKeyAble("j"));
        StringKeyAble a = new StringKeyAble("a");
        StringKeyAble z = new StringKeyAble("z");
        StringKeyAble c = new StringKeyAble("c");
        StringKeyAble l = new StringKeyAble("l");
        StringKeyAble t = new StringKeyAble("t");
        StringKeyAble b = new StringKeyAble("b");
        StringKeyAble y = new StringKeyAble("y");

        test.insertBelow(a);
        test.insertBelow(c);
        test.insertBelow(z);
        test.insertBelow(l);
        test.insertBelow(t);
        test.insertBelow(b);
        test.insertBelow(y);

        System.out.println(test.toString());
        System.out.println("\nContent of TreeNode test: " + test.getContent() + " Key: " + test.getContent().getKey());
        System.out.println("Content of test.getLeft: " + test.getLeft().getContent() + " Key: " + test.getLeft().getContent().getKey());
        System.out.println("Content of test.getRight: " + test.getRight().getContent() + " Key: " + test.getRight().getContent().getKey());
        System.out.println("Minimum of TreeNode test " + test.getMinimum() + " Key: " + test.getMinimum().getKey());
        System.out.println("Maximum of TreeNode test " + test.getMaximum() + " Key: " + test.getMaximum().getKey());
        System.out.println("Contains a " + test.contains(a));
        System.out.println("Contains y " + test.contains(y));


    }
}
