package Access_Modifier;

public class Private_Demo_Test {
	public static void main(String args[]){  
		   Private_Demo obj=new Private_Demo();  
		   System.out.println(obj.data); 
		   obj.msg();
		   } 
}
/* Cannot Access data variable and msg method because 
   its scope is only within the block of that class */
/* 
Access Modifier	within class	within package	outside package by subclass only	outside package
Private					Y				N					N									N
Default					Y				Y					N									N
Protected				Y				Y					Y									N
Public					Y				Y					Y									Y
*/