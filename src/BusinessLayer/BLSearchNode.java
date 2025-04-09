package BusinessLayer;

import EntityLayer.BinaryTree;
import EntityLayer.Medicine;
import EntityLayer.Node;
import javax.swing.JOptionPane;

public class BLSearchNode {
    
    private BinaryTree tree;
    
    public BLSearchNode(BinaryTree tree) {
        this.tree = tree;
    }
    
    public Medicine  searchNode(int id) {
        return search(tree.getRoot(), id);
    }
    
    private Medicine search(Node current, int id) {
        
        if(current == null) {
             JOptionPane.showMessageDialog(null, "Error: The ID you entered is not in the tree", "Error", JOptionPane.ERROR_MESSAGE);
             return null;
        }
        
        if(id == current.getMedicine().getID()){
            return current.getMedicine();
        }
        else if(id < current.getMedicine().getID()){
            return search(current.getLeftNode(), id);
        }
        else {
            return search(current.getRightNode(), id);
        }
    }
    
}
