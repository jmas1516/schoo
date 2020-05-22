//”z—ñdouble

class Sample6_3{
	public static void main(String[] args){
		double[] a = new double[5];
		
		for(int i = 0; i < a.length; i++){
			a[i] = (i * 11.0) / 10;
			System.out.println("a[ " + i + " ] = " + a[i]);
		}
	}
}