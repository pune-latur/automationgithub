package day1.variables;

public class GlobalVariable4 {
     //Global Variable
	static int empId123;
	public static void main(String[] args) {
	 int age=30;
	 System.out.println("Local Variable,age:"+age);//30
	 System.out.println("direct way to access SGV,EmpID:"+GlobalVariable4.empId123);//123
	}

}
