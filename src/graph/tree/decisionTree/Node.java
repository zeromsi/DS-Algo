package graph.tree.decisionTree;

import java.util.List;

public class Node {
	Node parent;
	List<Node> childs;
	DecisionNodeLabel label;
	int countYes;
	int countNo;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((childs == null) ? 0 : childs.hashCode());
		result = prime * result + countNo;
		result = prime * result + countYes;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (childs == null) {
			if (other.childs != null)
				return false;
		} else if (!childs.equals(other.childs))
			return false;
		if (countNo != other.countNo)
			return false;
		if (countYes != other.countYes)
			return false;
		if (label != other.label)
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Node [parent=" + parent + ", childs=" + childs + ", label=" + label + ", countYes=" + countYes
				+ ", countNo=" + countNo + "]";
	}

	public Node(Node parent, List<Node> childs, DecisionNodeLabel label, int countYes, int countNo) {
		super();
		this.parent = parent;
		this.childs = childs;
		this.label = label;
		this.countYes = countYes;
		this.countNo = countNo;
	}

	public Node getParent() {
		return parent;
	}

	public void setParent(Node parent) {
		this.parent = parent;
	}

	public List<Node> getChilds() {
		return childs;
	}

	public void setChilds(List<Node> childs) {
		this.childs = childs;
	}

	public DecisionNodeLabel getLabel() {
		return label;
	}

	public void setLabel(DecisionNodeLabel label) {
		this.label = label;
	}

	public int getCountYes() {
		return countYes;
	}

	public void setCountYes(int countYes) {
		this.countYes = countYes;
	}

	public int getCountNo() {
		return countNo;
	}

	public void setCountNo(int countNo) {
		this.countNo = countNo;
	}

}
