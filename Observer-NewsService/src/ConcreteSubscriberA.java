
public class ConcreteSubscriberA implements Subscriber {

	private NewsService newsService;
	private Story story;
	
	public ConcreteSubscriberA(NewsService newsService) {
		this.newsService = newsService;
		this.story = newsService.getStory();
	}
	
	@Override
	public void update() {
		this.story = newsService.getStory();
	}

	@Override
	public Story getStory() {
		return story;
	}

}
