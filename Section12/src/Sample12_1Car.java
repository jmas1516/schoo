package Sample;

public class Sample12_1Car {
	private   String name = "name";
	private   int width = 0;
	private   int height = 0;
	private   int length = 0;
	private double x = 0.0;
	private double y = 0.0;
	private   double fuel = 0.0;
	private   Sample12_1Day purchaseDay;

	//--- コンストラクタ ---//
	public Sample12_1Car() {}
	public Sample12_1Car(String name, int width, int height, int length, double fuel,
			Sample12_1Day purchaseDay) {
		super();
		this.name = name;
		this.width = width;
		this.height = height;
		this.length = length;
		this.x = 0;
		this.y = 0;
		this.fuel = fuel;
		this.purchaseDay = purchaseDay;
	}

	//--- ゲッタ, セッタ---//
	public double getX() {	return x; }
	public void setX(double x) { this.x = x;}

	public double getY() { return y; }
	public void setY(double y) { this.y = y; }

	public double getFuel() { return fuel; }
	public void setFuel(double fuel) { this.fuel = fuel; }

	public Sample12_1Day getPurchaseDay() { return purchaseDay; }
	public void setPurchaseDay(Sample12_1Day purchaseDay) { this.purchaseDay = new Sample12_1Day(purchaseDay); }

	//--- スペック表示 ---//
	public void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width  + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}
	//--- 移動 ---//
	public boolean move(double dx, double dy) {
		double dist = Math.sqrt(dx * dx + dy * dy);

		if(dist > fuel) {
			return false;
		}else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
}
