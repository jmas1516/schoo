package string;

public class Sample15_6 {
	public static void main(String[] args) {
		double r = Double.parseDouble(args[0]); //円の半径
		System.out.printf("半径r : %5.1f\n", r);
		System.out.printf("円周  : %5.1f\n", 2 * r * Math.PI);
		System.out.printf("面積  : %5.1f\n", r * r * Math.PI);
	}

}
