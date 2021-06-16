package shape;

import base.ShapeBase;

public class RectangularCuboid extends ShapeBase {

	public RectangularCuboid(String name,String formula) {
		super(name="rectagular cuboid",formula="2*(width*length+width*height+length*height)");
	}
}
