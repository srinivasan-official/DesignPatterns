package prototype.product;

import java.util.Objects;

public class Rectangle extends Shape {

	private int width;
	private int height;
	
	public Rectangle(int width, int height, String color) {
		super(width, height, color);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(Rectangle oldObj) {
		super(oldObj);
		this.width = oldObj.width;
		this.height = oldObj.height;
	}
	
	@Override
	public Shape clone() {
		return new Rectangle(this);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof Rectangle))
			return false;
		Rectangle other = (Rectangle) obj;
		return height == other.height && width == other.width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
}
