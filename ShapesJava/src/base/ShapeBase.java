package base;

public class ShapeBase {

	protected String name;
	protected String formula;
	
	public ShapeBase(String name,String formula) {
		super();
		this.name = name;
                this.formula=formula;
	}
         public String getFormula() {
		return formula;
	}
         public void setFormula(String formula) {
		this.formula = formula;
	}
          public String getName() {
		return name;
	}
	   public void setName(String name) {
		this.name = name;
	}

	

	

}
