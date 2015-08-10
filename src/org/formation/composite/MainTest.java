package org.formation.composite;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LeafNodeButton but1 = new LeafNodeButton();
		LeafNodeButton but2 = new LeafNodeButton();
		
		LeafNodeImage img1 = new LeafNodeImage();
		
		GroupNode g1 = new GroupNode();
		GroupNode g2 = new GroupNode();
		
		g1.add(but1);
		
		g2.add(img1);
		g2.add(but2);
		
		g1.add(g2);
		
		g1.draw();
	}

}
