package day1.variables;

public class GlobalVariable2 {
    //Global Variable
	static double empID=123;
	//static global variable or class variable
	public static void main(String[] args) {
		System.out.println("standard way to access SGV,EmpID:"+GlobalVariable2.empID);
		System.out.println("Direct way to access SGV,empID:"+empID);
	}
}
