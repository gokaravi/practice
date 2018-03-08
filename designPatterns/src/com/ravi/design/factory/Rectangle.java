/**
 * 
 */
package com.ravi.design.factory;

/**
 * @author Ravi Goka
 * @email rgoka@nisum.com
 * Jan 8, 2016
 */
public class Rectangle implements Shape {

	/* (non-Javadoc)
	 * @see com.ravi.design.factory.Shape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("Inside draw() :: Drawing the Rectangle.");
	}

}
