//2�����z��a�Ɠ����z��
class Sample7_29{
	//--- 2��������a�Ɠ����z��b��ԋp ---//
	static int[][] aryClone2(int[][] a){
		int[][] b = new int[a.length][];
		for(int i = 0; i < a.length; i++){
			b[i] = new int[a[i].length];
			for(int j = 0; j < a[i].length; j++){
				b[i][j]  = a[i][j];
			}
		}
		return b;
	}
	
	//--- �s��m�̑S�v�f��\�� ---//
	static void printMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int[][] a = {{1, 2, 3, 4}, {5, 6, 7}, {8,9,10,11}};
		int[][] b = aryClone2(a);
		
		System.out.println("�s��a"); printMatrix(a);
		System.out.println("�s��a�̃R�s�["); printMatrix(b);
	}
}