
package com.tns.sort;
import java.util.*;

class Emp implements Comparable<Emp> {
	int EmpID;
	String Ename;
	double Sal;
	static int i;

	public Emp() {
		EmpID = i++;
		Ename = "Unknown";
		Sal = 0.0;
	}

	public Emp(String ename, double sal) {
		EmpID = i++;
		Ename = ename;
		Sal = sal;
	}

	public String toString() {
		return "EmpID : " + EmpID + "\t" + "Ename : " + Ename + "\t" + "Sal : "
				+ Sal;
	}
	//Sorting on the basis of Salary
	public int compareTo(Emp o) {
		if (this.Sal == ((Emp)o).Sal)
			return 0;
		else if (this.Sal> ((Emp) o).Sal)
			return 1;
		else
			return -1;
	}
}

class ComparableDemo {
	
	public static void main(String[] args) 
	{
			ArrayList<Emp> emps = new ArrayList<Emp>();
			emps.add(new Emp("Pranav", 40000.00));
			emps.add(new Emp("Thor", 60000.00));
			emps.add(new Emp("Vishwajeet", 50000.00));
			emps.add(new Emp("Bunty",70000.00));
			
			//Before Sorting
			System.out.println("Before Sorting");
			System.out.println(emps);
			
			Collections.sort(emps);
			
			// After Sorting
			System.out.println("After Sorting");
			System.out.println(emps);
		

	}
}
