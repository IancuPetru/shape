package base;

public class ShapeBase implements ShapeInterface {

	protected String name;
	protected String formula;
	protected int width, height, height1;
	

	public ShapeBase(String name, int width, int height,String formula) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.formula=formula;
	}

	
	public ShapeBase(String name, int width, int height, int height1,String formula) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.height1 = height1;
		this.formula=formula;
	}

   public String getFormula() {
		return formula;
	}


	public void setFormula(String formula) {
		this.formula = formula;
	}


public int getHeight1() {
		return height1;
	}

	public void setHeight1(int height1) {
		this.height1 = height1;
	}

	/*public ShapeBase(String name, int width, int height) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

}
