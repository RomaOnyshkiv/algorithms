package treeSort;

public interface TreeVisitor {

    default void visit(Tree node) {
        System.out.print(" " + node.key);
    }

}
