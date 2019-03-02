package graph.tree.decisionTree;

import java.util.ArrayList;
import java.util.List;

public class Records {

	public static List<RecordsProperties> getRecords() {
		List<RecordsProperties> records = new ArrayList<>();
		records.add(new RecordsProperties("day 1", OutLook.SUNNY, Humidity.HIGH, Wind.WEAK, false));
		records.add(new RecordsProperties("day 2", OutLook.SUNNY, Humidity.HIGH, Wind.STRONG, false));
		records.add(new RecordsProperties("day 3", OutLook.OVERCAST, Humidity.HIGH, Wind.WEAK, true));
		records.add(new RecordsProperties("day 4", OutLook.RAIN, Humidity.HIGH, Wind.WEAK, true));
		records.add(new RecordsProperties("day 5", OutLook.RAIN, Humidity.NORMAL, Wind.WEAK, true));
		records.add(new RecordsProperties("day 6", OutLook.RAIN, Humidity.NORMAL, Wind.STRONG, false));
		records.add(new RecordsProperties("day 7", OutLook.OVERCAST, Humidity.NORMAL, Wind.STRONG, true));
		records.add(new RecordsProperties("day 8", OutLook.SUNNY, Humidity.HIGH, Wind.WEAK, false));
		records.add(new RecordsProperties("day 9", OutLook.SUNNY, Humidity.NORMAL, Wind.WEAK, true));
		records.add(new RecordsProperties("day 10", OutLook.RAIN, Humidity.NORMAL, Wind.WEAK, true));
		records.add(new RecordsProperties("day 11", OutLook.SUNNY, Humidity.NORMAL, Wind.STRONG, true));
		records.add(new RecordsProperties("day 12", OutLook.OVERCAST, Humidity.HIGH, Wind.STRONG, true));
		records.add(new RecordsProperties("day 13", OutLook.OVERCAST, Humidity.NORMAL, Wind.WEAK, true));
		records.add(new RecordsProperties("day 14", OutLook.RAIN, Humidity.HIGH, Wind.STRONG, false));
		return records;
	}

}
