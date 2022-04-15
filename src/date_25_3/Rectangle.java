package date_25_3;

public class Rectangle extends GeometricObject implements Comparable<Rectangle> {
	double width, height;

	public Rectangle(String color, boolean filled, double width, double height) {
		super(color, filled);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimeter() {
		return (width + height) * 2;
	}

	@Override
	public int compareTo(Rectangle rect) {
		if (this.getPerimeter() < rect.getPerimeter()) return -1;
		if (this.getPerimeter() > rect.getPerimeter()) return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", color=" + color + ", filled=" + filled + "]";
	}

}
