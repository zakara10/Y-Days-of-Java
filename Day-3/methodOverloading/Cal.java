package methodOverloading;

public class Cal {
	
	public static void main(String[] args) {
		Arthematic c = new Arthematic();
		c.mul(2,5);
		c.mul(5.5f,5.5f);
		c.mul(5.6, 6.9);
		c.mul(5, 5.6f);
		c.mul(5, 6.9);
	}

}
