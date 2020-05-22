
public class Sample10_1IdTester {
	public static void main(String[] args) {
		Sample10_1Id a = new Sample10_1Id();
		Sample10_1Id b = new Sample10_1Id();
		
		System.out.println("aの識別番号：" + a.getId());
		System.out.println("bの識別番号：" + b.getId());
		
		System.out.println("Id.counter = " + Sample10_1Id.counter);
		System.out.println("Id.counter = " + a.counter);
		System.out.println("Id.counter = " + b.counter);
		
		System.out.println("Id.getMaxId = " + Sample10_1Id.getMaxId());
	}
}
