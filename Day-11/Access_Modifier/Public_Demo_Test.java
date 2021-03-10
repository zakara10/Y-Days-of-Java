package Access_Modifier;

public class Public_Demo_Test {
	public static void main(String[] args) {
		Public_Demo p = new Public_Demo();
		System.out.println(p.val);
		p.msg();
	}
}

/* 
 Access Modifier	within class	within package	outside package by subclass only	outside package
Private					Y				N					N									N
Default					Y				Y					N									N
Protected				Y				Y					Y									N
Public					Y				Y					Y									Y
*/
