package BusinessLayer;

import EntityLayer.BinaryTree;
import EntityLayer.Medicine;
import EntityLayer.Node;

public class BLTour {

    private BinaryTree tree;

    public BLTour(BinaryTree tree) {
        this.tree = tree;
    }

    //Pre-orden
    public String preOrden() {
        StringBuilder sb = new StringBuilder();
        pre(tree.getRoot(), sb);
        return sb.toString().replaceAll(" - $", "");
    }

    private void pre(Node current, StringBuilder sb) {
        if (current != null) {
            sb.append(current.getMedicine().getID()).append(" - ");
            pre(current.getLeftNode(), sb);
            pre(current.getRightNode(), sb);
        }
    }

    //Pos-orden
    public String postOrden() {
        StringBuilder sb = new StringBuilder();
        post(tree.getRoot(), sb);
        return sb.toString().replaceAll(" - $", "");
    }

    private void post(Node current, StringBuilder sb) {
        if (current != null) {
            post(current.getLeftNode(), sb);
            post(current.getRightNode(), sb);
            sb.append(current.getMedicine().getID()).append(" - ");
        }
    }

    //In-orden
    public String inOrden() {
        StringBuilder sb = new StringBuilder();
        in(tree.getRoot(), sb);
        return sb.toString().replaceAll(" - $", "");
    }

    private void in(Node current, StringBuilder sb) {
        if (current != null) {
            in(current.getLeftNode(), sb);
            sb.append(current.getMedicine().getID()).append(" - ");
            in(current.getRightNode(), sb);
        }
    }

    //Number of nodes
    public int numberOfNodes() {
        return nOfNodes(tree.getRoot());
    }

    private int nOfNodes(Node current) {

        if (current == null) {
            return 0;
        }
        if (current.getLeftNode() != null || current.getRightNode() != null) {
            return 1 + nOfNodes(current.getLeftNode()) + nOfNodes(current.getRightNode());
        }
        return 0;
    }

    //Number of leaves
    public int numberOfLeaves() {
        return nOfLeaves(tree.getRoot());
    }

    private int nOfLeaves(Node current) {
        if (current == null) {
            return 0;
        }

        if (current.getLeftNode() == null && current.getRightNode() == null) {
            return 1;
        }
        return nOfLeaves(current.getLeftNode()) + nOfLeaves(current.getRightNode());
    }

    //Highest value
    public Medicine highestValue() {
        return highestValue(tree.getRoot());
    }

    private Medicine highestValue(Node current) {
        if (current == null) {
            return null;
        }

        Medicine left = highestValue(current.getLeftNode());
        Medicine right = highestValue(current.getRightNode());

        Medicine max = current.getMedicine();

        if (left != null && left.getPrice() * left.getAmount() > max.getPrice() * max.getAmount()) {
            max = left;
        }

        if (right != null && right.getPrice() * right.getAmount() > max.getPrice() * max.getAmount()) {
            max = right;
        }

        return max;
    }
}
