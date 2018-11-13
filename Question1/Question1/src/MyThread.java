
public class MyThread extends Thread{
	private int[] segment;
	public int biggestFromThread;
	public MyThread(int[] segment) {
		this.segment = segment;
	}
	public void run() {
		int biggest = 0;
		for (int i : segment) {
			if( i > biggest) biggest = i;
		}
		biggestFromThread = biggest;
	}
}
