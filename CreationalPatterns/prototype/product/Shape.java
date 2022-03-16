package prototype.product;

import java.util.Objects;

public abstract class Shape {
	private int x;
	private int y;
	private String shape;
	
	public Shape(int x, int y, String shape) {
		this.x = x;
		this.y = y;
		this.shape = shape;
	}
	
	public Shape(Shape oldObj) {
		if(oldObj == null) 
			throw new NullPointerException();
		this.x = oldObj.x;
		this.y = oldObj.y;
		this.shape = oldObj.shape;
	}
	
	public abstract Shape clone();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Shape))
			return false;
		Shape other = (Shape) obj;
		return Objects.equals(shape, other.shape) && x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + ", shape=" + shape + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
