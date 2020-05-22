//ランダム表示
import java.util.Random;
	class Sample2_7{
		public static void main(String[] args){
			Random rand = new Random();
			
			int x = rand.nextInt(9);
			int y = rand.nextInt(9);
			int z = rand.nextInt(90);
			
			System.out.println("1桁の自然数をランダム表示：" + x);
			System.out.println("1桁の負の整数をランダムに表示：" + (-y));
			System.out.println("2桁の自然数をランダム表示：" + (10 + z));
		}
	}