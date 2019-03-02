package graph.tree.decisionTree;

public enum DecisionNodeLabel {
	OUTLOOK("outlook"),
	HUMIDITY("humidity"),
	WIND("wind");
	
	private String value;
	private DecisionNodeLabel(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
