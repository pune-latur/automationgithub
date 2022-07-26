package day1.variables;

public class Globalvariable3 {
    //Global Variable
	static double empID=123;
	//static global variable or class variable
	public static void main(String[] args) {
    int empId=100,age=30; //local Variable
    System.out.println("Local Variable,EmpID:"+empId);//100
    System.out.println("Local Variable,age:"+age);//30
    System.out.println("standard way to access SGV,EmpID:"+Globalvariable3.empID);//123
	}

}
