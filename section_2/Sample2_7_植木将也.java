//�����_���\��
import java.util.Random;
	class Sample2_7{
		public static void main(String[] args){
			Random rand = new Random();
			
			int x = rand.nextInt(9);
			int y = rand.nextInt(9);
			int z = rand.nextInt(90);
			
			System.out.println("1���̎��R���������_���\���F" + x);
			System.out.println("1���̕��̐����������_���ɕ\���F" + (-y));
			System.out.println("2���̎��R���������_���\���F" + (10 + z));
		}
	}