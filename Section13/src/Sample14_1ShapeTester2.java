package Shape;

public class Sample14_1ShapeTester2 {
	public static void main(String[] args) {
		Sample14_1Plane2D[] a = new Sample14_1Plane2D[2];

		a[0] = new Sample13_1Rectangle(10, 10);
		a[1] = new Sample14_1Parallelogram(10, 15);

		for(Sample14_1Plane2D p : a) {
			System.out.println(p.getArea());
		}
	}
}
