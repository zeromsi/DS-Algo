package graph.tree.decisionTree;

public enum Wind {
	WEAK("weak"), STRONG("strong");
	private String value;

	private Wind(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
