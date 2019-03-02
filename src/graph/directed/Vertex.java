package graph.directed;

import java.util.List;

public class Vertex {

	public List<Vertex> adjacentNodes;
	public char data;
	@Override
	public String toString() {
		return "Vertex [adjacentNodes=" + adjacentNodes + ", data=" + data + "]";
	}
	public Vertex(char data) {
		this.data = data;
	}
	
}
