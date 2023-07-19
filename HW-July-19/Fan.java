package test;

public class Fan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stage s = new Stage();
		s.view(new SOS());
	}
}

class Stage {
	public void view(Select s) {
		s.speed();
	}
}

abstract class Select {
	abstract public void speed();
}

class SOS extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in OFF state.");
	}
}

class SON extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in ON state.");
	}
}

class One extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in I state.");
	}
}

class Two extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in II state.");
	}
}

class Three extends Select {
	@Override
	public void speed() {
		System.out.println("Fan in III state.");
	}

}
