package hw16;

public class SimpleTree {

    private Node parent;

    SimpleTree() {
        parent = null;
    }

    public void addData(int data) {
        parent = addNode(parent, data);
    }

    public Node addNode(Node parent, int data) {
        if (parent == null) {
            parent = new Node(data);
            return parent;
        }
        if (data < parent.getData()) {
            parent.setLeft(addNode(parent.getLeft(), data));
        } else if (data >= parent.getData()) {
            parent.setRight(addNode(parent.getRight(), data));
        }
        return parent;
    }

    public void outputTree() {
        inorder(parent);
    }

    public void inorder(Node parent) {

        if (parent != null) {
            inorder(parent.getLeft());
            System.out.println(parent.getData());
            inorder(parent.getRight());
        }
    }

}


