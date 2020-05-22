//乱数表示(double)
import java.util.Random;
	class Sample2_9{
		public static void main(String[] args){
			Random rand =new Random();
			
			double x = rand.nextDouble();
			
			System.out.println("0.0以上1.0未満の実数値をランダムに表示：" + x);
			System.out.println("0.0以上10.0未満の実数値をランダムに表示：" + (10*x));
			System.out.println("-1.0以上1,0未満の実数値をランダムに表示：" + (2 * x - 1));
		}
	}