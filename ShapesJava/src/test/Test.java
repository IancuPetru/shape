package test;

import base.ShapeBase;
import shape.ParalelipipedDreptunghic;
import shape.Rectangle;
import shape.Triangle;

public class Test {
	
	private static void displayArea(ShapeBase base) {
		if( base.getName()=="triangle"|| base.getName()=="rectangle")
		System.out.println("Display the area for the shape named:"+" "+  base.getName()+ " "+"width="+base.getWidth()+
	" "+	"height="+""+base.getHeight()+" "+"The area is:"+" "+base.calculateArea()+" "+" and is calculated using this:"+" "+base.getFormula());
		else
		System.out.println("Display the area for the shape named:"+ " "+base.getName()+ " "+"width="+base.getWidth()+" "+
	"height=" + base.getHeight()+" "+"height1="+base.getHeight1()+" "+"The area is:"+base.calculateArea()+" "+" and is calculated using this:"+" "+base.getFormula());}

	public static void main(String[] args) {
		ShapeBase [] shapes=new ShapeBase[3];
		shapes[0]=new Rectangle("rectangle",10,20,"width*height");
		shapes[1]=new Triangle("triangle",10,20,"width*height/2");
		shapes[2]=new ParalelipipedDreptunghic("paralelipiped",10,20,30,"2*(width*height+width*height1+height*height1)");
		// TODO Auto-generated method stub
        
		for(int i=0;i<shapes.length;i++) {
			
			displayArea(shapes[i]);}
		//vector[]formula;
		//for(int j=0;j<=formula.lentgh;j++)
	/*	if( shapes[0]!=null)
				System.out.println("Display the area for the shape named"+" "+ base.getName()+ " "+"width="+base.getWidth()+
			
			" "+	"height="+""+base.getHeight()+" "+"The area is"+" "+base.calculateArea());*/
	}

}
