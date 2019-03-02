package graph.directed;

import java.util.Arrays;

public class Main {
	static Vertex root = new Vertex('0');

	public static void main(String[] args) {
		insert('a',root);
		System.out.println(root);
	}

	
	public static void insert(char c,Vertex parent) {
		try {
			parent.adjacentNodes=Arrays.asList(new Vertex(c));
		}catch(Exception e) {
		parent.adjacentNodes.add(new Vertex(c));
		}
	}
}
