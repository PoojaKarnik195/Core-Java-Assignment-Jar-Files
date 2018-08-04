
package com.apache;

import pack2.Org;

/**
 * @author Pooja Karnik Program using jar files, accessing a class from other
 *         application stored at completely different location
 *
 */

//other application can access the jar file at different location using import package name
//accessing the jar file of Org class
public class Org1 {

	// creating an instance of Org and calling display method
	public static void main(String[] args) {

		Org organization = new Org();
		organization.display();
	}
}
