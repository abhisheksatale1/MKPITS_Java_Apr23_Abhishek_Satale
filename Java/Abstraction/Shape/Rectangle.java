class Rectangle implements Shape {
	int length, width;
	// constructor
	Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}

	 public void draw()
	{
		System.out.println("Rectangle has been drawn ");
	}

	 public double area()
	{
		return (double)(length * width);
	}
}
 