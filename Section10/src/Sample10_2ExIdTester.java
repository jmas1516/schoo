
public class Sample10_2ExIdTester {

	public static void main(String[] args) {
		int idN = 10; //ExIdのインスタンスの数
		Sample10_2ExId[] exId = new Sample10_2ExId[idN];

		for(int i = 0; i < 4; i++) {
			exId[i] = new Sample10_2ExId();
			System.out.println("exId[" + i + "]の識別番号：" + exId[i].getId());
		}

		exId[3].setN(100);

		for(int i = 4; i < idN; i++) {
			exId[i] = new Sample10_2ExId();
			System.out.println("exId[" + i + "]の識別番号：" + exId[i].getId());
		}
	}

}
