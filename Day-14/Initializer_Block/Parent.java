package Initializer_Block;

class Parent{  
Parent(){
	System.out.println("constructor is invoked");
	}  
	{
	System.out.println("instance initializer block invoked");
	}  
       
public static void main(String args[]){  
 Parent p=new Parent();  
  
		}      
} 
