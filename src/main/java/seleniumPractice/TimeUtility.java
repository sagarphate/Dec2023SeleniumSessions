package seleniumPractice;

public class TimeUtility {
	
	private final static int DEFAULT_TIME = 500;
	private final static int DEFAULT_SHORT_TIME = 2000;
	private final static int DEFAULT_MEDIUM_TIME = 5000;
	private final static int DEFAULT_LONG_TIME = 10000;
	private final static int MAX_TIME = 15000;

	public static void applyWait(int waitTime) {
		try {
			Thread.sleep(waitTime * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void defaultTime() {
		try {
			Thread.sleep(DEFAULT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void defaultShortTime() {
		try {
			Thread.sleep(DEFAULT_SHORT_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void defaultMediumTime() {
		try {
			Thread.sleep(DEFAULT_MEDIUM_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void defaultlongTime() {
		try {
			Thread.sleep(DEFAULT_LONG_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void maxTime() {
		try {
			Thread.sleep(MAX_TIME);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
