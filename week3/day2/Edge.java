package week3.day2;

public class Edge extends Browser{
	public void takeSnap()
	{
		System.out.println("Snap taken ----->from Edge sub class");
	}
	public void clearCookies()
	{
		System.out.println("Cookies cleared ----->from Edge sub class");
	}
	public static void main(String[] args) {
		Edge ed = new Edge();
		ed.closeBrowser();
		ed.openURL();
		ed.navigateBack();
		ed.takeSnap();
		ed.clearCookies();
		}
	}
