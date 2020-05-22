package throwable;

import java.util.Scanner;

//配列の要素に値を読み込んで並びを反転する（バグあり：reverseで例外を補足)

public class Sample16_3 {

	//---配列の要素a[idx1]と要素[idx2]を交換---//
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx1] = t;
	}

	//---配列aの要素の並びを反転（誤り）---//
	static void reverse(int [] a) {
		try {
			for(int i = 0; i < a.length / 2; i++) {
				swap(a, i, a.length-i);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.exit(1);
		}catch(NullPointerException e) {
			System.out.println("null");
			System.exit(1);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("要素数 : "); int n = scan.nextInt();

		int[] x = new int[n];

		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = scan.nextInt();
		}

		x = null;
		reverse(x);

		System.out.println("要素の並びを反転しました。");
		for(int i : x) {
			System.out.println(i);
		}

		scan.close();
	}
}
