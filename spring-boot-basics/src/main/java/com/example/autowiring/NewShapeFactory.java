package com.example.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class NewShapeFactory {
    //if more than one bean of same type is available
	@Autowired
	@Qualifier("triangle")
	Shape tshape;
	
	@Autowired
	Shape shape;
	
	@Autowired
	Shape rectangle;
	
	public void printArea(String s,int x,int y)
	{
		System.out.println("printing area");
		if(s.equals("s"))
			shape.area(x, y);
		if(s.equals("r"))
			shape.area(x, y);
		if(s.equals("t"))
			tshape.area(x, y);
			
	}
}
