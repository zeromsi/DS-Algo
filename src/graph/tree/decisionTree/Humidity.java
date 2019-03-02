package graph.tree.decisionTree;

public enum Humidity {
	HIGH("high"),
	NORMAL("normal");
	private String value;

	private Humidity(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
