package Week;

class Assignment5 extends Thread {
	@Override
	public void run() {
		System.out.println("Name: " + Thread.currentThread().getName());
		Thread.currentThread().setName("Do");
		System.out.println("Updated Name: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Assignment5 d = new Assignment5();
		d.start();
	}
}
