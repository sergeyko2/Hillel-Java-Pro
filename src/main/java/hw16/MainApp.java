package hw16;

public class MainApp {

    public static void main(String[] args) {
        SimpleTree myTree = new SimpleTree();
        myTree.addData(5);
        myTree.addData(6);
        myTree.addData(32);
        myTree.addData(4);
        myTree.addData(8);
        myTree.addData(47);
        myTree.addData(25);
        myTree.addData(13);
        myTree.addData(17);

        myTree.outputTree();

    }
}
