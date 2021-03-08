package containment;

public class EmployeeExam {
	
	int age;
	Name n;
	
	public  EmployeeExam() {
		age = 22;
		n = new Name();
	}
	
	public EmployeeExam(int a,Name na) {
		age = a;
		n = na;
	}
	
	public String toString() {
		return age+" "+n;
	}
	
	public static void main(String[] args) {
		EmployeeExam e1 = new EmployeeExam();
		System.out.println(e1);
		EmployeeExam e2 = new EmployeeExam(23,new Name("A","B","C"));
		System.out.println(e2);
	}

}
