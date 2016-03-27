import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class JTreeMenu extends JFrame implements MouseListener{
	public JTree tree;
	public JTextField tx1;
	
  public JTreeMenu(){
	  DefaultMutableTreeNode top=new DefaultMutableTreeNode("Option");
	  DefaultMutableTreeNode a=new DefaultMutableTreeNode("A");
	  top.add(a);
	  DefaultMutableTreeNode a1=new DefaultMutableTreeNode("A1");
	  a.add(a1);
	  DefaultMutableTreeNode a2=new DefaultMutableTreeNode("A2");
	  a1.add(a2);
	  DefaultMutableTreeNode a3=new DefaultMutableTreeNode("A3");
	  a2.add(a3);
	  
	  DefaultMutableTreeNode b=new DefaultMutableTreeNode("B");
	  top.add(b);
	  DefaultMutableTreeNode b1=new DefaultMutableTreeNode("B1");
	  b.add(b1);
	  DefaultMutableTreeNode b2=new DefaultMutableTreeNode("B2");
	  b1.add(b2);
	  DefaultMutableTreeNode b3=new DefaultMutableTreeNode("B3");
	  b2.add(b3);
	  
	  tree=new JTree(top);
	  add(tree);
	  
	  JScrollPane js=new JScrollPane(tree);
	  add(js,BorderLayout.CENTER);
	  
	  tx1=new JTextField("Wel-come", 15);
	  add(tx1,BorderLayout.SOUTH);
	  
	  tree.addMouseListener(this);
	  setVisible(true);
	  setSize(500, 500);
	  setLocationRelativeTo(null);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  
  }
	
	public static void main(String[] args) {
		new JTreeMenu();

	}

	@Override
	public void mouseClicked(MouseEvent arg1) {
		
		
	}

	public void doMouseClicked(MouseEvent arg0) {
    TreePath tp=tree.getPathForLocation(arg0.getX(), arg0.getY());	
    if(tp!=null){
    	tx1.setText(tp.toString());
    }
    else{
    	tx1.setText("Invalid");
    }
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		doMouseClicked(arg0);
		
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
