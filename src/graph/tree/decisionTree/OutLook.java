package graph.tree.decisionTree;

public enum OutLook {
	
	SUNNY("sunny"),
	OVERCAST("overcast"),
	RAIN("rain");
	
	private String value;

	private OutLook(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
}
