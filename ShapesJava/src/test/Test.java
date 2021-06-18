package test;

import base.ShapeBase;
import shape.ParalelipipedDreptunghic;
import shape.Rectangle;
import shape.Triangle;

public class Test {
	
	private static void displayAreaFormula(ShapeBase base) {
		System.out.println("the area for the shape named:"+" "+base.get.Name() "+ "is calculated using this:"+" "+base.getFormula());
	public static void main(String[] args) {
		ShapeBase [] shapes=new ShapeBase[3];
		shapes[0]=new Rectangle();
		shapes[1]=new Triangle();
		shapes[2]=neW RectangularCuboid();
	
		for(int i=0;i<shapes.length;i++) {
			displayAreaFormula(shapes[i]);}
	
	}

}
