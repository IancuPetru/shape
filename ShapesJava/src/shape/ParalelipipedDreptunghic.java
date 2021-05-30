package shape;

import base.ShapeBase;

public class ParalelipipedDreptunghic extends ShapeBase {
//int result;
	public ParalelipipedDreptunghic(String name, int width, int height, int height1,String formula) {
		super(name, width, height,height1, formula);
	
		// TODO Auto-generated constructor stub
	}

public int  calculateArea() {
		
		return 2*(width*height+width*height1+height*height1);
}
}