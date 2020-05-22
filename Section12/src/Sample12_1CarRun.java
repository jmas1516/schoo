package Sample;

public class Sample12_1CarRun extends Sample12_1Car{
	private double distance;

	public Sample12_1CarRun() {
		super();
	}

	public Sample12_1CarRun(String name, int width, int height, int length, double fuel,
			Sample12_1Day purchaseDay) {
		super(name, width, height, length,fuel, purchaseDay);

		distance = Math.sqrt(getX() * getX() + getY() * getY());
	}

	//--- 走行距離を取得 ---//
	public double getDistance() {
		distance = Math.sqrt(getX() * getX() + getY() * getY());
		return distance;
		}
}
