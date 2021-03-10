package Access_Modifier;

public class Private_Demo {
	private int data=40;  
	private void msg(){
		System.out.println("Hello java");
		} 
	public static void main(String args[]){  
		   Private_Demo obj=new Private_Demo();  
		   System.out.println(obj.data); 
		   obj.msg();
		   } 
}
