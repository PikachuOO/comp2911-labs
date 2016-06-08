import java.util.Calendar;

public class Story {

	private String title;
	private Calendar date;
	private String body;
	
	public Story(String title, String body) {
		this.title = title;
		this.date = Calendar.getInstance();
		this.body = body;
	}
	
	@Override
	public String toString() {
		return title;
	}
}
