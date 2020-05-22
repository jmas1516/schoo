//x‚Æy‚Ì˜a‚ðŠi”[‚µ‚½2ŽŸŒ³”z—ñ
class Sample7_28{
	static int[][] addMatrix(int[][] x, int[][] y){
		int[][] z = new int[x.length][];
		for(int i = 0; i < x.length; i++){
			z[i] = new int[x[i].length];
			for(int j = 0; j < x[i].length; j++){
				z[i][j] = x[i][j] + y[i][j];
			}
		}
		return z;
	}
	
	//--- s—ñm‚Ì‘S—v‘f‚ð•\Ž¦ ---//
	static void printMatrix(int[][] m){
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m[i].length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args){
		int[][] a = { {1, 2, 3}, {4, 5, 6} };
		int[][] b = { {6, 3, 4}, {5, 1, 2} };
		int[][] c = addMatrix(a, b);
		
		System.out.println("s—ña"); printMatrix(a);
		System.out.println("s—ñb"); printMatrix(b);
		System.out.println("a + b"); printMatrix(c);
	}
}