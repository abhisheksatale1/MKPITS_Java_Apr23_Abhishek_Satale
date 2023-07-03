class Main {
	// Main driver method
	public static void main(String[] args)
	{
		// Creating the Object of the Rectangle class
		// and using shape interface reference.
		Shape rect = new Rectangle(2, 3);
		System.out.println("Area of rectangle: "
						+ rect.area());

		// Creating the Objects of Circle class
		Shape circle = new Circle(2);
		System.out.println("Area of circle: "+ circle.area());
	}
}
