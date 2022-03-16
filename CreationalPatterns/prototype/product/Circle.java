package prototype.product;

public class Circle extends Shape {
	private int radius;
	
	public Circle(int radius, int x, int y, String color) {
		super(x, y, color);
		this.radius = radius;
	}
	
	public Circle(Circle oldObj) {
		super(oldObj);
		this.radius = oldObj.radius;
	}
	
	@Override
	public Shape clone() {
		return new Circle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Circle))
			return false;
		Circle other = (Circle) obj;
		return radius == other.radius;
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}
}
