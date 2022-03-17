package prototype.implementation;

import prototype.product.Circle;
import prototype.product.Rectangle;
import prototype.product.Shape;
import prototype.registry.PrototypeCache;

public class ClientCode {

	public static void main(String[] args) {
		ClientCode client = new ClientCode();
		client.cloneObjects();
		client.cacheObjects();
	}

	//UseCase - 1
	private void cloneObjects() {
		Circle circle = new Circle(15, 10, 20, "red");
		Circle circleClone = (Circle) circle.clone();
		System.out.println("Circle: " + circle + "\nCloned Circle: " + circleClone);
		
		Rectangle rectangle = new Rectangle(10, 20, "blue");
		Rectangle rectangleClone = (Rectangle) rectangle.clone();
		System.out.println("Rectangle: " + rectangle + "\nCloned Rectangle: " + rectangleClone + "\n");
	}
	
	//UseCase - 2
	private void cacheObjects() {
		Circle circle = new Circle(15, 10, 20, "red");
		Rectangle rectangle = new Rectangle(10, 20, "blue");
		PrototypeCache.put("Big red circle", circle);
		PrototypeCache.put("Medium blue rectangle", rectangle);
		
		Shape shape1 = PrototypeCache.get("Big red circle");
		Shape shape2 = PrototypeCache.get("Medium blue rectangle");
		Shape shape3 = PrototypeCache.get("Medium blue rectangle");
		if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big red circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big red circle == Medium blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }
	}
}
