package Week;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ThreadExtend {
	public ThreadExtend() {
		System.out.println("Thread created\n");
	}

	public void display() {
		System.out.println("\nWelcome to Java Week 6 New Question..\n\nMy name is : " + Thread.currentThread().getName()
				+ " - " + Thread.currentThread().getId());
		System.out.println("I'm executed after my Thread Name is set..");
	}
}

class Do {

	public static void main(String[] args) {
		final ThreadExtend te = new ThreadExtend();
		ExecutorService ex = Executors.newFixedThreadPool(1);
		ex.execute(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Thread.currentThread().setName("Main Thread");
				System.out.println("-------------------OUTPUT-------------------");
				te.display();
				System.out.println("I'm (" + Thread.currentThread().getName() + ") exiting...");
				System.out.println("--------------------------------------------");
			}

		});
	}
}
