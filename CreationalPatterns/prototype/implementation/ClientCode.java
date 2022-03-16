package prototype.implementation;

import prototype.product.Circle;
import prototype.product.Rectangle;

public class ClientCode {

	public static void main(String[] args) {
		Circle circle = new Circle(15, 10, 20, "red");
		Circle circleClone = (Circle) circle.clone();
		System.out.println("Circle: " + circle + "\nCloned Circle: " + circleClone);
		
		Rectangle rectangle = new Rectangle(10, 20, "blue");
		Rectangle rectangleClone = (Rectangle) rectangle.clone();
		System.out.println("Rectangle: " + rectangle + "\nCloned Rectangle: " + rectangleClone);
	}

}
