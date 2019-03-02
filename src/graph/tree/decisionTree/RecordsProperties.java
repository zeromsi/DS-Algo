package graph.tree.decisionTree;

public class RecordsProperties {
	private String day;
	private OutLook outLook;
	private Humidity humidity;
	private Wind wind;
	private boolean isHeGoingToPlay;
	@Override
	public String toString() {
		return "RecordsProperties [day=" + day + ", outLook=" + outLook + ", humidity=" + humidity + ", wind=" + wind
				+ ", isHeGoingToPlay=" + isHeGoingToPlay + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((humidity == null) ? 0 : humidity.hashCode());
		result = prime * result + (isHeGoingToPlay ? 1231 : 1237);
		result = prime * result + ((outLook == null) ? 0 : outLook.hashCode());
		result = prime * result + ((wind == null) ? 0 : wind.hashCode());
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
		RecordsProperties other = (RecordsProperties) obj;
		if (day == null) {
			if (other.day != null)
				return false;
		} else if (!day.equals(other.day))
			return false;
		if (humidity != other.humidity)
			return false;
		if (isHeGoingToPlay != other.isHeGoingToPlay)
			return false;
		if (outLook != other.outLook)
			return false;
		if (wind != other.wind)
			return false;
		return true;
	}
	public RecordsProperties(String day, OutLook outLook, Humidity humidity, Wind wind, boolean isHeGoingToPlay) {
		super();
		this.day = day;
		this.outLook = outLook;
		this.humidity = humidity;
		this.wind = wind;
		this.isHeGoingToPlay = isHeGoingToPlay;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	public OutLook getOutLook() {
		return outLook;
	}
	public void setOutLook(OutLook outLook) {
		this.outLook = outLook;
	}
	public Humidity getHumidity() {
		return humidity;
	}
	public void setHumidity(Humidity humidity) {
		this.humidity = humidity;
	}
	public Wind getWind() {
		return wind;
	}
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public boolean isHeGoingToPlay() {
		return isHeGoingToPlay;
	}
	public void setHeGoingToPlay(boolean isHeGoingToPlay) {
		this.isHeGoingToPlay = isHeGoingToPlay;
	}
	
	
	
	
}
