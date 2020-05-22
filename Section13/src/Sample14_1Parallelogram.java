package Shape;

public class Sample14_1Parallelogram extends Sample13_1Shape implements Sample14_1Plane2D{
	private int width;
	private int height;

	public Sample14_1Parallelogram(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}

	public String toString() {
		return "Parallelogram(width:" + width + ", height:" + height + ")";
	}

	public void draw() {
		for(int i = 1; i <= height; i++) {
			for(int j = 1; j <= height - i; j++) System.out.print(" ");
			for(int j = 1; j <= width; j++) System.out.print("#");
			System.out.println();
		}
	}

	public int getArea() {return width * height;}
}
