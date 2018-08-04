
package com.capgemini;

import com.apache.Emp;

/**
 * @author Pooja Karnik Program using jar files, accessing a class from other
 *         application stored at completely different location
 *
 */

//other application can access the jar file at different location using import package name
//accessing the jar file of Emp class
public class Emp1 {

	// creating an instance of Emp and calling display method
	public static void main(String[] args) {

		Emp employee = new Emp();
		employee.display();
	}
}
