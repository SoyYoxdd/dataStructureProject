package IGU;

import javax.swing.*;

import EntityLayer.*;
import java.awt.Color;
//import java.awt.Dimension;
import java.awt.Graphics;

public class ViewData extends JPanel {

    private final int node_radius = 20;
    private final int level_gap = 50;
    private BinaryTree tree;

    public ViewData(BinaryTree tree) {
        this.tree = tree;
        //this.setPreferredSize(new Dimension(800, 600)); 
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTree(g, tree.getRoot(), getWidth() / 2, 30, 1);
    }

    private void drawTree(Graphics g, Node node, int x, int y, int level) {
        if (node == null) {
            return;
        }

        g.setColor(Color.red);
        g.fillOval(x - node_radius, y - node_radius, 2 * node_radius, 2 * node_radius);

        g.setColor(Color.WHITE);
        g.drawString(String.valueOf(node.getMedicine().getID()), x - 5, y + 5);

        int xLeft = x - (getWidth() / (9 * level));
        int xRight = x + (getWidth() / (9 * level));
        int yNext = y + level_gap;

        if (node.getLeftNode() != null) {
            g.setColor(Color.gray);
            g.drawLine(x, y + node_radius, xLeft, yNext - node_radius);
            drawTree(g, node.getLeftNode(), xLeft, yNext, level + 1);
        }
        
        if(node.getRightNode() != null) {
            g.setColor(Color.green);
            g.drawLine(x, y + node_radius, xRight, yNext - node_radius);
            drawTree(g, node.getRightNode(), xRight, yNext, level + 1);
        }
    }
}
