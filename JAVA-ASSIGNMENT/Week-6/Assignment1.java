package Week;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadExtend {
	public ThreadExtend() {
		System.out.println("Thread created");
	}

	public void display() {
		System.out.println("\nMy name is : " + Thread.currentThread().getName() + " - " + Thread.currentThread().getId());
		System.out.println("I'm executed after my Thread Name is set..");
	}
}

class Assignment1 {

	public static void main(String[] args) {
		final ThreadExtend te = new ThreadExtend();
		ExecutorService ex = Executors.newFixedThreadPool(3);
		ex.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Thread.currentThread().setName("I'm a Thread");
				te.display();
				System.out.println("I'm running...");
			}

		});
	}
}
