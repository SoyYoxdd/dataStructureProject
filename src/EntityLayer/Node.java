package EntityLayer;

public class Node {
    private Medicine medicine;
    private Node leftNode;
    private Node RightNode;

    public Node(Medicine medicine) {
        this.medicine = medicine;
        this.leftNode = null;
        this.RightNode = null;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return RightNode;
    }

    public void setRightNode(Node RightNode) {
        this.RightNode = RightNode;
    }
    
    
}
