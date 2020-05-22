//自動車クラス
public class Sample8_2Car {
	private String name;   //名前
	private int    width;  //幅
	private int    height; //高さ
	private int    length; //長さ
	private double x;      //現在位置のx座標
	private double y;      //現在地のy座標
	private double fuel;   //残り燃料
	
	private double maxLoad; //最大積載量
	
	//--- コンストラクタ ---//
	Sample8_2Car(String name, int width, int height, int length, double fuel, double maxLoad){
			this.name = name;     this.width = width; this.height = height;
			this.length = length; this.fuel = fuel;   this.maxLoad = maxLoad;
			x = y = 0.0;
	}
	
	double getX() { return x;}
	double getY() { return y;}
	double getFuel() { return fuel;}
	
	//--- スペック表示 ---//
	void putSpec() {
		System.out.println("名前：" + name);
		System.out.println("車幅：" + width + "mm");
		System.out.println("車高：" + height + "mm");
		System.out.println("車長：" + length + "mm");
	}
	
	//--- X方向にdx, Y方向にdy移動 ---//
	boolean move(double dx, double dy) {
		double dist = Math,sqrt(dx * dx + dy * dy);
		
		if(dist > fuel)
			return false;
		else {
			fuel -= dist;
			x += dx;
			y += dy;
			return true;
		}
	}
	
	//--- 残りの積載量 ---//
	double remainingLoad(double x, int adults, int kids) { //x:荷物の重さ[kg], adults:大人の人数, kids:子供の人数
		return maxLoad - (x + 80.0 * adults + 40.0 * kids);
	}
}
