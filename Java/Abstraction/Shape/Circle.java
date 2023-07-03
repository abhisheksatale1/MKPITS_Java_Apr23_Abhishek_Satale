class Circle implements Shape {
	double pi = 3.14;
	int radius;
	// constructor
	Circle(int radius) { 
this.radius = radius; 
}
	 public void draw()
	{
		System.out.println("Circle has been drawn ");
	}

	 public double area()
	{
		return (double)((pi * radius * radius));
	}
}
