package Sample;

public class Sample12_1CarRunTester {

	public static void main(String[] args) {
		Sample12_1Day day = new Sample12_1Day(2020, 5, 12);
		Sample12_1CarRun car1 = new Sample12_1CarRun("name", 1, 1, 1, 100, day);

		if(car1.move(10, 10)){
			System.out.println(car1.getDistance() + "m動きました");
		}else {
			System.out.println("動きませんでした");
		}
	}

}
