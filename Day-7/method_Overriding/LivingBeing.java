package method_Overriding;

public class LivingBeing {
	
	public static void eatshow(Animal a) {
		if(a instanceof Tiger) {
			Tiger t = (Tiger) a;
			System.out.println("tiger= " + t.eat());
		}
	}

	public static void main(String[] args) {
		Animal a = new Tiger();
		eatshow(a);
	}

}
