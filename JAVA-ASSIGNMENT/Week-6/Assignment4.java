package Week;

class Calculation {
	int a = 0, b = 0;

	public synchronized void inc() {
		a++;
		b++;
	}

	public synchronized int sum() {
		return a + b;
	}
}

class Do extends Thread {
	Calculation calc;
	int count = 1000;

	public Do(Calculation calc) {
		this.calc = calc;
	}

	public void run() {
		for (int i = 0; i < count; i++) {
			calc.inc();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Calculation c = new Calculation();
		Do g1 = new Do(c);
		Do g2 = new Do(c);
		Do g3 = new Do(c);
		g1.start();
		g2.start();
		g3.start();
		g1.join();
		g2.join();
		g3.join();
		System.out.println("Total: " + c.sum());
	}
}
