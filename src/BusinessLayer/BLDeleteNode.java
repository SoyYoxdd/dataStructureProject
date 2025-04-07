package BusinessLayer;
import EntityLayer.BinaryTree;
import EntityLayer.Node;
import javax.swing.JOptionPane;
public class BLDeleteNode {
    
    private BinaryTree binaryTree= BLInsertNode.getSharedBinaryTree();
    private BinaryTree tree;
    
    public BLDeleteNode(BinaryTree binaryTree) {
        this.tree = binaryTree;
    }
    public void delete(int id) {
         System.out.println(tree.getRoot());
        binaryTree.setRoot(deleteNode(tree.getRoot(), id));
        System.out.println(tree.getRoot());
    }
    
    private Node deleteNode(Node currentNode, int id) {
        
        if(currentNode == null) return null;
        
        if(id < currentNode.getMedicine().getID()){
            currentNode.setLeftNode(deleteNode(currentNode.getLeftNode(), id));
        }else if(id > currentNode.getMedicine().getID()) {
            currentNode.setRightNode(deleteNode(currentNode.getRightNode(), id));
        }else {
            if(currentNode.getLeftNode() == null && currentNode.getRightNode()  == null) {
                return null;
            }else if(currentNode.getRightNode() != null && currentNode.getLeftNode() == null){
                return currentNode.getRightNode();
            }else if(currentNode.getLeftNode() != null && currentNode.getRightNode() == null) {
                JOptionPane.showMessageDialog(null, "Error: You can't delete this node because it only has a left subtree", "Error", JOptionPane.ERROR_MESSAGE);
                return currentNode.getLeftNode();
            }else if(currentNode.getRightNode() != null && currentNode.getLeftNode() != null){
                JOptionPane.showMessageDialog(null, "Error: You can't delete this node because it has both left and right children", "Error", JOptionPane.ERROR_MESSAGE);
                return currentNode;
            }
        }
        return currentNode;
    }
}
