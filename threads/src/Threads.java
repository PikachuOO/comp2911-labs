
public class Threads implements Runnable {

	public static void main(String[] args) {
		for (int i = 0; i < 256; i++) {
			final int x = i;
//			new Thread(() -> System.out.println(x)).start();
			Threads t = new Threads();
			Thread thread = new Thread(t);
			thread.start();
		}
	}

	@Override
	public void run() {
//		System.out.println("hey " + Thread.currentThread().getId());
		System.out.println("hey " + x);
	}

}