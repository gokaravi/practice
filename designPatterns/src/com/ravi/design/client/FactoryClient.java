/**
 * 
 */
package com.ravi.design.client;

import com.ravi.design.factory.Shape;
import com.ravi.design.factory.ShapeFactory;
import com.ravi.design.factory.Shapes;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com
 * Jan 8, 2016
 */
public class FactoryClient {
	
	public static void main(String[] args){
		ShapeFactory factory = new ShapeFactory();
		
		Shape circle = factory.getShape(Shapes.CIRCLE);
		if(null != circle){
			circle.draw();
		}
		
		
		Shape rectangle = factory.getShape(Shapes.RECTANGLE);
		if(null != rectangle){
			rectangle.draw();
		}
		
		
		Shape square = factory.getShape(Shapes.SQUARE);
		if(null != square){
			square.draw();
		}
		
	}

}
