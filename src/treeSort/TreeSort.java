package treeSort;

public class TreeSort {

    public static void main(String... args) {
        Tree myTree;
        myTree = new Tree(8);
        myTree.insert(new Tree(3));
        myTree.insert(new Tree(12));
        myTree.traverse(new KeyPrinter());

    }

}
