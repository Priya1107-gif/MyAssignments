package week3.day2;

public class Safari extends Browser {
	public void readerMode()
	{
		System.out.println("Mode reader ----->from Safari sub class");
	}
	public void fullScreenMode()
	{
		System.out.println("ScreenMode full ----->from Safari sub class");
	}
	public static void main(String[] args) {
		Safari sf = new Safari();
		sf.closeBrowser();
		sf.openURL();
		sf.navigateBack();
		sf.readerMode();
		sf.fullScreenMode();
		}
	}
