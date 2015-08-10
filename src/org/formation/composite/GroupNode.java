package org.formation.composite;

import java.util.ArrayList;
import java.util.List;

public class GroupNode implements CompositeNode {

	private List<CompositeNode> nodes = new ArrayList<CompositeNode>();
	private static String indent = "";
	
	public void add(CompositeNode node) {
		nodes.add(node);
	}
	
	public void remove(CompositeNode node) {
		nodes.remove(node);
	}
	
	public void empty() {
		nodes.clear();
	}
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("GroupNode");
		indent += "\t";
		
		for (CompositeNode composite : nodes) {
			System.out.print(indent);
			composite.draw();
		}
	}

}
