package date_25_3;

public abstract class GeometricObject {
	String color;
	boolean filled;
	
	public GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
