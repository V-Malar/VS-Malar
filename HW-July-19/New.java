package test;

abstract class ShoeFactory {
	final public void makeShoe() {
		System.out.println("Shoe made..");
	}
}

abstract class Shoe extends ShoeFactory {
	final public void shoeSize() {
		System.out.println("Shoe size..");
	}
}

class ShoeShop extends Shoe {
	public ShoeShop sellShoe() {
		new PUMA().puma(new ShoeFactory() {
		});
		new SS().smallSize(new Shoe() {
		});
		return this;
	}
}

class LS {
	final public void largeSize(Shoe s) {
		s.shoeSize();
		System.out.println("Shoe size is large");
	}
}

class SS {
	final public void smallSize(Shoe s) {
		s.shoeSize();
		System.out.println("Shoe size is small");
	}
}

class PUMA {
	final public void puma(ShoeFactory shoeFactory) {
		shoeFactory.makeShoe();
		System.out.println("Shoe type is PUMA");
	}
}

class FILA {
	final public void fila(ShoeFactory shoeFactory) {
		shoeFactory.makeShoe();
		System.out.println("Shoe type is FILA");
	}
}

public class New {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShoeShop().sellShoe();
//		ShoeShop s = new ShoeShop().sellShoe();
//		s.getClass();
//		s.sellShoe();
	}

}
