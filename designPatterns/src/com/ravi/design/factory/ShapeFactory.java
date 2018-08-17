/**
 * 
 */
package com.ravi.design.factory;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Jan 8, 2016
 */
public class ShapeFactory {
	
	public Shape getShape(Shapes shapeType){
		Shape shape = null;
		
		if("CIRCLE".equals(shapeType)){
			return new Circle();
		}
		else if("RECTANGLE".equals(shapeType)){
			return new Rectangle();
		}
		else if("SQUARE".equals(shapeType)){
			return new Square();
		}		
		
		return shape;
	}
	

}
