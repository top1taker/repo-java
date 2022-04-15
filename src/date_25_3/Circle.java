package date_25_3;

public class Circle extends GeometricObject implements Comparable<Circle> {
	double radius;

	public Circle(String color, boolean filled, double radius) {
		super(color, filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * this.radius * this.radius;
	}

	@Override
	public double getPerimeter() {
		return Math.PI * 2 * this.radius;
	}

	@Override
	public int compareTo(Circle c) {
		if (this.getArea() < c.getArea())
			return -1;
		if (this.getArea() > c.getArea())
			return 1;
		return 0;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + ", filled=" + filled + "]";
	}

}
