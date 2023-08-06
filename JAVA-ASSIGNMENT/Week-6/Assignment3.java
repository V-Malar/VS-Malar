package Week;

interface Runnable1 {
	public abstract void run();
}

class Thread1 implements Runnable1 {

	@Override
	public void run() {
	}
}

class ThreadExtend extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.print("NPTEL Java week-6 new Assignment Q3");
	}
}

class Assignment3 {

	public static void main(String[] args) {
		ThreadExtend t = new ThreadExtend();
		t.start();
	}
}
