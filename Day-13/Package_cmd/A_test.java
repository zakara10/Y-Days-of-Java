package Package_cmd;

/*
 public class MyDate {
	// data members
	int day,month,year;	
	public MyDate() {
		day=28;
		month=11;
		year=2020;
	}
	public MyDate(int d,int m,int year){
		day=d;
		month=m;
		this.year=year;   // remove shadowing effect 
	}
	public String toString()
	{
		 return day+"/"+month+"/"+year;
	}
	
	public static void main(String[] args) {
		
		MyDate d1=new MyDate(2,5,2006); 
		System.out.println(d1);
	}	
}

1.Copy code of class with main method and without package statement into new Notepad.
2. save it with same name as class name 
   assume save on D:
   a.  MyDate.java
   b.  save as Type to be All Files
3.open cmd
4.change directory to D:
5.check for path variable
  type javac on cmd and press enter key
  - if it shows options then we can go ahead to step 6
  - if it shows message as javac unrecgonized command
     then
     we need to set path variable
       copy path from your machine upto bin folder 
    ---  set path = C:\Program Files (x86)\Java\jdk1.7.0\bin
       press enter 
6. Now Compile ::::::::: 
    javac MyDate.java
7. Now Execute
    java MyDate
   Note :: if you get error like class not found
           then we need to set classpath variable.
         Set classpath=.;K:;M:;k:\Mydata;
  	 again Execute  as 
    	 java MyDate
-------------------------------------------------------------
Code2

1. create one class without main method as below and save it in file Student.java
 
package school;
public class Student {

	private int rollno;
	private String name;
	private int marks;
	
	public void initStudent(){
		rollno=1;
		name="Monka";
		marks=99;
	}
	public void printStudent(){
		System.out.println("Student details = "+rollno+" "+name+" "+marks);
	}
	public void setName(String nm)
	{
		name=nm;
	}
	public String getName()
	{
		return name;
	}
}
2.create one more class with main method and without package as below

    import school.Student;
    public class TestStudent
    {
       public static void main(String[] args) {
		
		// fully qualified path
		//school.Student s1=new school.Student();

		Student s1=new Student();
		s1.initStudent();
		s1.printStudent();
		s1.setName("Monika");
		System.out.println("Updated name  = "+s1.getName());
	}
    }




3. 
   i) compile Student class  
    javac -d . Student.java 
   javac ->  command to compile
   -d    ->  make directory/package/folder with name of package given in file
   .     ->  at current location/directory/path
   Student.java->  file to compile  
  ii)compile TestStudent class   
     javac TestStudent.java
4. run 
     java TestStudent
----------------------------------------------------------
- we never need to import java.lang package
- becz it is automatically imported.
- System class is available in java.lang package.
-------------------------------------------------------------
 */
