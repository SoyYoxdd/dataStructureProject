package BusinessLayer;
import EntityLayer.BinaryTree;
import EntityLayer.Node;
import javax.swing.JOptionPane;
public class BLDeleteNode {
    
    private BinaryTree binaryTree= BLInsertNode.getSharedBinaryTree();
    private Node root = binaryTree.getRoot();
    public void delete(int id) {
        binaryTree.setRoot(deleteNode(root, id));
    }
    
    private Node deleteNode(Node currentNode, int id) {
        
        if(currentNode == null) return null;
        
        if(id < currentNode.getMedicine().getID()){
            currentNode.setLeftNode(deleteNode(currentNode, id));
        }else if(id > currentNode.getMedicine().getID()) {
            currentNode.setRightNode(deleteNode(currentNode, id));
        }else {
            if(currentNode.getLeftNode() == null && currentNode.getRightNode()  == null) {
                return null;
            }else if(currentNode.getRightNode() != null && currentNode.getLeftNode() == null){
                return currentNode.getRightNode();
            }else if(currentNode.getLeftNode() != null && currentNode.getRightNode() == null) {
                JOptionPane.showMessageDialog(null, "Error: You can't delete this node because it only has a left subtree", "Error", JOptionPane.ERROR_MESSAGE);
                return currentNode;
            }else if(currentNode.getRightNode() != null && currentNode.getLeftNode() != null){
                JOptionPane.showMessageDialog(null, "Error: You can't delete this node because it has both left and right children", "Error", JOptionPane.ERROR_MESSAGE);
                return currentNode;
            }
        }
        return currentNode;
    }
    
}
