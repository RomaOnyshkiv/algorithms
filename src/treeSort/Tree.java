package treeSort;

class Tree {

    private Tree left;
    private Tree right;
    int key;

    Tree(int key) {
        this.key = key;
    }

    void insert(Tree aTree) {
        if (aTree.key < key) {
            if (left != null)
                left.insert(aTree);
             else
                 left = aTree;
        } else {
            if (right != null)
                right.insert(aTree);
            else
                right = aTree;
        }
    }

    void traverse(TreeVisitor visitor) {

        if (left != null)
            visitor.visit(left);

        visitor.visit(this);

        if (right != null)
            visitor.visit(right);

    }



}
