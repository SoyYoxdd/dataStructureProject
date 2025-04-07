package BusinessLayer;

import EntityLayer.BinaryTree;
import EntityLayer.Medicine;
import EntityLayer.Node;
import javax.swing.JOptionPane;

public class BLInsertNode {

    private static BinaryTree binaryTree = new BinaryTree();

    public void insert(Medicine medicine) {
        if(!checkFields(medicine)) {
            return;
        }
        binaryTree.setRoot(insertNode(binaryTree.getRoot(), medicine));
       // System.out.println("asd");
    }

    private Node insertNode(Node current, Medicine medicine) {
        if (current == null) {
            return new Node(medicine);
        }

        if (medicine.getID() < current.getMedicine().getID()) {
            current.setLeftNode(insertNode(current.getLeftNode(), medicine));
        } else if (medicine.getID() > current.getMedicine().getID()) {
            current.setRightNode(insertNode(current.getRightNode(), medicine));
        } else {
            JOptionPane.showMessageDialog(null, "Error: Duplicate ID", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return current;
    }
    
    public static BinaryTree getSharedBinaryTree() {
        return binaryTree;
    }
    
    private boolean checkFields(Medicine medicine) {
        
        if(medicine.getName().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error, you have to complete all fields", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
