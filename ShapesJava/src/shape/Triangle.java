package shape;

import base.ShapeBase;

public class Triangle  extends ShapeBase{

	public Triangle(String name, int width, int height,String formula) {
		super(name, width, height, formula);
		// TODO Auto-generated constructor stub
	}

	public int calculateArea() {
		
		return width*height/2;
	}
}
