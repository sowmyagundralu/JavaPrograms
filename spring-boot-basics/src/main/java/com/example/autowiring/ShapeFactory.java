package com.example.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class ShapeFactory {
     @Autowired
     @Qualifier("triangle")
	Shape shape;
	
	public void printArea(String s,int x,int y)
	{
		/*if(s.equals("square"))
		{
			shape=new Square();
			shape.area(x, y);
		}
		else if(s.equals("rectangle"))
		{
			shape=new Rectangle();
			shape.area(x, y);
		}
		else if(s.equals("triangle"))
		{
			shape=new Triangle();
			shape.area(x, y);
		}*/
		
		shape.area(x, y);
	}

	
}
