//‹t‚©‚çƒRƒs[

class Sample6_13{
	public static void main(String[] args){
		
		final int n = 5;
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0; i < n; i++)
			a[i] = i + 1;
		
		for(int i = 0; i < n; i++){
			b[i] = a[n - (i + 1)];
			System.out.println("a[" + i + "] = " + a[i] + "   b[" + i + "]  = " + b[i]);
		}
	}
}
