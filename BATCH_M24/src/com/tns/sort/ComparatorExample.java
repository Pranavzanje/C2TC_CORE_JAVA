package com.tns.sort;
import java.util.*;

public class ComparatorExample {

	
	public static void main(String args[]) {

		// Employee array which will hold employees 

		Employee employee[] = new Employee[3];

		// set different attributes of the individual employee.
		employee[0] = new Employee();
		employee[0].setAge(21);
		employee[0].setName("Pranav");
		
		employee[1] = new Employee();
		employee[1].setAge(23);
		employee[1].setName("Thor");

		employee[2] = new Employee();
		employee[2].setAge(25);
		employee[2].setName("Bunty");
		
		

		System.out.println("Order of employee before sorting is");

		for (int i = 0; i < employee.length; i++) 
		{
			System.out.println("Employee " + (i + 1) + " name :: "
					+ employee[i].getName() + ", Age :: "
					+ employee[i].getAge());
		}

		/* Sorting array on the basis of employee age by passing AgeComparator */

		Arrays.sort(employee, new AgeComparator());
		System.out.println("\n\nOrder of employee after sorting by employee age is");

		for (int i = 0; i < employee.length; i++) {

			System.out.println("Employee " + (i + 1) + " name :: "
					+ employee[i].getName() + ", Age :: "
					+ employee[i].getAge());
		}
		
		/* Sorting array on the basis of employee name by passing NameComparator */

		Arrays.sort(employee, new NameComparator());
		System.out.println("\n\nOrder of employee after sorting by employee name is");

		for (int i = 0; i < employee.length; i++) {

			System.out.println("Employee " + (i + 1) + " name :: "
					+ employee[i].getName() + ", Age :: "
					+ employee[i].getAge());
		}
		
		
	}
}

