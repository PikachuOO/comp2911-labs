import java.util.LinkedList;
//import java.util.Observable;

public class NewsService {

	private Story story;
	private LinkedList<Subscriber> subscribers;
//	private Observable observable;
	
	public NewsService() {
		this.story = null;
		this.subscribers = new LinkedList<Subscriber>();
//		this.observable = new Observable();
	}
	
	public NewsService(Story story) {
		this.story = story;
		this.subscribers = new LinkedList<Subscriber>();
	}
	
	public Story getStory() {
		return story;
	}
	
	public boolean addSubscriber(Subscriber subscriber) {
		if (subscribers.contains(subscriber)) {
			return false;
		}
		subscribers.add(subscriber);
		return true;
	}
	
	public void notifySubscribers() {
		for (Subscriber subscriber : subscribers) {
			subscriber.update();
		}
	}
	
	public void setStory(Story story) {
		this.story = story;
	}
}