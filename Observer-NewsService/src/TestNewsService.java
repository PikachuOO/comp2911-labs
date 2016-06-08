import static org.junit.Assert.*;

import org.junit.Test;

public class TestNewsService {

	@Test
	public void test() {
		NewsService newsService = new NewsService();
		ConcreteSubscriberA subscriberA = new ConcreteSubscriberA(newsService);
		ConcreteSubscriberA subscriberB = new ConcreteSubscriberA(newsService);
		ConcreteSubscriberA subscriberC = new ConcreteSubscriberA(newsService);
		
		newsService.addSubscriber(subscriberA);
		newsService.addSubscriber(subscriberB);
		newsService.addSubscriber(subscriberC);
		
		Story storyA = new Story("story one", "body one");
		Story storyB = new Story("story two", "body two");
		Story storyC = new Story("story three", "body three");
		
		newsService.setStory(storyA);
		newsService.notifySubscribers();
		
		assertEquals(subscriberA.getStory(), storyA);
		assertEquals(subscriberB.getStory(), storyA);
		assertEquals(subscriberC.getStory(), storyA);

		newsService.setStory(storyB);
		newsService.notifySubscribers();
		
		assertEquals(subscriberA.getStory(), storyB);
		assertEquals(subscriberB.getStory(), storyB);
		assertEquals(subscriberC.getStory(), storyB);

		newsService.setStory(storyC);
		newsService.notifySubscribers();
		
		assertEquals(subscriberA.getStory(), storyC);
		assertEquals(subscriberB.getStory(), storyC);
		assertEquals(subscriberC.getStory(), storyC);
	}

}
