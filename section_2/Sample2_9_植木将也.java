//�����\��(double)
import java.util.Random;
	class Sample2_9{
		public static void main(String[] args){
			Random rand =new Random();
			
			double x = rand.nextDouble();
			
			System.out.println("0.0�ȏ�1.0�����̎����l�������_���ɕ\���F" + x);
			System.out.println("0.0�ȏ�10.0�����̎����l�������_���ɕ\���F" + (10*x));
			System.out.println("-1.0�ȏ�1,0�����̎����l�������_���ɕ\���F" + (2 * x - 1));
		}
	}